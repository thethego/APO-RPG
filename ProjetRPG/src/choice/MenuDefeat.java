/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choice;

/**
 *
 * @author theo
 */
public enum MenuDefeat implements Choice {
    QUIT("quitter",1),
    SEE("voir l'inventaire",2),
    NEXT("relancer le combat",3);
            
    private String name = "";
    private int number = 0;
   
  //Constructor
  MenuDefeat(String name,int number){
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
    
    public static Choice[] getValues() {
        return Fight.values();
    }
  
}
