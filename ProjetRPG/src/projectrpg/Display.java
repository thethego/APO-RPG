/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import action.ActionFight;

/**
 *
 * @author SAM
 */
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
    
    
    
    public static void fight(){
        for(ActionFight af : ActionFight.values()){
            System.out.println(af);   
        }
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
}
