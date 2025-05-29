<h1>Head-i2</h1>

从图库下载 STL 文件。(已保存至头部STL)

在打印所有部件之前，您应该打印一份校准器 (CALIBRATOR)，以检查部件是否能够拼合。如果您在拼合这些部件时遇到困难，可以调整切片软件的水平扩展设置来解决这个问题。此设置可能因切片机和打印机而异，但用户报告称，将其设置为 -0.15 是一个不错的起点。

模具尺寸很大，需要很大的打印面积。在开始构建打印头之前，请检查它是否适合您的打印机。标准的220x220毫米打印床尺寸就足够了。我打印的模具厚度为0.4毫米，因为之后会在所有表面涂抹底漆填料。我使用的是Upol UHS高强度底漆S 2021 G/I及其快速固化剂S 2021/I。您可以使用装在喷雾罐中的底漆填料，进行测试，看看硅胶是否与您找到的底漆反应良好。

硅胶参考号为 Smooth-On Ecoflex 00-10。一片皮肤大约需要 500/600 克。你可以用油漆或颜料给硅胶上色。你也可以添加植绒，让它有皮肤般的质感。因为皮肤颜色很浅，而且略微透明，所以只需添加少量即可。主要添加白色，然后是一些红色和一点点黄色。

铸造前必须使用脱模剂，例如蜡喷剂。型号：Alchemie R5。

1 PCA9685（adafruit 16通道）

15 个伺服器 JX PDI 1109MG（避免使用廉价的 SG90，它们不会持续很长时间）

2个伺服器 JX PDI 6221MG

28块钕磁铁，10×1.5mm

1 或 2 个微型摄像头（选择带自动对焦的 type2）https://fr.aliexpress.com/item/1005004200917640.html?spm=a2g0o.order_list.order_list_main.76.40465e5b637U38&gatewayAdapt=glo2fra

6 x M3 六角螺母

6 x M3 x 14mm 沉头螺钉

6 x 0.8 x 6mm 长自攻螺钉

4 x 十字槽头 4g x 6.5mm 自攻沉头螺钉

2 x M3 x 20mm 长螺丝

<h2>i2Head教程</h2>

以下是头部所需的零件清单和打印数量：

1x BottomTeeth

1x CheekPuller

1x EarLock (添加支撑)

1x EyebrowSupport

1x Eyebrow

1x FaceHolderLeft

1x FaceHolderRight

1x ForHeadSupport

1x ForHeads

1x GearHolder

1x JawHinge

1x JawPiston (添加支撑)

1x JawSupport

1x Jaw

1x LowBack (兼容原装头)

1x MainGear (兼容原装头)

1x UpperLip

1x Ring (兼容原装头)

1x ServoGear (兼容原装头)

1x SkullServoFix

1x TeethTopHolder

1x TopBackskull (兼容原装头)

1x TopTeeth

1x TopskullFront

1x Topskull (兼容原装头)

1x servoAdapter (仅当您使用比 HS805BB 更小的伺服器来旋转头部时)

1x servoHornAdapter (仅当您使用比 HS805BB 更小的伺服器来旋转头部时)

以 30% 的填充率、2 毫米的壁厚进行打印，检查需要支撑的部分。

以下是模具所需的零件清单和打印数量，选择“Male”或“Female”：

1x InnerMiddleMold

1x InnerSidesMold

1x OuterBottomMoldFemale（添加支撑）

1x OuterBottomMoldMale（添加支撑）

1x OuterTopMoldFemale（添加支撑）

1x OuterTopMoldMale（添加支撑）

以 15% 的填充率、壁厚 2 毫米进行打印，检查需要支撑的部分。

**i2Head教程**

![image](https://github.com/user-attachments/assets/b6e970bf-d2a1-433e-a783-b2afe66d949b)

使用 4 颗螺丝（3mmx16mm）将 MainGear 和 NeckPlateHigh 组装在一起。

![image](https://github.com/user-attachments/assets/97d609a2-62b6-4974-b1b7-812c8f7f6e35)

![image](https://github.com/user-attachments/assets/6fa61a11-5d24-48fb-b364-82010607db56)

在顶部添加 ServoGear。

![image](https://github.com/user-attachments/assets/fce05f30-5e8f-4bf9-bd26-a8c64dea5cbe)

滑过 GearHolder，确保它可以在两个方向上自由旋转。

![image](https://github.com/user-attachments/assets/82d9f9b7-34a2-4543-9ad0-5be1b0658978)

将 GearHolder、FaceHolderRight 和 FaceHolderLeft 粘合在一起。

![image](https://github.com/user-attachments/assets/87d1dd6e-a693-4e98-9062-67d2a66dbb3a)

将两个 JawHinge 压入。如果太松，可以用胶水粘住。

![image](https://github.com/user-attachments/assets/ec98c917-28c5-4ff0-afcd-69a2645df410)

使用 4 个螺丝（3mmx16mm）安装 TeethTopHolder。

![image](https://github.com/user-attachments/assets/45548a65-0ad5-4821-a51f-821479b4101d)

设置两个带有喇叭的伺服器，并确保它们在软件中预设为 90°。（静止位置）

![image](https://github.com/user-attachments/assets/0a8c66ae-41a4-49e4-8259-e579f39fd327)

将两个 CheekPuller 固定到伺服喇叭上。

![image](https://github.com/user-attachments/assets/38a67d48-b696-4d2d-8fab-94a0fdc1ff1b)

用两颗螺丝（3mmx20mm）组装 TopTeeth。

![image](https://github.com/user-attachments/assets/aba7b8e6-8b7e-45d3-86b3-a665403aa143)

获得两个 JawSupport。

![image](https://github.com/user-attachments/assets/58e963e1-6dbf-41d9-a2e7-45d8edebcb03)

用 4 个螺丝（3mmx10mm + 螺栓）固定钳口，或者将各个部件粘在一起。

![image](https://github.com/user-attachments/assets/0cade5e1-5cfb-4e94-ae90-3d1f16d1c99a)

用 2 颗螺丝将 BottomTeeth 固定到 Jaw 上。（3mmx16mm）

![image](https://github.com/user-attachments/assets/7d4c265f-8ce0-4a6e-bb88-42fc317f7ed1)

将组件卡在 JawHinge 上。它应该可以自由移动。牙齿应该可以完美闭合。

![image](https://github.com/user-attachments/assets/c526f30c-6dd4-4ac7-9968-9d06068df1d2)

使用两颗螺丝添加 LowBack。（3mmx16mm）

![image](https://github.com/user-attachments/assets/29108ac4-d990-4414-94f6-bcb66cc33a68)

按下环，确保孔与 MainGear 的孔对齐。只需从侧面安装 2 颗螺丝即可。（3 毫米 x 16 毫米）

![image](https://github.com/user-attachments/assets/7bd1b3d4-2b09-4040-a8df-49a5b4c00fd2)

如果您使用的是 HS805BB 伺服电机，请在软件中将喇叭预设为 90%。在喇叭和伺服齿轮之间添加 2 个螺丝（小木螺钉）。

![image](https://github.com/user-attachments/assets/09e5f622-e8db-44bd-a3e6-8c8fcbbd5261)

如果您使用的是小型舵机（JX PDI 6221MG 180°），请在软件中将舵角预设为 90%。您需要使用 ServoAdapter 和 ServoHorn Adapter 进行组装。在舵角和 ServoGear 之间添加 2 颗螺丝（小木螺钉）。

![image](https://github.com/user-attachments/assets/75a3d181-2a39-437e-ace4-92619e819911)

按下 SkullServoFix。使用 4 颗螺丝（木螺丝）将 SkullServoFix、舵机和 GearHolder 固定在一起。

![image](https://github.com/user-attachments/assets/e7dd1fc9-2701-4eaf-8917-a47b74515fb3)

将喇叭安装到伺服器（JX PDI 6221MG 180°）上，并在软件中将其预设为 90°。用 4 颗螺丝（小型伺服螺丝）固定 JawPiston。将 JawPiston 插入 NoSupport。当伺服器需要通过软件旋转时，它需要能够打开和闭合下巴。

![image](https://github.com/user-attachments/assets/942516d0-6511-4eae-8d08-b69397c8ec14)

如下图所示，用两颗螺丝（小螺丝）安装一个舵机。确保在软件中将舵机预设为 90°，并安装好喇叭。

![image](https://github.com/user-attachments/assets/9e725449-ae02-4488-ba0e-5946d0c67c23)

用 2 个螺丝（小伺服螺丝）将其固定到喇叭上唇上。

![image](https://github.com/user-attachments/assets/b332e39d-3cac-42ef-82e8-4c5b022e7b3c)

添加左眼组件。并用4个螺丝（小木螺丝）固定。

![image](https://github.com/user-attachments/assets/9c72102f-7503-422c-9265-1a8455bf3239)

安装右侧眼罩组件，并用 4 颗螺丝（小木螺钉）固定。眼罩组件上方留出空间，可用 2 颗小螺丝安装摄像头驱动板。确保摄像头线缆穿过眼罩和驱动板之间，确保眼罩可以自由移动。

![image](https://github.com/user-attachments/assets/388a2487-5f52-4ebb-ae65-f9b25b2ad55b)

![image](https://github.com/user-attachments/assets/5051c56b-6a14-4498-a2cb-5f34eeda3d8b)

使用 2 个螺丝（3mmx16mm）添加 ForHeadSupport。

![image](https://github.com/user-attachments/assets/3e16d9ee-bf85-4a7e-a940-9e84deac302d)

使用胶水或 4 个螺丝将 EyeBrowSupport 与 ForHeadSupport 一起安装。

![image](https://github.com/user-attachments/assets/2aaa1cdb-a6b5-4c74-8d8a-3a1bcf5f3598)

用螺丝（小号伺服螺丝）安装眉毛的两个伺服器。确保在软件中将伺服器预设为 90°，并安装好喇叭。

![image](https://github.com/user-attachments/assets/5f50da59-7ff4-4fa0-9c4d-c1ec6f8e1cf0)

用 2 个螺丝将每个眉毛固定到喇叭上。（小伺服螺丝）

![image](https://github.com/user-attachments/assets/28e40599-ede5-4613-8e79-d8e8da61b357)

将舵机和螺丝安装到 ForHeadSupport 上。确保在软件中将舵机预设为 90°，并安装好喇叭。

![image](https://github.com/user-attachments/assets/d7605449-d2a8-427d-83ea-c4f6d14e410d)

分别用 2 个螺丝将每个 ForHead 固定到喇叭上。（小伺服螺丝）

![image](https://github.com/user-attachments/assets/153ddd11-024a-447b-b7d9-e2d1931a16ef)

此时，您可能需要安装并固定 PCA9685 板及其支架，以及两个迷你分线板。（眼睛嘴巴）

![image](https://github.com/user-attachments/assets/e0ce9a7c-7dd3-4b1e-a69e-3c30c9484a81)

![image](https://github.com/user-attachments/assets/08a954ec-1416-44ef-a9d5-c51e931743fd)

您可以根据此 Excel 表开始连接伺服引脚：引脚编号连接

![image](https://github.com/user-attachments/assets/1c351199-5a8c-47cf-94d4-c5c8ea915e93)

PCA9685 直接连接到左侧神经板上的 i2C 引脚。使用下图所示的 5V 引脚。请注意极性和引脚编号。您可以使用 XT60 电源为 PCA9685 伺服连接器供电。我使用与迷你分线板相同的带状电缆进行引脚连接，并使用一些 12 号线进行电源连接。

 ![image](https://github.com/user-attachments/assets/bf0aa177-c9d1-47f4-a408-bf66229b4f4e)

![image](https://github.com/user-attachments/assets/992a1596-bc72-4781-abbb-c61fac52a19e)

用2颗螺丝（3mmx16mm）分别固定两个TopBackSkull。最好在TopBackSkull内侧加装螺栓。我用小火加热螺栓，然后用钳子将其压入螺栓腔内，确保不会掉落。

![image](https://github.com/user-attachments/assets/c2dac61f-b8f8-4259-80e7-aab2945d5421)

TopSkull 的安装步骤相同。顶部两颗螺丝尺寸为 4mmx20mm。

![image](https://github.com/user-attachments/assets/50397542-2db0-4038-863d-b56ac53a7d73)

TopSkullFront 的过程相同。

![image](https://github.com/user-attachments/assets/ed2242e2-589f-450e-af19-0d646b819d9d)

TopSkullFront 的过程相同。

![image](https://github.com/user-attachments/assets/3a10958b-524d-46bd-a68a-97257ef352e6)

用螺钉（3mmx16mm）分别在两侧添加 EarLock。

![image](https://github.com/user-attachments/assets/98659aec-5528-4a8b-81aa-f8c9d2314191)

 
请注意，i2Eyes 与原始 eyeX 和 eyeY 同步。

i2Eyelids 也与原始眼睑伺服器同步。

这在未来可能会改变，但现在它允许使用标准手势来操作 i2Eyes 和 i2Eyelids。

以下是新伺服器的名称列表：

**眼睛**

i01_head_eyeLeftUD

i01_head_eyeLeftLR

i01_head_eyeRightUD

i01_head_eyeRightLR

**眼睑**

i01_head_eyelidLeftUpper

i01_head_eyelidLeftLower

i01_head_eyelidRightUpper

i01_head_eyelidRightLower

**眉毛**

i01_head_eyebrowRight

i01_head_eyebrowLeft

**脸颊**

i01_head_cheekRight

i01_head_cheekLeft

**上唇**

i01_head_upperLip

**头部**

i01_head_forheadRight

i01_head_forheadLeft


**i2Head 模具教程：**
 

我打印的模型厚度是0.4毫米，用的是一台老款的BFB 3D打印机，这也是为什么我的模具看起来很糟糕的原因。后来我喷了汽车填充剂，打磨了一下，最后用干净的汽车填充剂喷雾完成了。即使你的打印件看起来很干净，你也应该使用汽车填充剂。硅胶很薄，很容易渗透到打印件表面。所以，500/600克的硅胶用量不够。

铸造前必须使用脱模剂，例如蜡喷雾。

三个内模不要粘在一起或者互相粘贴，否则将无法将皮和内模从外模上取下来。
中间有角度的内模的目的是为了在硅胶固化后能够更容易地滑出。
 
![image](https://github.com/user-attachments/assets/83f398d4-f9d4-44aa-b3a5-381ff2ba6a3a)

用螺栓将两个外模固定在一起。通常情况下，外模不会再拆卸。螺栓有助于对齐。

![image](https://github.com/user-attachments/assets/0d826153-8a90-4a58-95ef-8f5b10e6d825)

用汽车填料填充两个部件之间的缝隙。之后，这条分离线应该看不见了。我用的是粗砂纸。

![image](https://github.com/user-attachments/assets/7bbe761d-d8c5-4b74-8a22-6ff096728319)

如果您的模具是干净的，您可以使用 400 号颗粒。我必须先使用 80 号颗粒->喷涂汽车填料->150 号颗粒->喷涂汽车填料->400 号颗粒->从远处喷涂最后一层汽车填料，以产生颗粒状的皮肤效果。

![image](https://github.com/user-attachments/assets/bd919388-714d-433f-be93-06593fc16960)

我使用 Upol 的聚氨酯汽车填料底漆，但大多数用户没有带气枪的压缩机，因此使用喷雾罐中的汽车填料是另一种选择。

![image](https://github.com/user-attachments/assets/6a21709a-895c-4ebc-8094-ef7d1c9f799e)

![image](https://github.com/user-attachments/assets/651817bd-5fa3-4cf6-b275-2ccc61b25733)

这是成品模具，喷涂时距离模具约60厘米，呈现出皮纹效果。填料到达模具表面时略微干燥，但仍能粘附。

![image](https://github.com/user-attachments/assets/c74215ba-3eab-4bb2-a555-0f054e99eecb)

内模也需喷涂汽车填料，这是为了方便脱模，主要是为了避免硅胶渗透到打印件中。

![image](https://github.com/user-attachments/assets/f6bf7691-3ce2-4922-be23-025679c08229)

中间内模倾斜的目的是为了在硅胶固化后更容易滑出，并压紧两侧内模。在铸造前必须使用脱模剂，例如蜡喷剂。将脱模剂喷洒在模具的所有表面。

![image](https://github.com/user-attachments/assets/488dfdad-b609-4df2-81b5-a4b3616df16a)

您可以使用夹具和一块木头来保持三个部件对齐。您也可以在中间内模的边缘添加两个螺栓。此时，务必密封模具，否则硅胶会泄漏。您可以使用热胶枪或 Kinder Doe 胶水进行密封。不要在模具的顶部边缘使用热胶或 Kinder Doe 胶水，因为我们需要气泡从这些接缝中逸出。

![image](https://github.com/user-attachments/assets/a303c384-3461-4272-a385-0f4b45bbefdc)

这是接收器，您将从这里倒入硅胶。打印件中的任何缝隙，硅胶都会进入那里。您可以在这张图片中看到，打印件非常干净，但孔周围有一些非常小的缝隙。如果您没有将所有缝隙全部密封，硅胶就会从这些缝隙中渗入。

![image](https://github.com/user-attachments/assets/646e6349-3193-4a91-9ae5-52309b6b4b31)

请根据经销商的规格准备硅胶混合物。我推荐 Smooth-On Ecoflex 00-10 硅胶，因为它超级柔软，粘度也很低，正好满足我们的需要。硅胶的混合和倒入时间是 30 分钟。倒入模具容器时，要不停地倒，并且要像下图这样，将硅胶一直倒到容器的顶部。否则，硅胶管里可能会产生气泡，气泡会流进皮肤里。

![image](https://github.com/user-attachments/assets/23885842-a55b-4dbe-a68f-f06f91e1f1b7)

当硅胶到达耳朵的小孔时，就说明硅胶已经满了。但要确保容器一直充满到顶部。硅胶会渗入内模之间的缝隙，所以硅胶的液面可能还会下降。

![image](https://github.com/user-attachments/assets/e3bc03ec-7240-4376-a28a-abb96f003516)

让硅胶固化一夜。然后，你可以用酒精去除热熔胶密封剂，它应该很容易脱落。

![image](https://github.com/user-attachments/assets/297165e3-f235-4e3d-84d9-0a542ed6dc64)

你可以从容器中取出硅胶，然后用剪刀剪掉硅胶管里的硅胶。为了取出内模和硅胶，我用了空气压缩机，它能很好地将硅胶从模具中分离出来。你可以通过耳孔、接收孔以及你认为可能有助于分离皮肤和模具的所有侧面吹气。如果真的无法分离，你可以卸下5个螺栓，然后分离两个外模。

![image](https://github.com/user-attachments/assets/0133854e-f065-462c-9cc4-dc9891b30448)

![image](https://github.com/user-attachments/assets/59f4c631-7e88-44aa-8f47-6f1a33e3c053)

![image](https://github.com/user-attachments/assets/eb66e143-bbf6-4570-abf2-cb6b0e695140)

皮肤分离后，你可以在皮肤表面撒一些婴儿爽身粉（滑石粉）去除粘性。用美工刀或剪刀剪掉所有多余的硅胶接缝。剪刀容易留下凹痕，而且边缘可能不整齐。最好将皮肤放在纸巾上，然后用美工刀精确切割。

![image](https://github.com/user-attachments/assets/53594b4e-57a3-47b2-9b1c-440645267740)

我们将使用少量硅胶或SilPoxy将皮肤固定到活动部件上。首先从眼睑开始，这需要一种特殊的方法，使用双面胶带和弹性乙烯基。鼻子、颧骨和上唇可以用一些粘在皮肤和打印部件上的Velcro魔术贴固定。其余活动部件则用填充在小空腔中并粘在皮肤上的硅胶以某种方式固定。这种方法允许我们在必要时移除皮肤，然后重新粘贴，而无需再次粘合。

![image](https://github.com/user-attachments/assets/a1546a15-f422-4ae6-9955-cadff14ab339)

沿着眼睑边缘贴上小条双面胶带并对齐。确保其粘性良好。为了彻底固定，请使用Sil-Poxy或道康宁732胶水。

![image](https://github.com/user-attachments/assets/b71ea459-7ce8-4bdb-8701-a77cfcf88251)

我使用的乙烯基有一面是布，另一面是塑料。粘贴乙烯基条时，避免将硅胶涂在塑料面上。如果乙烯基不能很好地粘在双面胶带上，则可能有一些硅胶残留物，应使用少许丙酮或一些硅胶去除剂清理干净。

![image](https://github.com/user-attachments/assets/39e9ddc2-1a3d-42b5-900e-156c727c0a48)

用 SilPoxy 或 Dow Corning 732 沿着眼睑边缘将小条乙烯基粘到皮肤内侧（将乙烯基的布料面粘上）。确保对齐。不要制作大条，因为我们要保持皮肤的弹性。您还可以看到用 Silpoxy（或 Dow Corning 732）粘在上唇的 Velcro 条。

![image](https://github.com/user-attachments/assets/18f7d7f3-2346-4b6d-aae9-d19252014944)

将硅胶涂抹在小腔中以形成锚点。

![image](https://github.com/user-attachments/assets/c84b541a-93f1-4dea-b121-698abe437bc3)

在这里您可以看到，我使用了 Velcro 条，当活动部件旋转时，例如眉毛、脸颊拉器、头部，效果不佳。它还增加了 2 毫米的厚度，这会改变面部结构，这就是我不在所有地方都使用它的原因。

![image](https://github.com/user-attachments/assets/cf65ec2c-26d3-4575-a7bd-69a74d25092b)

现在，我们在所有锚点上涂抹一些 SilPoxy（或道康宁 732），并将蒙皮安装到位，确保所有部件都对齐。待硅胶固化后，再尝试移动舵机。

![image](https://github.com/user-attachments/assets/6a9574aa-0c36-4226-aea5-80405d92ed2a)

用环氧树脂（双组份胶）将磁铁粘在打印头结构的各个空腔内。确保打印部件中所有磁铁的极性相同。

![image](https://github.com/user-attachments/assets/494e1ea1-bfcd-4592-8d89-956fdcdc29b0)

然后用薄布和 Silpoxy（或道康宁 732）将其他磁铁粘在硅胶皮的空腔中。确保硅胶皮中磁铁的极性与打印部件中的磁铁极性匹配。

![image](https://github.com/user-attachments/assets/31c5dd6c-67a9-4363-a7cd-f19f2e1a8525)

![image](https://github.com/user-attachments/assets/027414f5-ec38-41af-8eb1-214c4881ee8b)

此时，您可以开始在 Myrobotlab 中测试面部表情，看看在机器人上体验有多有趣。
在 InMoov UI 的控制器部分下，启动 adafruit 16 通道 (pca9685)。

![image](https://github.com/user-attachments/assets/5a63291d-7887-40e4-944b-a1a6cb209105)

如果您的 i01.left 控制器已启动，pca9685 会自动连接到控制器。

要访问 i2Head UI，请点击底部按钮。 然后，您需要启动每个头部舵机，选择 pca9685，并在向下滚动中定义正确的引脚。 完成后，您需要根据舵机的最大范围编辑限制并修改输出限制。 以下是用于测试基本表情的语音命令：

![image](https://github.com/user-attachments/assets/9c952e31-28e2-4590-a2d2-2257c258a150)

![image](https://github.com/user-attachments/assets/019441ee-90a3-4763-89bd-3ed715054209)

![image](https://github.com/user-attachments/assets/70ca5f0f-60d9-41a6-b932-0967dee28a16)

中性的
生气的
眨眼
厌恶
害怕
快乐的
微笑
伤心
叹
对不起
可疑的
思维
不高兴
