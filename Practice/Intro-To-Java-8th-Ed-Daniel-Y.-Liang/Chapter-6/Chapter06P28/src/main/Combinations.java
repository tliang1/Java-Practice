package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class Combinations
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_INTEGERS = 10;
		int[] integers = new int[NUMBER_OF_INTEGERS];
		
		System.out.print("Enter ten integers: ");
		
		for(int count = 0; count < integers.length; count++)
		{
			integers[count] = input.nextInt();
		}
		
		System.out.println("List of all combinations of picking two integers from the ten integers:");
		
		for(int firstInteger = 0; firstInteger < integers.length; firstInteger++)
		{
			for(int secondInteger = firstInteger + 1; secondInteger < integers.length; secondInteger++)
			{
				System.out.println(integers[firstInteger] + " " + integers[secondInteger]);
			}
		}
		
		input.close();
	}
}