package action;

public class Heal extends Power {

    @Override
    public action.Effect Effect(Character source, Character target) {
        int value=0;
        Effect effect = new Effect(target.caracteristics.health, value, true);
        return effect;
        
    }
}
