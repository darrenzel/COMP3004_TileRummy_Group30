package Project.TileRummy;

import java.util.*;
import java.util.Map.Entry;

public abstract class Player {
	public ArrayList<Tile> hand;
	public String name;
	public int index;
	
	public Player(ArrayList<Tile> hand, String name, int index)
	{
		this.hand = hand;
		this.name = name;
		this.index = index;
	}
	
	public  abstract  void play();
	
	
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
	
	Boolean winCheck(ArrayList<Integer> hand)
	{
		if(hand == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	Boolean endTurn(ArrayList<Integer> hand)
	{
		Scanner scanner = new Scanner(System.in);
		String decision; 
		System.out.print("Do you want to end your turn?(y/n");
		decision = scanner.next();
		if(decision == "y" || decision == "Y")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return this.hand + " " + this.name + " " + this.index;
	}

}