
package character;

import action.Effect;
import item.Weapon;
import item.Armor;
import item.Item;
import java.util.Map;
import controler.Controler;
import java.util.ArrayList;
import java.util.List;


public class Character {
    
    private final String name;
    private int level;
    private int maxweight;
    private int maxhealth;
    private Controler controler;
    private Map<Caracteristics, Integer> caracteristics;
    private List<Item> arrayItem;
    private Item armor;
    public Weapon[] weapons;
    
    

    public Character(String name, int level, int maxweight, int healthMax, Map<Caracteristics, Integer> caracteristics, Controler controler) {
        this.name = name;
        this.level = level;
        this.maxweight = maxweight;
        this.maxhealth = healthMax;
        this.caracteristics = caracteristics;
        this.controler = controler;
        this.arrayItem = new ArrayList<>();
        this.armor = null;
        this.weapons = new Weapon[2];
        this.weapons[0] = null;
        this.weapons[1] = null;
    }

    
    
    public void applyEffect (Effect effect)
    {
        
    }
    
    public void equipWeapon(int i, Weapon weapon)
    {
        this.weapons[i] = weapon;
        
    }
    
    public void equipArmor(Armor armor)
    {
        this.armor = armor;
    }
    
    public int getWeightInventory ()
    {
        int poidsInventaire=0;
        return poidsInventaire;
    }
    
    /* return 1 if the Item has been delete from the Inventory,
    * 0 otherwise
    */
    public boolean rmInventory (Item item)
    {
        return this.arrayItem.remove(item);
    }
    
    public void addInventory (Item item)
    {
        this.arrayItem.add(item);
    }
    
    public void calculHealth(int i)
    {
        int health;
        health = (int)this.caracteristics.get(Caracteristics.HEALTH);
    }
    
    public int getValueCarac(Caracteristics c){
        
        return (int)this.caracteristics.get(c);
    }
    
    public void calculDexterity ()
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
