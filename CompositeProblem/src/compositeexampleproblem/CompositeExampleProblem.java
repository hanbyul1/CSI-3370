/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexampleproblem;

/**
 *
 * @author kim2
 */
public class CompositeExampleProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu menu1 = new Menu("Menu1");
        Button button1 = new Button("Button1");
        WidgetContainer wc = new WidgetContainer("WidgeContainer1");
        wc.addMenu(menu1);
        wc.addButton(button1);

        Window1 w1 = new Window1();

        Menu menu2 = new Menu("Menu2");
        Button button2 = new Button("Button2");
        w1.addMenu(menu2);
        w1.addButton(button2);
        w1.addWidgetContainer(wc);        
        w1.update();
          
        // TODO code application logic here
    }
    
}
