package nl.toepen.web;

import nl.toepen.game.Deck;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeckController {

    @GetMapping("/api/deck")
    public Deck getDeck() {
        Deck deck = new Deck();
        deck.Shuffle();
        return deck;
    }
}
