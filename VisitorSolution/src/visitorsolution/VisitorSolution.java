/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorsolution;

/**
 *
 * @author kim2
 */
public class VisitorSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	// Create some widgets.
	Widget w1 = new Widget("Widget1", 10.00);
	Widget w2 = new Widget("Widget2", 20.00);
	Widget w3 = new Widget("Widget3", 30.00);
	// Add then to a widget assembly.
	WidgetAssembly wa = new WidgetAssembly("Chassis");
	wa.addComponent(w1);
	wa.addComponent(w2);
	wa.addComponent(w3);
        
        // Visit some nodes with a SimpleVisitor.
        SimpleVisitor sv = new SimpleVisitor();
        w1.accept(sv);
        w2.accept(sv);
        w3.accept(sv);
        wa.accept(sv);
        
        // Visit some nodes with a PriceVisitor.
        PriceVisitor pv = new PriceVisitor(25.00);
        w1.accept(pv);
        w2.accept(pv);
        w3.accept(pv);
        wa.accept(pv);
    }    
}
