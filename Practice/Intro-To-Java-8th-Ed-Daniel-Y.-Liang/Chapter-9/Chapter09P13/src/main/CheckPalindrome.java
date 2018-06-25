package main;

/**
 * @author Tony Liang
 *
 */
public class CheckPalindrome
{
	/**
	 * Displays if the given string array's first element is a palindrome.
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
			System.out.println("Usage: java CheckPalindrome string");
			System.exit(0);
		}
		
		if (isPalindrome(args[0]))
		{
			System.out.println(args[0] + " is a palindrome");
		}
		else
		{
			System.out.println(args[0] + " is not a palindrome");
		}
	}
	
	/**
	 * Returns if the given string is a palindrome.
	 * 
	 * @param s		a string
	 * @return		true if the given string is a palindrome. Otherwise, false.
	 */
	public static boolean isPalindrome(String s)
	{
		int low = 0;
		int high = s.length() - 1;
		
		while (low < high)
		{
			if (s.charAt(low) != s.charAt(high))
			{
				return false;
			}
			
			low++;
			high--;
		}
		
		return true;
	}
}