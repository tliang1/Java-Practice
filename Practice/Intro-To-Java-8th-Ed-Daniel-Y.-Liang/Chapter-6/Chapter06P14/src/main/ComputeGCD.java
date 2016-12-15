package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ComputeGCD
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_INTEGERS = 5;
		int[] integers = new int[NUMBER_OF_INTEGERS];
		
		System.out.print("Enter five numbers: ");
		
		for(int count = 0; count < integers.length; count++)
		{
			integers[count] = input.nextInt();
		}
		
		System.out.println("The gcd of the five numbers is " + gcd(integers));
		
		input.close();
	}
	
	/**
	 * Returns the greatest common divisor of the integer(s) in the integer variable-length argument.
	 * <p>
	 * If the argument is not provided or all the integers are zeroes, the gcd will default to 0. If the argument is
	 * only one integer, the gcd will default to the integer.
	 * 
	 * @param numbers	array of integers
	 * @return			the greatest common divisor of the integer(s) in the integer variable-length argument.
	 */
	public static int gcd(int... numbers)
	{
		if (numbers.length == 0)
		{
			return 0;
		}
		else if (numbers.length == 1)
		{
			return numbers[0];
		}
		
		int gcd = numbers[0];
		
		if (gcd == 0)
		{
			for (int index = 1; index < numbers.length; index++)
			{
				if (numbers[index] != 0)
				{
					gcd = numbers[index];
					break;
				}
			}
		}
		
		if (gcd != 0)
		{
			int currentGCD = gcd;
			
			for (int index = 1; index < numbers.length; index++)
			{
				if (numbers[index] != 0)
				{
					int k = 2;
					
					while (k <= Math.abs(currentGCD) && k <= Math.abs(numbers[index]))
					{
						if (currentGCD % k == 0 && numbers[index] % k == 0)
						{
							gcd = k;
						}
						
						k++;
					}
					
					currentGCD = gcd;
				}
			}
		}
		
		return gcd;
	}
}