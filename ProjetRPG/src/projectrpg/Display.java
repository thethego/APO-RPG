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
    
    public static void PrintLifes(Character player,Character opponent){
        System.out.println();
        System.out.println("Il vous reste "+player.calculHealth()+" vies sur "+player.getHealth());
        System.out.println("Il reste "+opponent.calculHealth()+" sur "+opponent.getHealth()+ " vies à votre ennemi.");
        System.out.println();
    }
}
