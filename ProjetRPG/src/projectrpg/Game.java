/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;


/**
 *
 * @author SAM
 */

import character.Caracteristics;
import character.Character;
import character.Warrior;
import controler.*;

public class Game {
    
    public static void play(){
        Character player = new Warrior((Controler)new ControlerHuman());
        Display.intro();
        Fight fight;
        for(int i =0;i<10;i++){
            fight = new Fight(player);
        }
    }
}
