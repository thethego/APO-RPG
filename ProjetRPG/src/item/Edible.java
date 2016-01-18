package item;

import action.Effect;
import character.Caracteristics;

public class Edible extends Item {
    private Caracteristics   caract;
    private int  edibleValue;
    private boolean permanent;

    public Edible(String name, int weight, int levelneeded, Caracteristics caract, int edibleValue, boolean permanent) {
        super(name, weight, levelneeded);
        this.caract = caract;
        this.edibleValue = edibleValue;
        this.permanent = permanent;
    }
    @Override
    public void getCaract(){
        int poids = getWeight();
        System.out.println("poids =" +poids);
        int levelneeded = getLevelneeded();
        System.out.println("niveau requis =" +levelneeded);;
        System.out.println("bonus de " + caract + " = " +edibleValue);
        

    }
    
}
