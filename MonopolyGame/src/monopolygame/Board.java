/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopolygame;

/**
 *
 * @author kim2
 */
public class Board {
    private Square[] squares;

    public Board(int numSquares) {
        squares = new Square[numSquares];
        for (int i = 0; i < numSquares; i++) {
            squares[i] = new Square();
        }
    }

    public Square getSquare(int position) {
        return squares[position];
    }    
}
