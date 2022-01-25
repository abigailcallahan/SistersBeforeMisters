import java.util.Scanner;


public class MoveInReverse {

	static Scanner reverseInput = new Scanner(System.in);
	static Scanner reverseIntInput = new Scanner(System.in);
	
	static String enterReverse;
	static int reverseNewPlace;
	static int reverseNewPlace2;
	static int newReversePlace3;
	
	static int reverseInventoryDecision;
	static String enterReverse2;
	
	public static void moveInReverse()
	{
		initialMove();
		
		
		while(MonopolyRunner.player1.getPlace() != 20)
		{
			otherMoves();
		}
		
	}
	
	public static void initialMove()
	{
		System.out.println("Press enter to roll");
		enterReverse = reverseInput.nextLine();
		
		Dice.rollDice();
		System.out.println("You rolled a " + Dice.diceRoll);
		reverseNewPlace = MonopolyRunner.player1.getPlace() - Dice.diceRoll;
		System.out.println("Since you are moving in reverse, you landed on " + BoardArrayList.boardList.get(reverseNewPlace).getName());
		MonopolyRunner.player1.setPlace(reverseNewPlace);
		MoveAround.doAction();
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
	
	
	
	
	
	
	
	
	
	
}











