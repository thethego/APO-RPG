package action;

import character.Caracteristics;
import character.Character;

public class Heal extends Power {

    @Override
    public Effect effect(Character source, Character target) {
        int value=3;
        Effect effect = new Effect(Caracteristics.DAMAGE, value, true,target);
        return effect;
    }
}
