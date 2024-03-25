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
public class Button {
    
    String name;
    
    public Button(String name){
        this.name = name;
    }
    public void draw(){
        System.out.println("A button has been drawn!");
    }
    
    public String getName(){
        return name;
    }

}
