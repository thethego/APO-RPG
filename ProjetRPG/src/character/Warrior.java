/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import character.Caracteristics;
import controler.Controler;
import java.util.Map;

/**
 *
 * @author SAM
 */
public class Warrior extends Character{
    
    int level;
    int force;
    int dexterity;
    int defence;
    int health;

    public Warrior(Controler controler) {
        super(controler);
        Map<Caracteristics, Integer> caract;
        caract = getCaracteristics();
        CaractModif(caract);
    }

    public Warrior(int level, int force, int dexterity, int defence, int health, String name, Controler controler) {
        super(name, controler);
        this.level = level;
        this.force = force;
        this.dexterity = dexterity;
        this.defence = defence;
        this.health = health;
        Map<Caracteristics, Integer> caract;
        caract = getCaracteristics();
        CaractModif2(caract);
        
    }
    
   
    private void CaractModif(Map<Caracteristics, Integer> caracteristics){
        caracteristics.put(Caracteristics.FORCE, 10);
        caracteristics.put(Caracteristics.DEXTERITY, 5);
        caracteristics.put(Caracteristics.DEFENCE, 5);
        caracteristics.put(Caracteristics.HEALTH, 12);
        caracteristics.put(Caracteristics.DAMAGE, 0);
    }
    
    private void CaractModif2(Map<Caracteristics, Integer> caracteristics){
        caracteristics.put(Caracteristics.FORCE, force);
        caracteristics.put(Caracteristics.DEXTERITY, dexterity);
        caracteristics.put(Caracteristics.DEFENCE, defence);
        caracteristics.put(Caracteristics.HEALTH, health);
        caracteristics.put(Caracteristics.DAMAGE, 0);
    }
    
}
