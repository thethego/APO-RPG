package action;

import character.Caracteristics;
import character.Character;
import static utils.Dice.roll;

public class Parry extends Power {

    @Override
    public Effect effect(Character source, Character target) {
        int sourceDef=source.getValueCarac(Caracteristics.DEFENCE);
        target = source;
        int bonus = roll(sourceDef);
        Effect effect = new Effect(Caracteristics.DEFENCE, sourceDef + bonus, false);
        return effect;
    }
}
