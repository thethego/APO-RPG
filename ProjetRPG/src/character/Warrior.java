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
    
    

    public Warrior(Controler controler) {
        super(controler);
        Map<Caracteristics, Integer> caract;
        caract = getCaracteristics();
        CaractModif(caract);
    }

    
    
   
    private void CaractModif(Map<Caracteristics, Integer> caracteristics){
        caracteristics.put(Caracteristics.FORCE, 10);
        caracteristics.put(Caracteristics.DEXTERITY, 5);
        caracteristics.put(Caracteristics.DEFENCE, 5);
        caracteristics.put(Caracteristics.HEALTH, 12);
        caracteristics.put(Caracteristics.DAMAGE, 0);
    }
    
   
    
}
