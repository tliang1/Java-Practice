package main;

import java.util.Scanner;

public class ISBN
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first nine digits of ISBN: ");
		int iSBNWithoutLastDigit = input.nextInt();
		
		int digit9 = iSBNWithoutLastDigit % 10;
		iSBNWithoutLastDigit /= 10;
		int digit8 = iSBNWithoutLastDigit % 10;
		iSBNWithoutLastDigit /= 10;
		int digit7 = iSBNWithoutLastDigit % 10;
		iSBNWithoutLastDigit /= 10;
		int digit6 = iSBNWithoutLastDigit % 10;
		iSBNWithoutLastDigit /= 10;
		int digit5 = iSBNWithoutLastDigit % 10;
		iSBNWithoutLastDigit /= 10;
		int digit4 = iSBNWithoutLastDigit % 10;
		iSBNWithoutLastDigit /= 10;
		int digit3 = iSBNWithoutLastDigit % 10;
		iSBNWithoutLastDigit /= 10;
		int digit2 = iSBNWithoutLastDigit % 10;
		iSBNWithoutLastDigit /= 10;
		int digit1 = iSBNWithoutLastDigit % 10;
		
		int checksum = (digit1 + (digit2 * 2) + (digit3 * 3) + (digit4 * 4) + (digit5 * 5) + (digit6 * 6) + 
				(digit7 * 7) + (digit8 * 8) + (digit9 * 9)) % 11;
		
		System.out.print("The ISBN for " + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + 
				digit9 + " is " + digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8 + digit9);
		
		if (checksum == 10)
		{
			System.out.println("X");
		}
		else
		{
			System.out.println(checksum);
		}
		
		input.close();
	}

}