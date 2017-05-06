package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class LargestElementIndex
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		while ((rows < 0) || (columns < 0))
		{
			System.out.print("Enter the number of rows and columns of the array " +
					"(Rows and columns must be positive): ");
			rows = input.nextInt();
			columns = input.nextInt();
		}
		
		double[][] numbers = new double[rows][columns];
		
		System.out.print("Enter the array: ");
		
		for (int row = 0; row < rows; row++)
		{
			for (int column = 0; column < columns; column++)
			{
				numbers[row][column] = input.nextDouble();
			}
		}
		
		int[] largestElementLocation = locateLargest(numbers);
		
		System.out.println("The location of the largest element is at (" + largestElementLocation[0] + ", " +
				largestElementLocation[1] + ")");
		
		input.close();
	}
	
	/**
	 * Returns the smallest row and column indices of the largest element in the double two-dimensional array
	 * argument.
	 * <ul>
	 * 	<li>
	 * 		If the number of rows or columns of the argument are less than 1, then the indices will default to -1.
	 * 	</li>
	 * 	<li>
	 * 		If the number of rows and columns of the argument are equal to 1, then the indices will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param a		array of double values
	 * @return		the smallest row and column indices of the largest element
	 */
	public static int[] locateLargest(double[][] a)
	{
		int[] largestElementLocation = { -1, -1 };
		
		if ((a.length >= 1) && (a[0].length >= 1))
		{
			Arrays.fill(largestElementLocation, 0);
			
			if ((a.length > 1) || (a[0].length > 1))
			{
				double currentLargestElement = a[largestElementLocation[0]][largestElementLocation[0]];
				
				for (int row = 0; row < a.length; row++)
				{
					for (int column = 0; column < a[row].length; column++)
					{
						if (a[row][column] > currentLargestElement)
						{
							currentLargestElement = a[row][column];
							largestElementLocation[0] = row;
							largestElementLocation[1] = column;
						}
					}
				}
			}
		}
		
		return largestElementLocation;
	}
}