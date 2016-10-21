package main;

/**
 * @author Tony Liang
 *
 */
public class DisplayCharacters
{
	
	public static void main(String[] args)
	{
		final int NUMBER_PER_LINE = 10;
		final char START_CHARACTER = '1';
		final char END_CHARACTER = 'Z';
		
		printChars(START_CHARACTER, END_CHARACTER, NUMBER_PER_LINE);
	}

	/**
	 * Displays characters between the first argument and the second argument inclusive while limiting the characters 
	 * per line by the third argument.
	 * <p>
	 * If the third argument is less than 1, it will default to 1.
	 * 
	 * @param ch1				the starting character
	 * @param ch2				the ending character
	 * @param numberPerLine		the maximum number of characters to display per line
	 */
	public static void printChars(char ch1, char ch2, int numberPerLine)
	{
		if (numberPerLine < 1)
		{
			numberPerLine = 1;
		}
		
		for (char character = ch1; character <= ch2; character++)
		{
			System.out.print(character + " ");
			
			if ((((character > ch1) || (numberPerLine == 1)) && ((character - ch1 + 1) % numberPerLine == 0)) || 
					character == ch2)
			{
				System.out.println();
			}
		}
	}
}