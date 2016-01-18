package item;

public class Item {
    private String name;
    private int weight;
    private int levelneeded;

    public Item(String name, int weight, int levelneeded) {
        this.name = name;
        this.weight = weight;
        this.levelneeded = levelneeded;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void getCaract(){
        
    }

    public int getWeight() {
        return weight;
    }

    public int getLevelneeded() {
        return levelneeded;
    }
   
}
