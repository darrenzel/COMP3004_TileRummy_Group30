package Project.TileRummy;

import java.util.ArrayList;

import junit.framework.TestCase;

public class TableTest extends TestCase {
	Table newTable = new Table();
	ArrayList<Tile> tileSet = new ArrayList<Tile>();
	
	
	Tile tile1 = new Tile(1, "green");
	Tile tile2 = new Tile(2, "green");
	Tile tile3 = new Tile(3, "green");
	
	Tile tile4 = new Tile(4, "green");
	Tile tile5 = new Tile(4, "orange");
	Tile tile6 = new Tile(4, "blue");
	Tile tile7 = new Tile(4, "red");
		
	//test for clearing all elements in a table
	public void testClearTable() throws Exception{
		tileSet.add(tile1);
		tileSet.add(tile2);
		tileSet.add(tile3);
		
		newTable.table.put(1,tileSet);
		
		newTable.clearTable();
		assertTrue(newTable.table.isEmpty());
	}
	
	//public void testNotifyPlayer
	
	
}

