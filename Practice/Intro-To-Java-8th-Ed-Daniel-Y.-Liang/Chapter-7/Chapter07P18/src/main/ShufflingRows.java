package main;

/**
 * @author Tony Liang
 *
 */
public class ShufflingRows
{
	public static void main(String[] args)
	{
		int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
		
		System.out.println("The matrix is:");
		
		printTwoDimensionalArray(m);
		
		shuffle(m);
		
		System.out.println("\nAfter shuffling the matrix, the matrix is:");
		
		printTwoDimensionalArray(m);
	}
	
	/**
	 * Shuffles the rows of the group of integers given the integer two-dimensional array argument.
	 * 
	 * @param m		array of group of integers
	 */
	public static void shuffle(int[][] m)
	{
		for (int row = 0; row < m.length; row++)
		{
			int randomRow = row;
			
			while (randomRow == row)
			{
				randomRow = (int)(Math.random() * m.length);
			}
			
			swap(m, row, randomRow);
		}
	}
	
	/**
	 * Swaps the element(s) of the row specified by the first integer argument with the element(s) of the row
	 * specified by the second integer argument in the integer two-dimensional array argument.
	 * <p>
	 * If all of the following below is true, swapping occurs.
	 * <ul>
	 * 	<li>
	 *		The array's number of rows is greater than 0.
	 *	</li>
	 *	<li>
	 *		The two integer arguments are positive and less than the array's number of rows.
	 *	</li>
	 *	<li>
	 *		The two integer arguments are not equal.
	 * 	</li>
	 * </ul>
	 * 
	 * @param array		array of group of integers
	 * @param oldRow	the row to swap
	 * @param newRow	the row to swap to
	 */
	public static void swap(int[][] array, int oldRow, int newRow)
	{
		if (array.length > 1)
		{
			if ((oldRow >= 0) && (oldRow < array.length) && (newRow >= 0) && (newRow < array.length))
			{
				if (oldRow != newRow)
				{
					int[] temp = array[oldRow];
					array[oldRow] = array[newRow];
					array[newRow] = temp;
				}
			}
		}
	}
	
	/**
	 * Displays each row of integers per line using the integer two-dimensional array argument.
	 * 
	 * @param array		array of group of integers
	 */
	public static void printTwoDimensionalArray(int[][] array)
	{
		for (int row = 0; row < array.length; row++)
		{
			System.out.print("(");
			
			for (int col = 0; col < array[row].length; col++)
			{
				System.out.print(array[row][col]);
				
				if (col < (array[row].length - 1))
				{
					System.out.print(", ");
				}
			}
			
			System.out.println(")");
		}
	}
}