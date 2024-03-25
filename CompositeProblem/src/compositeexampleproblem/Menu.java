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
public class Menu{

    String name;
    
    public Menu(String name){
        this.name = name;
    }
            
    public void refresh(){
        System.out.println("A menu has been refreshed!");
    }
    
    public String getName(){
        return name;
    }
    
}
