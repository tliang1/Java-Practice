package main;

import java.util.Scanner;

public class ComputeChange 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print(
		"Enter an amount as an integer, for example 11.56 is 1156: ");
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
		
		System.out.println("Your amount " + amount + " consists of \n" + 
				"\t" + numberOfOneDollars + " dollars\n" + 
				"\t" + numberOfQuarters + " quarters\n" + 
				"\t" + numberOfDimes + " dimes\n" + 
				"\t" + numberOfNickels + " nickels\n" + 
				"\t" + numberOfPennies + " pennies");
		
		input.close();
	}

}