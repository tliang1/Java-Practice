package main;

import java.util.Scanner;

public class ISBNRevised
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int iSBNWithoutLastDigit = -1;
		
		while (iSBNWithoutLastDigit < 0)
		{
			System.out.print("Enter the first nine digits of ISBN (Must be positive): ");
			iSBNWithoutLastDigit = input.nextInt();
		}
		
		System.out.print("The ISBN for ");
		
		int checkSum = 0;
		String iSBNWithoutLastDigitString = "";
		
		for (int i = 9; i >= 1; i--)
		{
			iSBNWithoutLastDigitString = (iSBNWithoutLastDigit % 10) + iSBNWithoutLastDigitString;
			checkSum += ((iSBNWithoutLastDigit % 10) * i);
			iSBNWithoutLastDigit /= 10;
		}
		
		checkSum %= 11;
		
		System.out.print(iSBNWithoutLastDigitString + " is " + iSBNWithoutLastDigitString);
		
		if (checkSum == 10)
		{
			System.out.println("X");
		}
		else
		{
			System.out.println(checkSum);
		}
		
		input.close();
	}

}