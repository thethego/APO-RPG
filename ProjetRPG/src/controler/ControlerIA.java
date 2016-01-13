package controler;

import action.ChoiceFight;
import utils.Dice;

public class ControlerIA extends Controler {
    
    
    @Override
    public ChoiceFight FightChoice(){
        int i = Dice.roll(1, 3);
        for(ChoiceFight af : ChoiceFight.values()){
            if(af.getNumber()==i){
                
                System.out.println("l'IA a choisi de "+af.getName());
                return af;
            }
        }
        return ChoiceFight.ATTACK;
    }

    @Override
    public String NameChoice() {
        return "ennemi";
    }
}
