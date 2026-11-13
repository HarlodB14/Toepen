package nl.toepen.game;

public class Card {
    private Suit suit;
    private Rank rank;
    private int id;

    public Card(int id, Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.id = id;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getId() {
        return id;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void Print() {
        System.out.println(this.rank.toString() + "," + this.suit.toString());
    }
}
