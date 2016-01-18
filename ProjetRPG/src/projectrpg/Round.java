/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import action.Action;
import choice.ChoiceFight;
import action.Effect;
import character.Character;
/**
 *
 * @author theo
 */
public final class Round {
    
    private Character player;
    private Character opponent;
    private ChoiceFight choice;
    private Action action;
    
    
    public Round(Character pl,Character op){
        Effect effect1;
        this.player=pl;
        this.opponent=op;
        choice = (ChoiceFight) player.getControler().choice(ChoiceFight.values());
        action = new Action(player,opponent,choice);
        applyActions();
        Display.printEffect(action);
        
    }
    
    
    public void applyActions(){
        if (choice.getSelf()){
             action = new Action(player,player,choice);
        }
        else{
             action = new Action(player,opponent,choice);
        }
        action.applyEffect();
    }
    
    
    public void cancelEffects(){
        if (!action.getEffect().isPermanent()){
            action.cancelEffect();   
        }
    }

    public Action getAction() {
        return action;
    }
    
}
