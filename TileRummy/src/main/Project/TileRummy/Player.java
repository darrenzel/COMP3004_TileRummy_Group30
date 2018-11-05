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
	
	

	public  abstract  ArrayList<Tile> play(Table table);
	
	
	
	//Check 
	/*
	public Boolean checkValidity(Map<Integer,ArrayList<Integer>> table)
	{
		for(Map.Entry<Integer, ArrayList<Integer>> meld:table.entrySet())
		{
			int[] colorCounter = new int[4];
			int sumCheck = 0;
			int productCheck = 0;
			
			for(int tileIndex = 0; tileIndex < table.get(meld).size() - 1; tileIndex++)
			{
				switch table.get(meld).get(tileIndex).color:
					"red":colorCounter[0]++;
					"green":colorCounter[1]++;
					"black":colorCounter[2]++;
					"blue":colorCounter[3]++;	
			}
			
			for(int counter:colorCounter)
			{
				sumCheck += counter;
				productCheck = productCheck * counter;
			}
			
			
			if(sumCheck <= 4 &&
				productCheck == 1)
			{
				for(int tileIndex = 0; tileIndex < table.get(meld).size() - 1; tileIndex++)
				{
					
				}
			}
			
		}
		return false;
	}
	*/
	
	
	
	
	
	public void printPlayerInformation() {
		System.out.println("---------------------------------------------------------");
		System.out.println("Name: "+name);
		System.out.println("Index: "+index);
		System.out.println("Number of Tiles: "+hand.size());
		System.out.println(hand);

		System.out.println("---------------------------------------------------------");
	}
	
	
	
	@Override
	public String toString()
	{
		return this.hand + " " + this.name + " " + this.index;
	}

}

