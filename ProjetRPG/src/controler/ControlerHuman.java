package controler;

import action.ActionChoice;
import action.ActionFight;
import java.util.Scanner;

public class ControlerHuman extends Controler {
    
    @Override
    public String NameChoice(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
    
    @Override
    public ActionFight FightChoice(){
        for(ActionFight af : ActionFight.values()){
            System.out.println(af);   
        }
        System.out.println("Que voulez vous faire ?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(ActionFight af : ActionFight.values()){
            if(af.getNumber()==i)
                return af;
        }
        return null;
    }
}
