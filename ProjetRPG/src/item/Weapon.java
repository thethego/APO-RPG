package item;

public class Weapon extends Item {
    public int dmgMax; 
    public int dmgMin;
    
    
    @Override
    public void getCaract(){
        int poids = getWeight();
        System.out.println("poids =" +poids);
        int levelneeded = getLevelneeded();
        System.out.println("niveau requis =" +levelneeded);
        System.out.println("bonus de dégat entre " + dmgMin + " et " + dmgMax);
        

    }
}
