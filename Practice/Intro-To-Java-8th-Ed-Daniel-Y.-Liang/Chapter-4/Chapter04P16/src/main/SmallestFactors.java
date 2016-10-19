package main;

import java.util.Scanner;

public class SmallestFactors
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
		
		System.out.print("The smallest factors for " + number + " are");
		
		if (number < 2)
		{
			System.out.println(number);
		}
		else
		{
			int factor = 2;
			
			while (factor <= number)
			{
				if (number % factor == 0)
				{
					number /= factor;
					System.out.print(" " + factor);
				}
				else
				{
					++factor;
				}
			}
			
			System.out.println();
		}
		
		input.close();
	}

}