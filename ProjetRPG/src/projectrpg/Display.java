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
import java.io.*;
import action.Action;
import character.Caracteristics;
import character.Character;
import item.Item;

public class Display {
    
    public static void intro() {
        System.out.println("-------------------------------------------------");
        System.out.println("                                                 ");
        System.out.println("                                                 ");
        System.out.println("                  GARDEN PARTY                   ");
        System.out.println("                                                 ");
        System.out.println("                                                 ");
        System.out.println("-------------------------------------------------");
        
        System.out.println();
        System.out.println();
        System.out.print("Bienvenue dans...   ");
        
        System.out.println("Votre jardin");
                

        System.out.println();
        System.out.println();
        System.out.println("Vous êtes vous jamais demandé ce que font vos fruits et légumes lorsque vous n'êtes pas la pour les surveillez ?");
        System.out.println("Vous allez maintenant pouvoir réaliser votre rève et incarner une banane se promenant dans votre jardin.");
        System.out.println("Tout d'abord vous devez choisir une classe.");
       
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
    
    public static void winItem(Item i){
        System.out.println("Vous avez gagner : "+i.getName());
    }
    
    public static void printCarac(Character player,Character opponent){
        System.out.println();
        System.out.println(player.getName()+"-> level :"+player.getLevel()+" xp :"+player.getXp()+"/"+player.xpNextLevel()+" health :"+player.calculHealth()+"/"+player.getValueCarac(Caracteristics.HEALTH)+" dextérité :"+player.getValueCarac(Caracteristics.DEXTERITY)+" force :"+player.getValueCarac(Caracteristics.FORCE)+" défense :"+player.getValueCarac(Caracteristics.DEFENCE));
        System.out.println(opponent.getName()+"-> level :"+opponent.getLevel()+" health :"+opponent.calculHealth()+"/"+opponent.getValueCarac(Caracteristics.HEALTH)+" dextérité :"+opponent.getValueCarac(Caracteristics.DEXTERITY)+" force :"+opponent.getValueCarac(Caracteristics.FORCE)+" défense :"+opponent.getValueCarac(Caracteristics.DEFENCE));
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
    
    public static void tuto(){
        System.out.println("Master Banana : -Bienvenue dans le jardin jeune homme ");
        System.out.println("Master Banana : -Je ne sais pas ce que vous êtes venu chercher ici mais je dois vous prévenir, ce monde est dangereux.");
        System.out.println("Master Banana : -Il y a des légumes qui trainent dans les parrages et d'autres choses pire encore.");
        System.out.println("Master Banana : -Avant de vous laisser partir je dois m'assurer que vous êtes capable de vous defendre");
        System.out.println("Master Banana : -Vous allez devoir me vaincre en duel");
    }
    
    public static void mainQuest1(String name){
        System.out.println("Soudain une vieille bannane presque pourris vous aborde :");
        System.out.println("Vieille bannane : -Ola jeune banane !");
        System.out.println("Vieille bannane : -Vous devez être le nouveau, " +name+ " c'est ça ?");
        System.out.println("Vieille bannane : -Je vous ai vu combattre contre le maître.");
        System.out.println("Vieille bannane : -C'était impressionnant, je n'avais jamais vu quelqu'un le battre du premier coup");
        System.out.println("Vieille bannane : -J'ai une mission a vous confier.");
        System.out.println("Vieille bannane : -J'ai besoin qque vous alliez donnez cette lettre à Capucine du village des haricots.");
        System.out.println("Mais surtout ne dites pas que c'et de ma part.");
        System.out.println("Je vous fais confiance.");
    }
    public static void levelUp(Character player){
        System.out.println("Vous passez level " +player.getLevel());
    }
    
    public static void improvement(String s, int n){
        System.out.println("Vous avez " +s+" de "+n);
    }
}
