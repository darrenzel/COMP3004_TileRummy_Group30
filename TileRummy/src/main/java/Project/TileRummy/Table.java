package Project.TileRummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;


public class Table extends Observable {
	int row;
	ArrayList<Tile> tileSet;
	public HashMap<Integer, ArrayList<Tile>> table;
	
	public Table(){
		table = new HashMap<Integer, ArrayList<Tile>>();
	}
	
	public void sortOnTable(){
		Set<Integer> keys = table.keySet();
		for(int i: keys){
			Collections.sort(table.get(i), Tile.colorComparator);
		}
	}
	
	public void clearTable() {
		table.clear();
	}
	
	
	public void notifyObserver(HashMap<Integer, ArrayList<Tile>> table){
		this.table = table;
		
	}
	
	
	public String tableToString() {
		/*Set<Integer> keys = table.keySet();
		
		String row = "";
		String tileString = "";
		
		for(Map.Entry<Integer,ArrayList<Tile>> meld:table.entrySet()){
		
			for(int i: keys){
				row = "Row " + i +": ";
				tileString = "";
				ArrayList<Tile> tList = table.get(i);
				for(Tile t : tList) {
					tileString += t.toString() +" ";
				}
				return row + tileString;
				
				//return meld.toString();
				if(i != table.size() ) {
					table.tableToString();
				}
			}
			return meld.toString();
			
		}
		return row + tileString;
		
		return table.toString();
		}
		for(Map.Entry<Integer,ArrayList<Tile>> meld:table.entrySet()){
			for(int i:keys) {
				ArrayList<Tile> tileList = table.get(i);
	            for (Tile)
			}
		}
	}*/
	return table.toString();
	}
}
