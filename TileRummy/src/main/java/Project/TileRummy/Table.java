package Project.TileRummy;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.Observable;


public class Table extends Observable {
	int row;
	ArrayList<Tile> tileSet;
	public HashMap<Integer, ArrayList<Tile>> table;
	
	public Table(){
		table = new HashMap<Integer, ArrayList<Tile>>();
	}
	

	public void clearTable() {
		table.clear();
	}
	
	
	public void notifyObserver(HashMap<Integer, ArrayList<Tile>> table){
		this.table = table;
		
	}
	
	
	public String tableToString() {
		Set<Integer> keys = table.keySet();
		String row = "";
		String tileString = "";
		
		for(int i: keys){
            row = "Row " + i +": ";
            tileString = "";
            ArrayList<Tile> tList = table.get(i);
            for(Tile t : tList) {
                tileString += t.toString() +" ";
            }
            return row + tileString;
        }
		return row + tileString;
	}
	
}
