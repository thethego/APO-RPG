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
import menu.Class;
import menu.Victory;
import controler.*;
import item.Weapon;
import java.util.Map;

public final class Game {
    
    private Character player;
    
    public Game(){
        Display.intro();
        ControlerHuman controler = new ControlerHuman();
        Class choice = (Class) controler.choice(Class.values());
        choice.createCharacter(controler);
        this.player = choice.getCharacter();
        Display.bonjour(player.getName());
        /*
        Tuto et premier combat
        */
        Display.tuto();
        Character MasterBanana = new character.Warrior(1, 2, 2, 2, 5, "MasterBanana", (Controler)new ControlerIA());
        Fight tuto = new Fight(player,MasterBanana);
        Fight fight;
        for(int i =0;i<10;i++){
            Character opponent=new character.Warrior((Controler)new ControlerIA());
            fight = new Fight(player,opponent);
        }
    }
    

}
