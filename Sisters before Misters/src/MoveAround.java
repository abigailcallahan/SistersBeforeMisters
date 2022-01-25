import java.util.Scanner;
import java.util.ArrayList;


public class MoveAround
	{
		static Scanner input = new Scanner(System.in);
		static Scanner intInput = new Scanner(System.in);
		
		static String enter2;
		static int newPlace;
		static int newPlace2;
		static String space;
		static int balanceNew;
		
		static int chanceMove;
		static int chanceBalance;
		
		static int communityMove;
		static int communityBalance;
		
		static int menuDecision;
		static int jailDecision;
		
		static String enter3;
		
		public static void startMoving()
			{
			
				//continue rolling or show inventory?
				System.out.println("\nWould you like to: ");
				System.out.println("1) continue rolling");
				System.out.println("2) look at your property inventory");
				menuDecision = intInput.nextInt();
				
				if(menuDecision == 1)
				{
					//continue rolling 
					System.out.println("\nOK let's roll the dice");
					System.out.println("Press enter to roll");
					enter2 = input.nextLine();
					
					Dice.rollDice();
					moveSpaces();
					doAction();
				}
				else if(menuDecision == 2)
				{
					
					//show inventory
					ShowInventory.showInventory();
					
					//go back to rolling
					System.out.println("Press enter to continue rolling and to continue playing the game");
					enter3 = input.nextLine();
					
					Dice.rollDice();
					moveSpaces();
					doAction();
				}
			}


		
		public static void moveSpaces()
		{
			if(MonopolyRunner.player1.getPlace() + Dice.diceRoll <= 39)
			{
				System.out.println("You rolled a " + Dice.diceRoll);
				newPlace = MonopolyRunner.player1.getPlace() + Dice.diceRoll;
				System.out.println("You landed on: " + BoardArrayList.boardList.get(newPlace).getName());
				MonopolyRunner.player1.setPlace(newPlace);
			}
			else if(MonopolyRunner.player1.getPlace() + Dice.diceRoll > 39)
			{
				if(MonopolyRunner.player1.getPlace() + Dice.diceRoll == 40)
				{
				//go through this and do nothing until they get to the go action 	
				}
				else
				{
					System.out.println("You rolled a " + Dice.diceRoll);
					newPlace2 = MonopolyRunner.player1.getPlace() + Dice.diceRoll;
					PassGo.PassGo();
					int newPlace3 = newPlace2 - 39;
					MonopolyRunner.player1.setPlace(newPlace3 - 1); 
					System.out.println("You are on: " + BoardArrayList.boardList.get(newPlace3 - 1).getName());
				}
				
			}
			
		}
		
		public static void doAction()
		{
			if(MonopolyRunner.player1.getPlace() == 0)
				{
					//go method goes here
					PassGo.PassGo();
					MonopolyRunner.player1.setPlace(0);
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
					
					System.out.println("Would you like to: ");
					System.out.println("1) Pay the 50$ fine?");
					System.out.println("2) Roll to try and get doubles?");
					jailDecision = input.nextInt();
					System.out.println();
					
					
					if(jailDecision == 1)
					{
						MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - 50);
						System.out.println("Ok, you out of jail, and you new balance is: " + MonopolyRunner.player1.getBalance());
					}
					else if(jailDecision == 2)
					{
						System.out.println("Let us roll");
						Dice.rollDice();
						if(Dice.dice1 == Dice.dice2) 
						{
							System.out.println("Congrats! You rolled a " + Dice.dice1 + " and a " + Dice.dice2 + " . You are out of jail");
							System.out.println();
						}
						else
						{
							System.out.println("Aw, you rolled a " + Dice.dice1 + " and a " + Dice.dice2 + " . You are still in jail");
							System.out.println("Next turn - Would you like to: ");
							System.out.println("1) Pay the 50$ fine?");
							System.out.println("2) Roll to try and get doubles for the second time?");
							jailDecision = input.nextInt();
							
							if(jailDecision == 1)
							{
								MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - 50);
								System.out.println("Ok, you out of jail, and you new balance is: " + MonopolyRunner.player1.getBalance());
								System.out.println();
							}
							else if(jailDecision == 2)
							{
								System.out.println("Let us roll");
								Dice.rollDice();
								if(Dice.dice1 == Dice.dice2) 
								{
									System.out.println("Congrats! You rolled a " + Dice.dice1 + " and a " + Dice.dice2 + " . You are out of jail");
									System.out.println();
								}
								else
								{
									System.out.println("Aw, you rolled a " + Dice.dice1 + " and a " + Dice.dice2 + " . You are still in jail");
									System.out.println("Next turn - Would you like to: ");
									System.out.println("1) Pay the 50$ fine?");
									System.out.println("2) Roll to try and get doubles for the third time?");
									jailDecision = input.nextInt();
									
									if(jailDecision == 1)
									{
										MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - 50);
										System.out.println("Ok, you out of jail, and you new balance is: " + MonopolyRunner.player1.getBalance());
										System.out.println();
									}
									else if(jailDecision == 2)
									{
										System.out.println("Let us roll");
										Dice.rollDice();
										if(Dice.dice1 == Dice.dice2) 
										{
											System.out.println("Congrats! You rolled a " + Dice.dice1 + " and a " + Dice.dice2 + " . You are out of jail");
											System.out.println();
										}
										else
										{
											System.out.println("You did not roll doubles, so you automatically pay the $50 fine.");
											MonopolyRunner.player1.setBalance(MonopolyRunner.player1.getBalance() - 50);
											System.out.println("Ok, you out of jail, and you new balance is: " + MonopolyRunner.player1.getBalance());
											System.out.println();
										}
									}
								}
							}
						}
					}
					
					
					
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
					System.out.println("You have to move in reverse now!");
					MoveInReverse.moveInReverse();
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
