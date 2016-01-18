/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import controler.*;
import character.Character;

/**
 *
 * @author theo
 */
public class Fight {
    
    private character.Character opponent;

    public Fight(Character player, Character opponent) {
        int nbTour = 1;
        Display.newFight();
        
        Round round1, round2 = null;
        Display.printCarac(player,opponent);
        round1 = new Round(player,opponent);
        while(player.calculHealth()>0 && opponent.calculHealth()>0 ){
            Display.printCarac(player,opponent);
            if(nbTour%2 == 0){
                Display.playerTurn();
                round1 = new Round(player,opponent);
                round2.cancelEffects();
            }
            else{
                Display.opponentTurn();
                round2 = new Round(opponent,player);
                round1.cancelEffects();
            }
            nbTour++;
        }
        if(player.calculHealth()<=0){
            Display.defeat();
        }
        else if(opponent.calculHealth()<=0){
            Display.victory();
        }
    }
    
}
