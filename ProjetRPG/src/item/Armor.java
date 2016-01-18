package item;

public class Armor extends Item {
    
    
    public int armorValue;

    public Armor(String name, int weight, int levelneeded, int armorValue) {
        super(name, weight, levelneeded);
        this.armorValue = armorValue;
    }
    
    
    
    @Override
    public void getCaract(){
        int poids = getWeight();
        System.out.println("poids =" +poids);
        int levelneeded = getLevelneeded();
        System.out.println("niveau requis =" +levelneeded);;
        System.out.println("bonus d'armure = " + armorValue);
    }
}
