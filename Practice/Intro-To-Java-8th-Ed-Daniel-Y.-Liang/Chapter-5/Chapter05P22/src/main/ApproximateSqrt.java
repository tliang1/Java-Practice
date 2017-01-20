package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ApproximateSqrt
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double num = -1.0;
		
		while (num < 0.0)
		{
			System.out.print("Enter a positive number: ");
			num = input.nextDouble();
		}
		
		System.out.println("The square root of " + num + " is approximately " + sqrt(num));
		
		input.close();
	}

	/**
	 * Returns the approximated square root of the double argument.
	 * <ul>
	 * 	<li>
	 * 		If the double argument is negative, the approximated square root will default to 0.0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param num	a positive number
	 * @return		the approximated square root of the number
	 */
	public static double sqrt(double num)
	{
		if (num < 0.0)
		{
			return 0.0;
		}
		
		double lastGuess = 1.0;
		double nextGuess = (lastGuess + (num / lastGuess)) / 2.0;
		
		while (Math.abs(nextGuess - lastGuess) >= 0.0001)
		{
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (num / lastGuess)) / 2.0;
		}
		
		return nextGuess;
	}
}