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
import character.Character;
import static utils.Dice.roll;
/**
 *
 * @author theo
 */
public class Round {
    
    private Character player1;
    private Character player2;
    private Choice c1;
    private Choice c2;
    private Action ac1;
    private Action ac2;
    
    
    public Round(Character player,Character opponent){
        Effect effect1,effect2;
        this.player1=player;
        this.player2=opponent;
        c1 = player1.getControler().FightChoice();
        ac1 = new Action(player1,player2,c1);
        c2 = player2.getControler().FightChoice();
        ac2 = new Action(player2,player1,c2);
        applyActions();
        Display.printCarac(player,opponent);
        cancelEffects();
        
    }
    
    
    private void applyActions(){
        int dextPlayer = player1.getValueCarac(Caracteristics.DEXTERITY);
        int dextOpponent = player2.getValueCarac(Caracteristics.DEXTERITY);
        int success = roll(50)-25;
        if (dextPlayer > dextOpponent + success){
            ac1.getEffect().apply();
            Display.printEffect(ac1.getEffect());
            ac2.getEffect().apply();
            Display.printEffect(ac2.getEffect());
        }
        else{
            ac2.getEffect().apply();
            Display.printEffect(ac2.getEffect());
            ac1.getEffect().apply();
            Display.printEffect(ac1.getEffect());
        }
    }
    
    
    private void cancelEffects(){
        if (!ac1.getEffect().isPermanent()){
            ac1.getEffect().cancel();
             
        }
        if (!ac2.getEffect().isPermanent()){
            ac2.getEffect().cancel();
             
        }
    }
    
    
    
}
