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


import character.Character;
import choice.ChoiceClass;
import choice.ChoiceMenu;
import controler.*;

public class Game {
    
    public static void play(){
        int menu=0;
        Display.intro();
        ControlerHuman controler = new ControlerHuman();
        ChoiceClass choice = (ChoiceClass) controler.choice(ChoiceClass.values());
        choice.createCharacter(controler);
        Character player = choice.getCharacter();
        Display.bonjour(player.getName());
        Fight fight;
        for(int i =0;i<10;i++){
            fight = new Fight(player);
            menu = 1;
            while(menu==1){
                ChoiceMenu choiceMenu = (ChoiceMenu) player.getControler().choice(ChoiceMenu.values());
                switch(choiceMenu.getNumber()){
                case 1 : System.exit(0);
                    break;
                case 2 : player.displayInventory();
                    break;
                case 3 : menu=0;
                    break;
                }
            }
            player.restoreHealth();
        }
    }
}
