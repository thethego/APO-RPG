
package action;

import character.Caracteristics;
import utils.Dice;
import character.Character;
import projectrpg.Display;

public class Attack extends Power {


    @Override
    public Effect effect(Character source, Character target) {
        int dmg;
        int dmgWeapons = 0;
        int puissanceAttack = source.getValueCarac(Caracteristics.FORCE);
        int targetDef=target.getValueCarac(Caracteristics.DEFENCE);
        int criticalStrikeChance = (int) (10*source.getValueCarac(Caracteristics.DEXTERITY))/(target.getValueCarac(Caracteristics.DEXTERITY)+1);
        int missChance = (int) (10*target.getValueCarac(Caracteristics.DEXTERITY))/(source.getValueCarac(Caracteristics.DEXTERITY)+1);
        //ajout de la défense de l'armure
        if (target.getArmor() != null){
            targetDef += target.getArmor().getArmorValue();
        }
        //ajout de l'attaque des armes
        if (source.getWeapons()[0] != null){
            dmgWeapons += Dice.roll(source.getWeapons()[0].dmgMin,  source.getWeapons()[0].dmgMax);
        }
        if (source.getWeapons()[1] != null){
            dmgWeapons += Dice.roll(source.getWeapons()[1].dmgMin,  source.getWeapons()[1].dmgMax);
        }
        dmg=puissanceAttack+dmgWeapons-targetDef;
        if(dmg < 0)
            dmg=0;
        //test coup critique
        int random = Dice.roll(100);
        if(random<criticalStrikeChance || target.getLevel()>2*source.getLevel()){
            dmg *= 2;
            Display.displayString("coup critique");
        }
        else{
            //test coup raté
            random = Dice.roll(100);
            if(random<missChance){
                dmg=0;
                Display.displayString("attaque manquée");
            }
        }
        Effect effect = new Effect(Caracteristics.DAMAGE, -dmg, true,target);
        return effect;
        
    }
    
}
