/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorproblem;

/**
 *
 * @author kim2
 */
public abstract class Component {
    
    protected String name;
    public Component(String name) {this.name = 	name;}
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = 	name; 
    }
    public abstract double getPrice();
    public abstract void simple();
    public abstract void price(double maxPrice);
    
}
