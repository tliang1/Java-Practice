package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SumOfAllDigits
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		long number = input.nextLong();
		
		System.out.println("The sum of the digits is " + sumDigits(number));
		
		input.close();
	}

	/**
	 * Returns the sum of all digits of the number.
	 * 
	 * @param n		a number
	 * @return		sum of all digits of the number
	 */
	public static long sumDigits(long n)
	{
		long sum = 0;
		
		while (n != 0)
		{
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
}