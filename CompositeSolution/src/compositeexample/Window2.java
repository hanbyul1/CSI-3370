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
public class Window2 {

    Vector widgets = new Vector();
    Vector containers = new Vector();

    public void addWidget (Widget w) {
        widgets.addElement(w);
    }

    public void addWidgetContainer (WidgetContainer wc) {
        containers.addElement(wc);
    }

    public void update(){
        
        Enumeration w = widgets.elements();
        Enumeration c = containers.elements();
        
        while (w.hasMoreElements())
                ((Widget) w.nextElement()).update();
        
        while (c.hasMoreElements())
                ((WidgetContainer) c.nextElement()).updateWidgets();
    
    }
}
