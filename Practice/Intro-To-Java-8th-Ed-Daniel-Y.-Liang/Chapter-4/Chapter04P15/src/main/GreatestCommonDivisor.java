package main;

import java.util.Scanner;

public class GreatestCommonDivisor
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		
		while (n1 < 0)
		{
			System.out.print("Enter first integer (Must be positive): ");
			n1 = input.nextInt();
		}
		
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		while (n2 < 0)
		{
			System.out.print("Enter second integer (Must be positive): ");
			n2 = input.nextInt();
		}
		
		int d = 1;
		
		if (n1 < n2)
		{
			d = n1;
		}
		else
		{
			d = n2;
		}
		
		while ((d > 1) && ((n1 % d != 0) || (n2 % d != 0)))
		{
			--d;
		}
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + d);
		
		input.close();
	}

}