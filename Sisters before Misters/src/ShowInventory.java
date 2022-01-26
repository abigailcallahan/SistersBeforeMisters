import java.util.ArrayList;

public class ShowInventory
	{
	
	static ArrayList<Inventory> player1Inventory = new ArrayList<Inventory>();
	static ArrayList<Inventory> player2Inventory = new ArrayList<Inventory>();
	
	public static void showInventory()
	{
		//fillInventoryList();
		displayInventory();
		//emptyList();
	}
	
	public static void showInventory2()
	{
		//fillInventoryList();
		displayInventory2();
		//emptyList();
	}
	
	
	//player 1
	public static void displayInventory()
	{
		int counter = 1;
		System.out.println("You own: ");
		for(int i = 0; i < player1Inventory.size(); i++)
		{
			System.out.println(counter + ") " + player1Inventory.get(i).getPropertyName());
			counter++;
		}
		System.out.println();
	}
	
	//player 2
		public static void displayInventory2()
		{
			int counter = 1;
			System.out.println("You own: ");
			for(int i = 0; i < player2Inventory.size(); i++)
			{
				System.out.println(counter + ") " + player2Inventory.get(i).getPropertyName());
				counter++;
			}
			System.out.println();
		}
	
	public static void emptyList()
	{
		player1Inventory.removeAll(player1Inventory);
	}
	
	
	
	}
