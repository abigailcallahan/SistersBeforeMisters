
public class Dice
	{
		static int dice1;
		static int dice2;
		static int diceRoll;
		
	public static void rollDice()
		{
		dice1 = (int) (Math.random()* 6)  + 1;
		dice2 = (int) (Math.random()* 6)  + 1;
		diceRoll = dice1 + dice2;
		
		
	}
	}
