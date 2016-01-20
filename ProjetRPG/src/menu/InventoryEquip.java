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
    QUIT("revenir au menu",1,null),
    EQUIP("s'équiper de l'item",2,null);
            
    private String name = "";
    private int number = 0;
    private Item item = null;
   
  //Constructor
  InventoryEquip(String name,int number,Item it){
    this.name = name;
    this.number = number;
    this.item = it;
    
  }
   
    @Override
  public String toString(){
    return "Pour "+name+" tapez "+number+".";
  }

    @Override
    public String getName() {
        return name;
    }
    
    public void applyChoice(Character c){
        if(item instanceof Armor)
            c.equipArmor((Armor) item);
        else if(item instanceof Weapon)
            c.equipWeapon(1, (Weapon) item);
    }

    @Override
    public int getNumber() {
        return number;
    }
  
}

