
package character;

import action.Effect;
import item.Weapon;
import item.Armor;
import item.Item;
import java.util.Map;


public class Character {
    
    private final String name;
    private int level;
    private int maxweight;
    private int maxhealth;
    private Map<Caracteristics, Integer> caracteristics;
    
    

    public Character(String name, int level, int maxweight, int healthMax, Map<Caracteristics, Integer> caracteristics) {
        this.name = name;
        this.level = level;
        this.maxweight = maxweight;
        this.maxhealth = healthMax;
        this.caracteristics = caracteristics;
    }

    
    
    public void applyEffect (Effect effect)
    {
        
    }
    
    public void equipArme(Weapon arme)
    {
        
    }
    
    public void equipArmor(Armor armure)
    {
        
    }
    
    public int getWeightInventory ()
    {
        int poidsInventaire=0;
        return poidsInventaire;
    }
    
    public void rmInventory (Item item)
    {
        
    }
    
    public void addInventory (Item item)
    {
        
    }
    
    public void calculMaxHealth()
    {
        
    }
    
    public void calculDexterityMax ()
    {
        
    }
    
    public void incrementLevel()
    {
        this.level++;
    }
    
    
    public int sumCarac()
    {
     int sumCarac = 0;
     return sumCarac;
    }
    
}
