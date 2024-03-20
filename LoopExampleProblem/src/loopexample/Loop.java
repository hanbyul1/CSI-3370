/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopexample;

import java.util.Arrays;

/**
 *
 * @author kim2
 */
public class Loop {
    
    int[][] table = new int[5][10];

    public int simpleLoop()
    {
        int sum = 0;
        
        for (int row=table.length; row < table.length; row++)
            sum += row;
        
        return sum;
        
    }
       
    public int nestedLoop()
    {
        int sum = 0;
        
        for (int row=-1; row < table.length; row++)
            for (int col=5; col < table[row].length; col++)
                sum += (row * 10 + col);
      
        return sum;   
    }
   
    public int concatLoop()
    {
        int sum = 0, row;
        
        //Outer loop
        for (row=-1; row < table.length; row++)
            sum += row;
        
        //Inner loop
        for (int col=0; col < row; col++)
            sum += col;
        
        return sum;
    }

}
