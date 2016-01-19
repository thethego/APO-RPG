/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choice;

import character.Character;
import character.Thief;
import character.Warrior;
import controler.Controler;

/**
 *
 * @author theo
 */
public enum Class implements Choice {
    THIEF("être un voleur",1),
    WARRIOR("être un guerrier",2);
            
    private String name = "";
    private int number = 0;
    private Character character = null;
   
  //Constructor
  Class(String name,int number){
    this.name = name;
    this.number = number;
  }
   
    @Override
  public String toString(){
    return "Pour "+name+" tapez "+number+".";
  }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumber() {
        return number;
    }

    public void createCharacter(Controler controler){
        switch(number){
            case 1: character = new Thief(controler);
                break;
            case 2: character = new Warrior(controler);
                break;
        }
    }
    
    public Character getCharacter() {
        return character;
    }
    
    
    public static Choice[] getValues(){
        return Class.values();
    }
}