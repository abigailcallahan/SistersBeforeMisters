import java.util.Scanner;
import java.util.ArrayList;


public class MoveAround
	{
		static Scanner input = new Scanner(System.in);
		static String enter2;
		static int newPlace;
		static String space;
		static int balanceNew;
		
		static int chanceMove;
		static int chanceBalance;
		
		static int communityMove;
		static int communityBalance;
		
		public static void startMoving()
			{
				System.out.println("OK let's roll the dice");
				System.out.println("Press enter to roll");
				enter2 = input.nextLine();
				
				Dice.rollDice();
				moveSpaces();
				doAction();
				
			}


		
		public static void moveSpaces()
		{
			
			newPlace = MonopolyRunner.player1.getPlace() + Dice.diceRoll;
			System.out.println("You landed on: " + BoardArrayList.boardList.get(newPlace).getName());
			MonopolyRunner.player1.setPlace(newPlace);
		}
		
		public static void doAction()
		{
			if(MonopolyRunner.player1.getPlace() == 0)
				{
					//go method goes here
					PassGo.PassGo();
				}

			else if(MonopolyRunner.player1.getPlace() == 7 || MonopolyRunner.player1.getPlace() == 22 || MonopolyRunner.player1.getPlace() == 36)


				{
					//chance
					ChanceRunner.shuffle();
					
					System.out.println("\nYou picked up: ");
					ChanceRunner.Chance();
		
					//set place to current place + or - 
					chanceMove = ChanceRunner.cards.get(0).getChangePlace();
					MonopolyRunner.player1.setPlace(MonopolyRunner.player1.getPlace() + chanceMove);
					for(Board b : BoardArrayList.boardList)
						{
							if(b.getPlaceNum() == MonopolyRunner.player1.getPlace())
								{
									System.out.println("You are now on " + b.getName());
								}
						}
					
					
					//set money
					chanceBalance = ChanceRunner.cards.get(0).getMoney();
					if(ChanceRunner.cards.get(0).getMoney() == -200)
						{
							MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - chanceBalance);
						}
					else if(ChanceRunner.cards.get(0).getMoney() == 200)
						{
							MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() + chanceBalance);
						}
					else
						{
							MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() + chanceBalance);
						}
					MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() + chanceBalance);
					System.out.println("Your balance is: " + MonopolyRunner.player1.getBalance());
					
					ChanceRunner.cards.remove(0);
					
					if(ChanceRunner.cards.size() == 0)
						{
							ChanceRunner.Chance();
						}
					
				}
			else if(MonopolyRunner.player1.getPlace() == 30)
				{
					//go to jail 
					System.out.println("You are now in jail");
					MonopolyRunner.player1.setPlace(10);
				}
			else if(MonopolyRunner.player1.getPlace() == 2 || MonopolyRunner.player1.getPlace() == 17 || MonopolyRunner.player1.getPlace() == 33)
				{
					//community chest
					ChestRunner.shuffle();
					
					System.out.println("\nYou picked up: ");
					ChestRunner.Chest();
					
					//set money
					communityBalance = ChestRunner.cards.get(0).getMoney();
					if(ChestRunner.cards.get(0).getMoney() == -200)
						{
							MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - communityBalance);
						}
					else if(ChestRunner.cards.get(0).getMoney() == 200)
						{
							MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() + communityBalance);
						}
					else
						{
							MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() + communityBalance);
						}
					System.out.println("Your balance is: " + MonopolyRunner.player1.getBalance());
					
					ChestRunner.cards.remove(0);
					if(ChestRunner.cards.size() == 0)
						{
							ChestRunner.Chest();
						}
				}
			else if(MonopolyRunner.player1.getPlace() == 38)
				{
					//luxury tax
					System.out.println("You have to pay 100");
					MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - 100);
					System.out.println("Your new balance is " + MonopolyRunner.player1.getBalance());
				
				}
			else if(MonopolyRunner.player1.getPlace() == 20)
				{
					//free parking
					System.out.println("You get a free space");
				}
			else if(MonopolyRunner.player1.getPlace() == 4)
				{
					//income tax
					System.out.println("You have to pay 200");
					MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - 200);
					System.out.println("Your new balance is " + MonopolyRunner.player1.getBalance());
				}
			else if(MonopolyRunner.player1.getPlace() == 10)
				{
					//jail
					System.out.println("You are visiting jail");
				}
			else
				{
					//all the other properties
					Prices.checkPrices();
					
				}
		}
		
		

	}
