
package character;

import action.Effect;
import static character.Caracteristics.DEFENCE;
import item.Weapon;
import item.Armor;
import item.Item;
import controler.Controler;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;


public class Character {
    
    private final String name;
    private int level;
    private int maxweight;
    private int maxhealth;
    private Controler controler;
    private Map<Caracteristics, Integer> caracteristics;
    private List<Item> arrayItem;
    private Armor armor;
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

    public Character(String name, Controler controler) {
        this(name,0,10,200,new EnumMap<Caracteristics, Integer>(Caracteristics.class),controler);
        //Set listKeys=caracteristics.keySet();  // Obtenir la liste des clés
        //Iterator iterateur=listKeys.iterator();
        for(Caracteristics carac : Caracteristics.values()){
            this.caracteristics.put((Caracteristics)carac, 0);
        }
    }

    
    public void applyEffect (Effect effect)
    {
        Caracteristics c = effect.getC();
        int valueInit = getValueCarac(c);
        int valueEffect = effect.getValue();
        this.caracteristics.put(c , valueInit + valueEffect);
    }
    
    public void equipWeapon(int i, Weapon weapon)
    {
        this.weapons[i] = weapon;
        
    }
    
    public void equipArmor(Armor armor)
    {
        this.armor = armor;
        int def = this.getValueCarac(Caracteristics.DEFENCE);
        this.caracteristics.put(DEFENCE, def+ this.armor.armorValue);
    }
    
    public void dropWeapon(int i){
        this.weapons[i]=null;
    }
    
    public void dropArmor(){
        this.armor = null;
        int def = this.getValueCarac(Caracteristics.DEFENCE);
        this.caracteristics.put(DEFENCE, def - this.armor.armorValue);
        
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
    
    public int calculHealth()
    {
        int health;
        health = 100+(int)this.caracteristics.get(Caracteristics.HEALTH)*(int)this.caracteristics.get(Caracteristics.HEALTH)*100;
        return health;
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

    public Controler getControler() {
        return controler;
    }

    public Map<Caracteristics, Integer> getCaracteristics() {
        return caracteristics;
    }

    public void setCaracteristics(Map<Caracteristics, Integer> caracteristics) {
        this.caracteristics = caracteristics;
    }
    
}
