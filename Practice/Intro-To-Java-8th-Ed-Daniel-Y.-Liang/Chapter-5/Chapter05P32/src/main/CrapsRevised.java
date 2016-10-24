package main;

/**
 * @author Tony Liang
 *
 */
public class CrapsRevised
{
	
	public static void main(String[] args)
	{		
		System.out.println("Total winning games: " + numberOfWins(10000));
	}

	/**
	 * Returns the number of times you win the Craps game out of the integer argument amount of times to run the 
	 * game.
	 * <p>
	 * If the integer argument is less than 1, it will default to 1.
	 * 
	 * @param numberOfTimes		number of times to run the Craps game
	 * @return					the number of times you won the Craps game
	 */
	public static int numberOfWins(int numberOfTimes)
	{
		if (numberOfTimes < 1)
		{
			numberOfTimes = 1;
		}
		
		int wins = 0;
		
		for (int count = 1; count <= numberOfTimes; count++)
		{
			if (crapsGame())
			{
				System.out.println("You win\n");
				wins++;
			}
			else
			{
				System.out.println("You lose\n");
			}
		}
		
		return wins;
	}
	
	/**
	 * Returns if the player wins or loses the Craps game.
	 * <p>
	 * The first round of the game begins here. If there needs to be more rounds, the game continues in another 
	 * method.
	 * 
	 * @return	true if the player wins. Otherwise, false.
	 * @see CrapsRevised#rollDicesLoop(int)
	 */
	public static boolean crapsGame()
	{
		int firstDice = (int)((Math.random() * 6) + 1);
		int secondDice = (int)((Math.random() * 6) + 1);
		
		int sum = firstDice + secondDice;
		
		System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + sum);
		
		if ((sum == 2) || (sum == 3) || (sum == 12))
		{
			return false;
		}
		else if ((sum == 7) || (sum == 11))
		{
			return true;
		}
		else
		{
			System.out.println("point is " + sum);
			
			return rollDicesLoop(sum);
		}
	}
	
	/**
	 * Returns if the player wins or loses the Craps game.
	 * <p>
	 * If there is no winner in the first round of the game, this method will continue the game until a winner is
	 * declared.
	 * 
	 * @param point		sum of the two dices of the first round
	 * @return			true if the player wins. Otherwise, false.
	 * @see CrapsRevised#crapsGame()
	 */
	public static boolean rollDicesLoop(int point)
	{
		if (point < 2)
		{
			return false;
		}
		
		int sum = 0;
		
		while ((point != sum) && (sum != 7))
		{
			int firstDice = (int)((Math.random() * 6) + 1);
			int secondDice = (int)((Math.random() * 6) + 1);
			sum = firstDice + secondDice;
			
			System.out.println("You rolled " + firstDice + " + " + secondDice + " = " + sum);
			
			if (sum == point)
			{
				return true;
			}
			else if (sum == 7)
			{
				return false;
			}
			else
			{
				point = sum;
				sum = 0;
			}
			
			System.out.println("point is " + point);
		}
		
		return false;
	}
}