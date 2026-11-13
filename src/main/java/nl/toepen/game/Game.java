package nl.toepen.game;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private Deck gameDeck;
    private Board board;

    public Game(){
        this.players = new ArrayList<>();
        this.gameDeck = new Deck();
        this.board = new Board();
    }

}
