package Project.TileRummy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest{
	
	@Test
	void test() {
		Tile t1 = new Tile(3,"green");
		Tile t2 = new Tile(3,"blue");
		Tile t3 = new Tile(3,"orange");
		Player p = new Player({t1, t2, t3}, "Tom", 2);
		assertEquals(t1,Player.hand[0]);
		assertEquals(t2,Player.hand[1]);
		assertEquals(t3,Player.hand[2]);
		assertEquals("Tom",Player.name);
		assertEquals(2,Player.index);
		
		
	}
}