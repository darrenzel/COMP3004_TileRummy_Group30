package Project.TileRummy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TileTest {

	@Test
	void test() {
		Tile tile = new Tile(3,"green");
		String tileString = "green 3";
	assertEquals(tileString, tile.toString());
	}

}
