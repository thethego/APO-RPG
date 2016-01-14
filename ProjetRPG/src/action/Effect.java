package action;

import character.Caracteristics;
import character.Character;

public class Effect {
    
    private Caracteristics caract;
    private int value;
    private boolean permanent;
    private Character target;

    public Effect(Caracteristics c, int value, boolean permanent, Character character) {
        this.caract = c;
        this.permanent = permanent;
        this.target = character;
        this.value = calculValue(value);
    }
    
    public void apply(){
        target.setValueCarac(caract,target.getValueCarac(caract)+value);
    }
    
    public void cancel(){
        target.setValueCarac(caract,target.getValueCarac(caract)-value);
    }

    private int calculValue(int n){
        if(caract==Caracteristics.DAMAGE){
            int damage = target.getValueCarac(Caracteristics.DAMAGE);
            int health = target.getValueCarac(Caracteristics.HEALTH);
            if(damage+value>health)
                return health-damage;
            else if(damage+value<0)
                return 0;
            else return n;
        }
        else return n;
    }
    
    public Caracteristics getCaract() {
        return caract;
    }

    public int getValue() {
        return value;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setCaract(Caracteristics c) {
        this.caract = c;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public Character getTarget() {
        return target;
    }
    
    
}
