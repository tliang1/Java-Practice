package main;

import java.util.Scanner;

public class AverageOfNumbers
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an int value, the program exits if the input is 0: ");
		int number = input.nextInt();
		
		int positiveNumbers = 0, negativeNumbers = 0, total = 0;
		double average = 0.0;
		
		while (number != 0)
		{
			total += number;
			
			if (number < 0)
			{
				++negativeNumbers;
			}
			else
			{
				++positiveNumbers;
			}
			
			number = input.nextInt();
		}
		
		if ((positiveNumbers + negativeNumbers) > 0)
		{
			average = (double)(total) / (positiveNumbers + negativeNumbers);
		}
		
		System.out.println("The number of positives is " + positiveNumbers);
		System.out.println("The number of negatives is " + negativeNumbers);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
		
		
		input.close();
	}

}