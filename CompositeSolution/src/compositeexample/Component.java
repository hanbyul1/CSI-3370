/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample;

/**
 *
 * @author kim2
 */
public abstract class Component {
    
    String name;
    
    public Component (String name){
        this.name = name;
    }
    
    public abstract void update();
    
    public String getName(){
        return name;
    }
   
}
