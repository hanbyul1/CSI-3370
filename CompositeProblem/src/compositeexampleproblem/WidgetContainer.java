/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexampleproblem;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author kim2
 */
public class WidgetContainer {

    String name;
    
    Vector widgets = new Vector();
    
    public WidgetContainer(String name){
        this.name = name;
    }
    
    public void addMenu (Menu c) {
        widgets.addElement(c);
    }

    public void addButton (Button c) {
        widgets.addElement(c);
    }

    public void addWidgetContainer (WidgetContainer wc) {
        widgets.addElement(wc);
    }

    public void updateWidgets(){
        
        Enumeration w = widgets.elements();
        
        while (w.hasMoreElements())
        {
            Object n = w.nextElement();
            if (n instanceof Menu)
                ((Menu) n).refresh();
            else if (n instanceof Button)
                ((Button) n).draw();
        }
    }
    
}
