/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author kim2
 */
public class Window3 {
    
    Vector components = new Vector();
    
    public void addComponent(Component c){
        components.addElement(c);
    }
    
    public void update(){
        
        Enumeration c = components.elements();
        
        while (c.hasMoreElements())
            ((Component) c.nextElement()).update();
    }
}
