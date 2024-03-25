/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

/**
 *
 * @author kim2
 */
public class ObserverExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConcreteSubject s = new ConcreteSubject("Corn Pops", 1.29f);
        NameObserver nameObs = new NameObserver();
        PriceObserver priceObs = new PriceObserver();
        s.addObserver(nameObs);
        s.addObserver(priceObs);
        s.setName("Frosted Flakes");
        s.setPrice(4.57f);
        s.setPrice(9.22f);
        s.setName("Sugar Crispies");
        
    }
    
}
