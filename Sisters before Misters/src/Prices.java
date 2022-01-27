import java.util.Scanner;
import java.util.ArrayList;

public class Prices
	{

		public static void checkPrices()
			{
				Scanner input = new Scanner(System.in);
				if (MonopolyRunner.player1.getPlace() >= 0)
					{
						if (BoardArrayList.boardList.get(MonopolyRunner.player1.getPlace()).getisTaken() == false)
							{
							//telling what the property is
								System.out.println("This property is " + BoardArrayList.boardList.get(MonopolyRunner.player1.getPlace()).getRent() + " dollars. Would you like to purchase it?");
								System.out.println("1. Yes");
								System.out.println("2. No");
								int buy = input.nextInt();

								if (buy == 1)
									{
									//sets buy to true
										System.out.println();
										System.out.println("Congrats! You now own " + BoardArrayList.boardList.get(MonopolyRunner.player1.getPlace()).getName());
										BoardArrayList.boardList.get(MonopolyRunner.player1.getPlace()).setTaken(true);
										
										ShowInventory.player1Inventory.add(new Inventory(BoardArrayList.boardList.get(MonopolyRunner.player1.getPlace()).getName()));
										
										MonopolyRunner.player1.setBalance((MonopolyRunner.player1.getBalance() - (BoardArrayList.boardList.get(MonopolyRunner.player1.getPlace()).getRent())));
										System.out.println("Your current balance is: " + MonopolyRunner.player1.getBalance() + " dollars");
									}

								else
									{

										System.out.println();
									}
							}

						else if (BoardArrayList.boardList.get(MonopolyRunner.player1.getPlace()).getisTaken() == true)
							{
								System.out.println("either you or player 2 owns this property, oops!");
							}
					}
			}
		
		//player 2
		public static void checkPrices2()
		{
			Scanner inputP2 = new Scanner(System.in);
			if (MonopolyRunner.player2.getPlace() >= 0)
				{
					if (BoardArrayList.boardList.get(MonopolyRunner.player2.getPlace()).getisTaken() == false)
						{
						//telling what the property is
							System.out.println("This property is " + BoardArrayList.boardList.get(MonopolyRunner.player2.getPlace()).getRent() + " dollars. Would you like to purchase it?");
							System.out.println("1. Yes");
							System.out.println("2. No");
							int buy = inputP2.nextInt();

							if (buy == 1)
								{
								//sets buy to true
									System.out.println();
									System.out.println("Congrats! You now own " + BoardArrayList.boardList.get(MonopolyRunner.player2.getPlace()).getName());
									BoardArrayList.boardList.get(MonopolyRunner.player2.getPlace()).setTaken(true);
									ShowInventory.player2Inventory.add(new Inventory(BoardArrayList.boardList.get(MonopolyRunner.player2.getPlace()).getName()));
									MonopolyRunner.player2.setBalance((MonopolyRunner.player2.getBalance() - (BoardArrayList.boardList.get(MonopolyRunner.player2.getPlace()).getRent())));
									System.out.println("Your current balance is: " + MonopolyRunner.player2.getBalance() + " dollars");
								}

							else
								{

									System.out.println();
								}
						}

					else if (BoardArrayList.boardList.get(MonopolyRunner.player2.getPlace()).getisTaken() == true)
						{
							System.out.println("Either you or player 1 already owns this property oops!");
						}
				}
		}

	}
