/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import character.Caracteristics;
import character.Character;

/**
 *
 * @author theo
 */
public enum LevelUp implements Menu {
    FORCE("augmenter votre force",1,Caracteristics.FORCE),
    DEXTERITY("augmenter votre dextérité",2,Caracteristics.DEXTERITY),
    DEFENCE("augmenter votre défence",3,Caracteristics.DEFENCE),
    HEALTH("augmenter votre santé",4,Caracteristics.HEALTH);
            
    private String name = "";
    private int number = 0;
    Caracteristics carac = null;
   
  //Constructor
  LevelUp(String name,int number,Caracteristics c){
    this.name = name;
    this.number = number;
    this.carac = c;
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
    
    public int applyChoice(Character player){
        int n = 10*player.getLevel();
        player.incrementCaracteristic(carac,n);
        return n;
    }
  
}
