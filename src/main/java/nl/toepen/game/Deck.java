package nl.toepen.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        createCards();
    }

    public void createCards() {
        int id = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(id,suit, rank);
                id++;
                cards.add(card);
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void Shuffle() {
        Collections.shuffle(cards);
    }

    public void print() {
        for (Card card : cards) {
            card.Print();
        }
    }
}
