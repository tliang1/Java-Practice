package main;

/**
 * @author Tony Liang
 *
 */
public class NumberOfUppercaseLettersInAString
{
	/**
	 * Displays the number of uppercase letters in the given string array's first element.
	 * <ul>
	 * 	<li>
	 * 		If the string array's length is not equal to 1, the program exits.
	 * 	</li>
	 * </ul>
	 * 
	 * @param args	a string array of one string
	 */
	public static void main(String[] args)
	{
		if (args.length != 1)
		{
			System.out.println("Usage: java NumberOfUppercaseLettersInAString string");
			System.exit(0);
		}
		
		System.out.println("The number of uppercase letters in the string " + args[0] + " is " + countUppercaseLetters(args[0]) + ".");
	}
	
	/**
	 * Returns the number of uppercase letters in the given string.
	 * 
	 * @param string	a string
	 * @return			the number of uppercase letters in the given string
	 */
	public static int countUppercaseLetters(String string)
	{
		int numberOfUppercaseLetters = 0;
		
		if (string.length() > 0)
		{
			for (int index = 0; index < string.length(); index++)
			{
				char character = string.charAt(index);
				
				if (Character.isLetter(character) && Character.isUpperCase(character))
				{
					numberOfUppercaseLetters++;
				}
			}
		}
		
		return numberOfUppercaseLetters;
	}
}