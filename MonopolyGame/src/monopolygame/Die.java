/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopolygame;

import java.util.Random;

/**
 *
 * @author kim2
 */
public class Die {
    private Random random;
    
    public Die() {
        random = new Random();
    }
    
    public int roll() {
        return random.nextInt(6) + 1; // Simulates a six-sided die
    }    
}
