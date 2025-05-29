<h1>上腹部：</h1>

从图库下载 STL 文件

在打印所有部件之前，您应该打印一份校准器 (CALIBRATOR)，以检查部件是否能够拼合。如果您在拼合这些部件时遇到困难，可以调整切片软件的水平扩展设置来解决这个问题。此设置可能因切片机和打印机而异，但用户报告称，将其设置为 -0.15 是一个不错的起点。

填充率为 30%，壁厚为 2.5 毫米，最好无筏，无支撑（除非另有说明），大部件使用边缘以避免翘曲。

您需要打印以下所有部分：

1 x DiskIntern

1 x TStomSpacer

1 x TStomRotFront

1 x TStomRotBack

1 x TStomPotHolder

1 x TStomCovRight

1 x TStomCovLeft

1 x TStoServoHolster

1 x TStoPistonRight

1 x TStoPistonLeft

2 x TStoMiddle

1 x TStoFrontStand

1 x TStoFrontRight

1 x TStoFrontLeft

1 x TStoBackStandRight

1 x TStoBackStandLeft

1 x TStoBackRight

1 x TStoBackLeft

1 x StomGear

1 x StoGearAttach

1 x ServoBack

1 x RollFrontRight

1 x RollFrontLeft

1 x RollBackRight

1 x RollBackLeft

1 x DiskUnder

4 x DiskExtern

你需要两个 HS805BB 舵机，需要进行破解。两个舵机只使用一块舵机板和一个电位器，这样两个舵机就能同步旋转。教程里会讲解如何操作。

你需要大约50到60个直径6毫米的球来制作轴承。BB枪的轴承材质可以是钢制的，也可以是塑料的。

你还需要（为了好玩）一个Adafruit 的 Neo Pixel Ring：https://www.adafruit.com/product/1463。目前我使用一块额外的 Nano Arduino 板来控制它，但希望它能集成到 MRL 中，这样我们就能把它连接到我们的 Mega 板上。

![image](https://github.com/user-attachments/assets/577328b4-9ade-4c4e-a2a3-1d04c3245018)

![image](https://github.com/user-attachments/assets/197c3002-d759-47f7-b0e6-283075bef9aa)

![image](https://github.com/user-attachments/assets/288e99c1-3fdc-4409-b544-e07b8e5c76df)

![image](https://github.com/user-attachments/assets/27347da6-27c3-41c8-9ca7-2a21a0c26289)

![image](https://github.com/user-attachments/assets/368a017d-d679-4531-a580-adceddc560e7)

![image](https://github.com/user-attachments/assets/6c360e5d-0123-493c-bf45-3c724a64a9b1)

![image](https://github.com/user-attachments/assets/be8cf3ac-4d3d-4ba6-8b04-454d5cf5ec82)

![image](https://github.com/user-attachments/assets/670343c2-9d6b-4c11-8f37-ea39f7175304)

![image](https://github.com/user-attachments/assets/df3bd4a6-fa9d-4131-9d1a-5a74c248f4fc)

![image](https://github.com/user-attachments/assets/be58e927-8fb9-41bf-85ff-cc951551dafa)

![image](https://github.com/user-attachments/assets/a83ffc50-f17b-472a-9eb7-d7cab9a27af7)

顶级腹部教程由 Sebastien 完成并分享

需要对两个伺服器进行破解才能使其连续旋转。

两个伺服器中的一个将由另一个控制，因此您必须移除该伺服器的电路板和电位器（请妥善保管以备备用，以防有一天您烧毁了 805B 伺服器控制板）。

![image](https://github.com/user-attachments/assets/0e4a9a70-e8a3-48fe-9c37-2a2cb71c44f2)

![image](https://github.com/user-attachments/assets/8055c18b-334f-4b5a-9ae6-583b21aba13d)

![image](https://github.com/user-attachments/assets/af4440a4-4209-4ea6-bd90-8ff971273767)

![image](https://github.com/user-attachments/assets/1c0128b9-4214-46f6-9961-c4cdc9e9b8b9)

![image](https://github.com/user-attachments/assets/1aef965d-6fdd-4c9e-aab9-7dc25b695f3e)

我需要剪断白色连接线，才能把两个舵机安装到支架上。如果其中一个需要更换，也最好这么做。

如果一切正常，使用 arduino 上的扫描示例脚本进行快速测试应该会产生您在该视频上看到的内容……

https://youtu.be/FAYjdWADEp8
