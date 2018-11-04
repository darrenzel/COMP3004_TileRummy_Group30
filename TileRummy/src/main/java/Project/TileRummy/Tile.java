package Project.TileRummy;
import java.util.Comparator;
public class Tile {
	int value;
	String color;
	 Tile(int value, String color) {
		this.value = value;
		this.color = color;
	}
	public String toString() {		
		return this.color +" "+Integer.toString(this.value);
	}
	public boolean sameColor(Tile other) {
		if(this.color.equals(other.color)) {
			return true;
		}
		return false;
	}
	public static Comparator<Tile> colorComparator = new Comparator<Tile>() {
		public int compare(Tile t1, Tile t2) {
			String color1 = t1.color;
			String color2 = t2.color;
			return color1.compareTo(color2);
		}
	};
	public static Comparator<Tile> valueComparator = new Comparator<Tile>() {
		public int compare(Tile t1, Tile t2) {
			int value1 = t1.value;
			int value2 = t2.value;
			return value1 - value2;
		}
	};
}
