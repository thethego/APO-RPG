package controler;

import choice.Choice;
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
        try {
            return checkChoice(c,i);
        } catch (InputException ex) {
            System.out.println("Veuillez saisir une valeur valide :");
            return choice(c);
        }
    }
    
    private Choice checkChoice(Choice[] c,int i) throws InputException {
        for(Choice af : c){
            if(af.getNumber()==i){
                System.out.println("Vous avez choisi de "+af.getName());
                return af;
            }
        }
        throw new InputException("InvalidInput");
    }

}
