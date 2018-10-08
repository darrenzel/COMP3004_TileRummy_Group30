package Project.TileRummy;
import java.util.*;
public class Deck {
	final String[] colors = {"green", "red", "black","blue"};
	 List<Tile> deck = new ArrayList<Tile>();
	 int size;
	Deck(){
		
		for(int i=0; i<colors.length; i++) {
			for(int j=1; j<14; j++) {
				deck.add(new Tile(j,colors[i]));
				deck.add(new Tile(j,colors[i]));
				size+=2;
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
}
