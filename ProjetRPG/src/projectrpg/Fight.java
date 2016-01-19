/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import character.Character;
import exception.LevelUpException;
import menu.Defeat;
import menu.Victory;
import item.Item;
import java.util.ArrayList;
import java.util.List;
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
        if(player.getArmor() != null)
           arrayItem.add(player.getArmor());
         if(player.getWeapons()[0] != null)
           arrayItem.add(player.getWeapons()[0]);
        if(player.getWeapons()[1] != null)
           arrayItem.add(player.getWeapons()[1]);
        int n = arrayItem.size();
        if (n>0){
            Item item = arrayItem.get(Dice.roll(n));
            player.addInventory(item);
            Display.winItem(item);
       }
    }
    
    public void menuVictory(){
        int menu=1;
        while(menu==1){
            Victory choiceMenu = (Victory) player.getControler().choice(Victory.values());
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
    
    
    
        public void menuDefeat(){
        int menu=1;
        while(menu==1){
            Defeat choiceMenu = (Defeat) player.getControler().choice(Defeat.values());
            switch(choiceMenu.getNumber()){
            case 1 : System.exit(0);
                break;
            case 2 : player.displayInventory();
                break;
            case 3 : menu=0;
                play();
                break;
            }
        }
    }
}
