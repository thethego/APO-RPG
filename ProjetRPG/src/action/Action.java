package action;

import character.Character;

public final class Action {
    
    private Character source;
    private Character target;
    private Effect effect;
    
    
    public Action(Character source, Character target,Choice choice) {
        this.source = source;
        this.target = target;
        this.effect = choice.getPower().effect(source, target);
    }

    public Effect getEffect() {
        return effect;
    }
}
