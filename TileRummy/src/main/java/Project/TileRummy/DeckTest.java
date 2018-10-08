package Project.TileRummy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeckTest {

	@Test
	void test() {
		Deck deck = new Deck();
		Tile a = deck.deck.get(1);
		deck.shuffle();
		Tile b = deck.deck.get(1);
		assertNotSame(a,b);
	}

}
