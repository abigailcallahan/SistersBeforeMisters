
public class PassGo
	{
		public static void PassGo()
			{
			MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() + 200);
			System.out.println("YAY! You finished a movie! Collect $200");
			System.out.println("Your new balance is: " + MonopolyRunner.player1.getBalance() + " ");
			System.out.println();

			}
		
		public static void PassGo2()
		{
			MonopolyRunner.player2.setBalance(MonopolyRunner.player2.getBalance() + 200);
			System.out.println("YAY! You finished a movie! Collect $200");
			System.out.println("Your new balance is: " + MonopolyRunner.player2.getBalance() + " ");
			System.out.println();
		}
	}
