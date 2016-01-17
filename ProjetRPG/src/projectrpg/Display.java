/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

/**
 *
 * @author SAM
 */

import action.Action;
import action.Effect;
import character.Caracteristics;
import character.Character;
import character.Thief;
import character.Warrior;
import controler.Controler;
import controler.ControlerHuman;
import java.util.Scanner;

public class Display {
    
    public static void intro(){
        System.out.println("-------------------------------------------------");
        System.out.println("                                                 ");
        System.out.println("                                                 ");
        System.out.println("                  GARDEN PARTY                   ");
        System.out.println("                                                 ");
        System.out.println("                                                 ");
        System.out.println("-------------------------------------------------");
        
        
    }
    

  public static Character classChoice( ){
        System.out.println("Choisissez votre classe : ");
        System.out.println("tapez 1 pour être WARRIOR ");
        System.out.println("tapez 2 pour être THIEF ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println();
        while(i<0 || i>2){
            System.out.println("Veuillez rentrer une valeur valide");
            i = sc.nextInt();
            System.out.println();
        }
       Character player;
        if (i==1){
            player = new Warrior((Controler)new ControlerHuman());
            return player;
        }
        else if (i==2){
            player = new Thief((Controler)new ControlerHuman());
            return player;
        }
        return player=null;
        
        
  }
    

    public static void newFight(){
        System.out.println("Nouveau combat : ");
    }
    
    public static void playerTurn(){
        System.out.println("A votre tour : ");
    }
    
    public static void opponentTurn(){
        System.out.println("Au tour de l'adversaire : ");
    }
    
    public static void victory(){
        System.out.println("Vous avez gagner");
    }
    
    public static void defeat(){
        System.out.println("Vous avez perdu");
    }
    
    public static void bonjour(String name){
        System.out.println("Bonjour "+name);
    }
    
    public static void printCarac(Character player,Character opponent){
        System.out.println();
        System.out.println(player.getName()+"-> health :"+player.calculHealth()+"/"+player.getValueCarac(Caracteristics.HEALTH)+" dextérité :"+player.getValueCarac(Caracteristics.DEXTERITY)+" force :"+player.getValueCarac(Caracteristics.FORCE)+" défense :"+player.getValueCarac(Caracteristics.DEFENCE));
        System.out.println(opponent.getName()+"-> health :"+opponent.calculHealth()+"/"+opponent.getValueCarac(Caracteristics.HEALTH)+" dextérité :"+opponent.getValueCarac(Caracteristics.DEXTERITY)+" force :"+opponent.getValueCarac(Caracteristics.FORCE)+" défense :"+opponent.getValueCarac(Caracteristics.DEFENCE));
        System.out.println();
    }
    
    public static void printEffect(Action action){
        System.out.print(action.getTarget().getName());
        if(action.getEffect().getValue()>=0){
            System.out.print(" a gagné ");
            System.out.print(action.getEffect().getValue());
        }
        else {
            System.out.print(" a perdu ");
            System.out.print(-action.getEffect().getValue());
        }
        System.out.println(" "+action.getCaracteristic());
    }
}
