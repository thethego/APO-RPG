/* 
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import item.*;
import character.Character;

/**
 *
 * @author theo
 */
public enum InventoryEquip implements Menu {
    QUIT("revenir au menu",1),
    EQUIP("s'équiper de l'item",2);
            
    private String name = "";
    private int number = 0;
   
  //Constructor
  InventoryEquip(String name,int number){
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
  
}

