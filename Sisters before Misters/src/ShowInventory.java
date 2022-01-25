import java.util.ArrayList;

public class ShowInventory
	{
	
	static ArrayList<Inventory> player1Inventory = new ArrayList<Inventory>();
	
	public static void showInventory()
	{
		fillInventoryList();
		displayInventory();
		emptyList();
	}
	
	public static void fillInventoryList()
	{
		for(Board b : BoardArrayList.boardList)
		{
			if(b.getisTaken() == true)
			{
				player1Inventory.add(new Inventory(b.getName()));
			}
			else
			{
				
			}
		}
	}
	
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
	
	public static void emptyList()
	{
		//does not work yet
//		for(int i = 0; i < player1Inventory.size(); i++)
//		{
//			player1Inventory.remove(i);
//		}
//		for(Inventory s : player1Inventory)
//		{
//			player1Inventory.remove(s);
//		}
	}
	
	
	
	}
