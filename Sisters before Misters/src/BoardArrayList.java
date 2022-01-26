import java.util.ArrayList;

public class BoardArrayList
	{
		static ArrayList<Board> boardList = new ArrayList<Board>();
		
		static ArrayList<Board> tradBoard = new ArrayList<Board>();
		
		public static void fillListDisnopoly()
		{
			boardList.add(new Board("Go", 0 , 0, false));
			boardList.add(new Board("Sultan's Palace", 50, 1, false));
			boardList.add(new Board("Community Chest", 0, 2, false));
			boardList.add(new Board("Cave of Wonder", 50, 3, false));
			boardList.add(new Board("Income Tax", 0, 4, false));
			boardList.add(new Board("New Orlean's Trolley", 100, 5, false));
			boardList.add(new Board("Tiana's Palace", 100, 6, false));
			boardList.add(new Board("Chance", 0, 7, false));
			boardList.add(new Board("The Bayou", 100, 8, false));
			boardList.add(new Board("Dr. Faciliers Magic Shop", 100, 9, false));
			boardList.add(new Board("Jail", 0, 10, false));
			boardList.add(new Board("Ugly Ducking Tavern", 150, 11, false));
			boardList.add(new Board("Electric Utility", 100, 12, false));
			boardList.add(new Board("Corona Town Sqaure", 150, 13, false));
			boardList.add(new Board("Tower", 150, 14, false));
			boardList.add(new Board("Route 66 Railroad", 100, 15, false));
			boardList.add(new Board("Savanna Central", 200, 16, false));
			boardList.add(new Board("Community Chest", 0, 17, false));
			boardList.add(new Board("Bunny Burrow", 200, 18, false));
			boardList.add(new Board("Tundra Town", 200, 19, false));
			boardList.add(new Board("Free Parking", 0, 20, false));
			boardList.add(new Board("Ramone's Body Shop", 250, 21, false));
			boardList.add(new Board("Chance", 0, 22, false));
			boardList.add(new Board("Flo's V8 Cafe", 250, 23, false));
			boardList.add(new Board("Cozy Cone Cafe", 250, 24, false));
			boardList.add(new Board("Zootopia Train", 100, 25, false));
			boardList.add(new Board("Chateau de Chambord", 300, 26, false));
			boardList.add(new Board("Belle's House", 300, 27, false));
			boardList.add(new Board("Water Works", 100, 28, false));
			boardList.add(new Board("The Beast's Library", 300, 29, false));
			boardList.add(new Board("Go to Jail", 0, 30, false));
			boardList.add(new Board("Pride Rock", 350, 31, false));
			boardList.add(new Board("Tree of Life", 350, 32, false));
			boardList.add(new Board("Community Chest", 100, 33, false));
			boardList.add(new Board("Elephant Graveyard", 350, 34, false));
			boardList.add(new Board("Sven's Sleigh", 100, 35, false));
			boardList.add(new Board("Chance", 0, 36, false));
			boardList.add(new Board("Arendelle Palace", 400, 37, false));
			boardList.add(new Board("Luxury Tax", 0, 38, false));
			boardList.add(new Board("Ice Palace", 400, 39, false));
		}
		
		public static void fillListTradition()
			{
				//change to correct numbers
				tradBoard.add(new Board("Go", 0 , 0, false));
				tradBoard.add(new Board("Mediterranean Avenue", 60, 1, false));
				tradBoard.add(new Board("Community Chest", 0, 2, false));
				tradBoard.add(new Board("Baltic Avenue", 60, 3, false));
				tradBoard.add(new Board("Income Tax", 0, 4, false));
				tradBoard.add(new Board("Reading Railroad", 200, 5, false));
				tradBoard.add(new Board("Oriental Avenue", 100, 6, false));
				tradBoard.add(new Board("Chance", 0, 7, false));
				tradBoard.add(new Board("Vermont Avenue", 100, 8, false));
				tradBoard.add(new Board("Connecticut Avenue", 120, 9, false));
				tradBoard.add(new Board("Visiting Jail", 0, 10, false));
				tradBoard.add(new Board("St. Charles Place", 140, 11, false));
				tradBoard.add(new Board("Electric Company", 150, 12, false));
				tradBoard.add(new Board("States Avenue", 140, 13, false));
				tradBoard.add(new Board("Virginia Avenue", 160, 14, false));
				tradBoard.add(new Board("Pennsylvania Raiload", 200, 15, false));
				tradBoard.add(new Board("St. James Place", 180, 16, false));
				tradBoard.add(new Board("Community Chest", 0, 17, false));
				tradBoard.add(new Board("Tennessee Avenue", 180, 18, false));
				tradBoard.add(new Board("New York Avenue", 200, 19, false));
				tradBoard.add(new Board("Free Parking", 0, 20, false));
				tradBoard.add(new Board("Kentucky Avenue", 220, 21, false));
				tradBoard.add(new Board("Chance", 0, 22, false));
				tradBoard.add(new Board("Indiana Avenue", 220, 23, false));
				tradBoard.add(new Board("Illinois Avenue", 240, 24, false));
				tradBoard.add(new Board("B&O Railroad", 200, 25, false));
				tradBoard.add(new Board("Atlantic Avenue", 260, 26, false));
				tradBoard.add(new Board("Ventnor Avenue", 260, 27, false));
				tradBoard.add(new Board("Water Works", 150, 28, false));
				tradBoard.add(new Board("Marvin Gardens", 280, 29, false));
				tradBoard.add(new Board("Go To Jail", 0, 30, false));
				tradBoard.add(new Board("Pacific Avenue", 300, 31, false));
				tradBoard.add(new Board("North Caroline Avenue", 300, 32, false));
				tradBoard.add(new Board("Community Chest", 0, 33, false));
				tradBoard.add(new Board("Pennsylvania Avenue", 320, 34, false));
				tradBoard.add(new Board("Short Line Railroad", 200, 35, false));
				tradBoard.add(new Board("Chance", 0, 36, false));
				tradBoard.add(new Board("Park Place", 350, 37, false));
				tradBoard.add(new Board("Luxury Tax", 0, 38, false));
				tradBoard.add(new Board("Boardwalk", 400, 39, false));
				
			}
		
		
		
		
		
		
	}
