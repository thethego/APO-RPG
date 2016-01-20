package controler;

import exception.InputException;
import menu.Menu;
import java.util.Scanner;
import character.Character;
import item.Item;
import java.util.List;
import menu.Fight;
import projectrpg.Display;

public class ControlerHuman extends Controler {
    
    @Override
    public String NameChoice(){
        System.out.println("Choisissez un nom : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
    
    @Override
    public Menu choice(Menu[] c){ 
        System.out.println();
        int n = 0;
        
        for(Menu af : c){
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
    
    private Menu checkChoice(Menu[] c,int i) throws InputException {
        for(Menu af : c){
            if(af.getNumber()==i){
                System.out.println("Vous avez choisi de "+af.getName());
                return af;
            }
        }
        throw new InputException("InvalidInput");
    }

    @Override
    public Menu choiceFight(Character pl, Character op) {
        Display.printCarac(pl,op);
        return choice(Fight.values());
    }
    
    @Override
    public Item choiceInventory(List<Item> arrayItem){ 
        System.out.println();
        System.out.println("Quel item voulez vous voir ?");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println();
        try {
            return checkItem(arrayItem,s);
        } catch (InputException ex) {
            System.out.println("Veuillez saisir un item valide :");
            return choiceInventory(arrayItem);
        }
    }
    
    private Item checkItem(List<Item> arrayItem,String s) throws InputException {
        for(Item it : arrayItem){
            if(it.getName().equals(s)){
                System.out.println("Vous avez choisi "+it.getName());
                return it;
            }
        }
        throw new InputException("InvalidInput");
    }

}
