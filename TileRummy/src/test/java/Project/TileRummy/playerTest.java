package Project.TileRummy;

import java.util.ArrayList;

import junit.framework.TestCase;

public class playerTest extends TestCase {
	ArrayList<Integer> testHand = new ArrayList<Integer>();
	testHand.add(3);
	testHand.add(4);
	testHand.add(5);
	player testPlayer = new player(testHand,"Arthur",1);
	
	void testEndTurn(ArrayList<Integer> testHand)
	{
		boolean result = testPlayer.endTurn(testHand);
		assertEquals(false, result);
	}
	
}
