package main;

import java.util.Scanner;

public class Lottery
{

	public static void main(String[] args)
	{
		int lotteryDigit1 = 0;
		
		// First digit must be greater than 0
		while (lotteryDigit1 == 0)
		{
			lotteryDigit1 = (int)(Math.random() * 10);
		}
		
		int lotteryDigit2 = lotteryDigit1;
		
		// Second digit must be distinct from first digit
		while (lotteryDigit2 == lotteryDigit1)
		{
			lotteryDigit2 = (int)(Math.random() * 10);
		}
		
		int lottery = (lotteryDigit1 * 10) + lotteryDigit2;
		
		Scanner input = new Scanner(System.in);
		
		int guess = 0;
		
		while ((guess < 10) || (guess > 99))
		{
			System.out.print("Enter your lottery pick (two digits): ");
			guess = input.nextInt();
		}
		
		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		// Check the guess
		if (guess == lottery)
		{
			System.out.println("Exact match: you win $10,000");
		}
		else if ((guessDigit2 == lotteryDigit1) && (guessDigit1 == lotteryDigit2))
		{
			System.out.println("Match all digits: you win $3,000");
		}
		else if ((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) || (guessDigit2 == lotteryDigit1) 
				|| (guessDigit2 == lotteryDigit2))
		{
			System.out.println("Match one digit: you win $1,000");
		}
		else
		{
			System.out.println("Sorry, no match");
		}
		
		input.close();
	}

}