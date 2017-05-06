package main;

/**
 * @author Tony Liang
 *
 */
public class RandomCharacter
{
	public static void main(String[] args)
	{
		final int TOTAL_UPPERCASE_LETTERS = 100;
		final int TOTAL_DIGITS = 100;
		final int TOTAL_PER_LINE = 10;
		
		for (int count = 1; count <= TOTAL_UPPERCASE_LETTERS; count++)
		{
			System.out.print(getRandomUpperCaseLetter());
			
			if ((count % TOTAL_PER_LINE == 0) || (count == TOTAL_UPPERCASE_LETTERS))
			{
				System.out.println();
			}
		}
		
		System.out.println();
		
		for (int count = 1; count <= TOTAL_DIGITS; count++)
		{
			System.out.print(getRandomDigitCharacter());
			
			if ((count % TOTAL_PER_LINE == 0) || (count == TOTAL_DIGITS))
			{
				System.out.println();
			}
		}
	}

	/**
	 * Returns a random character between the first argument and the second argument inclusive.
	 * 
	 * @param ch1	the minimum character
	 * @param ch2	the maximum character
	 * @return		a random character between the minimum character and the maximum character inclusive
	 */
	public static char getRandomCharacter(char ch1, char ch2)
	{
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	/**
	 * Returns a random lowercase letter.
	 * 
	 * @return	a random lowercase letter
	 */
	public static char getRandomLowerCaseLetter()
	{
		return getRandomCharacter('a', 'z');
	}
	
	/**
	 * Returns a random uppercase letter.
	 * 
	 * @return	a random uppercase letter
	 */
	public static char getRandomUpperCaseLetter()
	{
		return getRandomCharacter('A', 'Z');
	}
	
	/**
	 * Returns a random digit character.
	 * 
	 * @return	a random digit character
	 */
	public static char getRandomDigitCharacter()
	{
		return getRandomCharacter('0', '9');
	}
	
	/**
	 * Returns a random character.
	 * 
	 * @return	a random character
	 */
	public static char getRandomCharacter()
	{
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}