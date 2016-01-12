/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrpg;

import controler.Controler;
import controler.ControlerIA;
import character.Character;

/**
 *
 * @author theo
 */
public class Round {
    
    
    
    public Round(Character player,Character opponent){
        
        Display.fight();
        int choice = player.getControler().choix();
        int choiceOponent = opponent.getControler().choix();
    }
    
}
