/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import action.Action;
import action.Choice;
import action.Effect;
import character.Caracteristics;
import controler.Controler;
import controler.ControlerIA;
import character.Character;
import java.util.List;
import static utils.Dice.roll;
import action.Power;
/**
 *
 * @author theo
 */
public class Round {
    
    public List nonPermanentEffect;
    
    
    
    public Round(Character player,Character opponent){
        Effect effect1,effect2;
        Choice choice = player.getControler().FightChoice();
        Action ac1 = new Action(player,opponent,choice);
        Choice choiceOponent = opponent.getControler().FightChoice();
        Action ac2 = new Action(opponent,player,choiceOponent);
        int dextPlayer = player.getValueCarac(Caracteristics.DEXTERITY);
        int dextOpponent = opponent.getValueCarac(Caracteristics.DEXTERITY);
        int success = roll(50)-25;
        if (dextPlayer > dextOpponent + success){
            effect1 = ac1.applyAction();
            Display.PrintEffect(effect1,player);
            effect2 = ac2.applyAction();
            Display.PrintEffect(effect2,opponent);
        }
        else{
            effect2 = ac2.applyAction();
            Display.PrintEffect(effect2,opponent);
            effect1 = ac1.applyAction();
            Display.PrintEffect(effect1,player);
        }
        boolean permanent = effect1.isPermanent();
        if (permanent  == false){
            player.CancelEffect(effect1);
             
        }
        boolean permanent2 = effect2.isPermanent();
        if (permanent2  == false){
            player.CancelEffect(effect2);
             
        }
        
    }
    
}
