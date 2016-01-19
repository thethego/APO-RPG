
package character;

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
    private Controler controler;
    private Map<Caracteristics, Integer> caracteristics;
    private List<Item> arrayItem;
    private Armor armor;
    private Weapon[] weapons;
    private int xp = 0;
    

    public Character(String name, int level, int maxweight, int healthMax, Map<Caracteristics, Integer> caracteristics, Controler controler) {
        this.name = name;
        this.level = level;
        this.maxweight = maxweight;
        this.caracteristics = caracteristics;
        this.controler = controler;
        this.arrayItem = new ArrayList<>();
        this.armor = null;
        this.weapons = new Weapon[2];
        this.weapons[0] = null;
        this.weapons[1] = null;
    }

    public Character(Controler controler) {
        this(controler.NameChoice(),0,10,200,new EnumMap<Caracteristics, Integer>(Caracteristics.class),controler);
        for(Caracteristics carac : Caracteristics.values()){
            this.caracteristics.put((Caracteristics)carac, 0);
        }
    }

    public Character(String name,Controler controler) {
        this(name,0,10,200,new EnumMap<Caracteristics, Integer>(Caracteristics.class),controler);
        for(Caracteristics carac : Caracteristics.values()){
            this.caracteristics.put((Caracteristics)carac, 0);
        }
    }

    public Character(String name, int level, Controler controler, Map<Caracteristics, Integer> caracteristics, Weapon[] weapons) {
        this.name = name;
        this.level = level;
        this.controler = controler;
        this.caracteristics = caracteristics;
        this.weapons = weapons;
    }
    
    public void equipWeapon(int i, Weapon weapon)
    {
        int leveln = weapon.getLevelneeded();
        if(level>=leveln){
            this.weapons[i] = weapon;
            rmInventory (weapon);
        }
        else{System.out.println("niveau insuffisant pour utiliser cet item");}
    }
    
    public void equipArmor(Armor armor)
    {
        int leveln = armor.getLevelneeded();
        if(level>=leveln){
            this.armor = armor;
            int def = this.getValueCarac(Caracteristics.DEFENCE);
            this.caracteristics.put(DEFENCE, def+ this.armor.armorValue);
            rmInventory (armor);
        }
        else{System.out.println("niveau insuffisant pour utiliser cet item");}
    }
    
    public void dropWeapon(int i){
        Weapon weapon = this.weapons[i];
        this.weapons[i]=null;
        addInventory (weapon);
    }
    
    public void dropArmor(){
        Armor armor = this.armor;
        this.armor = null;
        int def = this.getValueCarac(Caracteristics.DEFENCE);
        this.caracteristics.put(DEFENCE, def - this.armor.armorValue);
        addInventory (armor);
    }
    
    public void displayWeapon(){
        for(int i=0 ; i<2;i++){
            if (weapons[i]!=null){
            Weapon weapon = weapons[i];            
            System.out.println(weapon.getName());
            weapon.getCaract();
            }
            else { System.out.println("pas d'arme dans l'emplacement " + i);}
        }
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
    
    public void displayInventory(){
        for(int i=0 ; i<arrayItem.size();i++){
            Item item = arrayItem.get(i);            
            System.out.println(item.getName());
            item.getCaract();
        }
    }
    
    public int calculHealth()
    {
        return (int)this.caracteristics.get(Caracteristics.HEALTH)+this.caracteristics.get(Caracteristics.DAMAGE);
    }
    
    public int getValueCarac(Caracteristics c){
        
        return (int)this.caracteristics.get(c);
    }
    
    public void setValueCarac(Caracteristics c,int n){
        this.caracteristics.put(c, n);
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
    
    public String getName(){
        return this.name;
    }
    
    public int getHealth(){
        return (int)this.caracteristics.get(Caracteristics.HEALTH);
    }
    
    public void restoreHealth(){
        this.caracteristics.put(Caracteristics.DAMAGE, 0);
    }

    public int getLevel() {
        return level;
    }
    
    public void calculLevel(int exp){
        xp += exp;
        System.out.println("Vous gagnez " +exp+ "XP");
        if (xp >= xpNextLevel()){
            xp -= xpNextLevel();
            level++;
            System.out.println("Vous passez level " +level);
        }
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon[] getWeapons() {
        return weapons;
    }

    public int getXp() {
        return xp;
    }
    
    public int xpNextLevel(){
        return level*500 +100;
    }
    
}
