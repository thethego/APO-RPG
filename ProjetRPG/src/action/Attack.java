
package action;

import character.Caracteristics;
import utils.Dice;
import character.Character;

public class Attack extends Power {

    @Override
    public Effect effect(Character source, Character target) {
        int dmg;
        int puissanceattack = source.getValueCarac(Caracteristics.FORCE);
        dmg=puissanceattack-target.getValueCarac(Caracteristics.DEFENCE);
        Effect effect = new Effect(Caracteristics.HEALTH, dmg, true);
        return effect;
        
    }
    
}
