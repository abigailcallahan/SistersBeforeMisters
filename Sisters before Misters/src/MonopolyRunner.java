import java.util.Scanner;
import java.util.ArrayList;

public class MonopolyRunner
	{
		static Scanner input = new Scanner(System.in);
		static String name;
		static String name2;
		static String enter;
		static Player player1;
		static Player player2;
		static int themeChoice;
		

		public static void main(String[] args)
			{
				ChestRunner.shuffle();
				ChanceRunner.shuffle();
				
				introduction();

				//askTheme();

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
			//introduces player 1
			System.out.println("Hello and welcome to Disnopoly! ");
			System.out.println("What is your name Player 1? ");
			name = input.nextLine();
			player1 = new Player(name, 1500, 0);
			System.out.println("\nWelcome " + name + "!!");
			
			//introduces player 2
			System.out.println("What is your name Player 2? ");
			name2 = input.nextLine();
			player2 = new Player(name2, 1500, 0);
			System.out.println("\nWelcome " + name2 + "!!");
			
			//starts the game 
			System.out.println("You both start with $1500");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
			}
		
		public static void askTheme()
		{
			System.out.println("Would you like to play (1)Disnopoly or (2)Traditional Monopoly?");
			themeChoice = input.nextInt();
			if(themeChoice == 1)
				{
					//play disnopoly
				}
			else
				{
					//play monopoly
				}
		}


	}
