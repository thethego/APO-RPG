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
    
    public static void NewFight(){
        System.out.println("Nouveau combat : ");
    }
    
    public static void Victory(){
        System.out.println("Vous avez gagner");
    }
    
    public static void Defeat(){
        System.out.println("Vous avez perdu");
    }
    
    public static void Bonjour(String name){
        System.out.println("Bonjour "+name);
    }
    
    public static void PrintCarac(Character player,Character opponent){
        System.out.println();
        System.out.println(player.getName()+"-> health :"+player.calculHealth()+"/"+player.getValueCarac(Caracteristics.HEALTH)+" dextérité :"+player.getValueCarac(Caracteristics.DEXTERITY)+" force :"+player.getValueCarac(Caracteristics.FORCE));
        System.out.println(opponent.getName()+"-> health :"+opponent.calculHealth()+"/"+opponent.getValueCarac(Caracteristics.HEALTH)+" dextérité :"+opponent.getValueCarac(Caracteristics.DEXTERITY)+" force :"+opponent.getValueCarac(Caracteristics.FORCE));
        System.out.println();
    }
    
    public static void PrintEffect(Effect effect,Character c){
        System.out.println(c.getName()+" a infligé "+effect.getValue()+" "+effect.getCarac().name());
    }
}
