package action;

import character.Character;

public final class Action {
    
    private Character source;
    private Character target;
    private Choice choice;
    
    
    public Action(Character source, Character target,Choice choice) {
        this.source = source;
        this.target = target;
        this.choice = choice;
    }
    
    public Effect applyAction(){
        Effect e = choice.getPower().effect(source, target);
        target.applyEffect(choice.getPower().effect(source, target));
        return e;
    }

    public Choice getChoice() {
        return choice;
    }
}
