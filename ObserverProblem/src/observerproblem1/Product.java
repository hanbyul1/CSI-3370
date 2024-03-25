/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerproblem1;

/**
 *
 * @author kim2
 */
public class Product {
    
    private String name;
    private float price;
    private NameDisplay nameDisplay = new NameDisplay();
    private PriceDisplay priceDisplay = new PriceDisplay();
    
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
        System.out.println("Product created: " + name + " at " + price);
        nameDisplay.display(name);
        priceDisplay.display(price);
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
        nameDisplay.display(name);
    }

    public void setPrice(float price) {
        this.price = price;
        priceDisplay.display(price);
    }
    
}
