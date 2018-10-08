package Project.TileRummy;
import java.util.*;
public class Deck {
	final String[] colors = {"green", "red", "black","blue"};
	 List<Tile> deck = new ArrayList<Tile>();

	Deck(){
		
		for(int i=0; i<colors.length; i++) {
			for(int j=1; j<14; j++) {
				deck.add(new Tile(j,colors[i]));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
}
