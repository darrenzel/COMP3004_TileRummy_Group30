package Project.TileRummy;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;


public class Table extends Observable {
	private ArrayList<Player> observers = new ArrayList<>();
	int row;
	ArrayList<Tile> tileSet;
	public HashMap<Integer, ArrayList<Tile>> table;
	
	public Table(){
		table = new HashMap<Integer, ArrayList<Tile>>();
	}
	

	public void clearTable() {
		table.clear();
	}
	
//	public void notifyObserver(HashMap<Integer, ArrayList<Tile>> table){
//		this.table = table;
//		
//	}
	public void attach(Player observer){
	      observers.add(observer);		
	   }
	public void notifyObservers() {
		for (Player observer : observers) {
	         observer.update(table);
	      }
	}
	public void setTable(HashMap<Integer, ArrayList<Tile>> table) {
		this.table = table;
		notifyObservers();
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
