package item;

public class Armor extends Item {
    
    
    private int armorValue;
    
    private void ModifyDefence(int DEFENSE){
            DEFENSE += armorValue; 
    }
}
