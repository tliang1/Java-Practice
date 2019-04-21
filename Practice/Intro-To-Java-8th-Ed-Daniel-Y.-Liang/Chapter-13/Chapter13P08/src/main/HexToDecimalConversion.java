package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class HexToDecimalConversion
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		
		try
		{
			System.out.println("The decimal value for hex number " + hex + " is "+ hexToDecimal(hex.toUpperCase()));
		}
		catch (HexFormatException ex)
		{
			System.out.println("The invalid hex string is " + ex.getHex());
		}
		
		input.close();
	}
	
	/**
	 * Returns the decimal integer given the hex string.
	 * 
	 * @param hex						hex string
	 * @return							the decimal integer given the hex string
	 * @throws HexFormatException		if the string is not a hex string
	 */
	public static int hexToDecimal(String hex) throws HexFormatException
	{
		if (hex.matches("[\\da-fA-F]{4}"))
		{
			int decimalValue = 0;
			
			for (int i = 0; i < hex.length(); i++)
			{
				char hexChar = hex.charAt(i);
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}
			
			return decimalValue;
		}
		else
		{
			throw new HexFormatException(hex);
		}
	}
	
	/**
	 * Returns the decimal integer given the hex character.
	 * 
	 * @param ch	hex character
	 * @return		the decimal integer given the hex character
	 */
	public static int hexCharToDecimal(char ch)
	{
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}