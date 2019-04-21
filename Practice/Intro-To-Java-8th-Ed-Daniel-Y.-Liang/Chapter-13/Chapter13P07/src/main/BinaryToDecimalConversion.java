package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class BinaryToDecimalConversion
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a binary string: ");
		String binaryString = input.next();
		
		System.out.println("The decimal integer for the binary string " + binaryString + " is " + binaryToDecimal(binaryString) + ".");
		
		input.close();
	}
	
	/**
	 * Returns the decimal integer of the given binary string.
	 * 
	 * @param binaryString				a binary string
	 * @return							the decimal integer of the given binary string
	 * @throws NumberFormatException	if the string is not a binary string
	 */
	public static int binaryToDecimal(String binaryString) throws NumberFormatException
	{
		if (binaryString.matches("(0|1)+"))
		{
			int decimal = 0;
			
			for (int character = 0, index = binaryString.length() - 1; (character < binaryString.length()) && (index >= 0); character++, 
					index--)
			{
				if (binaryString.charAt(character) == '1')
				{
					decimal += (int) (Math.pow(2, index));
				}
			}
			
			return decimal;
		}
		else
		{
			throw new NumberFormatException("String is not a binary string");
		}
	}
}