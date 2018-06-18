package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class BinaryToHex
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a binary number: ");
		String binaryValue = input.next();
		
		System.out.println("The hexidecimal value for the binary number " + binaryValue + " is " + binaryToHex(binaryValue) + ".");
		
		input.close();
	}
	
	/**
	 * Returns the hex number of the given binary value.
	 * <ul>
	 * 	<li>
	 * 		If the string is not a binary value, the hex number will default to Unknown.
	 * 	</li>
	 * </ul>
	 * 
	 * @param binaryValue	a binary number
	 * @return				the hex number of the given binary value.
	 */
	public static String binaryToHex(String binaryValue)
	{	
		if (binaryValue.matches("(0|1)+"))
		{
			StringBuilder expandedBinaryValue = new StringBuilder(binaryValue);
			
			while ((expandedBinaryValue.length() % 4) != 0)
			{
				expandedBinaryValue.insert(0, "0");
			}
			
			StringBuilder hex = new StringBuilder();
			
			for (int index = 0; index < expandedBinaryValue.length(); index += 4)
			{
				int decimal = binaryToDecimal(expandedBinaryValue.substring(index, index + 4));
				
				if (decimal > 9)
				{
					char letterHex = (char) (decimal - 10 + 'A');
					hex.append(letterHex);
				}
				else
				{
					hex.append(decimal);
				}
			}
			
			return hex.toString();
		}
		else
		{
			return "Unknown";
		}
	}
	
	/**
	 * Returns the decimal integer of the given binary string.
	 * <ul>
	 * 	<li>
	 * 		If the string is not a binary string, the decimal integer will default to -1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param binaryString	a binary string
	 * @return				the decimal integer of the given binary string.
	 */
	public static int binaryToDecimal(String binaryString)
	{
		int decimal = -1;
		
		if (binaryString.matches("(0|1)+"))
		{
			decimal = 0;
			
			for (int character = 0, index = binaryString.length() - 1; (character < binaryString.length()) && (index >= 0); character++, 
					index--)
			{
				if (binaryString.charAt(character) == '1')
				{
					decimal += (int) (Math.pow(2, index));
				}
			}
		}
		
		return decimal;
	}
}