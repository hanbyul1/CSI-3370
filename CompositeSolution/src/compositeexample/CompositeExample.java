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
public class CompositeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu menu1 = new Menu("Menu1");
        Button button1 = new Button("Button1");
        WidgetContainer wc = new WidgetContainer("WidgeContainer1");
        wc.addComponent(menu1);
        wc.addComponent(button1);

        Window1 w1 = new Window1();

        w1.addMenu(menu1);
        w1.addButton(button1);
        w1.addWidgetContainer(wc);        
        w1.update();
        
        Window2 w2 = new Window2();
        
        w2.addWidget(menu1);
        w2.addWidget(button1);
        w2.addWidgetContainer(wc);
        w2.update();

        Window3 w3 = new Window3();
        w3.addComponent(menu1);
        w3.addComponent(button1);
        w3.addComponent(wc);
        w3.update();
        // TODO code application logic here
    }
    
}
