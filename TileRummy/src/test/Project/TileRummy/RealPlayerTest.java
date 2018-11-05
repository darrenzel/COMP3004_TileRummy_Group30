package Project.TileRummy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import Project.TileRummy.RealPlayer;
import Project.TileRummy.Table;
import Project.TileRummy.Tile;

class RealPlayerTest {
	private ArrayList<Tile> startHand = new ArrayList();
	private ArrayList<Tile> startTable = new ArrayList();
	private RealPlayer rp = new RealPlayer(startHand, "Arthur", 0);
	private Tile tile1 = new Tile(2, "red");
	private Tile tile2 = new Tile(3, "red");
	private Tile tile3 = new Tile(4, "red");
	private Tile tile4 = new Tile(5, "red");
	private Tile tile5 = new Tile(7, "red");
	private Tile tile6 = new Tile(7, "green");
	private Tile tile7 = new Tile(7, "black");
//	private Tile tile8 = new Tile("blue", 2);
//	private Tile tile9 = new Tile("red", 2);
//	private Tile tile10 = new Tile("red", 2);
//  private String name = "Arthur";
	private Table t = new Table();
	
	@Test
	public void changeHandTile() 
	{
		t.table.put(0, startTable);
		rp.hand.add(tile1);
		rp.hand.add(tile2);
		System.out.println("hand : " + rp.hand);
		System.out.println("table : " + t.table);
		rp.changeHandTile(t, 0, 0, 0);
		assertEquals(tile1, t.table.get(0).get(0));
		System.out.println("hand : " + rp.hand);
		System.out.println("table : " + t.table);
	}

}
