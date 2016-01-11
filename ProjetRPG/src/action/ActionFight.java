/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

/**
 *
 * @author theo
 */
public enum ActionFight {
    ATTACK("attaquer"),
    PARRY("parer"),
    HEAL("guérir");
    
    private String name = "";
   
  //Constructor
  ActionFight(String name){
    this.name = name;
  }
   
  public String toString(){
    return name;
  }
}
