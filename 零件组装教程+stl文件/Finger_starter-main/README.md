<h1>手指启动器</h1>

![image](https://github.com/user-attachments/assets/e11c5040-58f2-4373-818e-6e0ab84f2eed)

“Finger Starter” 的组装视频：https://youtu.be/0t2uhAyf2-c

从 Gallery 下载 STL 文件。

在打印所有部件之前，您应该打印 CALIBRATOR，以检查您的部件是否适合在一起。如果您很难将这些部分放在一起，调整切片器软件的水平扩展设置可以解决这个问题，此设置可能会因您的切片器和打印机而异，但用户报告将其设置为 -0.15 是一个很好的起点。

以下是 1 个 Finger Starter 所需的部件列表和打印件数量：

1x FingerIndex

1x FingerTester

1x RobRing

1x Servo-Pulley

这将会很有趣！！
我们将把一根手指组装到一个小型伺服器上，以便用 Arduino 开发板对其进行测试。我在图片上使用的伺服器是数字 HK15298，但您也可以使用便宜的模拟 MG995，如果您能找到更便宜的伺服器并且尺寸规格相同，甚至可以使用更便宜的伺服器。
这里使用的 Arduino 开发板是 Arduino Uno。最好添加外部电源，因为即使这些伺服器很小，它们也会消耗太多电流，这可能会导致开发板重启。
在本教程的最后，还有一张图片，说明如何简单地将伺服器连接到开发板。
请记住：此连接设置只能为低安培的单个伺服器供电，如果您的开发板自行重置，或者伺服器抖动，则意味着您的伺服器的功耗对于电源引脚来说太高。您将需要一个外部电源。

有关连接和电源，请参见此处：https://inmoov.blogspot.com/2012/12/power-supply-robot-head-printed.html
这些连接图主要针对整个手，但对于一个伺服器/手指或五个伺服器/手指来说都是相同的。

我在这个教程中使用的拉竿是尼龙钓鱼竿，但效果不太好，因为它容易随着时间的推移而拉伸。我推荐使用 InMoov 的 200 磅钓鱼线。不过，在这个测试中，你可以使用任何手边现有的线，只要它能拉动，并且足够细，可以让手指弯曲。

现在让我们看看我们打印了什么以及我们将如何做。

![image](https://github.com/user-attachments/assets/5ec851ff-a57c-44d5-9847-c16a130e2357)

![image](https://github.com/user-attachments/assets/71942264-00af-45b1-a556-0714ad8ff87b)

使用 3 毫米钻头重新钻侧面的铰链孔。

![image](https://github.com/user-attachments/assets/d6775dcb-cde7-44b2-8322-7ac950d0b7bb)

应使用 3.5 毫米钻头重新钻内部铰链孔。

![image](https://github.com/user-attachments/assets/7838702e-26f7-4480-9b68-465f2b46d6a5)

因此，手指的内部铰链也应该用 3.5 毫米的钻头来完成。

![image](https://github.com/user-attachments/assets/0052f522-7183-4533-bbf7-050cbe9b736b)

请注意，手指各部分都印有数字，以便于组装。

![image](https://github.com/user-attachments/assets/2e780e27-d6e7-432d-9620-0671f1236d09)

根据您用于打印的材料，有不同的方法将各个部分粘合在一起。

如果您有 PLA 打印件，双组分环氧胶非常适合，但您也可以使用 Zap-A-Gap 胶。

如果您使用 ABS 进行打印，那么效果最好的是丙酮，但您也可以使用环氧树脂、Zap-A-Gap 胶水。

![image](https://github.com/user-attachments/assets/8861c3ac-7680-4a39-a367-83567327bae3)

滴几滴丙酮就能把各个部件溶解粘合在一起，就像打印成一体一样。所以，把第1部分和第2部分取出，然后把它们粘在一起。

![image](https://github.com/user-attachments/assets/65aa3d0b-2b32-4636-bcc2-1597c77d6504)

将第 3 部分和第 4 部分粘合在一起。

![image](https://github.com/user-attachments/assets/359d9b6a-8692-4f0a-a00d-06b738887817)

先不要粘合第 5 和第 6 部分

![image](https://github.com/user-attachments/assets/1566c832-c008-4c74-9aca-a40ca598c68e)

取一段 3 毫米的灯丝，如果没有，则需要从五金店买一些 3 毫米的螺丝。

![image](https://github.com/user-attachments/assets/fdefec1f-f731-4e3c-9aee-9ec4fb413f3f)

用切刀将其修剪。

![image](https://github.com/user-attachments/assets/79e8f531-47e3-4c55-bb83-6511b26031cc)

将其推入孔中，将 1/2 至 3/4 部分组装在一起。

![image](https://github.com/user-attachments/assets/684aba5b-a5ae-4beb-b1f2-77246ec6d5e8)

一旦到达另一边，

![image](https://github.com/user-attachments/assets/cc89bd89-9e30-4a65-a262-5d220e4e627f)

用钳子剪断灯丝。

![image](https://github.com/user-attachments/assets/6d64f476-b338-4148-bcc0-b2a8652294d6)

对第 3/4 至 5 部分使用同样的技巧

![image](https://github.com/user-attachments/assets/042b0e39-0225-4c7a-9737-84494ef4327a)

现在我们的手指可以自由移动了。

![image](https://github.com/user-attachments/assets/387609c8-c183-472c-a311-13daa1e5a32f)

用同样的技术将手指组装到主体部分。

![image](https://github.com/user-attachments/assets/6c9f8bdd-2a6a-407b-bb13-11b8e70bf5f5)

你应该有类似这样的东西。它应该可以自由折叠到这个角度。

![image](https://github.com/user-attachments/assets/04b3071e-e49e-4142-879f-ed489e5863ec)

现在让我们看看伺服器。我们要在伺服器上找到一个任意零点。用手将执行器旋转到最左侧，并记录它到达的位置。向左旋转执行器，并记录它到达的位置。这两个点是伺服器的极限位置，任意零点位于这两个点的中间。如果你知道如何操作，你可以用你的Arduino开发板找到它，但目前这是一个简单的解决方案，尽管它并不精确。

![image](https://github.com/user-attachments/assets/ce6085e2-a319-41c5-9b11-88b057091f23)

安装，将“RobRing”拧到伺服器上，两个小孔应该位于极端点上。

![image](https://github.com/user-attachments/assets/d2b76825-6b9c-4322-8174-7820178110ca)

取一根约50厘米长的鱼竿，将其穿过一个孔。

![image](https://github.com/user-attachments/assets/6db97bb7-7321-465a-b914-d12f9ca3db50)

像这样，在距离鱼竿约 25 厘米处打两个结，并将它们打紧。

![image](https://github.com/user-attachments/assets/2861f9ed-0c6e-4ae9-ba8f-434085f8f836)

在距离第一组结约 1 厘米处添加另一组结。

![image](https://github.com/user-attachments/assets/988e7233-8d2b-40d2-a45a-78faedc566ed)

我的照片上只打了两个这样的结，但它们可能会穿过“RobRing”的孔，这是不应该发生的。多打几个结可以避免这种情况。

![image](https://github.com/user-attachments/assets/b6e7a14c-6be6-4d60-b6d9-dc0aada2eff0)

现在将杆的另一端穿过第二个孔。

![image](https://github.com/user-attachments/assets/eee0bb66-b63f-4578-842f-6d023ce17cc0)

你应该有类似的东西，甚至比我的结还多。

![image](https://github.com/user-attachments/assets/66791b63-7c36-42c0-8207-0e7916ccafb4)

是时候将伺服器固定到基座上了。

![image](https://github.com/user-attachments/assets/257e63f1-891d-4054-b72d-3cd74b9303c8)

将底部杆穿过如下图所示的部件。

![image](https://github.com/user-attachments/assets/ef971dba-8d81-4774-ac7e-364e0be2e5e5)

只要确保不要倒置你的钓竿，它应该始终位于手指背面。

![image](https://github.com/user-attachments/assets/db2c6364-8cc7-403e-9530-a5db94f59ea9)

现在将第二根杆放在手指内侧。

![image](https://github.com/user-attachments/assets/6bb50cf1-91c6-4e3f-92a1-cc51db8003f6)

你应该以这样的结局结束。

![image](https://github.com/user-attachments/assets/954cb038-7bf2-4f58-b6ae-57fc14a4bbdc)

检查你的伺服器是否处于其零任意点。

![image](https://github.com/user-attachments/assets/87e97852-9f77-480e-9166-1aaf1b39dd4c)

将手指稍微卷曲，并在两根电线之间打几个结。

![image](https://github.com/user-attachments/assets/35a73937-c059-4cce-9b45-20843539d8f9)

用手转动“RobRing”时，手指应该能够处于这个位置。手指完全伸展。

![image](https://github.com/user-attachments/assets/c4d9424a-3d62-4d6f-8d53-3ab8944dd3cf)

现在切割杆。

![image](https://github.com/user-attachments/assets/791a5184-ca95-4d2e-8825-d4a6d2dfb3ad)

将第 6 部分粘到第 5 部分。如果仔细观察第 6 部分，就会发现它有一个钉子侧面，出于美观原因，我没有在钉子上写上数字。

![image](https://github.com/user-attachments/assets/ea43e3b5-29be-46d3-a7a2-7413c69c002c)

尝试通过旋转“RobRing”来移动手指，它应该可以自由移动而不会锁定。

![image](https://github.com/user-attachments/assets/de05c94b-7ebd-4da9-994d-49ec9d336eda)

插入 Arduino 开发板并进行如下接线。橙色或黄色线连接 PWM 的 3 号引脚。红色线连接 +5V。黑色或棕色线连接 Gnd（地线）。

请记住：此连接设置只能为单个低安培的舵机供电。如果您的开发板自动复位，或者舵机抖动，则意味着舵机的功耗对于电源引脚来说过高。您需要外部电源。（请参阅本教程开头）

现在，您可以将FingerStarter 代码（已保存至FingerStarter 代码.txt）上传到您的 Arduino 来查看它的运行情况。如果您以前从未使用过 Arduino，请点击此链接：https://www.arduino.cc/en/Guide/。或使用 Arduino简介 PDF 文件。

您还可以访问 MyRobotLab，学习如何使用滑块驱动手指。按照教程（如何启动 MyRobotLab）开始使用 Myrobotlab。自从我撰写本文以来，情况发生了一些变化，但它有助于理解基础知识。

以下是使用 MyRobotLab 对 FingerStarter 进行语音控制的脚本：

对于 Manticore–>带语音控制的 InMoovFingerStarter：https://github.com/MyRobotLab/myrobotlab/blob/master/src/resource/InMoov/InMoov.minimalFingerStarter.py

对于 Nixie–>带语音控制的 InMoovFingerStarter（已保存至InMoov.minimalFingerStarter.py）：https://inmoov.fr/fingerstarter-with-voice-control/

如果您有一些肌肉传感器或超声波传感器，您可以尝试用它们控制手指启动器。

– inmoov_fingerstarter_muscle_sensor
– inmoov_fingerstarter_ultrasound
