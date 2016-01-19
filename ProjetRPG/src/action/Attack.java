
package action;

import character.Caracteristics;
import utils.Dice;
import character.Character;

public class Attack extends Power {


    @Override
    public Effect effect(Character source, Character target) {
        int dmg;
        int dmgWeapons ;
        int puissanceAttack = source.getValueCarac(Caracteristics.FORCE);
        int targetDef=target.getValueCarac(Caracteristics.DEFENCE);
        if (source.weapons[0] != null){
            dmgWeapons = Dice.roll(source.weapons[0].dmgMin,  source.weapons[0].dmgMax);
        }        
        else{ 
            dmgWeapons = 0;
        }
        dmg=puissanceAttack+dmgWeapons-targetDef;
        if(dmg < 0)
            dmg=0;
        Effect effect = new Effect(Caracteristics.DAMAGE, -dmg, true,target);
        return effect;
        
    }
    
}
