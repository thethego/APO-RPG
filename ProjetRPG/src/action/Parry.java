package action;

import character.Caracteristics;
import character.Character;
import static utils.Dice.roll;

public class Parry extends Power {

    @Override
    public Effect effect(Character source, Character target) {
        int sourceDef=source.getValueCarac(Caracteristics.DEFENCE);
        int bonus = roll(sourceDef)+1;
        Effect effect = new Effect(Caracteristics.DEFENCE, bonus, false,source);
        return effect;
    }
}
