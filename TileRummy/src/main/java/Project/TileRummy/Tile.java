package Project.TileRummy;

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
	
}
