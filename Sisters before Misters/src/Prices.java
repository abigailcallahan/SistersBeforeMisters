import java.util.Scanner;

public class Prices
	{

		public static void main(String[] args)
			{

			}

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
										MonopolyRunner.player1.setBalance((MonopolyRunner.player1.getBalance() - (BoardArrayList.boardList.get(MonopolyRunner.player1.getPlace()).getRent())));
										System.out.println("Your current balance is: " + MonopolyRunner.player1.getBalance() + " dollars");
									}

								else
									{

										System.out.println();
										System.out.println("Roll the dice again!");

									}
							}

						else if (BoardArrayList.boardList.get(MonopolyRunner.player1.getPlace()).getisTaken() == true)
							{
								System.out.println("You already own this property! Roll again");
							}
					}
			}

	}
