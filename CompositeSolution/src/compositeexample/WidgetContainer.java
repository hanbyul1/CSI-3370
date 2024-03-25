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
public class WidgetContainer extends Component {

    Vector widgets = new Vector();
    
    public WidgetContainer(String name){
        super(name);
    }
    
    public void addComponent (Component c) {
        widgets.addElement(c);
    }

    public void updateWidgets(){
        
        Enumeration w = widgets.elements();
                
        while (w.hasMoreElements())            
            System.out.println(((Component) w.nextElement()).getName()+" has been udpated!");
    }
    
    public void update(){
        updateWidgets();
    }
}
