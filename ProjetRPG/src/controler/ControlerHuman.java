package controler;

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
        int n = 0;
        for(ActionFight af : ActionFight.values()){
            System.out.println(af);
            n++;
        }
        
        System.out.println("Que voulez vous faire ?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println();
        while(i<0 || i>n){
            System.out.println("Veuillez rentrer une valeur valide");
            i = sc.nextInt();
            System.out.println();
        }
        for(ActionFight af2 : ActionFight.values()){
            if(af2.getNumber()==i){
                System.out.println("Vous avez choisi de "+af2.getName());
                return af2;
            }
        }
        return ActionFight.ATTACK;
    }
    

}
