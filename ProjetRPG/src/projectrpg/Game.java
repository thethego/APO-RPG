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
import choice.ChoiceClass;
import choice.ChoiceMenu;
import controler.*;
import item.Weapon;
import java.util.Map;

public final class Game {
    
    private Character player;
    
    public Game(){
        Display.intro();
        ControlerHuman controler = new ControlerHuman();
        ChoiceClass choice = (ChoiceClass) controler.choice(ChoiceClass.values());
        choice.createCharacter(controler);
        this.player = choice.getCharacter();
        Display.bonjour(player.getName());
        /*
        Tuto et premier combat
        */
        Display.tuto();
        Character MasterBanana = new character.Warrior(1, 2, 2, 2, 5, "MasterBanana", (Controler)new ControlerIA());
        Fight tuto = new Fight(player,MasterBanana);
        menu();
        Fight fight;
        for(int i =0;i<10;i++){
            Character opponent=new character.Warrior((Controler)new ControlerIA());
            fight = new Fight(player,opponent);
            menu();
            player.restoreHealth();
        }
    }
    
    public void menu(){
        int menu=1;
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
    }
}
