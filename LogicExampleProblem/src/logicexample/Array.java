/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicexample;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kim2
 */
public class Array {
    
    public int[] delete(int[] numbers, int target)
    {
        int[] arr_new = new int[numbers.length-1];
        
        for(int i=0, k=0;i < numbers.length;i++){
            
            if(numbers[i] != target){
                
                arr_new[k] = numbers[i];
                k++;
            }
        }
            return arr_new;       
    }    
}
