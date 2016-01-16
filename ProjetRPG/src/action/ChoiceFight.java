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
public enum ChoiceFight implements Choice {
    ATTACK("attaquer",1,(Power) new Attack(),false,"vie"),
    PARRY("parer",2,(Power) new Parry(),true,"défense"),
    HEAL("guérir",3,(Power) new Heal(),true,"vie");
            
    private String name = "";
    private int number = 0;
    private Power power = null;
    private boolean self;
    private String caracteristic;
   
  //Constructor
  ChoiceFight(String name,int number, Power pow,boolean self,String s){
    this.name = name;
    this.number = number;
    this.power = pow;
    this.self=self;
    this.caracteristic=s;
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
    
    @Override
    public boolean getSelf(){
        return self;
    }

    @Override
    public String getString() {
        return this.caracteristic;
    }
  
  
}
