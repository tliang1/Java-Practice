package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SumOfTwoIntegers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean validIntegers = false;
		
		do
		{
			try
			{
				System.out.print("Enter the first integer: ");
				String firstIntegerString = input.next();
				System.out.print("Enter the second integer: ");
				String secondIntegerString = input.next();
				
				int firstInteger = Integer.parseInt(firstIntegerString);
				int secondInteger = Integer.parseInt(secondIntegerString);
				
				validIntegers = true;
				
				System.out.println(firstInteger + " + " + secondInteger + " = " + (firstInteger + secondInteger));
			}
			catch (NumberFormatException ex)
			{
				String message = ex.getMessage();
				
				if (message != null)
				{
					System.out.print(message.substring(message.indexOf('"') + 1, message.lastIndexOf('"')));
				}
				
				System.out.println(" is not an integer. Try again.");
				
				input.nextLine();
			}
		} while (!validIntegers);
		
		input.close();
	}
}