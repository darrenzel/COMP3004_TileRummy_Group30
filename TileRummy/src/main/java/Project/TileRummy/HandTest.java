package Project.TileRummy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HandTest {

	@Test
	void test() {
		Hand hand = new Hand();
		Deck deck = new Deck();
		
		Tile a = deck.deck.get(1);
		//test add()
		hand.add(a);
		
		//test getTile();
		assertEquals(a, hand.getTile(1));
		
		//test size();
		assertEquals(1, hand.size());
		
		//test remove();
		hand.remove(0);
		
		//test empty();
		assertEquals(true, hand.empty());
		
		//test sort();
		Tile b = new Tile(1,"green");
		Tile c = new Tile(3, "green");
		Tile d = new Tile(1, "blue");
		Hand hand2  = new Hand();
		hand.add(c);
		hand.add(d);
		hand.add(b);
		
		hand2.add(d);
		hand2.add(b);
		hand2.add(c);
		assertEquals(hand2, hand.sort());
		
	}

}
