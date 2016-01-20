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
import item.Armor;
import item.Weapon;
import java.util.Map;
import utils.Dice;

public final class Game {

   
    
    private Character player;
    
    
    public Game(){
        Display.intro();
        ControlerHuman controler = new ControlerHuman();
        Class choice = (Class) controler.choice(Class.values());
        choice.createCharacter(controler);
        this.player = choice.getCharacter();
        Display.bonjour(player.getName());
        
        Quest.tuto(player);
        Quest.mainQuest(player);
        
        
        for(int i=0;i<10;i++){
            int av = Dice.roll(5+i, 10+i);
            Armor armureDeBase = new Armor("armureDeBase"+i,10,1,av);
            int dmgmin = Dice.roll(10+2*i, 20+i);
            int dmgmax = Dice.roll(10+i, 15+i);
            Weapon épéeDeBase = new Weapon("épéeDeBase"+i,10,1,dmgmax,dmgmin);            
            int force =Dice.roll(2+i, 7+i);
            int dexterity =Dice.roll(1+i, 3+i);
            int defence =Dice.roll(1+i, 3+i);
            int health =Dice.roll(5+i, 10+i);
            int hasard = Dice.roll(1, 2);
            if(hasard==1){
                character.Character courgette = new character.Monster(1, force, dexterity, defence, health, "Courgette", (Controler)new ControlerIA(),armureDeBase ,new Weapon[2]);
                Fight fight = new Fight(player,courgette);
            }
            else{
                Weapon[] weapons ={épéeDeBase,null};
                character.Character courgette = new character.Monster(1, force, dexterity, defence, health, "Courgette", (Controler)new ControlerIA(),(Armor) null,weapons);
                Fight fight = new Fight(player,courgette);

            }
        } 
        
        
    }
    

}

