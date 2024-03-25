/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerproblem1;

/**
 *
 * @author kim2
 */
public class ObserverProblem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Product s = new Product("Corn Pops", 1.29f);
        s.setName("Frosted Flakes");
        s.setPrice(4.57f);
        s.setPrice(9.22f);
        s.setName("Sugar Crispies");
    }
    
}
