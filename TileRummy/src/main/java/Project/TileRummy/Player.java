package Project.TileRummy;

import java.util.Scanner;

import java.util.*;
import java.util.Map.Entry;

public abstract class Player {
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
	
	public Boolean winCheck() {
		if(this.checkValidity == true)
		{
			if(this.hand == null)
			{
				return true;
			}
		}
		return false;
	}
	
	public Boolean endTurn() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Do you want to end your turn?(y/n)")
		char command = sca.next();
		if(command.equals('y'))
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
		String hands = "+";
        for (int i = 0; i < this.hand.size(); i++) {
            hands += " " + this.hand.get(i);
        }
		return hands + " " + this.name + " " + this.index;
	}

}
