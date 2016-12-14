package main;

/**
 * @author Tony Liang
 *
 */
public class RandomNumberChooser
{
	public static void main(String[] args)
	{
		int[] excludeNumbers = { 2, 5, 8, 16, 23, 49, 52 };
		
		System.out.println("Random number 1: " + getRandom(excludeNumbers));
		System.out.println("Random number 2: " + getRandom(3, 7, 22, 38, 45));
	}
	
	/**
	 * Returns a random integer between 1 and 54 inclusive and excluding the integers in the integer variable-length
	 * argument.
	 * <p>
	 * If the argument is not provided or it excludes all integers between 1 and 54 inclusive, a random integer
	 * between 1 and 54 inclusive is returned.
	 * 
	 * @param numbers	array of integers
	 * @return			a random integer between 1 and 54 inclusive and excluding the integers in the integer
	 * variable-length argument
	 */
	public static int getRandom(int... numbers)
	{
		int randomNumber = (int)(Math.random() * 54) + 1;
		
		if (numbers.length == 0)
		{
			return randomNumber;
		}
		
		if (numbers.length >= 54)
		{
			int allExcluded = 0;
			
			for (int number = 1; number < 55; number++)
			{
				for (int index = 0; index < numbers.length; index++)
				{
					if (numbers[index] == number)
					{
						allExcluded++;
						break;
					}
				}
			}
			
			if (allExcluded == 54)
			{
				return randomNumber;
			}
		}
		
		for (int index = 0; index < numbers.length; index++)
		{
			if (numbers[index] == randomNumber)
			{
				randomNumber = (int)(Math.random() * 54) + 1;
				index = 0;
			}
		}
		
		return randomNumber;
	}
}