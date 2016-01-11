/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrpg;


import character.Character;
/**
 *
 * @author SAM
 */
public class Game {

    
    private final Character player;
    
    
    public Game(Character pl) {
        this.player = pl;
        while(this.player.calculHealth()>0){
            
            
        }
    }
}
