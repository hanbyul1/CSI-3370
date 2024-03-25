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
public class Button extends Widget {
    
    public Button(String name){
        super(name);
    }
    public void draw(){
        System.out.println("A button has been drawn!");
    }
    
    public void update(){
        draw();
    }
}
