/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import controler.Controler;
import java.util.Map;

/**
 *
 * @author SAM
 */
public class Thief extends Character{
    
    public Thief(String name, Controler controler) {
        super(controler);
        Map<Caracteristics, Integer> caract;
        caract = getCaracteristics();
        CaractModif(caract);
    }

    public Thief(Controler controler) {
        super(controler);
        Map<Caracteristics, Integer> caract;
        caract = getCaracteristics();
        CaractModif(caract);
    }
    
    private void CaractModif(Map<Caracteristics, Integer> caracteristics){
        caracteristics.put(Caracteristics.FORCE, 5);
        caracteristics.put(Caracteristics.DEXTERITY, 15);
        caracteristics.put(Caracteristics.DEFENCE, 2);
        caracteristics.put(Caracteristics.HEALTH, 10);
        caracteristics.put(Caracteristics.DAMAGE, 0);
    }
    
    
    
}
