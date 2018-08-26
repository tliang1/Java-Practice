package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class PrimeFactors
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int number = -1;
		
		while (number < 0)
		{
			System.out.print("Enter a positive integer: ");
			number = input.nextInt();
		}
		
		input.close();
		
		System.out.print("The smallest factors for " + number + " are");
		
		StackOfIntegers primeFactors = getPrimeFactors(number);
		
		while (!primeFactors.empty())
		{
			System.out.print(" " + primeFactors.pop());
		}
		
		System.out.println(".");
	}
	
	/**
	 * Returns the StackOfIntegers that stores the smallest factors of the given integer.
	 * <ul>
	 * 	<li>
	 * 		If the integer is negative, the StackOfIntegers will contain only the integer itself.
	 * 	</li>
	 * </ul>
	 * 
	 * @param integer	number
	 * @return			the StackOfIntegers that stores the smallest factors of the given integer.
	 */
	public static StackOfIntegers getPrimeFactors(int integer)
	{
		StackOfIntegers stackOfIntegers = new StackOfIntegers();
		
		if (integer < 2)
		{
			stackOfIntegers.push(integer);
		}
		else
		{
			int factor = 2;
			
			while (factor <= integer)
			{
				if (integer % factor == 0)
				{
					integer /= factor;
					stackOfIntegers.push(factor);
				}
				else
				{
					++factor;
				}
			}
		}
		
		return stackOfIntegers;
	}
}