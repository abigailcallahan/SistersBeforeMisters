import java.util.Scanner;

//done with player 2
public class MoveInReverse {

	static Scanner reverseInput = new Scanner(System.in);
	static Scanner reverseIntInput = new Scanner(System.in);
	
	static String enterReverse;
	static String enterReverseP2;
	
	static int reverseNewPlace;
	static int reverseNewPlaceP2;
	
	
	static int reverseNewPlace2;
	static int reverseNewPlace2P2;
	
	static int newReversePlace3;
	static int newReversePlace3P2;
	
	static int reverseInventoryDecision;
	static int reverseInventoryDecisionP2;
	
	static String enterReverse2;
	static String enterReverse2P2;
	
	
	//player 1
	public static void moveInReverse()
	{
		
		initialMove();
		while(MonopolyRunner.player1.getPlace() != 20 && MonopolyRunner.player1.getBalance() > 0)
		{	
				MonopolyRunner.player2Turn();
				
				System.out.println("\nOk, player 1, your turn again");
				otherMoves();	
		}
	}
	
	//player 2
	public static void moveInReverse2()
	{
		
		initialMove2();
		while(MonopolyRunner.player2.getPlace() != 20 && MonopolyRunner.player2.getBalance() > 0)
		{	
			MonopolyRunner.player1Turn();
			System.out.println("\nOk, player 2, your turn again");
			otherMoves2();	
		}
		
	}
	
	public static void initialMove()
	{
		//get out of free parking 
		System.out.println("Press enter to roll");
		enterReverse = reverseInput.nextLine();
		
		Dice.rollDice();
		System.out.println("You rolled a " + Dice.diceRoll);
		reverseNewPlace = MonopolyRunner.player1.getPlace() - Dice.diceRoll;
		System.out.println("Since you are moving in reverse, you landed on " + BoardArrayList.boardList.get(reverseNewPlace).getName());
		MonopolyRunner.player1.setPlace(reverseNewPlace);
		MoveAround.doAction();
	}
	
	public static void initialMove2()
	{
		//get out of free parking 
		System.out.println("Press enter to roll");
		enterReverseP2 = reverseInput.nextLine();
		
		Dice.rollDice();
		System.out.println("You rolled a " + Dice.diceRoll);
		reverseNewPlaceP2 = MonopolyRunner.player2.getPlace() - Dice.diceRoll;
		System.out.println("Since you are moving in reverse, you landed on " + BoardArrayList.boardList.get(reverseNewPlaceP2).getName());
		MonopolyRunner.player2.setPlace(reverseNewPlaceP2);
		MoveAround.doAction2();
	}
	
	
	public static void otherMoves()
	{
		System.out.println("Would you like to: ");
		System.out.println("1. continue rolling and moving in reverse?");
		System.out.println("2. look at your property inventory");
		reverseInventoryDecision = reverseIntInput.nextInt();
		
		if(reverseInventoryDecision == 1)
		{
			System.out.println("Press enter to roll");
			enterReverse = reverseInput.nextLine();
			
			Dice.rollDice();
			System.out.println("You rolled a " + Dice.diceRoll);
			
			//exits if it gets back to free parking 
			if(MonopolyRunner.player1.getPlace() - Dice.diceRoll == 20)
			{
				System.out.println("You landed on free parking again, so we go back to moving around the board regularly");
				MoveAround.startMoving();
				System.exit(0);
			}
			
			else if(MonopolyRunner.player1.getPlace() - Dice.diceRoll == 0)
			{
				PassGo.PassGo();
				MonopolyRunner.player1.setPlace(0);
				MoveAround.doAction();
			}
			else if(MonopolyRunner.player1.getPlace() - Dice.diceRoll < 0)
			{
				reverseNewPlace2 = MonopolyRunner.player1.getPlace() - Dice.diceRoll;
				PassGo.PassGo();
				int reverseNewPlace3 = reverseNewPlace2 + 39;
				MonopolyRunner.player1.setPlace(reverseNewPlace3 + 1); 
				System.out.println("You are on: " + BoardArrayList.boardList.get(reverseNewPlace3 + 1).getName());
				MoveAround.doAction();
			}
			else
			{
				reverseNewPlace = MonopolyRunner.player1.getPlace() - Dice.diceRoll;
				System.out.println("Since you are moving in reverse, you landed on " + BoardArrayList.boardList.get(reverseNewPlace).getName());
				MonopolyRunner.player1.setPlace(reverseNewPlace);
				MoveAround.doAction();
			}
			
			
			
		}
		else if(reverseInventoryDecision == 2)
		{
			ShowInventory.showInventory();
			
			System.out.println("Press enter to continue the game");
			enterReverse2 = reverseInput.nextLine();
			
			Dice.rollDice();
			System.out.println("You rolled a " + Dice.diceRoll);
			
			//exits if it gets back to free parking 
			if(MonopolyRunner.player1.getPlace() - Dice.diceRoll == 20)
			{
				System.out.println("You landed on free parking again, so we go back to moving around the board regularly");
				MoveAround.startMoving();
				System.exit(0);
			}
			else if(MonopolyRunner.player1.getPlace() - Dice.diceRoll == 0)
			{
				PassGo.PassGo();
				MonopolyRunner.player1.setPlace(0);
				MoveAround.doAction();
			}
			else if(MonopolyRunner.player1.getPlace() - Dice.diceRoll < 0)
			{
				reverseNewPlace2 = MonopolyRunner.player1.getPlace() - Dice.diceRoll;
				PassGo.PassGo();
				int reverseNewPlace3 = reverseNewPlace2 + 39;
				MonopolyRunner.player1.setPlace(reverseNewPlace3 + 1); 
				System.out.println("You are on: " + BoardArrayList.boardList.get(reverseNewPlace3 + 1).getName());
			}
			else
			{
				reverseNewPlace = MonopolyRunner.player1.getPlace() - Dice.diceRoll;
				System.out.println("Since you are moving in reverse, you landed on " + BoardArrayList.boardList.get(reverseNewPlace).getName());
				MonopolyRunner.player1.setPlace(reverseNewPlace);
				MoveAround.doAction();
			}
		}
		
	}
	
	public static void otherMoves2()
	{
		System.out.println("Would you like to: ");
		System.out.println("1. continue rolling and moving in reverse?");
		System.out.println("2. look at your property inventory");
		reverseInventoryDecisionP2 = reverseIntInput.nextInt();
		
		if(reverseInventoryDecisionP2 == 1)
		{
			System.out.println("Press enter to roll");
			enterReverseP2 = reverseInput.nextLine();
			
			Dice.rollDice();
			System.out.println("You rolled a " + Dice.diceRoll);
			
			//exits if it gets back to free parking 
			if(MonopolyRunner.player2.getPlace() - Dice.diceRoll == 20)
			{
				System.out.println("You landed on free parking again, so we go back to moving around the board regularly");
				MoveAround.startMoving2();
				System.exit(0);
			}
			
			else if(MonopolyRunner.player2.getPlace() - Dice.diceRoll == 0)
			{
				PassGo.PassGo2();
				MonopolyRunner.player2.setPlace(0);
				MoveAround.doAction2();
			}
			else if(MonopolyRunner.player2.getPlace() - Dice.diceRoll < 0)
			{
				reverseNewPlace2P2 = MonopolyRunner.player2.getPlace() - Dice.diceRoll;
				PassGo.PassGo2();
				int reverseNewPlace3P2 = reverseNewPlace2P2 + 39;
				MonopolyRunner.player2.setPlace(reverseNewPlace3P2 + 1); 
				System.out.println("You are on: " + BoardArrayList.boardList.get(reverseNewPlace3P2 + 1).getName());
				MoveAround.doAction2();
			}
			else
			{
				reverseNewPlaceP2 = MonopolyRunner.player2.getPlace() - Dice.diceRoll;
				System.out.println("Since you are moving in reverse, you landed on " + BoardArrayList.boardList.get(reverseNewPlaceP2).getName());
				MonopolyRunner.player2.setPlace(reverseNewPlaceP2);
				MoveAround.doAction2();
			}
			
		}
		else if(reverseInventoryDecisionP2 == 2)
		{
			ShowInventory.showInventory2();
			
			System.out.println("Press enter to continue the game");
			enterReverse2P2 = reverseInput.nextLine();
			
			Dice.rollDice();
			System.out.println("You rolled a " + Dice.diceRoll);
			
			//exits if it gets back to free parking 
			if(MonopolyRunner.player2.getPlace() - Dice.diceRoll == 20)
			{
				System.out.println("You landed on free parking again, so we go back to moving around the board regularly");
				MoveAround.startMoving2();
				System.exit(0);
			}
			else if(MonopolyRunner.player2.getPlace() - Dice.diceRoll == 0)
			{
				PassGo.PassGo2();
				MonopolyRunner.player2.setPlace(0);
				MoveAround.doAction2();
			}
			else if(MonopolyRunner.player2.getPlace() - Dice.diceRoll < 0)
			{
				reverseNewPlace2P2 = MonopolyRunner.player2.getPlace() - Dice.diceRoll;
				PassGo.PassGo2();
				int reverseNewPlace3 = reverseNewPlace2P2 + 39;
				MonopolyRunner.player2.setPlace(reverseNewPlace3 + 1); 
				System.out.println("You are on: " + BoardArrayList.boardList.get(reverseNewPlace3 + 1).getName());
			}
			else
			{
				reverseNewPlaceP2 = MonopolyRunner.player2.getPlace() - Dice.diceRoll;
				System.out.println("Since you are moving in reverse, you landed on " + BoardArrayList.boardList.get(reverseNewPlaceP2).getName());
				MonopolyRunner.player2.setPlace(reverseNewPlaceP2);
				MoveAround.doAction2();
			}
		}
		
	}

	
	
}











