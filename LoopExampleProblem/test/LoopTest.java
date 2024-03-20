/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import loopexample.Loop;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kim2
 */
public class LoopTest {
    
    Loop loop;
    
    public LoopTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        loop = new Loop();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void simpleLoop(){
        
        
        assertEquals(loop.simpleLoop(),0);
        //Zero pass. Set row=table.length
        
        //1 pass. Set row=table.length-1
        
        //m(2) passes. Set row=2
        
        //n-1(4) passes. Set row=1
        
        //n (5) passes. Set row=0
        
        //n+1(6) passes. Set row=-1
    }
    
    @Test    
    public void nestedLoop(){
        
        //Inner loop test. Set the outer loop with the minimum # of passes which is 1. 
        
        //Zero pass. Set row=table.length-1 (1 pass), col=table[1].length
        
        //1 pass. Set row=table.length-1 (1 pass), col=table[1].length-1
        
        //m(5) passes. Set row=table.length-1 (1 pass), col=5
        
        //n-1(9) passes. Set row=table.length-1 (1 pass), col=1
        
        //n (10) passes. Set row=table.length-1 (1 pass), col=0
        
        //n+1(11) passes. Set row=table.length-1 (1 pass), col=-1

        //========================================================
        //Outer loop test. Set the inner loop with a typical # of passes which can be 5 in this case.
        
        //Zero pass. Set row=table.length, col= 5 (5 passes)
        
        //1 pass. Set row=table.length-1, col=5 (5 passes)
        
        //m(2) passes. Set row=2, col=5 (5 passes)
        
        //n-1(4) passes. Set row=1, col=5 (5 passes)
        
        //n (5) passes. Set row=0, col=5 (5 passes)
        
        //n+1(6) passes. Set row=-1, col=5 (5 passes)
        //Infeasible 
    }

    @Test
    public void concatLoop(){
        //Inner loop test. Set the outer loop with the minimum # of passes which is 1. 
        
        //Zero pass. Set row=table.length-1 (1 pass), col=row
        
        //1 pass. Set row=table.length-1 (1 pass), col=row-1
        
        //m(5) passes. Set row=table.length-1 (1 pass), col=2 (middle value of row)
        
        //n-1(9) passes. Set row=table.length-1 (1 pass), col=1
        
        //n (10) passes. Set row=table.length-1 (1 pass), col=0
        
        //n+1(11) passes. Set row=table.length-1 (1 pass), col=-1

        //========================================================
        //Outer loop test. Set the inner loop with a typical # of passes which can be 0 in this case as the row varies in each outer loop.
        
        //Zero pass. Set row=table.length, col=0
        
        //1 pass. Set row=table.length-1, col=0
        
        //m(2) passes. Set row=2, col=0
        
        //n-1(4) passes. Set row=1, col=0
        
        //n (5) passes. Set row=0, col=0
        
        //n+1(6) passes. Set row=-1, col=0
    }

}
