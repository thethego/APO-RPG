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
