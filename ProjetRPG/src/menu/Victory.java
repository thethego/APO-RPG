/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author theo
 */
public enum Victory implements Menu {
    
    NEXT("continer",1),
    SEE("voir l'inventaire",2),
    QUIT("quitter",3);
            
    private String name = "";
    private int number = 0;
   
  //Constructor
  Victory(String name,int number){
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
