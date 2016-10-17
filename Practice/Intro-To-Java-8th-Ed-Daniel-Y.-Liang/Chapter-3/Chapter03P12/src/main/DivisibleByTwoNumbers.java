package main;

import java.util.Scanner;

public class DivisibleByTwoNumbers
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.print(number + " is ");
		
		if ((number % 5 != 0) && (number % 6 != 0))
		{
			System.out.println("not divisible by either 5 or 6");
		}
		else if ((number % 5 == 0) && (number % 6 == 0))
		{
			System.out.println("divisible by both 5 and 6");
		}
		else
		{
			System.out.println("divisible by 5 or 6, but not both");
		}
		
		input.close();
	}

}