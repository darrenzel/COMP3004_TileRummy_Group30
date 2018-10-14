package Project.TileRummy;

import java.util.*;
import java.util.Map.Entry;

public abstract class player {
	public ArrayList<Tile> hand;
	public String name;
	public int index;
	
	public player(ArrayList<Tile> hand, String name, int index)
	{
		this.hand = hand;
		this.name = name;
		this.index = index;
	}
	
	public  abstract  HashMap<Integer,ArrayList<Integer>> play();
	
	
	public Boolean checkValidity(Map<Integer,ArrayList<Integer>> table)
	{
		for(Map.Entry<Integer, ArrayList<Integer>> meld:table.entrySet())
		{
			for(int tileIndex = 0; tileIndex < table.get(meld).size() - 1; tileIndex++)
			{
				if(table.get(meld).get(tileIndex) != table.get(meld).get(tileIndex) ||
					table.get(meld).get(tileIndex) != table.get(meld).get(tileIndex + 1))
				{
					return false;
				}
				else
				{
					return true;
				}
			}
		}
		return false;
	}
	
	Boolean winCheck();
	Boolean endTurn();
	
	@Override
	public String toString()
	{
		return this.hand + " " + this.name + " " + this.index;
	}

}
