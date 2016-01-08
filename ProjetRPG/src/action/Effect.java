package action;

import character.Character;

public class Effect {
    
    private Character.caracteristics c;
    private int value;
    private boolean permanent;

    public Effect(caracteristics c, int value, boolean permanent) {
        this.c = c;
        this.value = value;
        this.permanent = permanent;
    }
    
}
