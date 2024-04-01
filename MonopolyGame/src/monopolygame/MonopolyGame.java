/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopolygame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kim2
 */
public class MonopolyGame {
    private Die die1;
    private Die die2;
    private Board board;
    private List<Player> players;

    public MonopolyGame(int numPlayers) {
        die1 = new Die();
        die2 = new Die();
        board = new Board(40);
        players = new ArrayList<>();

        // Create players and assign pieces
        for (int i = 0; i < numPlayers; i++) {
            Player player = new Player("Player " + (i + 1), new Piece());
            players.add(player);
        }
    }

    public void play() {
        // Game logic goes here
        // Example: Roll dice, move pieces, handle events, etc.
    }    
}
