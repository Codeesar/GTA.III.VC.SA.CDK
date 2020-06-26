# GTA.III.VC.SA.AndroidOpcodes

## 0DD6
SCM:

    0DD6=1,%1d% = get_game_version ; android
fastman92 script command definitions:

    0DD6=1,get_game_version %1d%
Opcodes:

    0DD6: 0@ = get_game_version  
CommandName:

    GET_GAME_VERSION

描述: 获取游戏的版本号.   
Description: Get the version ID of the game.

* SupportedGame(支持的游戏): `Android GTAIII.GTAVC.GTASA`  
* Library（所属库）: `libCLEO.SO`  
* Author（作者）: `AlexanderBlade`  
* ParametersNum（参数数量）: `1`  
* ParametersType（参数类型）: `Returned Integer(INT)`
* Example（示例代码）:
```
0DD6: 0@ = get_game_version
if  
 0@ == 13//ID GTASA1.08  
then
```
* 额外说明: `上面的代码为判断游戏的版本ID是否为13，也就是判游戏版本是否为GTASA1.08版本.   
0DD8在安卓CLEO用来获取安卓GTA游戏的版本号，该OP的参数为获取到的版本ID，不同版本ID对应不同的GTA游戏版本，你可以查看下面的安卓GTA游戏版本ID表格，来帮助你编写CLEO脚本进行版本判断.`

* Data:  
        注: GTAVC1.06和1.07版没有本质上的区别，只是谷歌地区不同
        上架了两个版本，实际上为一个版本，GTAVC1.06和1.07版的ID都是12。
        GTA3v1.8.GTAVCv1.07/1.09.GTASAv2.00这四个版本是FLA插件为安卓CLEO主程序添加的ID。

|GAME|ID|GAME|ID|
|:--------:|:--------:|:--------:|:--------:| 
|Undefined|0|GTA3 v1.4|1|  
|GTAVC v1.03|2|GTASA v1.00|3|
|GTASA v1.02|5|GTASA v1.03|6|
|GTASA v1.05|7|GTASA v1.06|8|
|GTASA v1.05GER|9|GTASA v1.07|10|
|GTA3 v1.6|11|GTAVC v1.06|12|
|GTASA v1.08|13|GTA3 v1.8|14|
|GTAVC v1.07|15|GTAVC v1.09|16|
|GTASA v2.00|17|GTALCS v2.4|x|

![游戏版本ID](https://github.com/XMDS/GTA.III.VC.SA.CDK/raw/master/image/游戏版本ID.png)
