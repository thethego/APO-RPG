package controler;

import action.ActionChoice;
import action.ActionFight;
import java.util.Scanner;

public class ControlerHuman extends Controler {
    
    @Override
    public String NameChoice(){
        System.out.println("Choisissez un nom : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
    
    @Override
    public ActionFight FightChoice(){
        System.out.println();
        for(ActionFight af : ActionFight.values()){
            System.out.println(af);   
        }
        
        System.out.println("Que voulez vous faire ?");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int i = sc.nextInt();
        for(ActionFight af : ActionFight.values()){
            if(af.getNumber()==i)
                return af;
        }
        return ActionFight.ATTACK;
    }
}
