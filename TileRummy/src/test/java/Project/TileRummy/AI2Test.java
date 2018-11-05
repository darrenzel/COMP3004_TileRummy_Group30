package Project.TileRummy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AI2Test {

	@Test
	void test() {
		ArrayList<Tile> hand = new ArrayList<>();
		hand.add(new Tile(2,"blue"));
		hand.add(new Tile(3,"blue"));
		hand.add(new Tile(4,"blue"));
		hand.add(new Tile(11,"blue"));
		hand.add(new Tile(13,"green"));
		hand.add(new Tile(3,"green"));
		hand.add(new Tile(4,"green"));
		hand.add(new Tile(12,"green"));
		hand.add(new Tile(13,"red"));
		hand.add(new Tile(1,"red"));
		hand.add(new Tile(7,"red"));
		hand.add(new Tile(13,"orange"));
		hand.add(new Tile(2,"orange"));
		hand.add(new Tile(5,"orange"));

		AI2 player = new AI2(hand,"test",2);
		
		
		ArrayList<Tile> expected = new ArrayList<>();
		ArrayList<Tile> expected1 = new ArrayList<>();

		expected.add(new Tile(2,"blue"));
		expected.add(new Tile(3,"blue"));
		expected.add(new Tile(4,"blue"));
		expected.add(new Tile(13,"green"));
		expected.add(new Tile(13,"orange"));
		expected.add(new Tile(13,"red"));

//		ArrayList<ArrayList<Tile>> expected2 = new ArrayList<>();
//		expected2.add(expected);
//		expected2.add(expected1);
		
		ArrayList<Tile> out = player.play();
		for(int i=0; i<expected.size(); i++) {
			assertEquals(expected.get(i).toString(),out.get(i).toString());
		}
//		for(ArrayList<Tile> i:expected) {
//			System.out.println("first for loop size: "+ expected2.get(i).size());
//			for(int j=0; j<expected2.get(i).size(); j++) {
//				System.out.println("SSSSSS");
//				assertEquals(expected2.get(i).get(j).toString(),out.get(i).get(j).toString());
////				System.out.println("expected: "+ expected2.get(i).get(j).toString());
////				System.out.println("getting: "+out.get(i).get(j).toString());
//			}
//		}
	}

}
