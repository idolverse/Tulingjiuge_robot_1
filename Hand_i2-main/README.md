## 手i2

从图库下载 STL 文件：i2RightHand i2LeftHand。

在打印所有部件之前，您应该打印一份校准器 (CALIBRATOR)，以检查部件是否能够拼合。如果您在拼合这些部件时遇到困难，可以调整切片软件的水平扩展设置来解决这个问题。此设置可能因切片机和打印机而异，但用户报告称，将其设置为 -0.15 是一个不错的起点。

以下是一只右手所需的零件清单和打印数量：

1个i2_CoverFingerV3

1x i2_FingersMoldX5V3

1个 i2_FingersTipX5V2

1个i2_FingersX5V1

1x i2_HandCoverV1

1个i2_PalmCoverV2

1x i2_PulleyX5V1

1x i2_WristGearV1

1个 i2_WristLargeV2

打印腕部大件、手指模具、手指、腕带、滑轮，最大分辨率 0.25，填充率为 30%，壁厚为 2 毫米，无支撑，无筏。

打印 CoverFinger、FingersTip、HandCover、PalmCover，最大分辨率 0.25，填充率为 30%，壁厚为 2 毫米，需要支撑，如果打印机需要，则需要筏。

物料清单：

25个沉头螺钉M3 x 16mm

5 个 M3 x 4mm 沉头螺钉

1 个 M3 x 12mm 沉头螺钉

5 个平头螺钉 M1.5 x 4mm

5个膨胀弹簧3/16英寸x1-3/4或4.8毫米x44.5毫米

6x舵机 JX-6225MG 300度

1x 带状线 16 根 3 米

1 条编织鱼线 0.8 毫米 200 磅，3 米

5个霍尔传感器AH3503

5x 圆盘磁铁直径 2.5mmx1mm

1x 特氟龙管 ID1.5MM X OD2.5MM，3米
 

<h2>步骤1</h2>

![image](https://github.com/user-attachments/assets/c018f92b-3d1b-4db8-a168-fc1a4714e1e6)

将腕部伺服支架粘到 RobCableFront 上

![image](https://github.com/user-attachments/assets/24646728-586f-45b1-93ea-72bc1acdee80)

用 4 个螺钉安装伺服电机

![image](https://github.com/user-attachments/assets/0988a7fb-2e62-4ce3-b1b3-561f9b4a6bf7)

如果需要，用 M3 钻头重新钻孔

![image](https://github.com/user-attachments/assets/10634749-f620-46c9-ac43-c27bdce2b570)

重新钻孔，以便 M3 PTFE 管穿过它们

![image](https://github.com/user-attachments/assets/e9547d9d-cc76-4854-a622-5bc475dbc53c)

使用 M3 钻头重新钻孔

![image](https://github.com/user-attachments/assets/e8c89a9b-9f00-46bc-a212-898764dde333)

将两个轴打印部件粘合在一起

![image](https://github.com/user-attachments/assets/09ca90a5-9492-4841-9a5d-ea52dba306f8)

检查以确保轴正确安装在两个印刷齿轮中

![image](https://github.com/user-attachments/assets/cca0395d-58e9-4a4f-81b9-02ba8be29c2c)

将 RobCableFront 和伺服支架安装到伺服床上

![image](https://github.com/user-attachments/assets/35a1fbe5-d1c9-4ca1-87bf-c83678cbc13f)

此视图向您展示了 WristGear 的组装以及各个部件如何组合在一起

![image](https://github.com/user-attachments/assets/af77ce47-e08e-4ed8-8e98-854b8f06a792)

将舵机角度设置为大约 90 度（HK15298B）或 150 度（JX-6225MG）。（即舵机总角度的中间值）。您可以使用此脚本(见脚本.txt)进行设置。用 3 毫米螺钉将组件末端安装到舵机轴上。

![image](https://github.com/user-attachments/assets/bb58fcd5-32aa-4cc6-b68b-bf86c0305213)

用 4 颗螺丝将组件拧到手腕上

![image](https://github.com/user-attachments/assets/e5fe72d8-c5eb-4bfa-a852-83720d1d1706)

按图示组装主齿轮

![image](https://github.com/user-attachments/assets/f04f7249-b853-45fc-8936-09083430160d)

注意小齿轮的头部必须适合 RotaWrist2 的预留孔

![image](https://github.com/user-attachments/assets/34e7a8a4-7128-4a53-917d-a8fa1990535a)

使用 M3 螺丝刀将主齿轮与 RotaWrist3 对齐，然后添加 M3 x 12 毫米螺钉将它们固定在一起

![image](https://github.com/user-attachments/assets/95588f92-307a-4ea8-a1e7-2912ed18a28d)

删除那块打印的预支撑，你不再需要它了

![image](https://github.com/user-attachments/assets/1c8196e6-c1e1-4d8a-abc6-f636b4e78ae8)

用锋利的刀片，必要时清理边缘

![image](https://github.com/user-attachments/assets/846de710-f465-48f3-bc80-990bf8d2ed86)

![image](https://github.com/user-attachments/assets/9b4ed84e-22ce-4f91-a754-55d40e665682)

使用 M8 钻头重新钻孔 WristLarge

![image](https://github.com/user-attachments/assets/aca1b28a-611e-4685-b643-3ebe3cd222dc)

使用 M3 丝锥，在将要固定手盖的地方准备一些 M3 x 16 毫米螺丝孔

![image](https://github.com/user-attachments/assets/ad9da142-8c09-445a-a084-7b4a54b086a7)

使用 M3 丝锥，为安装弹簧的 M3 x 16 毫米螺钉准备孔

![image](https://github.com/user-attachments/assets/5f0ca785-3272-4bc7-a5f0-1561a600b2b7)

使用 M3 钻头，清理连接每个手指的所有孔

![image](https://github.com/user-attachments/assets/b3928661-df97-4458-b1de-86e5543af6af)

用M3钻头，将所有手指每3节的孔全部清理干净

![image](https://github.com/user-attachments/assets/02ab3897-c9d3-4df3-a398-59738dd5b2fc)

用锋利的刀片清理霍尔传感器的出口

![image](https://github.com/user-attachments/assets/c254f702-4f78-4cf4-bfe6-64492c55f67a)

使用 M1.5 钻头，清理弹簧末端连接的孔

![image](https://github.com/user-attachments/assets/6481343c-bd2e-48b7-b7b7-1712741ccaa8)

用填充物时，确保每个手指的三个部分都贴合，并且移动起来非常顺畅。这对于手指的良好功能至关重要。

![image](https://github.com/user-attachments/assets/d9feb969-62f9-4f87-8f7f-431897590377)

![image](https://github.com/user-attachments/assets/abc9d14f-aa79-4ad5-afb6-61077b4febb8)

使用 M5.5 钻头清理手指部分，让弹簧正常穿过

![image](https://github.com/user-attachments/assets/14407396-c0b4-4ca9-a3af-ffb26a38e585)

使用 M5.5 钻头清理手指部分，让弹簧正常穿过

![image](https://github.com/user-attachments/assets/00605e4a-14ad-4fbe-b6f8-1317a8171658)

这是为了向您展示如何将弹簧和三根传感器线安装在每个手指部分

![image](https://github.com/user-attachments/assets/820977b6-e6f9-40be-9f5f-78c419a26d9d)

确保针头可以穿过每个手指部分，如图所示，否则清理孔

![image](https://github.com/user-attachments/assets/976cfb0e-4ef5-45a2-b75d-e84df780df7d)

使用 M3 x 16 毫米螺钉和螺栓将手指部分添加并安装在一起

![image](https://github.com/user-attachments/assets/5209d50e-e023-4752-9e8c-a3d8871cb378)

确保编织鱼线的入口也清理干净

![image](https://github.com/user-attachments/assets/2d5dcb93-d667-4e95-9436-3d47818aaba3)

准备 5 条长度为 50 厘米的编织鱼线（0.8 毫米 200 磅）如果您在谷歌搜索中输入这些关键词，就可以找到该产品：编织鱼线 0.8 毫米 200 磅

![image](https://github.com/user-attachments/assets/ff230843-da5d-4fc7-80f8-f861520e9835)

准备一条40厘米长的带状电缆。你可以在谷歌搜索关键词：带状电缆 16 针（尽量选择最柔软、最细的）。

![image](https://github.com/user-attachments/assets/17537dc0-cf3b-46e1-b4d3-6e54770f43be)

将丝带分成两部分，一部分长 40 厘米，有 6 根电线，另一部分长 10 根电线

![image](https://github.com/user-attachments/assets/e72e9700-fdaa-4116-859f-3aa131f0b600)

从10根电线中完全移除1根电线。将9根电线分成三段，每段3根电线，长度均为15厘米。

![image](https://github.com/user-attachments/assets/bb9b6559-ab14-4b5e-9af1-0b06549c3ba1)

用红色记号笔，给每个部分的一根电线涂上颜色。我们假设这些是正极 (+) 线

![image](https://github.com/user-attachments/assets/b801502d-d047-4d08-93b4-481b7410ae02)

在丝带的两端都涂上这些颜色，这对于避免在进行最后的焊接时混合电线非常有用。

![image](https://github.com/user-attachments/assets/19ab6096-f285-4d89-a377-f4240c976fa6)

穿过腕部大号每 5 个丝带部分

![image](https://github.com/user-attachments/assets/9011334e-dd1c-429f-8ded-50470f833708)

将丝带穿过每个手指，注意不要倒着穿。另外要注意，每个手指的形状都差不多，只有拇指的形状不同。

![image](https://github.com/user-attachments/assets/a2092b91-57bb-472b-9ab8-b77d5803879e)

现在把编织好的鱼线穿过每个手指。为了让鱼线末端更硬，可以加一些强力胶。

![image](https://github.com/user-attachments/assets/a379985f-00b1-4730-8189-d2c1e245d9ca)

在 1 厘米长的编织钓鱼线上涂上强力胶。

![image](https://github.com/user-attachments/assets/9bb1d475-299e-4bd7-9098-1fa2028035a0)

等到它完全干燥后，从中间切开粘合部分，这样可以确保尖端坚固而纤薄。

![image](https://github.com/user-attachments/assets/b9ddb11e-30ca-44aa-995f-f1a82cb0d29c)

通过将钓鱼线拉入指尖的 V 形凹槽，即可将其固定

![image](https://github.com/user-attachments/assets/bd30142f-74d3-4adf-95c1-f2f538ddb241)

现在将鱼线的另一端插入手腕大孔中

![image](https://github.com/user-attachments/assets/5c9c760e-b3e5-4526-919c-8af4e4e8ca5e)

这是给你展示一下它应该是什么样子。我的照片上还没做拇指，不过你可以做。五个手指可以同时做。

![image](https://github.com/user-attachments/assets/02a2ce54-ee28-438e-bc7e-377429b7747a)

如果你还没有这样做，请清理 3 毫米螺栓外壳，以便进行下一步

![image](https://github.com/user-attachments/assets/bf57c2cd-96eb-433b-a32f-719f71e7d2bf)

现在是时候添加 M3 x 16 毫米螺钉及其相应的螺栓，将手指组装到大腕上。从大拇指开始，然后是食指、无名指、小指，最后是拇指。

![image](https://github.com/user-attachments/assets/7442f7b1-b8b9-4130-a5c2-575ad5033ab0)

使用合适的 M8 印刷螺栓将 WristLarge 安装到 RotaWrist3

![image](https://github.com/user-attachments/assets/a46bf66d-fd3f-4aa3-a553-2b8219e771fd)

将微型夹具设置在打印螺栓的凹槽上

![image](https://github.com/user-attachments/assets/f2d454e3-d9bb-4fff-a802-f822da4621fb)

穿过主齿轮的最大丝带

![image](https://github.com/user-attachments/assets/a710336b-51a5-4366-b8fa-595e6f25803b)

然后穿过主齿轮第二条丝带

![image](https://github.com/user-attachments/assets/86770bc3-c6d7-4cbd-bbb6-39d7e4598182)

放置掌上盖并用 3 颗 M3 x 16 毫米螺钉固定

![image](https://github.com/user-attachments/assets/22c91658-8d7a-4aa8-a00e-6582eb01daf2)

拧紧掌上盖时，确保将丝带整齐地放入凹槽中，并真正避免夹住它们

![image](https://github.com/user-attachments/assets/4593eeba-ebe4-4b03-a987-18b3de0b988b)

现在将 M2.5 PTFE 管穿过主齿轮特氟隆管 ID1.5MM X OD2.5MM PTFE 管的长度如下：拇指 335mm 食指 300mm 中间 300mm 无名指 300mm 小指 360mm

特氟隆管 ID1.5MM X OD2.5MM：https://fr.aliexpress.com/item/32730855848.html?spm=a2g0s.9042311.0.0.3b966c37jungcW

![image](https://github.com/user-attachments/assets/c6869df5-8668-40d5-abaa-f28202820ed8)

将管子穿过伺服底座孔。管子距离伺服轴约 1.5 厘米。

![image](https://github.com/user-attachments/assets/856c6302-0a94-4b00-8396-9fe386d6fec7)

将鱼线穿过管子

![image](https://github.com/user-attachments/assets/a688dd47-e789-4b34-9b25-0763a78dabf1)

![image](https://github.com/user-attachments/assets/cc4eabdd-7103-4e42-9c93-443882715b56)

并将管子的末端放入预留的孔中，直到无法再插入为止

![image](https://github.com/user-attachments/assets/086ac96b-6ca4-4716-8d48-04b78a8a863f)

对每根手指重复操作

![image](https://github.com/user-attachments/assets/36e2f501-377a-4764-afda-8cfb38a91166)

现在获得 5 个弹簧弹簧 3/16″x1-3/4

弹簧 3/16″x1-3/4：https://www.ebay.com/p/19011685359

![image](https://github.com/user-attachments/assets/bce79c09-6f85-40b7-8de1-3add342a28e5)

将一根鱼线穿过弹簧的一侧。鱼线总长度约为30厘米

![image](https://github.com/user-attachments/assets/11735da6-d182-4b12-b289-e63e38106fc9)

将鱼线穿过主指部分的弹簧孔

![image](https://github.com/user-attachments/assets/0f5b041c-0abe-4d70-805a-e550ce7f981c)

将弹簧穿过第二个手指部分

![image](https://github.com/user-attachments/assets/77f13557-dd22-4674-bb71-4bc5586514b8)

取 5 个小螺丝，我用了一些安装在眼部机构中的伺服器上的螺丝，这些螺丝的直径约为 2 毫米

![image](https://github.com/user-attachments/assets/82b4abd9-b2e2-4461-af26-7fac4dec5d39)

![image](https://github.com/user-attachments/assets/2136ad04-982c-4e88-a9b6-0df9f72f42fe)

用钳子将螺丝剪至最大总长度为 4 毫米

![image](https://github.com/user-attachments/assets/e2eeacc9-66c5-4f95-a48a-14e4d111b62c)

将弹簧固定到位

![image](https://github.com/user-attachments/assets/f391be7f-5f6d-4f34-a3a1-dda18ef23789)

装上那个小螺丝，把弹簧固定到位。确保螺丝没有刺穿三根带状电线

![image](https://github.com/user-attachments/assets/d944f639-ca4d-4625-bff2-25041058384e)

获取或切割五颗 3 毫米、最大长度为 4 毫米的螺钉

![image](https://github.com/user-attachments/assets/4f3d2016-5be7-40f0-b6ba-0e58e105aa0e)

拉动鱼线，将弹簧头固定到位，然后安装螺丝。注意，我在螺丝刀上放了一块黑色磁铁，这样可以方便安装螺丝。

![image](https://github.com/user-attachments/assets/197173a7-c508-4813-8e24-5ebad896fd5c)

拧紧螺丝之前，先将鱼线拉出来

![image](https://github.com/user-attachments/assets/9aedb2fa-fa9c-4aa7-9bf5-25aad548c6f0)

完成拧紧。确保没有刺穿三根带状电线

![image](https://github.com/user-attachments/assets/8c955b86-8bb8-4857-859c-5823dab1dd17)

拿两根针

![image](https://github.com/user-attachments/assets/7fe6ff5d-29e2-4535-831a-8beb145dd229)

将手指的最后一部分最大限度地折叠起来，并将第一根针穿过手指和弹簧，直到它从另一侧出来。

![image](https://github.com/user-attachments/assets/1c33a577-d387-4239-847f-18ca5f898e1d)

折叠手指的第二节，并将第二根针穿过手指和弹簧，直至完全穿过。这样可以为每个手指节设置合适的张力。

![image](https://github.com/user-attachments/assets/f37e4a03-a357-4fa0-a09e-a0ccb87c6727)

用小钳子剪断针头

![image](https://github.com/user-attachments/assets/60b2d6ae-b9e3-4085-8632-bed8a963c92e)

滴一滴强力胶，确保针头不会再出来

![image](https://github.com/user-attachments/assets/3cdeabcf-b092-475c-a26b-85fb82592b5b)

是时候用拇指做同样的事情了，只有两个手指部分，所以弹簧的张力较小，不需要针

![image](https://github.com/user-attachments/assets/42b0d7ef-3eeb-4bc8-86e5-c44b07cdf656)

拇指的另一个不同之处在于，我们将螺丝拧入盖子中，从而将弹簧固定到位。确保不要刺穿电线。虽然我的图片显示已经装好了拇指盖，但先不要装上，你仍然需要接触到内部。

![image](https://github.com/user-attachments/assets/f8c12432-b0ec-4ec2-b8aa-4118486a8924)

让我们把霍尔传感器焊接到电线上。开始焊接中间的电线。注意传感器在图片上的位置，因为一侧是正极，另一侧是负极。霍尔传感器 AH3503

霍尔传感器 AH3503：https://fr.aliexpress.com/item/32899671134.html?src=google&src=google&albch=shopping&acnt=494-037-6276&isdl=y&slnk=&plac=&mtctp=&albbt=Google_7_shopping&aff_platform=google&aff_short_key=UneMJZVf&&albagn=888888&albcp=6459793138&albag=77316928277&trgt=743612850714&crea=fr32899671134&netw=u&device=c&gclid=CjwKCAiA_f3uBRAmEiwAzPuaM3NMls2FXydvh7C1B073Ng0wvuwxhDTT_k_XjAtt_-IML73q4LzrOxoCUzkQAvD_BwE&gclsrc=aw.ds

![image](https://github.com/user-attachments/assets/1972425a-9939-4240-8351-8a2842b1157e)

![image](https://github.com/user-attachments/assets/bc96fb95-8c8c-447c-89ff-192b7ab8a708)

用一小块胶带保护焊锡。我用的是Kapton胶带。这部分操作比较精细。

![image](https://github.com/user-attachments/assets/e1760d03-0705-406e-b290-30d93e49b19a)

焊接第二根和第三根电线并用胶带包裹起来

![image](https://github.com/user-attachments/assets/83468940-0e6b-44bc-9268-d78a29b2ce64)

缠绕胶带时，胶带的厚度不应超过丝带本身的厚度，否则下一步将其推下去会很困难。

![image](https://github.com/user-attachments/assets/6e2acd83-a678-4bdf-afed-8edaae572fb9)

小心地将其推回指尖

![image](https://github.com/user-attachments/assets/ac720bf2-8118-41c2-a042-76692403ea96)

这是指尖应该伸出的长度

![image](https://github.com/user-attachments/assets/2eabdf03-42b9-42b5-be12-7badc5fe59eb)

你可以拉动手掌中的电线，帮助自己将霍尔传感器推回到尖端

![image](https://github.com/user-attachments/assets/82adbf33-4ded-4987-8f22-253f509d7df9)

将钓鱼线缠绕在凹槽周围，然后小心地将手指末端拧到传感器上。

![image](https://github.com/user-attachments/assets/57de5978-bb45-4b98-99f3-21e3b49c73f0)

注意，手指末端印有小螺纹，可以顺时针旋转至指尖。请勿用力过猛，否则螺纹会损坏。

![image](https://github.com/user-attachments/assets/37977e0c-cbf2-4ced-9a53-4fd071ada312)

完成每个手指的操作。

![image](https://github.com/user-attachments/assets/b0382159-8b34-495a-a1e7-02a4f42eb2ad)

你可以用一些 16x3mm 的螺丝安装手指盖。虽然我的图片显示手指盖已经装好了，但先不要装，你仍然需要打开内部。

![image](https://github.com/user-attachments/assets/53df43ea-c462-4fe6-b6e7-b04c19e266fe)

是时候把每根线焊接到 NervoBoard 的传感器板上了。拇指放在“0”上，食指放在“1”上，大拇指放在“2”上，无名指放在“3”上，小指放在“4”上。

![image](https://github.com/user-attachments/assets/c9f9af2a-c475-4b56-8fc8-a94daefbd316)

您可以在此页面上查看有关传感器连接的更多信息：https://inmoov.fr/test-your-finger-sensor/

![image](https://github.com/user-attachments/assets/fb0b3f27-412e-42eb-8f44-caaaca38c6d1)

这里你可以看到我放置迷你模拟板的位置。你还可以在滑轮上看到，带小垫圈的螺丝是如何将鱼线用一个结固定住的。要做到这一点，你需要在你想要剪断鱼线的地方涂上一些胶水。

![image](https://github.com/user-attachments/assets/8b277c42-c4fd-4928-b6bf-bbfca11fb0a3)

要做到这一点，你需要在你想要剪断的编织线上涂点胶水，让接触胶固化。胶水可以让剪断更容易。

![image](https://github.com/user-attachments/assets/64ec4e92-c2dc-4121-8e19-6c967ed79b21)

然后，用锋利的剪刀剪掉涂有胶水的地方。

![image](https://github.com/user-attachments/assets/d141a547-8e7c-42ad-bc49-c0d953bdfb29)

按照我在图中的方式拉动你的钓鱼线，它应该会形成一个大结。

![image](https://github.com/user-attachments/assets/29b5c86d-77f1-4cae-8701-134fea36b9dc)

拧紧结，将螺钉和垫圈放在结上，并在拧紧螺钉时保持结被拉住。

![image](https://github.com/user-attachments/assets/4de50987-79b3-425b-af13-a57249657ee7)

模具中有一个孔，用于插入直径为2毫米的部件，以便在模制硅胶中形成一个复位，以便磁铁复位。圆盘磁铁直径为2.5毫米x1毫米。

圆盘磁铁直径为2.5毫米x1毫米：https://www.supermagnete.fr/eng/disc-magnets-neodymium/disc-magnet-2.5mm-1mm_S-2.5-01-N52N

![image](https://github.com/user-attachments/assets/22282bb9-54ce-4df3-ba33-95458c1867b3)

让它穿过2毫米。我使用了双组分透明RTV硅胶Ecoflex™ 00-10

![image](https://github.com/user-attachments/assets/04f78ce9-cc76-4805-b826-a56cb8f3b4ef)

用硅胶套件将每个指尖上的模制部件粘合起来

![image](https://github.com/user-attachments/assets/185a9587-f321-4a26-b6e2-cc647aa1c22b)

用指南针确定磁铁的南极。

![image](https://github.com/user-attachments/assets/9ff3cddd-e03d-47cb-916b-9f8547524c80)

将磁铁的南极朝向霍尔传感器，插入硅胶模制尖端的复位孔中。请使用木质牙签，因为任何金属工具都会粘在磁铁上。这项工作很精细，必须操作到位才能获得正确的结果。用一滴硅胶套装固定磁铁位置，并等待其干燥。使用此页面https://inmoov.fr/test-your-finger-sensor/测试您的传感器。

## 如何使用手指传感器

手指传感器可以用于各种功能。抓取鸡蛋或瓶子需要不同的压力。握手也需要检测施加的压力。触摸传感器有很多种实现方法，我做过两个版本，成本都非常低。带霍尔传感器的版本比原来的泡沫版本精确得多。

 

概括：

电子版（2 个版本）
设置
利用率


**带霍尔传感器的电子装置**

-此版本采用霍尔传感器和磁铁完成。

-当磁铁靠近霍尔传感器时，传感器会测量该值。

-该值被发送到模拟 Arduino 引脚。

-手部教程中解释了手指上传感器的组装。

![image](https://github.com/user-attachments/assets/667958b0-27b5-4643-ae75-68a0d971f115)

![image](https://github.com/user-attachments/assets/96c12c39-5f44-4c93-86cf-f5f0e7344b25)

![image](https://github.com/user-attachments/assets/eeb05fd9-86d2-40a5-8516-f03c4e863a2d)


**电子泡沫传感器**

- 手指传感器的原始版本是用 2 块铜板连接到一块防静电泡沫制成的。

-当泡沫被压缩时，两块铜板之间的电流流动更强。

-模拟 Arduino 引脚检测变化。

-手部教程中解释了手指上传感器的组装。

![image](https://github.com/user-attachments/assets/c6a16158-fbf8-4714-8c78-10a6b6fa36af)

![image](https://github.com/user-attachments/assets/519d8f25-90b7-40a2-882e-9c2c079b3452)


**设置**

打开 InMoov/config/ service_J_SensorFinger.config并进行如下设置。

[MAIN]

rightHandSensorActivated=True
rightHandSensorArduino=right

right_thumb_Psi_min=544当传感器未按下时，请在此处输入最大值。
right_thumb_Psi_low=545一般情况下，取最小值，如果使用 AH3503 霍尔传感器，则加 1。
right_thumb_Psi_mid=547一般情况下，取最小值，加 4。
right_thumb_Psi_max=550一般情况下，取最小值，加 7。

right_index_Psi_min=538
right_index_Psi_low=539
right_index_Psi_mid=542
right_index_Psi_max=545

添加每个手指传感器的值……

要检查手指传感器是否工作正常并查看其值，您可以在 Python 窗口中输入并执行：

sensorTimerStart()

并在 python 选项卡中查看结果。

您可以使用以下方法关闭传感器定时器：

sensorTimerStop()

**利用率**

<h2>我们有三个选择：</h2>

1-如果您已经设置了传感器配置文件，某些手势将自动使用传感器。

2-直接在 Arduino 上使用代码进行测试。

3-使用 MyRobotLab 中的 Python 代码进行测试。（如果您没有运行 START_INMOOV）

<h3>第一个选项：</h3>

shakehands()当手闭合时，手势将自动使用传感器。

您可以将手势所需的压力调整为 0 到 3 之间的值。当传感器达到所需压力时，手指伺服器将停止其位置并禁用。

if rightHandSensorActivated:
    rightHandSensorON()
    sleep(1.5)
    rightThumbPressure=1 # Pressure range between 0-3
    rightIndexPressure=1
    rightMajeurePressure=1
    rightRingFingerPressure=1
    rightPinkyPressure=1
    i01.rightHand.moveTo(79,170,180,180,180,180)
    sleep(2)
    rightHandSensorOFF()
else:
  i01.rightHand.moveTo(79,90,140,130,122,180)


<h3>第二种选择：</h3>

-将此代码上传到您的 Arduino 板：

// A small script to test one servo and one sensor.

// Connect one sensor cable to the PIN A0, and the other cable
// to the 5V of your Arduino.
// The servo will be connected to your power supply (Gnd,Vcc)
// and to the PIN 2 of your Arduino.
// Set the serial of your Arduino at 57600 in device manager
// More detail on connection here https://inmoov.fr/test-your-finger-sensor
    
#include <Servo.h>

const int servoPin = 2;
const int sensorPin = A0;
int sensorReading;

int position;

Servo myservo;

void setup(){
  Serial.begin(57600);
  myservo.write(30);  // Closed claw.
  position = 30;
  myservo.attach(servoPin );
}

void loop(){
  sensorReading = analogRead(sensorPin);
    Serial.print("Analog reading = ");
    Serial.print(sensorReading); // the raw analog reading
    // We'll have a few threshholds, qualitatively determined
    if (sensorReading < 25) {
    Serial.println(" - No pressure");
    } else if (sensorReading < 30) {
    Serial.println(" - Light touch");
    } else if (sensorReading < 50) {
    Serial.println(" - Light squeeze");
    } else if (sensorReading < 110) {
    Serial.println(" - Medium squeeze");
    } else if (sensorReading < 200) {
    Serial.println(" - Big squeeze");
    }
    delay(1000);
  openClaw();
  delay(3000);
  closeClaw();
  delay(3000);
}

void openClaw() {
  for (; position < 130;  position++) {
    myservo.write(position);
    if(analogRead(sensorPin) > 30)
      break;
  }
}

void closeClaw() {
  myservo.write(30);  // Go to open position
  position = 30;
}
 

- 连接传感器（以 FSR 传感器为例）和伺服电机。有些伺服电机需要的电流过大，无法直接由 Arduino 供电。如果您的伺服电机抖动或运动不稳定，请为伺服电机连接一个额外的电源，并确保将 Arduino 连接到该额外的电源，如下所示：

![image](https://github.com/user-attachments/assets/f679cee8-a6ce-4fd1-94dd-6fda5ae97c99)

-当通电时，手指会自动缓慢闭合，如果传感器检测到压力，则会在 Arduino.exe 监视器中显示信息。

-您可能需要更改代码中的传感器值以达到更好的调整。

为此，请检查监视器上的结果并根据需要直接在代码中更改这些值：

(sensorReading < 25)
(sensorReading < 30)
(sensorReading < 50)
(sensorReading < 110)
(sensorReading < 200)
 

 
<h3>第三种选择：</h3>

这里我们假设您已经安装了 MyRobotLab 并且知道如何使用它，如果没有，请先转到此页面。

-双击 MRL 目录中的“myrobotlab.jar”启动 MyRobotLab。

-按照第一个选项教程中的图像，在 Arduino 和伺服电机之间建立相同的连接。

-将此 python 脚本复制并粘贴到 MyRobotLab 中的 python 选项卡。

#这个简单的传感器 InMoov 脚本在 MyRobotLab 版本 1.0.2693 上进行了测试
#可以通过 Oscope 和手指动作看到结果。
#将一根传感器电缆连接到 PIN A0，将另一根电缆连接到 Arduino 的 5V。
#Servo 将连接到 Arduino 的引脚 2。
#根据您的Arduino板更改代码中的COM端口。

leftPort = "COM10"

Voice="US-English_Matthew"
mouth = Runtime.createAndStart("i01.mouth", "NaturalReaderSpeech")
#mouth.installComponentsAcceptLicense(Voice)
mouth.setVoice(Voice)
mouth.setRate(-10)

i01 = Runtime.createAndStart("i01", "InMoov")
i01.startMouth()
leftHand = Runtime.create("i01.leftHand","InMoovHand")
i01.startLeftHand(leftPort)
i01.leftHand.index.map(0,180,25,165)

left=Runtime.create("i01.left", "Arduino")
left.setBoard("atmega2560")
left = Runtime.start("i01.left", "Arduino")
left.connect("COM10")

 
def publishPin(pins): 
    for pin in range(0, len(pins)):
        print pins[pin].address, pins[pin].value
        if pins[pin].value<=540:
          print "No pressure"
        if pins[pin].value>=541 and pins[pin].value<=542:
          print "Low pressure"
        if pins[pin].value>=543 and pins[pin].value<=544:
          print "Soft pressure"
          FingerGoesBack()
        if pins[pin].value>=545:
          print "High pressure"
          FingerGoesBack()
          i01.mouth.speak(u"OUCH, that hurts") 
 
left.addListener("publishPinArray","python","publishPin")
sleep(5)
left.enablePin(54,1) # 54 is pin A0, Number 1 is how many polls/second

i01.leftHand.setAutoDisable(True)

def moveFingerSlowly():
    i01.leftHand.index.enable()
    i01.leftHand.index.setVelocity(25)
    sleep(2)
    i01.leftHand.index.moveTo(180)

def FingerGoesBack():
    i01.leftHand.index.enable()
    i01.leftHand.index.setVelocity(-1)
    i01.leftHand.index.moveTo(0)
 
#此简单的 InMoov 传感器脚本已在 MyRobotLab 1.1.812 版本上测试。
#结果可在 Oscope 中通过手指动作查看。
#将一根传感器线缆连接到 Arduino 的 A0 引脚，另一根线缆连接到 Arduino 的 5V 接口。
#伺服器将连接到 Arduino 的 2 引脚。
#根据您的 Arduino 开发板更改代码中的 COM 端口。


Voice="Mark" 
i01_mouth = Runtime.start("i01.mouth", "MarySpeech") 
#i01_mouth.installComponentsAcceptLicense(Voice) 
i01_mouth.setVoice(Voice) 

i01_left=Runtime.create("i01.left", "Arduino") 
i01_left.setBoard("atmega2560") 
i01_left = Runtime.start("i01.left", "Arduino") 
i01_left.connect("COM3") 

i01 = Runtime.start("i01", "InMoov2") 
i01.startMouth() 
i01_leftHand = Runtime.start("i01.leftHand","InMoov2Hand") 
i01_leftHand_index.map(0.0,180.0,0.0,180.0) 
i01_left.attach("i01.leftHand") 

 
def publishPin(pins):
    对于范围内的引脚（0，len（pins））：
        打印 pins[pin].address，pins[pin].value
        如果 pins[pin].value<=540：
          打印“无压力”
        如果 pins[pin].value>=541 且 pins[pin].value<=542：
          打印“低压”
        如果 pins[pin].value>=543 且 pins[pin].value<=544：
          打印“轻压” 
          FingerGoesBack()
        如果 pins[pin].value>=545：
          打印“高压” 
          FingerGoesBack() 
          i01.mouth.speak(u“哎哟，好疼”）
 
i01_left.addListener("publishPinArray","python","publishPin") 
sleep(5) 
i01_left.enablePin(54,1) # 54 是引脚 A0，数字 1 是每秒轮询次数

i01_leftHand.setAutoDisable(True) 

def moveFingerSlowly（）：
    i01_leftHand_index.enable（）
    i01_leftHand_index.setSpeed（25）
    睡眠（2）
    i01_leftHand_index.moveTo（180）

def FingerGoesBack（）：
    i01_leftHand_index.enable（）
    i01_leftHand_index.setSpeedy（250）
    i01_leftHand_index.moveTo（0）

-当通电时，手指会自动缓慢闭合，如果传感器检测到压力，它会在 Python 监视器中显示信息，并停止闭合并说出与他感受到的压力相关的内容。

-您可能需要更改代码中的传感器值以达到更好的调整。

为此，请检查监视器上的结果并根据需要直接在代码中更改这些值：

value<=540
value>=541
value<=542
value>=543
value<=544
value>=545
