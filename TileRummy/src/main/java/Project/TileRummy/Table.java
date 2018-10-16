package Project.TileRummy;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Observable;


public class Table extends Observable {
	public HashMap<Integer, ArrayList<Tile>> table;

	public void clearTable() {
		table.clear();
	}
	
	public void notifyObserver(HashMap<Integer, ArrayList<Tile>> table){
		this.table = table;
		
	}
	
	
	public String toString() {		
		return " ";
	}
}
