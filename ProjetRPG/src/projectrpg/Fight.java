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

    public Fight(Character player) {
        Display.newFight();
        this.opponent=new character.Warrior((Controler)new ControlerIA());
        Round round;
        Display.printCarac(player,opponent);
        while(player.calculHealth()>0 && opponent.calculHealth()>0 ){
            Display.newTurn();
            Display.printCarac(player,opponent);
            round = new Round(player,opponent);
        }
        if(player.calculHealth()<=0){
            Display.defeat();
        }
        else if(opponent.calculHealth()<=0){
            Display.victory();
        }
    }
    
}
