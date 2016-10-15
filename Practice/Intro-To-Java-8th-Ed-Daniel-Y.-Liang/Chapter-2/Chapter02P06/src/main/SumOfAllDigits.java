package main;

import java.util.Scanner;

public class SumOfAllDigits 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int firstDigit = number % 10;
		number /= 10;
		int secondDigit = number % 10;
		number /= 10;
		int thirdDigit = number % 10;
		number /= 10;
		int fourthDigit = number % 10;
		
		int sumOfDigits = firstDigit + secondDigit + thirdDigit + fourthDigit;
		
		System.out.println("The sum of the digits is " + sumOfDigits);
		
		input.close();
	}

}