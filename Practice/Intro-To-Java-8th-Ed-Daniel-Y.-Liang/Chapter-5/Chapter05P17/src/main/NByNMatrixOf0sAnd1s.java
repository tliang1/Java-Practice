package main;

/**
 * @author Tony Liang
 *
 */
public class NByNMatrixOf0sAnd1s
{
	public static void main(String[] args)
	{
		printMatrix(3);
	}

	/**
	 * Prints a NxN matrix of random binary digits given the integer argument.
	 * <ul>
	 * 	<li>
	 * 		If integer argument is less than 1, an error will be displayed.
	 * 	</li>
	 * </ul>
	 * 
	 * @param n		matrix size
	 */
	public static void printMatrix(int n)
	{
		if (n < 1)
		{
			System.out.println("Error: n must be a nonzero positive integer");
			System.exit(0);
		}
		
		
		for (int row = 1; row <= n; row++)
		{
			for (int column = 1; column <= n; column++)
			{
				int bit = (int)(Math.random() * 2);
				
				System.out.print(bit + " ");
			}
			
			System.out.println();
		}
	}
}