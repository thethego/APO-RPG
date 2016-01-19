package action;

import character.Caracteristics;
import character.Character;
import static utils.Dice.roll;

public class Parry extends Power {

    @Override
    public Effect effect(Character source, Character target) {
        int Def=target.getValueCarac(Caracteristics.DEFENCE);
        int bonus = roll(Def)+1;
        Effect effect = new Effect(Caracteristics.DEFENCE, bonus, false,target);
        return effect;
    }
}
