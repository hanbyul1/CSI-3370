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
public class Menu extends Widget{
    
    public Menu(String name){
        super(name);
    }
            
    public void refresh(){
        System.out.println("A menu has been refreshed!");
    }
    
    public void update(){
        refresh();
    }
}
