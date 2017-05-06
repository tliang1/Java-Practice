package main;

import java.util.Scanner;

public class ComputeChange
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount as an integer, for example 11.56 is 1156: ");
		int amount = input.nextInt();
		
		int remainingAmount = amount;
		
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		System.out.print("Your amount " + amount + " consists of \n\t");
		
		if (numberOfOneDollars > 0)
		{
			if (numberOfOneDollars == 1)
			{
				System.out.print(numberOfOneDollars + " dollar\n\t");
			}
			else
			{
				System.out.print(numberOfOneDollars + " dollars\n\t");
			}
		}
		
		if (numberOfQuarters > 0)
		{
			if (numberOfQuarters == 1)
			{
				System.out.print(numberOfQuarters + " quarter\n\t");
			}
			else
			{
				System.out.print(numberOfQuarters + " quarters\n\t");
			}
		}
		
		if (numberOfDimes > 0)
		{
			if (numberOfDimes == 1)
			{
				System.out.print(numberOfDimes + " dime\n\t");
			}
			else
			{
				System.out.print(numberOfDimes + " dimes\n\t");
			}
		}
		
		if (numberOfNickels > 0)
		{
			if (numberOfNickels == 1)
			{
				System.out.print(numberOfNickels + " nickel\n\t");
			}
			else
			{
				System.out.print(numberOfNickels + " nickels\n\t");
			}
		}
		
		if (numberOfPennies > 0)
		{
			if (numberOfPennies == 1)
			{
				System.out.println(numberOfPennies + " penny");
			}
			else
			{
				System.out.println(numberOfPennies + " pennies");
			}
		}
		
		input.close();
	}

}