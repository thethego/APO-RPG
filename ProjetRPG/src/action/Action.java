package action;

import character.Character;

public final class Action {
    
    private Character source;
    private Character target;
    private ActionChoice choice;
    
    
    public Action(Character source, Character target,ActionChoice choice) {
        this.source = source;
        this.target = target;
        this.choice = choice;
    }
    
    public void applyAction(){
        target.applyEffect(choice.getPower().effect(source, target));
        
    }

    public ActionChoice getChoice() {
        return choice;
    }
}
