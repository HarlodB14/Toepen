package nl.toepen.game;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> cards;

    public Player(){
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
