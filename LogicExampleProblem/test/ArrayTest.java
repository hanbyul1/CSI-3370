/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import logicexample.Array;
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
public class ArrayTest {
    
    Array arr;
    
    public ArrayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        arr = new Array();
    }
    
    @After
    public void tearDown() {
    }

    @Test 
    public void delete_case1(){
        
        int[] a = new int[]{0,1,2};
        //int[] b= new int[]{0,1};
        int target = 2;
        
        //Precondition: Ensure that the element to be deleted exists in the array

        int[] actual = arr.delete(a, target);
        
        //Postcondition 1: Ensure that the target element does not exist in the output array        
        
        //Postcondition 2: Ensure that the length of the output array is one less than the length of the input array

        //Postcondition 3: Ensure that the other elements in the input array, except the target, exist in the output array

    }
    
    // Helper method to check if an element exists in the array
    
}
