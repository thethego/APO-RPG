package item;

public class Armor extends Item {
    
    
    public int armorValue;
    
    @Override
    public void getCaract(){
        int poids = getWeight();
        System.out.println("poids =" +poids);
        int levelneeded = getLevelneeded();
        System.out.println("niveau requis =" +levelneeded);;
        System.out.println("bonus d'armure = " + armorValue);
    }
}
