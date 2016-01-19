package controler;

import character.Caracteristics;
import menu.Menu;
import menu.Fight;
import utils.Dice;
import character.Character;
import projectrpg.Display;

public class ControlerIA extends Controler {
    
    
    @Override
    public Menu choiceFight(Character pl,Character op){
        Display.printCarac(op,pl);
        Menu m = null;
        int Def=pl.getValueCarac(Caracteristics.DEFENCE);
        int dmg = calculDmg(pl,op);
        int dmg2 = calculDmg(op,pl);
        if(dmg > op.calculHealth()){
            
            m = Fight.ATTACK;
        }
        else if(pl.calculHealth() < dmg2){
            if(Def/2 > (int)0.1*pl.calculHealth())
                m = Fight.PARRY;
            else m = Fight.HEAL;
        }
        else m = Fight.ATTACK;
        System.out.println("l'IA a choisi de "+m.getName());
        return m;
    }
    
    //calculate the damage that pl can hope to do to op
    private int calculDmg(Character pl,Character op){
        int dmg = pl.getValueCarac(Caracteristics.FORCE)-op.getValueCarac(Caracteristics.DEFENCE);
        if (pl.getWeapons()[0] != null)
            dmg += pl.getWeapons()[0].dmgMin;
        if (pl.getWeapons()[1] != null)
            dmg += pl.getWeapons()[1].dmgMin;
        if (op.getArmor() != null)
            dmg -= op.getArmor().getArmorValue();
        return dmg;
    }

    @Override
    public String NameChoice() {
        return "ennemi";
    }

    @Override
    public Menu choice(Menu[] c) {
        int i = Dice.roll(1, c.length);
        i = c[i].getNumber();
        for(Menu af : c){
            if(af.getNumber()==i){
                System.out.println("l'IA a choisi de "+af.getName());
                return af;
            }
        }
        return null;
    }
}
