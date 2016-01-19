/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import controler.Controler;
import item.Armor;
import item.Weapon;
import java.util.Map;

/**
 *
 * @author SAM
 */
public class Monster extends Character {
    
    
    int level;
    int force;
    int dexterity;
    int defence;
    int health;
    
    
    public Monster(int level, int f, int dexterity, int defence, int health, String name, Controler controler) {
        super(name,level, controler);
        this.level = level;
        this.force = f;
        this.dexterity = dexterity;
        this.defence = defence;
        this.health = health;
        Map<Caracteristics, Integer> caract;
        caract = getCaracteristics();
        CaractModif(caract);
    }
 
    
    public Monster(int level, int force, int dexterity, int defence, int health, String name, Controler controler,Armor armor, Weapon[] weapons) {
        super(name,level, controler,armor, weapons);
        this.level = level;
        this.force = force;
        this.dexterity = dexterity;
        this.defence = defence;
        this.health = health;
        Map<Caracteristics, Integer> caract;
        caract = getCaracteristics();
        CaractModif(caract);
        
    }
    
    private void CaractModif(Map<Caracteristics, Integer> caracteristics){
        caracteristics.put(Caracteristics.FORCE, force);
        caracteristics.put(Caracteristics.DEXTERITY, dexterity);
        caracteristics.put(Caracteristics.DEFENCE, defence);
        caracteristics.put(Caracteristics.HEALTH, health);
        caracteristics.put(Caracteristics.DAMAGE, 0);
    }
    
}
