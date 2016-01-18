/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choice;

import character.Character;
import character.Thief;
import character.Warrior;
import controler.ControlerHuman;

/**
 *
 * @author theo
 */
public enum ChoiceClass implements Choice {
    THIEF("voleur",1,(Character) new Thief(new ControlerHuman())),
    WARRIOR("guerrier",2,(Character) new Warrior(new ControlerHuman()));
            
    private String name = "";
    private int number = 0;
    private Character character = null;
   
  //Constructor
  ChoiceClass(String name,int number, Character character){
    this.name = name;
    this.number = number;
    this.character = character;
  }
   
    @Override
  public String toString(){
    return "Pour être un"+name+" tapez "+number+".";
  }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumber() {
        return number;
    }

    public Character getCharacter() {
        return character;
    }
    
    
    public static Choice[] getValues(){
        return ChoiceClass.values();
    }
}