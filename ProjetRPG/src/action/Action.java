package action;

import choice.ChoiceFight;
import choice.Choice;
import character.Character;

public final class Action {
    
    private Character source;
    private Character target;
    private Effect effect;
    private String caracteristic;
    
    
    public Action(Character source, Character target,Choice choice) {
        ChoiceFight c = (ChoiceFight) choice;
        this.source = source;
        this.target = target;
        this.effect = c.getPower().effect(source, target);
        this.caracteristic = c.getString();
    }

    public void applyEffect(){
        this.effect.apply(target);
    }
    
    public void cancelEffect(){
        this.effect.cancel(target);
    }
    
    public Effect getEffect() {
        return effect;
    }

    public Character getTarget() {
        return target;
    }

    public String getCaracteristic() {
        return caracteristic;
    }
    
    
}
