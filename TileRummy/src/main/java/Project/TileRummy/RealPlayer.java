import java.util.Scanner;
import java.util.Map.Entry;

public class RealPlayer extends Player {
	
	public RealPlayer(Player p)
	{
		super(p);
	}
	
	public Table play(Table table){
		int moveChoice;
		
		Scanner sca = new Scanner(System.in);
		System.out.println("======================");
		System.out.println("This is the table.");
		System.out.println("======================");
		table.tableToString();
		System.out.println("======================");
		System.out.println("This is your hands.");
		this.printHand();
		System.out.println("======================");
		System.out.println("Your turn to move.");
		System.out.println("======================");
		System.out.println("Do you want to move tile on your hand or table?(input '1' for hand and '2' for table.)");
		moveChoice = sca.nextInt();
		if(moveChoice == 1)
		{
			System.out.println("Write down the index of the tile you want to move.(Press Enter after each)");
			int startIndex = sca.nextInt();
			System.out.println("Write down the row and the index of the tile you want to put.(Press Enter after each)");
			int endRow = sca.nextInt();
			int endIndex = sca.nextInt();
			changeHandTile(table,startIndex,endRow,endIndex);
		}
		else if(moveChoice == 2)
		{
			System.out.println("Write down the row and the index of the tile you want to move.(Press Enter after each)");
			int startRow = sca.nextInt();
			int startIndex = sca.nextInt();
			System.out.println("Write down the row and the index of the tile you want to put.(Press Enter after each)");
			int endRow = sca.nextInt();
			int endIndex = sca.nextInt();
			changeTableTile(table,startRow, startIndex, endRow, endIndex);
		}
		
	}
	
	public void changeTableTile(Table table,int startRow, int startIndex, int endRow, int endIndex)
	{
		ArrayList<Tile> tempMeld = table.get(startRow);
		Tile tempTile = tempMeld.get(startIndex);
		ArrayList<Tile> endMeld = table.get(endRow);
		endMeld.set(endIndex, tempTile);
		table.put(endRow, endMeld);
	}
	
	public void changeHandTile(Table table, int startIndex, int endRow, int endIndex)
	{
		Tile tempTile = hand.get(startIndex);
		ArrayList<Tile> endMeld = table.get(endRow);
		endMeld.set(endIndex, tempTile);
		table.put(endRow, endMeld);
	}
	
}
