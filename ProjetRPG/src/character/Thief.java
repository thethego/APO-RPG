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
        super(name, controler);
        Map<Caracteristics, Integer> caract;
        caract = getCaracteristics();
        CaractModif(caract);
    }
    
    private void CaractModif(Map<Caracteristics, Integer> caracteristics){
        caracteristics.put(Caracteristics.FORCE, 10);
        caracteristics.put(Caracteristics.DEXTERITY, 10);
        caracteristics.put(Caracteristics.DEFENCE, 10);
        caracteristics.put(Caracteristics.HEALTH, 10);
    }
    
}
