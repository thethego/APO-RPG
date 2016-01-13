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
    
    

    public Caracteristics getC() {
        return c;
    }

    public int getValue() {
        return value;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setC(Caracteristics c) {
        this.c = c;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }
    
}
