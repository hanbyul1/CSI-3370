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
public class Widget extends Component{

    //String name;
    
    public Widget(String name){
        //this.name = name;
        super(name);
    }
    
    public void update(){
        
        System.out.println("A widget has been updated!");

    }
    
}
