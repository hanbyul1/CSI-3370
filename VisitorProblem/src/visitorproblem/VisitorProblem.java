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
public class VisitorProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// Create some widgets.
	Widget w1 = new Widget("Widget1", 10.00);
	Widget w2 = new Widget("Widget2", 20.00);
	Widget w3 = new Widget("Widget3", 30.00);
	// Add then to a widget assembly.
	WidgetAssembly wa = new WidgetAssembly("Chassis");
	wa.addComponent(w1);
	wa.addComponent(w2);
	wa.addComponent(w3);
        
        w1.simple();
        w2.simple();
        w3.simple();
        wa.simple();

        w1.price(40);
        w2.price(40);
        w3.price(40);
        wa.price(40);        
    }
}
