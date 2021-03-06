/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import controler.Controler;
import controler.ControlerIA;
import item.Armor;
import item.Item;
import item.Weapon;
import java.util.ArrayList;
import java.util.List;
import utils.Dice;

/**
 *
 * @author SAM
 */

public class Quest {
    
    public static void  tuto(character.Character player){
        //Tuto et premier combat
        
        Display.tuto();
        Weapon épéeDeBase = new Weapon("épéeDeBase",10,1,5,2);
        Weapon[] weapons ={épéeDeBase,null};
        character.Character MasterBanana = new character.Monster(1, 2, 2, 2, 5, "MasterBanana", (Controler)new ControlerIA(),(Armor) null,weapons);
        Fight tuto = new Fight(player,MasterBanana);
        
        //Fin tuto
    }
    
    public static void mainQuest(character.Character player){
        Display.mainQuest1(player.getName());
      
        Item lettre = new Item("lettre",10,0);
        player.addInventory(lettre);
        Display.winItem(lettre);
        Display.mainQuest2();
        
        for(int i=0;i<10;i++){
            Display.mainQuest3();
            int av = Dice.roll(5+i, 10+i);
            Armor armureDeBase = new Armor("armureDeBase"+i,10,1,av);
            int dmgmin = Dice.roll(5+i, 10+i);
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
        
        Display.mainQuestEnd();
        Armor armureDeBG = new Armor("armureDeBG",10,1,10);
        Weapon épéeDeBG = new Weapon("épéeDeBG",10,1,20,10);            
        Weapon[] weapons ={épéeDeBG,null};

        character.Character musclorFraise = new character.Monster(5, 20, 20, 20, 20, "musclorFraise", (Controler)new ControlerIA(),armureDeBG ,weapons);
        Fight fight = new Fight(player,musclorFraise);
        Display.end();

    
            
    }
    
    
    
}
