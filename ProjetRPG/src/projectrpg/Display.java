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
        System.out.println("Vieille bannane : -J'ai besoin qque vous alliez donnez cette lettre à Capucine du village des fraises.");
        System.out.println("Mais surtout ne dites pas que c'et de ma part.");
        System.out.println("Je vous fais confiance.");
    }
    public static void mainQuest2(){
        System.out.println("Vous sortez du village des bannanes et vous prenez la route pour aller chez les fraises");
        System.out.println("Un panneau indique : ATTENTION !! vous entrez dans la vallée des courgettes sauvages");
        System.out.println("Mais vous etes courageux et un peu con donc vous continuer.");

        
    }
    public static void mainQuest3(){
        System.out.println("Soudain une courgette sauvage apparait !");
    }
    public static void mainQuestEnd(){
        System.out.println("Vous arrivez enfin au village des Fraises.");
        System.out.println("Vous trouvez Capucine et lui donnez la lettre.");
        System.out.println("Elle commence à la lire...");
        System.out.println("Soudain elle devient encore plus rouge et appelle une grosse fraise impressionnante et pleine de muscle");
        System.out.println("Fraise Musclor : - Eh toi! petite bannane.");
        System.out.println("Fraise Musclor : - D'où tu parle à ma copine ?");
        System.out.println();
    }
    
    public static void end(){
        System.out.println("Félicitation vous avez fini le jeu.");
        System.out.println("Vous pouvez continuer à faire des combats en attendant le DLC qui sortira très bientôt");
        System.out.println("et qui apportera des nouvelles quetes, des nouveaux perso et des nouvelles armes");
        }

    
    public static void levelUp(Character player){
        System.out.println("Vous passez level " +player.getLevel());
    }
    
    public static void improvement(String s, int n){
        System.out.println("Vous avez " +s+" de "+n);
    }
    
    public static void displayString(String s){
        System.out.println(s);
    }
}
