/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import controler.Controler;
import controler.ControlerIA;

/**
 *
 * @author SAM
 */
public class Quest {
    
    public static void  tuto(character.Character player){
        //Tuto et premier combat
        
        Display.tuto();
        character.Character MasterBanana = new character.Monster(1, 2, 2, 2, 5, "MasterBanana", (Controler)new ControlerIA());
        Fight tuto = new Fight(player,MasterBanana);
        Fight fight;
        for(int i =0;i<10;i++){
            character.Character opponent=new character.Warrior((Controler)new ControlerIA());
            fight = new Fight(player,opponent);
        }
        //Fin tuto
    }
}
