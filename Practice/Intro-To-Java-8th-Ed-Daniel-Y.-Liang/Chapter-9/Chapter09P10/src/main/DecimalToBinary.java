package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int decimal = -1;
		
		while (decimal < 0)
		{
			System.out.print("Enter a positive decimal integer value: ");
			decimal = input.nextInt();
		}
		
		System.out.println("The binary value for the decimal number " + decimal + " is " + decimalToBinary(decimal) + ".");
		
		input.close();
	}
	
	/**
	 * Returns the binary number of the given decimal number.
	 * <ul>
	 * 	<li>
	 * 		If the integer is zero, the binary number will default to 0000.
	 * 	</li>
	 * 	<li>
	 * 		If the integer is negative, the binary number will default to Unknown.
	 * 	</li>
	 * </ul>
	 * 
	 * @param value		the decimal number
	 * @return			the binary number of the given decimal number
	 */
	public static String decimalToBinary(int value)
	{
		if (value == 0)
		{
			return "0000";
		}
		else if (value < 0)
		{
			return "Unknown";
		}
		else
		{
			StringBuilder binary = new StringBuilder();
			int countBinaryDigits = 0;
			
			while ((value > 0) || (countBinaryDigits % 4 != 0) || countBinaryDigits == 0)
			{
				binary.insert(0, (value % 2));
				value /= 2;
				countBinaryDigits++;
			}
			
			return binary.toString();
		}
	}
}