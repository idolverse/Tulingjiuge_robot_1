package org.myrobotlab.service;

import java.io.IOException;
import java.net.URLEncoder;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.json.JSONObject;
import org.myrobotlab.logging.LoggerFactory;
import org.myrobotlab.service.config.YahooFinanceStockQuoteConfig;
import org.slf4j.Logger;

/**
 * A service to query into Yahoo's api with a query to the current price for a
 * given ticker symbol. This requires
 */
public class YahooFinanceStockQuote extends HttpClient<YahooFinanceStockQuoteConfig> {

  private static final long serialVersionUID = 1L;
  private String apiBase = "https://query.yahooapis.com/v1/public/yql?format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=&q=";
  public final static Logger log = LoggerFactory.getLogger(YahooFinanceStockQuote.class);

  public YahooFinanceStockQuote(String n, String id) {
    super(n, id);
  }

  // Return a sentence describing the stock price
  public String fetchQuote(String ticker) throws ClientProtocolException, IOException, JSONException {
    String yql = "select * from yahoo.finance.quotes where symbol in (\"" + ticker + "\")";
    String apiUrl = apiBase + URLEncoder.encode(yql, "utf-8");
    String response = this.get(apiUrl);
    log.info("Respnse: {}", response);
    JSONObject obj = new JSONObject(response);
    String askPrice = obj.getJSONObject("query").getJSONObject("results").getJSONObject("quote").get("Ask").toString();
    String sentence = "it's trading at " + askPrice;
    return sentence;
  }

  public String getApiBase() {
    return apiBase;
  }

  /*
   * The base url that is assocaited with the yahoo yql api.
   */
  public void setApiBase(String apiBase) {
    this.apiBase = apiBase;
  }

  public static void main(String[] args) {
    YahooFinanceStockQuote owm = (YahooFinanceStockQuote) Runtime.start("quote", "YahooFinanceStockQuote");
    owm.startService();
    try {
      String response = owm.fetchQuote("NVDA");
      System.out.println(response);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
