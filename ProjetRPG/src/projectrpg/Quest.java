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
import item.UselessItem;
import item.Weapon;

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
        Armor armureDeBase = new Armor("armureDeBase",10,1,5);
        character.Character courgette = new character.Monster(1, 2, 2, 2, 5, "Courgette", (Controler)new ControlerIA(),armureDeBase ,new Weapon[2]);
        Fight fight = new Fight(player,courgette);

    
            
    }
    
    
    
}
