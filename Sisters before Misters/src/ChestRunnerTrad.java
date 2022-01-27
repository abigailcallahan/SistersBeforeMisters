import java.util.ArrayList;
import java.util.Collections;

public class ChestRunnerTrad
	{
		static ArrayList<Chest> cardsTrad = new ArrayList<Chest>();
		public static void Chest()
			{
			
				//done
				cardsTrad.add(new Chest("Recieve $25 for services", +25));
				cardsTrad.add(new Chest("Doctor's Fee pay $50", -50));
				cardsTrad.add(new Chest("You won a prize, earn $200", +200));
				cardsTrad.add(new Chest("Income Tax Refund earn $30", +30));
				cardsTrad.add(new Chest("Life Insurance Pay $300", -300));
				cardsTrad.add(new Chest("Inherit $100", +100));
				cardsTrad.add(new Chest("You bought stocks pay $50", -50));
				cardsTrad.add(new Chest("Pay hospital $100", -100));
				cardsTrad.add(new Chest("You sold stocks, earn $100", +100));
				
				pickCard();
			}
		public static void shuffle()
			{
			Collections.shuffle(cardsTrad);
			}
		
		public static void pickCard()
			{
				System.out.println(cardsTrad.get(0).getOutput());
			}
	}
