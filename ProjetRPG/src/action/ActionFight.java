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
    ATTACK("attaquer",1),
    PARRY("parer",2),
    HEAL("guérir",3);
    
    private String name = "";
    private int number = 0;
   
  //Constructor
  ActionFight(String name,int number){
    this.name = name;
    this.number = number;
  }
   
    @Override
  public String toString(){
    return "Pour "+name+" tapez "+number+".";
  }
  
  
}
