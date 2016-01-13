/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import action.Action;
import action.ActionChoice;
import character.Caracteristics;
import controler.Controler;
import controler.ControlerIA;
import character.Character;
import static utils.Dice.roll;
/**
 *
 * @author theo
 */
public class Round {
    
    
    
    public Round(Character player,Character opponent){
        ActionChoice choice = player.getControler().FightChoice();
        Action ac1 = new Action(player,opponent,choice);
        ActionChoice choiceOponent = opponent.getControler().FightChoice();
        Action ac2 = new Action(player,opponent,choiceOponent);
        int dextPlayer = player.getValueCarac(Caracteristics.DEXTERITY);
        int dextOpponent = opponent.getValueCarac(Caracteristics.DEXTERITY);
        int success = roll(50)-25;
        if (dextPlayer > dextOpponent + success){
            ac1.applyAction();
            ac2.applyAction();
        }
        else{
            ac2.applyAction();
            ac1.applyAction();
        }
    }
    
}
