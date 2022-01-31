import java.util.Scanner;
import java.util.ArrayList;

public class MonopolyRunner
	{
		static Scanner input = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
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
				
				
				askTheme();
			}
		
		public static void askTheme()
		{
			System.out.println("Would you like to play (1)Disnopoly or (2)Traditional Monopoly?");
			themeChoice = intInput.nextInt();
			if(themeChoice == 1)
				{
					//play disnopoly
					disnopolyIntroduction();
					BoardArrayList.fillListDisnopoly();
					while(MonopolyRunner.player1.getBalance() > 0)
						{
						
							player1Turn();
							
							player2Turn();
						}

				}
				
			else if(themeChoice == 2)
				{
					//play monopoly
					monopolyIntroduction();
					BoardArrayList.fillListTradition();
					
					while(MonopolyRunner.player1.getBalance() > 0)
						{
					
							player1TurnTrad();
							player2TurnTrad();
						}
					if(player1.getBalance() <= 0)
					{
						System.out.println("Player 1 ran out of money, the game is over");
					}
					else if(player2.getBalance() <= 0)
					{
						System.out.println("Player 2 ran out of money, the game is over");
					}
				}
		}


				

		public static void disnopolyIntroduction()
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
		
		
		public static void monopolyIntroduction()
		{
		//introduces player 1
		System.out.println("Hello and welcome to Monopoly! ");
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
		
		
		
		public static void player1Turn()
		{
			System.out.println("\nOk, player 1, " + name + ", it is your turn");
			MoveAround.startMoving();
			
			if(player1.getBalance() <= 0)
			{
				System.out.println("Player 1 ran out of money and the game is over");
				System.exit(0);
			}
			else if(player2.getBalance() <= 0)
			{
				System.out.println("Player 2 ran out of money and the game is over");
				System.exit(0);
			}
		}
		
		public static void player2Turn()
		{
			System.out.println("\nOk, player 2, " + name2 + ", it is your turn");
			MoveAround.startMoving2();
			if(player1.getBalance() <= 0)
			{
				System.out.println("Player 1 ran out of money and the game is over");
				System.exit(0);
			}
			else if(player2.getBalance() <= 0)
			{
				System.out.println("Player 2 ran out of money and the game is over");
				System.exit(0);
			}
			
		}
		
		public static void player1TurnTrad()
			{
				System.out.println("\nOk, player 1, " + name + ", it is your turn");
				MoveAroundTrad.startMoving();
				
				if(player1.getBalance() <= 0)
				{
					System.out.println("Player 1 ran out of money and the game is over");
					System.exit(0);
				}
				else if(player2.getBalance() <= 0)
				{
					System.out.println("Player 2 ran out of money and the game is over");
					System.exit(0);
				}
			}
			
			public static void player2TurnTrad()
			{
				System.out.println("\nOk, player 2, " + name2 + ", it is your turn");
				MoveAroundTrad.startMoving2();
				if(player1.getBalance() <= 0)
				{
					System.out.println("Player 1 ran out of money and the game is over");
					System.exit(0);
				}
				else if(player2.getBalance() <= 0)
				{
					System.out.println("Player 2 ran out of money and the game is over");
					System.exit(0);
				}
				
			}
		
		


	}
