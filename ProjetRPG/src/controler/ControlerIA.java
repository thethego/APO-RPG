package controler;

import action.Action;
import action.ActionFight;
import utils.Dice;

public class ControlerIA extends Controler {
    
    
    @Override
    public ActionFight FightChoice(){
        int i = Dice.roll(1, 4);
        for(ActionFight af : ActionFight.values()){
            if(af.getNumber()==i)
                return af;
        }
        return null;
    }

    @Override
    public String NameChoice() {
        return "ennemi";
    }
}
