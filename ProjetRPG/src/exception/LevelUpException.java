/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author theo
 */
public class LevelUpException extends Exception{
    public LevelUpException(){
        super("Votre personnage a gagné un niveau");
    }
}
