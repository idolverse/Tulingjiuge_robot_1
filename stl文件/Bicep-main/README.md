<h1>打造 InMoov 的二头肌</h1>

我已尽量简化，希望您能在这里找到问题的答案。打印完零件后，就可以开始制作了。图中我组装的是**左臂**，如果您要组装右臂，请考虑到这一点。

从图库下载 STL

在打印所有部件之前，您应该打印一份校准器 (CALIBRATOR)，以检查部件是否能够拼合。如果您在拼合这些部件时遇到困难，可以调整切片软件的水平扩展设置来解决这个问题。此设置可能因切片机和打印机而异，但用户报告称，将其设置为 -0.15 是一个不错的起点。

填充率为 30%，壁厚为 2.5 毫米，最好没有筏，没有支撑，大部件使用边缘以避免翘曲。

以下是制作一个 右二头肌所需的零件清单和打印数量：

  1x GearHolder
  
  2x HighArmSide
  
  1x Pistonanticlock
  
  1x Pistonbaseanti
  
  1x RotGear
  
  1x RotMit
  
  2x PivPotentio (圆形或方形)
  
  1x RotTit
  
  1x RotWorm
  
  1x Rotcenter
  
  1x armtopcover1
  
  1x armtopcover2
  
  1x armtopcover3
  
  1x elbowshaftgear
  
  1x gearpotentio
  
  2x lowarmside
  
  2x reinforcer
  
  1x servobase
  
  1x servoholder
  
  1x spacer

以下是制作左二头肌所需的零件清单和打印数量：

  1x GearHolder
  
  2x HighArmSide
  
  1x Pistonanticlock
  
  1x Pistonbaseanti
  
  1x RotGear
  
  1x RotMit
  
  2x PivPotentio (圆形或方形)
  
  1x LeftRotTit
  
  1x RotWorm
  
  1x LeftRotcenter
  
  1x armtopcover1
  
  1x armtopcover2
  
  1x armtopcover3
  
  1x elbowshaftgear
  
  1x gearpotentio
  
  2x lowarmside
  
  2x reinforcer
  
  1x servobase
  
  1x servoholder
  
  1x spacer

二头肌教程视频：https://youtu.be/aHVBU02EtxY

<h2>步骤1：</h2>

在第一个教程中，我们要做的是提取两个伺服器的电位器，并通过焊接增加额外的电缆长度：

![DSC05131](https://github.com/user-attachments/assets/1afb15fe-8e7c-41bf-baf5-b867bdac3960)

我们首先要打开 Hitec HS-805BB 伺服器，拧下底部所有螺丝。它分为三个部分。务必在干净的地方进行操作，以免丢失任何东西，损坏里面的润滑脂。拆下顶部后，请记录或拍下每个齿轮的位置，仔细检查一下，有两个齿轮看起来几乎一样（如图所示）。

![DSC05132](https://github.com/user-attachments/assets/52085fd6-9ac0-4c0d-9644-e0c08637dfc1)

拆下轴承及其环（注意顺序）。拆下来可能有点困难，我用了一把放在轴承下面的小螺丝刀。

![DSC05133](https://github.com/user-attachments/assets/7affbf44-9600-42d6-a6a7-4d8b86afea45)

现在我们要移除 PCB 卡和它的电机，在某些伺服器上这很容易，但是电机周围有一点胶水，所以你可以通过按下螺丝刀尖端的小金属齿轮来将电机向下推。

这是 InMoov 构建者发布的另一个解决方案，如果您无法按照我的方式打开伺服器，当然如果您有一个焊料泵，那就更容易了：

https://youtu.be/4ia6zoRKujI

或者这个视频：

https://youtu.be/BM4oDbYcKwo

或者您也可以观看 InMoov 建造者发布的这些视频：

http://youtu.be/EwebQTuTAcw

http://youtu.be/5usFR3W61SA

http://youtu.be/5-nxuoqT8Ho

http://youtu.be/J8Q-bUT-IJ0

http://youtu.be/t1LBbmfRvOQ

这是另一组视频，其中涉及的技术是去除三个电机连接上的焊料，将电机留在原位而不是将其移除：

视频教程-Pot-Servo.rar

用于提取 JX-PDI2060MG 伺服器上的电位器的 PDF：

HowTo-JX-Servo.pdf

![DSC05134](https://github.com/user-attachments/assets/7b432be3-49bf-48ae-958e-30219ce788e5)

它出来了，拧开电位器，要将其释放出来，请参见下一张图片。

![DSC05135](https://github.com/user-attachments/assets/4fd5ec9b-1c07-4ad6-aee2-df9a049389a0)

再次使用放在大齿轮下方的小螺丝刀来帮助自己。

![DSC05136](https://github.com/user-attachments/assets/db809d98-efad-4698-bac2-42b7ba4c848b)

取出塑料垫圈（我们不再需要它了，但保留它你永远不知道......）

![DSC05137](https://github.com/user-attachments/assets/b6db27ea-1dd4-4f30-a35d-d07abe151b37)

这有点困难，用刀或钳子切开“塞子”，但不要损坏齿轮。

![DSC05138](https://github.com/user-attachments/assets/d491a1c8-b951-4ee7-b596-c88345700a85)

将所有齿轮重新安装回原位。用小刀切出一个更大的开口，以便穿过额外的电缆。从电路板和电位器上拆下电缆时，注意颜色。（我的第一个伺服电机没有焊好，接了十分钟电话，回去焊接时却记不住颜色了……这导致伺服电机永久损坏，30欧元被扔进了垃圾桶，啊啊啊）

![DSC05140](https://github.com/user-attachments/assets/3f95e8fe-a85f-4fcd-af8c-f0044f5d2fbb)

在焊接二头肌下部的电位器之前，请将电缆放入“servoholderV1”的间隙中。

重要提示：请勿将电位器导线从伺服电机的PCB上拆焊，只需剪断并焊接所需长度即可。一些安装人员报告称，将电位器导线直接焊接到PCB控制器上后，伺服电机无法正常工作。某些组件可能对温度非常敏感。

对于二头肌下部舵机，线缆的焊接顺序应与打开舵机时的颜色顺序一致。线缆长度约为 25/30 厘米。现在我们开始组装零件。

如果您无法按照我的方式打开伺服器，这里还有另一个解决方案（由 Wayne Kinne 提供），当然，如果您有焊锡泵，那就更容易了：

https://youtu.be/4ia6zoRKujI
您还可以观看由 InMoov 构建者 (byKaibab) 发布的这些视频：

http://youtu.be/EwebQTuTAcw
http://youtu.be/5usFR3W61SA
http://youtu.be/5-nxuoqT8Ho
http://youtu.be/J8Q-bUT-IJ0
http://youtu.be/t1LBbmfRvOQ

这是另一组视频（由 Yann Huguenin 制作），其中涉及的技术是去除三个电机连接上的焊料，将电机留在原位而不是将其移除：

视频教程-Pot-Servo.rar

<h2>步骤2：</h2>

![DSC05108](https://github.com/user-attachments/assets/f5fc76d7-7b91-4437-a88d-4b0d2f174d0b)

这张图片是为了展示“rotgearV1”和“rotmitV1”的角度位置。检查那个小矩形孔。

![DSC05113](https://github.com/user-attachments/assets/54bd3cbd-248b-42e2-a660-155476c0d5ad)

保持相同的旋转角度，将“rotmitV1”安装到“rotgearV1”上。（不要参考这张图片来判断角度，你下载的零件已经不一样了）

![DSC05114](https://github.com/user-attachments/assets/e66e3298-644b-4e84-b15e-ea55535b4be0)

我使用了夹子，以确保三个部件在拧紧过程中不会相互卡住。确保螺丝不会脱出来，否则需要重新切割。（不要参考这张图片的角度，你下载的部件已经不一样了）

![DSC05107](https://github.com/user-attachments/assets/3469c0c9-762d-40ab-bc06-e964ea6f6bf4)

将一个伺服器连接到“rotcenterV1”。操作方法：安装白色执行器轮，但不要太紧。

![DSC05106](https://github.com/user-attachments/assets/6be065c4-06ef-4fe2-a391-7f0a6069f6ea)

一旦伺服器连接好，就可以拧紧螺丝。

![DSC05104](https://github.com/user-attachments/assets/73ec2fc9-e151-47d6-b405-42ef22e7d2dd)

用 4 颗小螺丝将“rotwormV4”安装到执行器上，确保它们不会从执行器后面脱落，否则就得把它们剪掉。将“rotgearV2”安装到“rotcenterV2”上，它应该可以轻松转动，不会出现间隙。我把伺服器插到 Arduino 上，让它转动了几圈。然后，我清理了零件产生的灰尘。在用“rotTitV1”盖上盒子之前，在齿轮的每个地方都涂上足量的润滑脂。

![DSC05319](https://github.com/user-attachments/assets/6b3c03c9-f8b6-4739-8594-89e0e4097c90)

如果您正在构建左旋转臂，则电缆的焊接顺序应与打开伺服器时的颜色顺序相同。

![DSC05320](https://github.com/user-attachments/assets/ca142e1e-ed9a-4d0d-bc49-1a99bf75983c)

如果您正在构建正确的旋转臂，则电缆应按照与打开伺服器时相反的颜色顺序进行焊接。

![DSC05110](https://github.com/user-attachments/assets/73ccebc7-54e2-4371-93d9-e58f25d13b89)

将电位器安装到“rotpotentioV2”上，但务必将电位器上的小金属片放入“rotpotentioV2”设计的间隙中。可以使用小型舵机上的一些备用螺丝。

![image](https://github.com/user-attachments/assets/83fa3414-8f29-4133-868b-bf627500f986)

附言：“rotmitV2 不应该站在上面三张图片的左侧，因为你已经骑上它了……

![DSC05116](https://github.com/user-attachments/assets/d2413806-2f99-4c77-b892-1b2f84708a63)

将“pistonanticlockV1”缓入“pistonbaseV1”。我用一根金属棒加固了“pistonanticlockV1”的内部。不过你可以像这样使用它，它应该能撑住。我在测试过程中弄坏了几个，很高兴它们坏了而不是别的。

![DSC05115](https://github.com/user-attachments/assets/fc80303e-a4f1-41eb-92f4-5c073e21c0a0)

将“higharmV1”和“rotmitV1”组装起来，用钳子，ABS材质的它完美契合，感觉就像在玩乐高积木一样。确保它们的位置与图片上的位置一致。

![DSC05117](https://github.com/user-attachments/assets/67eac780-ab37-4325-9d06-2d14616e85a9)

添加“pistonbaseV1”和“spacerV1”。连接电位器，再次确保将电位器上的小金属板放置在设计的间隙中。

![DSC05119](https://github.com/user-attachments/assets/bf60a3ec-d9ea-4fce-994d-b2d253e8a3a9)

组装“higharmV1”和“lowarmV1”的剩余部分。测试完成后，你需要将这些部件粘合起来。

![DSC05123](https://github.com/user-attachments/assets/9272072e-bc0b-4b85-94d9-aa176ed0ffdd)

将伺服器安装在“servoholderV1”中。

![DSC05125](https://github.com/user-attachments/assets/71372dc4-a06b-499c-aee5-17544062456c)

按图示铺设电缆。

![DSC05126](https://github.com/user-attachments/assets/54bed72f-1f24-46a3-b6ff-f21eb9f73937)

按照图中所示，将电缆沿着框架向下折叠，我用了铝箔胶带，这样可以避免在操作过程中夹住电缆。对电位器导线的另一侧也进行同样的操作。

![DSC05166bis-1024x776](https://github.com/user-attachments/assets/43cdb58a-3ac7-41c5-8a55-1cf97eab9359)

将“servobaseV1”和“pistonanticlockV1”连接到执行器。

![DSC05127](https://github.com/user-attachments/assets/3a7b1451-6f8b-4f7b-8bcb-2cca50e70ac7)

将“pistonanticlockV1”归还给“pistonbaseV1”。加点润滑油是个好主意。

所以我假设你已经把“ elbowshaftgearV1 ”粘贴到“robcap3V1”上了。这样你也把前臂和二头肌连接起来了。很好。

![DSC05129](https://github.com/user-attachments/assets/8a2089f9-c0b1-4104-a333-6e2a17929bd4)

接下来是我最难解释的部分。现在把“伺服底座”向下倾斜，并将其安装到前臂上。

![DSC05128](https://github.com/user-attachments/assets/4883b758-5d45-4c0c-bab4-16bed959829b)

你应该在它的底部留出一个空隙，这将是你的0°位置。把整条手臂固定或标记在这个位置，在接下来的步骤中不要弄丢它。

![servogun-600x450](https://github.com/user-attachments/assets/9390f214-dd58-4c41-b462-5d8b20072ec5)

卸下舵机枪。将舵机插入Arduino开发板，运行程序获取舵机的0°位置，舵机将持续旋转。现在用手转动电位器，直到舵机停止转动。这就是0°位置。

![DSC05166](https://github.com/user-attachments/assets/41a84fcb-5cc1-4832-bd56-ceeb58bba78f)

将“potentiogearV1”安装在电位器上，确保臂和电位器不会移动。

![DSC05168](https://github.com/user-attachments/assets/324fc697-ffbe-494a-aad1-ce06f2d13331)

将“gearholderV1”卡入。两个齿轮之间不应有间隙。保持伺服枪未安装，并像之前一样使用Arduino进行0°测试。您可以用手缓慢地将手臂移动到关闭位置和打开位置，以检查一切正常。重新安装伺服枪。

![DSC05128](https://github.com/user-attachments/assets/f2f02b31-dc9a-45e0-8dd2-6c32325cb656)

关键时刻到了。重新运行测试，直到0°。机械臂应该打开，并保持之前在底部看到的间隙。否则，“pistonanticlockV1”会断裂。

![DSC05169](https://github.com/user-attachments/assets/dd52a5f5-d78c-4663-9250-2028990ef130)

再进行一次从0°到60°的测试。检查“pistonanticlockV1”和“pistonbaseV1”之间剩余的空间。我的手臂可以旋转到90°，但要注意，这取决于你设置的间隙。所以，尝试10°乘以10°。记住，在绘制草图时，不要超出你得到的最佳结果。
现在，你可以将连接到“rotcenterV1”的舵机旋转到90°进行测试，这将是手臂在连接到下一个肩部时的“静止”位置。

在二头肌上添加盖子以加强结构。

这些部件上没有支撑结构需要移除。但你需要切割部件之间的微小连接点才能将它们分开。切割刀片适用于 ABS 材料，如果使用 PLA 材料打印，则可能需要使用带齿的刀。

![Bicep3](https://github.com/user-attachments/assets/199b4f9f-4860-4cfd-aed4-6603697dcc7e)

将盖子粘在一起以匹配二头肌，如下图所示：

![Bicep2](https://github.com/user-attachments/assets/e6e44854-b154-4970-b7be-99116b1dcaf1)

通常情况下你应该已经设置好了。

