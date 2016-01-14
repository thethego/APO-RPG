package item;

import action.Effect;
import character.Caracteristics;

public class Edible extends Item {
    private Caracteristics   caract;
    private int  edibleValue;
    private boolean permanent;

    public Edible(Caracteristics caract, int edibleValue, boolean permanent) {
        this.caract = caract;
        this.edibleValue = edibleValue;
        this.permanent = permanent;
    }
    
    
}
