import java.util.Scanner;
import java.util.ArrayList;

public class MonopolyRunner
	{
		// tester please ignore this comment
		static Scanner input = new Scanner(System.in);
		static String name;
		static String enter;
		static Player player1;

		public static void main(String[] args)
			{
				ChestRunner.shuffle();
				ChanceRunner.shuffle();
				introduction();
				BoardArrayList.fillListDisnopoly();
				while(MonopolyRunner.player1.getBalance() > 0)
					{
						
						MoveAround.startMoving();
						if(MonopolyRunner.player1.getBalance() <= 0)
							{
								System.out.println("You ran out of money, the game is over");
							}
						
					}
				


			}

		public static void introduction()
			{

			System.out.println("Hello and welcome to Disnopoly! ");
			System.out.println("What is your name Player? ");
			name = input.nextLine();
			player1 = new Player(name, 1500, 0);
			System.out.println("\nWelcome " + name + "!!");
			System.out.println("You start with $1500");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
			
			}

		public static void PassGoMain()
			{

				// if(MoveAround.place == 0)

				if (MonopolyRunner.player1.getPlace() == 0)
					{
						PassGo.PassGo();
					}

			}

	}
