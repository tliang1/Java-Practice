package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class TestLocation
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int rows = 0;
		int columns = 0;
		
		while ((rows < 1) || (columns < 1))
		{
			System.out.print("Enter the number of rows and columns of the array: ");
			rows = input.nextInt();
			columns = input.nextInt();
		}
		
		double[][] values = new double[rows][columns];
		
		System.out.println("Enter the array: ");
		for (int row = 0; row < rows; row++)
		{
			for (int col = 0; col < columns; col++)
			{
				values[row][col] = input.nextDouble();
			}
		}
		
		Location location = locateLargest(values);
		
		System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", " + location.column + 
				")");
		
		input.close();
	}
	
	/**
	 * Returns an instance of Location that contains the location of the largest element given the double two-dimensional array argument.
	 * <ul>
	 * 	<li>
	 * 		If the two-dimensional array is empty or null, the largest element will not be located.
	 * 	</li>
	 * 	<li>
	 * 		If any of the single-dimensional arrays in the two-dimensional array are empty or null, they will be skipped when locating the 
	 * 		largest element.
	 * 	</li>
	 * </ul>
	 * 
	 * @param a		two-dimensional array of values
	 * @return		an instance of Location that contains the location of the largest element
	 */
	public static Location locateLargest(double[][] a)
	{
		int maxValueRow = -1;
		int maxValueCol = -1;
		double maxValue = 0;
		
		if ((a != null) && (a.length > 0))
		{	
			for (int row = 0; row < a.length; row++)
			{
				if ((a[row] != null) && (a[row].length > 0))
				{
					for (int col = 0; col < a[row].length; col++)
					{
						if (a[row][col] > maxValue)
						{
							maxValueRow = row;
							maxValueCol = col;
							maxValue = a[row][col];
						}
					}
				}
			}
			
			return new Location(maxValueRow, maxValueCol, maxValue);
		}
		
		return new Location(-1, -1, 0);
	}
}