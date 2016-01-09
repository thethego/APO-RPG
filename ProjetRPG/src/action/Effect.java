package action;

import character.Caracteristics;

public class Effect {
    
    private Caracteristics c;
    private int value;
    private boolean permanent;

    public Effect(Caracteristics c, int value, boolean permanent) {
        this.c = c;
        this.value = value;
        this.permanent = permanent;
    }
    
}
