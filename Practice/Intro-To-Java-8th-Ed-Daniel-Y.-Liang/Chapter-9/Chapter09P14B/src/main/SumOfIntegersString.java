package main;

/**
 * @author Tony Liang
 *
 */
public class SumOfIntegersString
{
	/**
	 * Displays the sum of all the integers given the string array.
	 * <ul>
	 * 	<li>
	 * 		Each element of the string array can have more than one integer each separated by a space.
	 * 	</li>
	 * </ul>
	 * 
	 * @param args	string array of integers
	 */
	public static void main(String[] args)
	{
		System.out.println("The total sum of all the integers is " + sumOfAllIntegers(args) + ".");
	}
	
	/**
	 * Returns the sum of all the integers given the string array.
	 * <ul>
	 * 	<li>
	 * 		Each element of the string array can have more than one integer each separated by a space.
	 * 	</li>
	 * </ul>
	 * 
	 * @param integers	string array of integers
	 * @return			the sum of all the integers given the string array.
	 */
	public static int sumOfAllIntegers(String[] integers)
	{
		int total = 0;
		
		if (integers.length > 0)
		{
			for (String currentIntegers : integers)
			{
				for (String currentInteger : currentIntegers.split(" "))
				{
					if (currentInteger.matches("\\d+"))
					{
						total += Integer.parseInt(currentInteger);
					}
				}
			}
		}
		
		return total;
	}
}