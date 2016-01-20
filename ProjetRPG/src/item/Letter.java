/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

/**
 *
 * @author SAM
 */
public class Letter extends Item{
    
    private final String message;
    
    public Letter(String name, int weight,String m) {
        super(name, weight, 0);
        this.message = m;
    }

    public String getMessage() {
        return message;
    }
    
    
}
