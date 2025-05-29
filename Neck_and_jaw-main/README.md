<h1>颈部和下颌的组装</h1>

好的，我想你的躯干应该已经组装好了，或者差不多了。颈部的组装应该不会太难。用到的伺服器都不需要改装，可以直接设置。太棒了。

从图库下载 STL(已下载)

在打印所有部件之前，您应该打印一份校准器 (CALIBRATOR)，以检查部件是否能够拼合。如果您在拼合这些部件时遇到困难，可以调整切片软件的水平扩展设置来解决这个问题。此设置可能因切片机和打印机而异，但用户报告称，将其设置为 -0.15 是一个不错的起点。

填充率为 30%，壁厚为 2.5 毫米，最好无筏，无支撑（除非另有说明），大部件使用边缘以避免翘曲。

注意：我设计了一种新的颈部机制，可以在图库中下载，但未在下面的教程中显示。（见newNeck.mp4）

以下是颈部和下颌所需的零件清单和打印数量：

1x JawHinge

1x JawHinge

1x JawPiston

1x JawSupport

1x Jaw

1x LowBack

1x FaceHolder

1x GearHolder

1x MainGear

1x NeckBolts

1x NeckHinge

1x Neck

1x Ring

1x ServoGear

1x SkullServoFix

1x ThroatHolder

1x ThroatHole

1x ThroatPistonBase

1x ThroatPiston

![DSC05275](https://github.com/user-attachments/assets/d8cca34e-1bab-4dbc-b650-2e736a72dbc1)

将“MainGear”用胶水或螺丝固定到“NeckHinge”上

![DSC05280](https://github.com/user-attachments/assets/5b52de84-2f50-42e3-8b28-b5d39388a86a)

使用“GearHolder”并将“ServoGear”安装到其中。将随 HS-805BB 舵机一起提供的执行器轮拧到“ServoGear”上。

![DSC05282](https://github.com/user-attachments/assets/b3159d06-03b8-4e13-9fc6-cb227bf859fa)

使用您的 Arduino 板并将您的 HS-805BB 伺服设置为 90°。
将其推入转盘。

![DSC05283](https://github.com/user-attachments/assets/d8c28277-f7ab-41d0-91c6-f8d7a276cbb7)

这有点棘手，但可以用螺丝刀上的磁铁来实现。使用舵机附带的螺丝，将转盘拧到“ServoGear”内的舵机上。保持舵机呈90°。

![image](https://github.com/user-attachments/assets/516062e7-6f13-4378-b771-c77d9e57d13d)

将此组件安装到“MainGear”和“NeckHinge”组件上，并使用一些润滑脂以减轻旋转。“GearHolder”应与“NeckHinge”对齐，并且伺服器应保持90°。

![DSC05285](https://github.com/user-attachments/assets/b0d34eec-9462-4772-98c6-a96bb5a5150c)

将“LowBackRight”和“LowBackLeft”或“Temporary”固定到“GearHolder”。这将是头骨的后部。

![DSC05286](https://github.com/user-attachments/assets/dfce0afa-774f-445d-9513-9b7dc2b13e42)

将“Ring”拧到“MainGear”上。尽量避免零件之间松弛。

![DSC05288](https://github.com/user-attachments/assets/38169296-3911-4b11-8a5c-453ea30c0a79)

使用您最喜欢的钳子来安装“FaceHolder”。
您可以安装它们两个。

![DSC05439](https://github.com/user-attachments/assets/75e505d2-9e11-4877-b15d-21c5554cba2c)

现在我们来制作下巴。取“JawPiston”并将其旋转到“JawHinge”内部，直到它们之间偏移1cm。

![DSC05813](https://github.com/user-attachments/assets/40163a2d-143c-4aa8-b94d-24f4ac378ec3)

将此螺丝安装到 HK15298 或类似舵机的转盘上。使用 Arduino 开发板将舵机设置为 0°。保持 1cm 的偏移，“JawHinge” 应与舵机成 90° 角安装。

![image](https://github.com/user-attachments/assets/f992088b-2484-4d05-8585-59044c4cffc3)

将螺丝“SkullServoFix”安装在 HS-805BB 伺服器上。

![DSC05816](https://github.com/user-attachments/assets/5e11084e-74c9-41e3-b8dc-a622fc7e3677)

把4个螺丝全部拧上。别介意我照片上的电线，它们来自相机。

![image](https://github.com/user-attachments/assets/0d89dee2-9866-4313-8f47-c142d563ca36)

用丙酮将两个“JawHolders”粘在整个组件的两侧。它与“FaceHolders”贴合。

![image](https://github.com/user-attachments/assets/c0c94149-3b71-40ff-a07b-d6e88f62f5a7)

现在取出您的 HK15298 组件并将其滑过。

![DSC05822](https://github.com/user-attachments/assets/09e9bee5-6fa9-4921-a5c7-85596d3c3c8f)

拧上所有 4 颗螺丝，固定您的 HK15298 伺服器。

![DSC05324](https://github.com/user-attachments/assets/af50a350-2242-409a-b095-2b79beca92dc)

移除“Jaw”的预支撑。图片上显示的“Jaw”只是一半。这是我之前做的测试打印。你的“Jaw”是一体式打印。

![DSC05824](https://github.com/user-attachments/assets/85e0c55d-d6b4-43ae-8cd2-8cd5b6855803)

将“Jawsupport”拧到“Jaw”上。确保“Jawsupport”的平面朝内。

![DSC05832](https://github.com/user-attachments/assets/93d7a69d-d1f9-476f-9c8d-cb1e9373d444)

修复“ThroatHole”的问题。我的看起来和你的不一样。抱歉，图片显示“ThroatPiston”和“ThroatPistonBase”应该还没有安装，后续步骤会安装。

![DSC05833](https://github.com/user-attachments/assets/d46d9fa4-5efb-4d46-a770-173461bda8ff)

将“Neck”拧到“ThroatHole”上。

![DSC05831](https://github.com/user-attachments/assets/aff555f3-7e8e-4672-9de3-cef44fba1c88)

用 8 毫米螺栓将“NeckHinge”固定到“Neck”上（或从手上打印一个）
假设您已将 HS-805BB 舵机固定在躯干组件中。使用 Arduino 开发板将舵机旋转 90°。稍微旋转“ThroatPiston”和“ThroatPistonBase”，使“NeckHinge”平直。

![DSC05830](https://github.com/user-attachments/assets/5e4bf52f-65f8-4de7-a7c6-4ab08f3c008f)

将“ThroatPiston”拧到转盘上，使伺服器保持 90°。

![DSC05826](https://github.com/user-attachments/assets/4b5a9935-513f-43d2-ab09-909c3f327eab)

用 8 毫米螺栓将“ThroatPistonBase”固定到“NeckHinge”（或从手上打印一个）
现在，当伺服电机从 0 度旋转到 180 度时，整个头部应该能够上下移动。用 arduino 进行测试。请仔细运行此测试。

![DSC05827](https://github.com/user-attachments/assets/8deeaf39-e879-48c5-b1eb-549005b830f9)

将头部抬起，将下颌组件滑入头部。

![image](https://github.com/user-attachments/assets/2978ed38-ed7e-4460-bd67-ea96dd6487bb)

将“JawSupports”穿过并安装到“JawHinges”和“JawHolders”上

![image](https://github.com/user-attachments/assets/96a8470c-b39a-4172-9659-e9fd8cc34d4f)

使用垫圈，固定螺丝。

使用 Arduino 对钳口机构进行测试。

注意：钳口伺服器只能旋转 0 到 20°（我估计），如果旋转超过 20° 可能会损坏零件。请自行测试。（目前我记不清我的伺服器具体能旋转到多少度了。等我重新插上电源后再解决这个问题。）

您可以在“Neck”中运行伺服器的电缆。

现在您应该可以通过 Arduino 移动头部和下巴了。

将 MyRobotLab 与InMoov.minimalHead.py结合使用：https://github.com/MyRobotLab/pyrobotlab/blob/develop/service/InMoovHead.py

检查InMoov 服务 Myrobotlab的引脚连接以将其添加到您的机器人。

