package controler;

import action.ActionFight;
import utils.Dice;

public class ControlerIA extends Controler {
    
    
    @Override
    public ActionFight FightChoice(){
        int i = Dice.roll(1, 3);
        for(ActionFight af : ActionFight.values()){
            if(af.getNumber()==i){
                
                System.out.println("l'IA a choisi de "+af.getName());
                return af;
            }
        }
        return ActionFight.ATTACK;
    }

    @Override
    public String NameChoice() {
        return "ennemi";
    }
}
