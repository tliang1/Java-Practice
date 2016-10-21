package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class PalindromeInteger
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print(number + " is");
		
		if (!isPalindrome(number))
		{
			System.out.print(" not");
		}
		
		System.out.println(" a palindrome");
		
		input.close();
	}

	/**
	 * Returns the reverse of an integer.
	 * 
	 * @param number	an integer
	 * @return			reverse of the integer
	 */
	public static int reverse(int number)
	{
		if (number == 0)
		{
			return 0;
		}
		
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
		
		return Integer.parseInt(reverseNumberString);
	}
	
	/**
	 * Returns if an integer is a palindrome integer.
	 * 
	 * @param number	an integer
	 * @return			true if integer is palindrome. Otherwise, false.
	 */
	public static boolean isPalindrome(int number)
	{
		return number == reverse(number);
	}
}