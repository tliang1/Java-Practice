package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ReversedInteger
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print("The reverse of " + number + " is ");
		reverse(number);
		System.out.println();
		
		input.close();
	}
	
	/**
	 * Display the reverse of an integer.
	 * 
	 * @param number	an integer
	 */
	public static void reverse(int number)
	{
		String reverseNumberString = "";
		
		if (number < 0)
		{
			reverseNumberString = "-";
		}
		
		while (number != 0)
		{
			reverseNumberString += (int)(Math.abs((number % 10)));
			number /= 10;
		}
		
		System.out.print(reverseNumberString);
	}
}