package main;

/**
 * @author Tony Liang
 *
 */
public class Craps
{
	public static void main(String[] args)
	{
		if (crapsGame())
		{
			System.out.println("You win");
		}
		else
		{
			System.out.println("You lose");
		}
	}
	
	/**
	 * Returns if the player wins or loses the Craps game.
	 * <p>
	 * The first round of the game begins here. If there needs to be more rounds, the game continues in another 
	 * method.
	 * 
	 * @return	true if the player wins. Otherwise, false.
	 * @see Craps#rollDicesLoop(int)
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
	 * @see Craps#crapsGame()
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