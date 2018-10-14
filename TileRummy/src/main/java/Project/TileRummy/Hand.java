package Project.TileRummy;

import java.util.*;
public class Hand  {
	List<Tile> hand = new ArrayList<Tile>();
	private int size =0;
	Hand(ArrayList<Tile> input){
		hand = input;
		size = input.size();
	}
	
	public void add(Tile tile) {
		hand.add(tile);
		size++;
	}
	public Tile remove(int tile) {
		return hand.remove(title);
	}
	public int size() {
		return size;
	}
	public void sort() {
		Collections.sort(hand, new SortTitle());
	}
	
	class SortTile implements Comparator<Tile>{
		public int compare(Tile a, Tile b) {
			int result = a.color.compareTo(b.color);
			if(result==0) {
				result = a.value.compareTo(b.value);
			}
			return result;
		}
	}
	
}
