/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

import java.util.Observable;

/**
 *
 * @author kim2
 */
public class ConcreteSubject extends Observable{

	private String name;
	private float price;
        
	public ConcreteSubject(String name, float price) 
	{
		this.name = name;
		this.price = price;
                System.out.println("ConcreteSubject create:" + name + "at" + price);
	}
    
        public String getName() {return name;}
        public float getPrice() {return price;}
        public void setName(String name) 
        {
                this.name = name;
                setChanged();
                notifyObservers(name);
        }
        public void setPrice(float price) 
        {
                this.price = price;
                setChanged();
                notifyObservers(new Float(price));
        }

}
