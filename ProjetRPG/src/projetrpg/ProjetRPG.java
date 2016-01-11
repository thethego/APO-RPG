/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrpg;

import controler.Controler;
import controler.ControlerHuman;
import character.Character;

/**
 * wesh
 * @author theo
 */
public class ProjetRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character player = new Character("moi", (Controler)new ControlerHuman());
        Game game = new Game(player);
        // TODO code application logic here
    }
    
}
