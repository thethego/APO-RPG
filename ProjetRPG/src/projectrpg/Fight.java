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
        Display.NewFight();
        this.opponent=new character.Warrior((Controler)new ControlerIA());
        Round round;
        while(player.calculHealth()>0 && opponent.calculHealth()>0 ){
            round = new Round(player,opponent);
        }
    }
    
}
