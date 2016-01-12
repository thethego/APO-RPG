package controler;

import java.util.Scanner;

public class ControlerHuman extends Controler {
    
    @Override
    public int choix(){
        System.out.println("Que voulez vous faire ?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }
}
