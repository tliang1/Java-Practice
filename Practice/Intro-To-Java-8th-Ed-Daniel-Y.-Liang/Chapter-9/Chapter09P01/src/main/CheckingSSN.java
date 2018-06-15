package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class CheckingSSN
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a social security number in the format DDD-DD-DDDD where D is a digit: ");
		String ssn = input.next();
		
		if (ssn.matches("\\d{3}-\\d{2}-\\d{4}"))
		{
			System.out.println("Valid SSN");
		}
		else
		{
			System.out.println("Invalid SSN");
		}
		
		input.close();
	}
}