package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SumOfNumbersInAMatrix
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int ROWS = 4;
		final int COLUMNS = 4;
		
		System.out.println("Sum of the matrix is " + sumMatrix(readAMatrix(ROWS, COLUMNS)));
		
		input.close();
	}
	
	/**
	 * Returns the sum of all elements in the integer two-dimensional array argument.
	 * <p>
	 * If the integer two-dimensional array's size is 0 and/or its one-dimensional arrays' sizes are all 0s, the sum
	 * will default to 0.
	 * 
	 * @param m		array of integers in a matrix
	 * @return		the sum of all integers in the matrix
	 */
	public static int sumMatrix(int[][] m)
	{
		int sum = 0;
		
		for (int row = 0; row < m.length; row++)
		{
			for (int column = 0; column < m[row].length; column++)
			{
				sum += m[row][column];
			}
		}
		
		return sum;
	}
	
	/**
	 * Returns the two-dimensional array of user input integer values given the two integer arguments.
	 * <p>
	 * If one or both integer arguments are negative, they will default to 0 accordingly.
	 * 
	 * @param rows		rows of the matrix
	 * @param columns	columns	of the matrix
	 * @return			the rows x columns matrix of user input integers
	 */
	public static int[][] readAMatrix(int rows, int columns)
	{
		if (rows < 0)
		{
			rows = 0;
		}
		
		if (columns < 0)
		{
			columns = 0;
		}
		
		Scanner input = new Scanner(System.in);
		
		int[][] matrix = new int[rows][columns];
		
		System.out.println("Enter a " + rows + "-by-" + columns + " matrix row by row: ");
		
		for (int row = 0; row < rows; row++)
		{
			for (int column = 0; column < columns; column++)
			{
				matrix[row][column] = input.nextInt();
			}
		}
		
		input.close();
		
		return matrix;
	}
}