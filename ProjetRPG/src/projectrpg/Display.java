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
    
    public static void newTurn(){
        System.out.println("Nouveau tour : ");
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
    
    public static void printEffect(Effect effect){
        System.out.println(effect.getTarget().getName()+" a gagné "+effect.getValue()+" "+effect.getCaract().name());
    }
}
