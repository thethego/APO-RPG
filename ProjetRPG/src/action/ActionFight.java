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
public enum ActionFight implements ActionChoice {
    ATTACK("attaquer",1,(Power) new Attack()),
    PARRY("parer",2,(Power) new Parry()),
    HEAL("guérir",3,(Power) new Heal());
    
    private String name = "";
    private int number = 0;
    private Power power = null;
   
  //Constructor
  ActionFight(String name,int number, Power pow){
    this.name = name;
    this.number = number;
    this.power = pow;
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

    @Override
    public Power getPower() {
        return power;
    }
    
    
  
  
}
