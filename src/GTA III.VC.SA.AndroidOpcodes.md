# GTA.III.VC.SA.AndroidOpcodes

## 0DD6
    SCM: 0DD6=1,%1d% = get_game_version ; android  
    Opcodes: 0DD6: 0@ = get_game_version  
    CommandName:  
    描述: 获取游戏的版本号。
* Game: Android GTAIII.GTAVC.GTASA  
* Library: libCLEO.SO  
* Author: AlexanderBlade  
* Parameters: 1  Returned Integer(INT)
* 示例:
```
0DD6: 0@ = get_game_version
if  
 0@ == 13//ID GTASA1.08  
then
```
* Data:
|GAME|GTAIII|GTAVC|GTASA|  
|:--------:|:--------:|:--------:|:--------:|  
|1.00|x|x|3|  
|1.02|x|x|5|  
|1.03|x|2|6|  
|1.4|1|x|x|  
|1.05|x|x|7|  
|1.6|11|x|x|  
|1.06|x|x|8|  
|1.07|x|12|9|  
|1.08|x|x|13|
