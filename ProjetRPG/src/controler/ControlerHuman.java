package controler;

import choice.Choice;
import choice.ChoiceFight;
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
    public Choice choice(Choice[] c){
        System.out.println();
        int n = 0;
        
        for(Choice af : c){
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
        for(Choice af2 : c){
            if(af2.getNumber()==i){
                System.out.println("Vous avez choisi de "+af2.getName());
                return af2;
            }
        }
        return ChoiceFight.ATTACK;
    }
    

}
