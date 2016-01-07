




package caractere;

import action.Effect;
import item.Weapon;
import item.Armor;
import item.Item;
import java.util.Map;


public class Caractere {
    
    private String nom;
    private int niveau;
    private int poidsmax;
    private final int SANTEMax;
    private Map<Caracteristics, Integer> caracteristics;
    
    

    public Caractere(String nom, int niveau, int poidsmax, int SANTEMax, Map<Caracteristics, Integer> caracteristique) {
        this.nom = nom;
        this.niveau = niveau;
        this.poidsmax = poidsmax;
        this.SANTEMax = SANTEMax;
        this.caracteristics = caracteristics;
    }

    
    
    public void applyEffect (Effect effect)
    {
        
    }
    
    public void equipeArme(Weapon arme)
    {
        
    }
    
    public void equipeArmure(Armor armure)
    {
        
    }
    
    public int getPoidsInventaire ()
    {
        int poidsInventaire=0;
        return poidsInventaire;
    }
    
    public void retireInventaire (Item item)
    {
        
    }
    
    public void ajouteInventaire (Item item)
    {
        
    }
    
    public void calculSanteMax()
    {
        
    }
    
    public void calculDexteriteMax ()
    {
        
    }
    
    public void incrementNiveau()
    {
        
    }
    
    
    public int sumCarac()
    {
     int sumCarac = 0;
     return sumCarac;
    }
    
}
