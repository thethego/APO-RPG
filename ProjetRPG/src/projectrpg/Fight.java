/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import character.Character;
import exception.LevelUpException;
import item.*;
import menu.Defeat;
import menu.Victory;
import java.util.ArrayList;
import java.util.List;
import menu.Inventory;
import menu.InventoryEquip;
import menu.InventoryLetter;
import menu.LevelUp;
import utils.Dice;

/**
 *
 * @author theo
 */
public class Fight {
    
    private Character opponent;
    private Character player;

    public Fight(Character p, Character o) {
        this.player=p;
        player.restoreHealth();
        this.opponent=o;
        this.play();
    }
    
    public void play(){
        int nbTour = 1;
        Display.newFight();
        Round round1, round2 = null;
        round1 = new Round(player,opponent);
        while(player.calculHealth()>0 && opponent.calculHealth()>0 ){
            Display.printCarac(player,opponent);
            if(nbTour%2 == 0){
                Display.playerTurn();
                round1 = new Round(player,opponent);
                round2.cancelEffects();
            }
            else{
                Display.opponentTurn();
                round2 = new Round(opponent,player);
                round1.cancelEffects();
            }
            nbTour++;
        }
        if(player.calculHealth()<=0){
            Display.defeat();
            menuDefeat();
        }
        else if(opponent.calculHealth()<=0){
            Display.victory();
            try {
                player.calculLevel((opponent.getLevel()+1)*100);
            } catch (LevelUpException ex) {
                Display.displayString(ex.getMessage());
                Display.levelUp(player);
                LevelUp choice = (LevelUp) player.getControler().choice(LevelUp.values());
                int n = choice.applyChoice(player);
                Display.improvement(choice.getName(), n);
            }
            winItem();
            menuVictory();
        }
    }
    
    private void winItem(){
        List<Item> arrayItem = new ArrayList<>();
        if(opponent.getArmor() != null)
           arrayItem.add(opponent.getArmor());
         if(opponent.getWeapons()[0] != null)
           arrayItem.add(opponent.getWeapons()[0]);
        if(opponent.getWeapons()[1] != null)
           arrayItem.add(opponent.getWeapons()[1]);
        int n = arrayItem.size();
        if (n>0){
            Item item = arrayItem.get(Dice.roll(n-1));
            player.addInventory(item);
            Display.winItem(item);
       }
    }
    
    public void menuVictory(){
        int menu=1;
        while(menu==1){
            Victory choiceMenu = (Victory) player.getControler().choice(Victory.values());
            switch(choiceMenu.getNumber()){
            case 3 : System.exit(0);
                break;
            case 2 : 
                //Si l'utilisteur a choisit de voir l'inventaire
                menuInventory();
                break;
            case 1 : menu=0;
                break;
            }
        }
    }
    
    
    
    public void menuDefeat(){
        int menu=1;
        while(menu==1){
            Defeat choiceMenu = (Defeat) player.getControler().choice(Defeat.values());
            switch(choiceMenu.getNumber()){
            case 3 : System.exit(0);
                break;
            case 2 : menuInventory();
                break;
            case 1 : menu=0;
                player.restoreHealth();
                opponent.restoreHealth();
                play();
                break;
            }
        }
    }
        
    public void menuInventory(){
        player.displayInventory();
            Inventory choiceInventory = (Inventory) player.getControler().choice(Inventory.values());
            switch(choiceInventory.getNumber()){
                case 2:
                    //si l'utilisateur a choisit de voir un item
                    Item it = player.getControler().choiceInventory(player.getInventory());
                    if(it instanceof Armor || it instanceof Weapon){
                        InventoryEquip choiceItem;
                        choiceItem = (InventoryEquip) player.getControler().choice(InventoryEquip.values());
                        if(choiceItem.getNumber() == 2)
                            if(it instanceof Armor)
                                player.equipArmor((Armor) it);
                             else if(it instanceof Weapon)
                                 if(player.getWeapons()[0] == null)
                                    player.equipWeapon(0, (Weapon) it);
                                 else  player.equipWeapon(1, (Weapon) it);
                    }
                    else if(it instanceof Letter){
                        InventoryLetter choiceItem;
                        choiceItem = (InventoryLetter) player.getControler().choice(InventoryLetter.values());
                        if(choiceItem.getNumber() == 2)
                            Display.displayString(((Letter)it).getMessage());
                    }
                    break;
                default: break;
            }

    }
}
