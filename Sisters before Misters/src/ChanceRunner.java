import java.util.ArrayList;
import java.util.Collections;
public class ChanceRunner
	{
		static ArrayList<Chance> cards = new ArrayList<Chance>();
		public static void Chance()
			{
				//done
				cards.add(new Chance("Go back three spaces", -3, 0));
				cards.add(new Chance("Collect $200!", 0, 200));
				cards.add(new Chance("You Lost $200", 0, -200));
				cards.add(new Chance("Go forward three spaces", 3, 0));
				cards.add(new Chance("Collect $300 and move forward two spaces", 2, 300));
				cards.add(new Chance("Lose $100 and move backward two spaces", -2, -100));
				cards.add(new Chance("Collect $100 and move forward one space", 1, 100));
				cards.add(new Chance("Move back two spaces", -2, 0));
				cards.add(new Chance("Lose $600", 0, -600));
				cards.add(new Chance("Move foward ten spaces", 10,0));
				
				pickCard();
			}
		public static void shuffle()
			{
			Collections.shuffle(cards);
			}
		
		public static void pickCard()
		{
			System.out.println(cards.get(0).getOutput());
		}
			

	}
