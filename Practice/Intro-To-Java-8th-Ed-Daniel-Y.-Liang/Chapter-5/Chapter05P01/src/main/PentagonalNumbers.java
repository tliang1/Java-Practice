package main;

/**
 * @author Tony Liang
 *
 */
public class PentagonalNumbers
{

	public static void main(String[] args)
	{
		printNPentagonalNumbers(100, 10);
	}
	
	/**
	 * Returns the specified nth pentagonal number.
	 * 
	 * @param n		the nth pentagonal number to find
	 * @return		the nth pentagonal number
	 */
	public static int getPentagonalNumber(int n)
	{
		return n * ((3 * n) - 1) / 2;
	}

	/**
	 * Prints up to the number of pentagonal numbers specified by the first argument while limiting the numbers per 
	 * line by the second argument.
	 * <p>
	 * If the first argument is less than 1, no pentagonal numbers are displayed.
	 * <p>
	 * If the second argument is less than 1, it will default to 1.
	 * 
	 * @param numberOfPentagonalNumbers		total number of pentagonal numbers to display
	 * @param maxNumbersPerLine				max pentagonal numbers to display per line
	 */
	public static void printNPentagonalNumbers(int numberOfPentagonalNumbers, int maxNumbersPerLine)
	{
		if (maxNumbersPerLine < 1)
		{
			maxNumbersPerLine = 1;
		}
		
		for (int n = 1; n <= numberOfPentagonalNumbers; n++)
		{
			System.out.print(getPentagonalNumber(n));
			
			if ((n % maxNumbersPerLine == 0) || (n == numberOfPentagonalNumbers))
			{
				System.out.println();
			}
			else
			{
				System.out.print(" ");
			}
		}
	}
}