/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import controler.*;
import character.Character;
import item.Item;
import java.util.ArrayList;
import java.util.List;
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
        this.opponent=o;
        int nbTour = 1;
        Display.newFight();
        
        Round round1, round2 = null;
        Display.printCarac(player,opponent);
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
        }
        else if(opponent.calculHealth()<=0){
            Display.victory();
            player.calculLevel((opponent.getLevel()+1)*100);
            winItem();
        }
    }
    
    private void winItem(){
       List<Item> arrayItem = new ArrayList<>();
       if(player.getArmor() != null)
           arrayItem.add(player.getArmor());
       if(player.getWeapons()[1] != null)
           arrayItem.add(player.getWeapons()[1]);
       if(player.getWeapons()[2] != null)
           arrayItem.add(player.getWeapons()[2]);
       Item item = arrayItem.get(Dice.roll(arrayItem.size()));
       player.addInventory(item);
       Display.winItem(item);
    }
    
}
