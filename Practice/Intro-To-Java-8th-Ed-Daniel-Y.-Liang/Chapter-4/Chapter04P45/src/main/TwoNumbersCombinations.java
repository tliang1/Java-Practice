package main;

public class TwoNumbersCombinations
{
	
	public static void main(String[] args)
	{
		final int MINIMUM_NUMBER = 1;
		final int MAXIMUM_NUMBER = 7;
		
		int totalCombinations = 0;
		
		for (int firstNumber = MINIMUM_NUMBER; firstNumber < MAXIMUM_NUMBER; firstNumber++)
		{
			for (int secondNumber = firstNumber + 1; secondNumber <= MAXIMUM_NUMBER; secondNumber++)
			{
				System.out.println(firstNumber + " " + secondNumber);
				totalCombinations++;
			}
		}
		
		System.out.println("Keep picking two numbers between " + MINIMUM_NUMBER + " and " + MAXIMUM_NUMBER + 
				" yields " + totalCombinations + " combinations");
	}

}