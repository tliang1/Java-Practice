package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class DisplayPattern
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = -1;
		
		while (n < 1)
		{
			System.out.print("Enter a nonzero positive integer: ");
			n = input.nextInt();
		}
		
		displayPattern(n);
		
		input.close();
	}

	/**
	 * Displays the left half of an integer pyramid up to the integer argument.
	 * <p>
	 * Example:
	 * <p>
	 * The left half of an integer pyramid with n = 3:
	 * <p>
	 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1
	 * <p>
	 * &nbsp;&nbsp;&nbsp;2 1
	 * <p>
	 * 3 2 1
	 * <p>
	 * If n is less than 1, an error will be displayed.
	 * 
	 * @param n		a nonzero positive integer
	 */
	public static void displayPattern(int n)
	{
		if (n < 1)
		{
			System.out.println("Error: n must be a nonzero positive integer");
			System.exit(0);
		}
		
		for (int row = 1; row <= n; row++)
		{
			for (int spacing = row; spacing < n; spacing++)
			{
				System.out.printf("%4s", "");
			}
			
			for (int num = row; num >= 1; num--)
			{
				System.out.printf("%4d", num);
			}
			
			System.out.println();
		}
	}
}