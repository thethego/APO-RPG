
package action;

import utils.Dice;
import character.Character;
import action.Power;

public class Attack extends Power {

    
    

    @Override
    public action.Effect Effect(Character source, Character target) {
        int dmg;
        int puissanceattack = source.caracteristics.FORCE;
        dmg=puissanceattack-target.carateristics.DEFENCE;
        Effect effect = new Effect(target.caracteristics.health, dmg, true);
        return effect;
        
    }

   
    
}
