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
public class Widget extends Component {

    	protected double price;
        
	public Widget(String name, double price) {
		super(name);
		this.price = price;
	}
        
	public void setPrice(double price) { 
            this.price = price; 
        }
        
	public double getPrice() { 
            return price; 
        }
        
	public void price(double maxPrice) { 
            double price = this.getPrice();
            if (price > maxPrice)
                    System.out.println("Don't Buy! Widget price of " +
                    price + " exceeds maximum price (" + maxPrice + ").");
            else	
                    System.out.println("Buy! Widget price of " + price +
                    " is less than maximum price (" + maxPrice + ").");
        }
        
        public void simple(){
             System.out.println("Visiting a Widget");
        }
}
