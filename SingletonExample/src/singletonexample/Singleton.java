/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonexample;

/**
 *
 * @author kim2
 */
public class Singleton {
    
    private static Singleton uniqueInstance = null;
    private int data = 0;
    private Singleton() {}

    public static Singleton instance() 
    {
            if(uniqueInstance == null) 
                uniqueInstance = new Singleton();
            return uniqueInstance;
    }    
    
    public void setData(int d){
        data = d;
    }
    
    public int getData(){
        return data;
    }
}
