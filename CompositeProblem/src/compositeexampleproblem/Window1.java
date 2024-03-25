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
public class Window1 {
    
    Vector buttons = new Vector();
    Vector menus = new Vector();
    Vector containers = new Vector();

    public void addButton (Button b) {
        buttons.addElement(b);
    }

    public void addMenu (Menu m) {
        menus.addElement(m);
    }

    public void addWidgetContainer (WidgetContainer wc) {
        containers.addElement(wc);
    }
    
    public void update(){
        
        Enumeration b = buttons.elements();
        Enumeration m = menus.elements();
        Enumeration wc = containers.elements();
        
        while (b.hasMoreElements())
            ((Button) b.nextElement()).draw();

        while (m.hasMoreElements())
            ((Menu) m.nextElement()).refresh();
        
        while (wc.hasMoreElements())
            ((WidgetContainer) wc.nextElement()).updateWidgets();

    }
    
}
