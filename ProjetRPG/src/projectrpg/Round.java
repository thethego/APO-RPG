/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import action.Action;
import action.ActionChoice;
import controler.Controler;
import controler.ControlerIA;
import character.Character;

/**
 *
 * @author theo
 */
public class Round {
    
    
    
    public Round(Character player,Character opponent){
        ActionChoice choice = player.getControler().FightChoice();
        Action.applyAction(player,opponent,choice);
        ActionChoice choiceOponent = opponent.getControler().FightChoice();
        Action.applyAction(player,opponent,choiceOponent);
    }
    
}
