package main;

/**
 * @author Tony Liang
 *
 */
public class MathSqrtMethod
{
	
	public static void main(String[] args)
	{
		final int STARTING_NUMBER = 0;
		final int ENDING_NUMBER = 20;
		final int CHANGE_IN_NUMBER = 2;
		
		System.out.println("Number\tSquareRoot");
		
		for (int number = STARTING_NUMBER; number <= ENDING_NUMBER; number += CHANGE_IN_NUMBER)
		{
			System.out.printf("%-2d\t    %-6.4f\n", number, Math.sqrt(number));
		}
		
		System.out.println();
	}

}