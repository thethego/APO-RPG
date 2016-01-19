package controler;

import choice.Choice;
import choice.Fight;
import utils.Dice;

public class ControlerIA extends Controler {
    
    
    @Override
    public Choice choice(Choice[] c){
        int i = Dice.roll(1, 3);
        for(Choice af : c){
            if(af.getNumber()==i){
                
                System.out.println("l'IA a choisi de "+af.getName());
                return af;
            }
        }
        return Fight.ATTACK;
    }

    @Override
    public String NameChoice() {
        return "ennemi";
    }
}
