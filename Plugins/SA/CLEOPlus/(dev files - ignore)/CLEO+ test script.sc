/*
Test codes for CLEO+ by Junior_Djjr - MixMods.com.br
For GTA3script: https://www.mixmods.com.br/2017/01/tutorial-como-criar-mods-cleos.html
Using: https://forum.mixmods.com.br/f16-utilidades/t179-gta3script-while-true-return_true-e-return_false 
Maybe not all codes here is working, and maybe it's expected, well, welcome to the mess...
*/

SCRIPT_START
{
    LVAR_INT scplayer obj car char pBuffer
    LVAR_INT i j k l
    LVAR_FLOAT g g1 g2
    LVAR_FLOAT x y z x2 y2 z2

    GET_PLAYER_CHAR 0 scplayer
    
    WHILE TRUE
        WAIT 0

        IF TEST_CHEAT "P1"
            GOSUB Test23
        ENDIF
        IF TEST_CHEAT "P2"
            GOSUB Test20
        ENDIF
        IF TEST_CHEAT "P3"
            GOSUB Test18
        ENDIF

    ENDWHILE

    Test23:
    k = 1000
    x = 0.0
    y = 0.0
    z = 0.0
    x2 = 0.0
    y2 = 0.0
    z2 = 0.0
    g = 1.0
    g1 = 1.0
    g2 = 1.0
    i = 0
    j = 0
    l = TRUE
    GOSUB Test23_RecreateRenderObject
    SET_PLAYER_CONTROL 0 l
    WHILE TRUE
        WAIT 0
        IF IS_KEY_PRESSED 107
            IF IS_KEY_PRESSED VK_LSHIFT
                IF IS_KEY_PRESSED VK_KEY_B
                    j += 10
                    WHILE IS_KEY_PRESSED 107
                        WAIT 0
                    ENDWHILE
                ENDIF
                IF IS_KEY_PRESSED VK_KEY_M
                    k += 10
                    WHILE IS_KEY_PRESSED 107
                        WAIT 0
                    ENDWHILE
                ENDIF
                IF IS_KEY_PRESSED VK_KEY_R
                    IF IS_KEY_PRESSED VK_KEY_X
                        x2 +=@ 10.0
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Y
                        y2 +=@ 10.0
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Z
                        z2 +=@ 10.0
                    ENDIF
                ENDIF
                IF IS_KEY_PRESSED VK_KEY_S
                    IF IS_KEY_PRESSED VK_KEY_X
                        g +=@ 0.01
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Y
                        g1 +=@ 0.01
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Z
                        g2 +=@ 0.01
                    ENDIF
                ENDIF
                IF IS_KEY_PRESSED VK_KEY_P
                    IF IS_KEY_PRESSED VK_KEY_X
                        x +=@ 0.01
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Y
                        y +=@ 0.01
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Z
                        z +=@ 0.01
                    ENDIF
                ENDIF
            ELSE
                IF IS_KEY_PRESSED VK_LCONTROL
                    IF IS_KEY_PRESSED VK_KEY_B
                        j += 100
                        WHILE IS_KEY_PRESSED 107
                            WAIT 0
                        ENDWHILE
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_M
                        k += 100
                        WHILE IS_KEY_PRESSED 107
                            WAIT 0
                        ENDWHILE
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_R
                        IF IS_KEY_PRESSED VK_KEY_X
                            x2 +=@ 20.0
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            y2 +=@ 20.0
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            z2 +=@ 20.0
                        ENDIF
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_S
                        IF IS_KEY_PRESSED VK_KEY_X
                            g +=@ 0.1
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            g1 +=@ 0.1
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            g2 +=@ 0.1
                        ENDIF
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_P
                        IF IS_KEY_PRESSED VK_KEY_X
                            x +=@ 0.1
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            y +=@ 0.1
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            z +=@ 0.1
                        ENDIF
                    ENDIF
                ELSE
                    IF IS_KEY_PRESSED VK_KEY_B
                        j += 1
                        WHILE IS_KEY_PRESSED 107
                            WAIT 0
                        ENDWHILE
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_M
                        k += 1
                        WHILE IS_KEY_PRESSED 107
                            WAIT 0
                        ENDWHILE
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_R
                        IF IS_KEY_PRESSED VK_KEY_X
                            x2 +=@ 1.0
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            y2 +=@ 1.0
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            z2 +=@ 1.0
                        ENDIF
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_S
                        IF IS_KEY_PRESSED VK_KEY_X
                            g +=@ 0.001
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            g1 +=@ 0.001
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            g2 +=@ 0.001
                        ENDIF
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_P
                        IF IS_KEY_PRESSED VK_KEY_X
                            x +=@ 0.001
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            y +=@ 0.001
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            z +=@ 0.001
                        ENDIF
                    ENDIF
                ENDIF
            ENDIF
            GOSUB Test23_RecreateRenderObject
        ENDIF
        IF IS_KEY_PRESSED 109
            IF IS_KEY_PRESSED VK_LSHIFT
                IF IS_KEY_PRESSED VK_KEY_B
                    j -= 10
                    WHILE IS_KEY_PRESSED 109
                        WAIT 0
                    ENDWHILE
                ENDIF
                IF IS_KEY_PRESSED VK_KEY_M
                    k -= 10
                    WHILE IS_KEY_PRESSED 109
                        WAIT 0
                    ENDWHILE
                ENDIF
                IF IS_KEY_PRESSED VK_KEY_R
                    IF IS_KEY_PRESSED VK_KEY_X
                        x2 -=@ 10.0
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Y
                        y2 -=@ 10.0
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Z
                        z2 -=@ 10.0
                    ENDIF
                ENDIF
                IF IS_KEY_PRESSED VK_KEY_S
                    IF IS_KEY_PRESSED VK_KEY_X
                        g -=@ 0.01
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Y
                        g1 -=@ 0.01
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Z
                        g2 -=@ 0.01
                    ENDIF
                ENDIF
                IF IS_KEY_PRESSED VK_KEY_P
                    IF IS_KEY_PRESSED VK_KEY_X
                        x -=@ 0.01
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Y
                        y -=@ 0.01
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_Z
                        z -=@ 0.01
                    ENDIF
                ENDIF
            ELSE
                IF IS_KEY_PRESSED VK_LCONTROL
                    IF IS_KEY_PRESSED VK_KEY_B
                        j -= 100
                        WHILE IS_KEY_PRESSED 109
                            WAIT 0
                        ENDWHILE
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_M
                        k -= 100
                        WHILE IS_KEY_PRESSED 109
                            WAIT 0
                        ENDWHILE
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_R
                        IF IS_KEY_PRESSED VK_KEY_X
                            x2 -=@ 20.0
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            y2 -=@ 20.0
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            z2 -=@ 20.0
                        ENDIF
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_S
                        IF IS_KEY_PRESSED VK_KEY_X
                            g -=@ 0.1
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            g1 -=@ 0.1
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            g2 -=@ 0.1
                        ENDIF
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_P
                        IF IS_KEY_PRESSED VK_KEY_X
                            x -=@ 0.1
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            y -=@ 0.1
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            z -=@ 0.1
                        ENDIF
                    ENDIF
                ELSE
                    IF IS_KEY_PRESSED VK_KEY_B
                        j -= 1
                        WHILE IS_KEY_PRESSED 109
                            WAIT 0
                        ENDWHILE
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_M
                        k -= 1
                        WHILE IS_KEY_PRESSED 109
                            WAIT 0
                        ENDWHILE
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_R
                        IF IS_KEY_PRESSED VK_KEY_X
                            x2 -=@ 1.0
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            y2 -=@ 1.0
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            z2 -=@ 1.0
                        ENDIF
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_S
                        IF IS_KEY_PRESSED VK_KEY_X
                            g -=@ 0.001
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            g1 -=@ 0.001
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            g2 -=@ 0.001
                        ENDIF
                    ENDIF
                    IF IS_KEY_PRESSED VK_KEY_P
                        IF IS_KEY_PRESSED VK_KEY_X
                            x -=@ 0.001
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Y
                            y -=@ 0.001
                        ENDIF
                        IF IS_KEY_PRESSED VK_KEY_Z
                            z -=@ 0.001
                        ENDIF
                    ENDIF
                ENDIF
            ENDIF
            GOSUB Test23_RecreateRenderObject
        ENDIF
        IF IS_KEY_PRESSED VK_KEY_L
            IF l = TRUE
                l = FALSE
                PRINT_STRING_NOW "Free!" 1000
            ELSE
                l = TRUE
                PRINT_STRING_NOW "Lock!" 1000
            ENDIF
            SET_PLAYER_CONTROL 0 l
            WHILE IS_KEY_PRESSED VK_KEY_L
                WAIT 0
            ENDWHILE
        ENDIF
        IF IS_KEY_PRESSED VK_KEY_H
            i = 0 // don't delete it
            PRINT_STRING_NOW "Saved!" 1000
            GOSUB Test23_RecreateRenderObject
            WHILE IS_KEY_PRESSED VK_KEY_H
                WAIT 0
            ENDWHILE
        ENDIF
        IF IS_KEY_PRESSED VK_KEY_N // exit
            PRINT_STRING_NOW "~r~Hold to exit" 2000
            WAIT 2000
            IF IS_KEY_PRESSED VK_KEY_N
                BREAK
            ENDIF
        ENDIF
        PRINT_FORMATTED_NOW "model %i bone id %i" 1000 k j
    ENDWHILE
    //CREATE_RENDER_OBJECT_TO_CHAR_BONE scplayer 1001 5 (-0.5 0.0 0.0) (0.0 0.0 0.0) i
    //SET_RENDER_OBJECT_AUTO_HIDE i TRUE TRUE TRUE
    //SET_RENDER_OBJECT_VISIBLE i FALSE
    RETURN

    Test23_RecreateRenderObject:
    IF IS_MODEL_IN_CDIMAGE k
        REQUEST_MODEL k
        LOAD_ALL_MODELS_NOW
        DELETE_RENDER_OBJECT i
        CREATE_RENDER_OBJECT_TO_CHAR_BONE scplayer k j (x y z) (x2 y2 z2) i
        SET_RENDER_OBJECT_SCALE i g g1 g2
        MARK_MODEL_AS_NO_LONGER_NEEDED k
    ENDIF
    RETURN

    Test22:
    CREATE_PICKUP 1277 5 10.0 10.0 5.0 j
    IF GET_PICKUP_THIS_COORD 10.0 10.0 5.0 TRUE i
        //GET_PICKUP_COORDINATES i x y z
        //PRINT_FORMATTED_NOW "%.3f %.3f %.3f" 1000 x y z
        GET_PICKUP_MODEL i j
        GET_PICKUP_TYPE i k
        //PRINT_FORMATTED_NOW "%.3f %.3f %.3f" 1000 x y z
        PRINT_FORMATTED_NOW "pickup model %i type %i" 1000 j k
    ENDIF
    RETURN 

    Test21:
    REQUEST_MODEL 1000
    REQUEST_MODEL 1001
    LOAD_ALL_MODELS_NOW
    CREATE_RENDER_OBJECT_TO_CHAR_BONE scplayer 1000 5 (0.0 0.0 0.0) (0.0 0.0 0.0) i
    CREATE_RENDER_OBJECT_TO_CHAR_BONE scplayer 1001 5 (-0.5 0.0 0.0) (0.0 0.0 0.0) i
    SET_RENDER_OBJECT_AUTO_HIDE i TRUE TRUE TRUE
    //SET_RENDER_OBJECT_VISIBLE i FALSE
    RETURN

    Test20:
    GET_CURRENT_SAVE_SLOT i
    IF IS_GAME_FIRST_START
        PRINT_FORMATTED_NOW "Current save slot %d. First start." 2000 i
    ELSE
        PRINT_FORMATTED_NOW "Current save slot %d. Not first start." 2000 i
    ENDIF
    RETURN

    Test19:
    ADD_CLEO_BLIP 35 100.0 100.0 FALSE 255 255 255 255 (i)
    WAIT 1000
    //REMOVE_CLEO_BLIP i
    RETURN

    Test18:
    GET_CURRENT_CHAR_WEAPON scplayer i
    IF IS_WEAPON_FIRE_TYPE i WEAPONFIRE_INSTANT_HIT
        PRINT_STRING_NOW "is firegun" 1000
    ENDIF
    RETURN
    
    Test17:
    GET_PED_POINTER scplayer i
    READ_STRUCT_OFFSET i 0x540 4 (g) //00000540 m_fHealth dd
    PRINT_FORMATTED_NOW "%f" 1000 g
    RETURN

    Test16:
    GET_OFFSET_FROM_CHAR_IN_WORLD_COORDS scplayer 0.0 2.0 0.0 x y z
    CREATE_CHAR PEDTYPE_CIVMALE MALE01 x y z (char)
    FIX_CHAR_GROUND_BRIGHTNESS_AND_FADE_IN char FALSE TRUE TRUE
    RETURN

    Test15:
    GET_AUDIO_SFX_VOLUME g1
    PRINT_FORMATTED_NOW "sfx %.3f" 1000 g1
    WAIT 1000
    GET_AUDIO_RADIO_VOLUME g1
    PRINT_FORMATTED_NOW "radio %.3f" 1000 g1
    WAIT 1000
    GET_MOUSE_SENSIBILITY g1
    PRINT_FORMATTED_NOW "mouse sens %.3f" 1000 g1
    RETURN

    Test14:
    IF IS_ON_MISSION
        PRINT_STRING_NOW "ON MISSION" 100
    ELSE
        PRINT_STRING_NOW "OFF MISSION" 100
    ENDIF
    RETURN

    Test13:
    g = 0.0
    WHILE g < 1.0
        WAIT 0
        g +=@ 0.005 // linear interpolation
        EASE g EASE_MODE_CUBIC EASE_WAY_INOUT (g2) // get ease interpolation from linear
        PRINT_FORMATTED_NOW "%.3f ease %.3f" 10 g g2
        g1 = 100.0 * g2 // use ease for distance to travel progress
        g1 += 200.0 // add original position
        DRAW_RECT 200.0 g1 20.0 20.0 255 255 255 255
        USE_TEXT_COMMANDS 0
    ENDWHILE
    RETURN

    /*
    Test12:
    STORE_CLOSEST_ENTITIES scplayer car char
    GET_OFFSET_FROM_CHAR_IN_WORLD_COORDS scplayer 0.0 5.0 0.0 (x y z)
    REQUEST_MODEL 400
    LOAD_ALL_MODELS_NOW
    CREATE_CAR 400 x y z (obj)
    SET_CAR_HEADING obj 120.0
    GET_VEHICLE_QUATERNION obj quat_x quat_y quat_z quat_w
    GET_VEHICLE_QUATERNION car dest_quat_x dest_quat_y dest_quat_z dest_quat_w
    GET_VAR_POINTER quat_x (source_quat)
    GET_VAR_POINTER dest_quat_x (dest_quat)
    GET_VAR_POINTER res_quat_x (res_quat)
    WHILE TRUE
        WAIT 0
        QUAT_SLERP source_quat dest_quat 0.5 (res_quat)
        SET_VEHICLE_QUATERNION obj res_quat_x res_quat_y res_quat_z res_quat_w
    ENDWHILE
    RETURN
    */

    Test11a:
    STORE_CLOSEST_ENTITIES scplayer car char
    IF car > 0
        INIT_EXTENDED_CHAR_VARS car AUTO 10
        SET_EXTENDED_CHAR_VAR car AUTO 1 100
        PRINT_FORMATTED_NOW "Set car %i" 2000 500
    ENDIF
    RETURN 
    
    Test11b:
    
    STORE_CLOSEST_ENTITIES scplayer car char
    IF car > 0
        IF GET_EXTENDED_CAR_VAR car AUTO 1 (i) // Get var 1 value
            PRINT_FORMATTED_NOW "Get var %i" 2000 i // In this example, i is 100
        ELSE
            PRINT_STRING "No value yet for var. Writing" 2000
            // Initialize 2 var spaces
            // Use AUTO for automatically use this script as id, you can use some number too
            INIT_EXTENDED_CAR_VARS car AUTO 2 
            SET_EXTENDED_CAR_VAR car AUTO 1 100 // Write 100 in var 1
            SET_EXTENDED_CAR_VAR car AUTO 2 200 // Write 200 in var 1
        ENDIF
    ENDIF

    RETURN

    /*
    Test10:
    WHILE TRUE
        WAIT 0
        DRAW_TEXTURE_PLUS 0 100.0 100.0 50.0 50.0 TRUE TRUE 255 255 255 255
        DRAW_RECT 200.0 100.0 50.0 50.0 255 255 255 255
        USE_TEXT_COMMANDS 0
        PRINT_STRING_NOW "drawnando" 10
    ENDWHILE
    RETURN
    */
    
    Test9:
    GET_LABEL_POINTER Buffer pBuffer
    STRING_FORMAT pBuffer "TESTE%i" 50
    PRINT_FORMATTED_NOW "%s" 5000 $pBuffer
    WAIT 1000
    INIT_EXTENDED_CHAR_VARS scplayer $pBuffer 10
    SET_EXTENDED_CHAR_VAR scplayer $pBuffer 1 500
    //GET_EXTENDED_CHAR_VAR scplayer $pBuffer 1 (i)
    PRINT_FORMATTED_NOW "%i" 5000 i
    RETURN
    
    Test8a:
    STORE_CLOSEST_ENTITIES scplayer car char
    IF char > 0
        INIT_EXTENDED_CHAR_VARS char AUTO 10
        SET_EXTENDED_CHAR_VAR char AUTO 1 500
        PRINT_FORMATTED_NOW "Set %i" 2000 500
    ENDIF
    RETURN

    Test8b:
    STORE_CLOSEST_ENTITIES scplayer car char
    IF char > 0
        IF GET_EXTENDED_CHAR_VAR char AUTO 1 (i)
            PRINT_FORMATTED_NOW "Get %i" 2000 i
        ELSE
            PRINT_STRING "No value yet" 2000
        ENDIF
    ENDIF
    RETURN

    Test8:
    INIT_EXTENDED_CHAR_VARS scplayer AUTO 10
    SET_EXTENDED_CHAR_VAR scplayer AUTO 2 400
    GET_EXTENDED_CHAR_VAR scplayer AUTO 2 (i)
    PRINT_FORMATTED_NOW "%i" 5000 i
    RETURN
  
    Test7:
    IF IS_CHAR_SITTING_IN_ANY_CAR scplayer

        STORE_CAR_CHAR_IS_IN_NO_SAVE scplayer car

        GET_VEHICLE_SUBCLASS car i

        IF i = VEHICLE_SUBCLASS_BIKE
        OR i = VEHICLE_SUBCLASS_TRAIN
            IF IS_CAR_SCRIPT_CONTROLLED car
                PRINT_FORMATTED_NOW "%i is script motorbike or train" 2000 i
            ELSE
                PRINT_FORMATTED_NOW "%i is random motorbike or train" 2000 i
            ENDIF
        ENDIF

        WAIT 1000
        GET_VEHICLE_POINTER car i
        GET_ENTITY_TYPE i i
        PRINT_FORMATTED_NOW "entity type %d" 2000 i
    ENDIF
    RETURN
    
    Test6:
    timera = 0
    WHILE timera < 5000
        WAIT 0
        IF IS_MOUSE_WHEEL_UP
            PRINT_STRING_NOW "wheel up" 1
        ENDIF
        IF IS_MOUSE_WHEEL_DOWN
            PRINT_STRING_NOW "wheel down" 1
        ENDIF
    ENDWHILE
    RETURN

    Test5:
    GET_CURRENT_RESOLUTION j k
    PRINT_FORMATTED_NOW "%i %i" 5000 j k

    WAIT 1000

    timera = 0
    WHILE timera < 5000
        WAIT 0
        GET_FIXED_XY_ASPECT_RATIO 50.0 50.0 x y
        DRAW_RECT 320.0 224.0 x y 255 255 255 255
        USE_TEXT_COMMANDS 0
    ENDWHILE
    RETURN

    Test4:
    GET_OFFSET_FROM_CHAR_IN_WORLD_COORDS scplayer 0.0 2.0 0.0 (x y z)
    CREATE_OBJECT 1000 x y z (obj)

    IF IS_OBJECT_SCRIPT_CONTROLLED obj
        PRINT_STRING_NOW "obj created TRUE" 1000
    ELSE
        PRINT_STRING_NOW "~r~obj created FALSE: error" 1000
    ENDIF

    WAIT 1000

    MARK_OBJECT_AS_NO_LONGER_NEEDED obj

    IF IS_OBJECT_SCRIPT_CONTROLLED obj
        PRINT_STRING_NOW "~r~obj released TRUE: error" 1000
    ELSE
        PRINT_STRING_NOW "obj released FALSE" 1000
    ENDIF
    
    WAIT 1000
    MARK_OBJECT_AS_NEEDED obj 

    IF IS_OBJECT_SCRIPT_CONTROLLED obj
        PRINT_STRING_NOW "obj marked TRUE" 1000
    ELSE
        PRINT_STRING_NOW "~r~obj marked FALSE: error" 1000
    ENDIF
    RETURN

    Test3:
    GET_OFFSET_FROM_CHAR_IN_WORLD_COORDS scplayer 0.0 2.0 0.0 (x y z)
    CREATE_CHAR PEDTYPE_CIVMALE MALE01 x y z (char)

    IF IS_CHAR_SCRIPT_CONTROLLED char
        PRINT_STRING_NOW "char created TRUE" 1000
    ELSE
        PRINT_STRING_NOW "~r~char created FALSE: error" 1000
    ENDIF

    WAIT 1000

    MARK_CHAR_AS_NO_LONGER_NEEDED char

    IF IS_CHAR_SCRIPT_CONTROLLED char
        PRINT_STRING_NOW "~r~char released TRUE: error" 1000
    ELSE
        PRINT_STRING_NOW "char released FALSE" 1000
    ENDIF
    
    WAIT 1000
    MARK_CHAR_AS_NEEDED char 

    IF IS_CHAR_SCRIPT_CONTROLLED char
        PRINT_STRING_NOW "char marked TRUE" 1000
    ELSE
        PRINT_STRING_NOW "~r~char marked FALSE: error" 1000
    ENDIF
    RETURN

    Test2:
    GET_OFFSET_FROM_CHAR_IN_WORLD_COORDS scplayer 0.0 2.0 0.0 (x y z)
    CREATE_CAR ELEGY x y z (car)

    IF IS_CAR_SCRIPT_CONTROLLED car
        PRINT_STRING_NOW "car created TRUE" 1000
    ELSE
        PRINT_STRING_NOW "~r~car created FALSE: error" 1000
    ENDIF

    WAIT 1000

    MARK_CAR_AS_NO_LONGER_NEEDED car

    IF IS_CAR_SCRIPT_CONTROLLED car
        PRINT_STRING_NOW "~r~car released TRUE: error" 1000
    ELSE
        PRINT_STRING_NOW "car released FALSE" 1000
    ENDIF

    WAIT 1000

    MARK_CAR_AS_NEEDED car 

    IF IS_CAR_SCRIPT_CONTROLLED car
        PRINT_STRING_NOW "car marked TRUE" 1000
    ELSE
        PRINT_STRING_NOW "~r~car marked FALSE: error" 1000
    ENDIF
    RETURN

    Test1:
    GET_OFFSET_FROM_CHAR_IN_WORLD_COORDS scplayer 0.0 2.0 0.0 (x y z)
    CREATE_OBJECT_NO_SAVE 1000 x y z FALSE FALSE (obj)

    GET_OFFSET_FROM_CHAR_IN_WORLD_COORDS scplayer 20.0 5.0 0.0 (x y z)
    CREATE_CAR_GENERATOR x y z 0.0 ELEGY 1 1 TRUE 0 0 1000 2000 car
    SWITCH_CAR_GENERATOR car 101
    SET_CAR_GENERATOR_NO_SAVE car

    GET_CURRENT_WEATHER i
    PRINT_FORMATTED_NOW "cur weather id %d" 1000 i
    
    WAIT 1000

    SET_NEXT_WEATHER 8 

    GET_NEXT_WEATHER i
    PRINT_FORMATTED_NOW "next weather id %d" 1000 i

    WAIT 1000

    SET_RAIN_INTENSITY 0.5

    GET_RAIN_INTENSITY g
    PRINT_FORMATTED_NOW "rain %f" 1000 g

    RETURN

    Buffer:
    DUMP
    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 
    ENDDUMP
}
SCRIPT_END

    {
//CLEO_CALL FindAngle 0 (x,y) (x,y) (angle) --LightVelox
FindAngle:
    LVAR_FLOAT cx cy ex ey
    LVAR_FLOAT dx dy theta m_pi q1 q2 r
    m_pi = 3.1415926
    dy = ey
    dy -= cy
    dx = ex
    dx -= cx
    //Passa para magnitude
    q1 = dx
    q1 *=dx
    q2 = dy
    q2 *=dy
    q1 +=q2
    SQRT q1 r
    dx /= r
    dy /= r
    GET_HEADING_FROM_VECTOR_2D dx dy theta
CLEO_RETURN 0 theta
}
