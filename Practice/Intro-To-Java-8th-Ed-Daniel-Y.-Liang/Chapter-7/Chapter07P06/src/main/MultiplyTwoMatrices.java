package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class MultiplyTwoMatrices
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int ROWS = 3;
		final int COLUMNS = 3;
		double[][] matrix1 = new double[ROWS][COLUMNS];
		double[][] matrix2 = new double[ROWS][COLUMNS];
		
		System.out.print("Enter matrix1: ");
		for (int row = 0; row < ROWS; row++)
		{
			for (int column = 0; column < COLUMNS; column++)
			{
				matrix1[row][column] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		for (int row = 0; row < ROWS; row++)
		{
			for (int column = 0; column < COLUMNS; column++)
			{
				matrix2[row][column] = input.nextDouble();
			}
		}
		
		System.out.println("The matrices are multiplied as follows");
		
		double[][] product = multiplyMatrix(matrix1, matrix2);
		
		for (int row = 0; row < ROWS; row++)
		{
			for (int column = 0; column < COLUMNS; column++)
			{
				System.out.printf("%-3.1f", matrix1[row][column]);
				
				if (column != (COLUMNS - 1))
				{
					System.out.print(" ");
				}
			}
			
			if (row != (ROWS / 2))
			{
				System.out.print("\t \t");
			}
			else
			{
				System.out.print("\t*\t");
			}
			
			for (int column = 0; column < COLUMNS; column++)
			{
				System.out.printf("%-3.1f", matrix2[row][column]);
				
				if (column != (COLUMNS - 1))
				{
					System.out.print(" ");
				}
			}
			
			if (row != (ROWS / 2))
			{
				System.out.print("\t \t");
			}
			else
			{
				System.out.print("\t=\t");
			}
			
			for (int column = 0; column < COLUMNS; column++)
			{
				System.out.printf("%-3.1f", (product[row][column]));
				
				if (column != (COLUMNS - 1))
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		input.close();
	}
	
	/**
	 * Returns the product of the two matrices given the two double two-dimensional array arguments.
	 * <p>
	 * If all of the following conditions below are not met, then the product will default to a empty double
	 * two-dimensional array.
	 * <p>
	 * 1. Both double two-dimensional array arguments are valid matrices.
	 * <p>
	 * 2. Their number of rows and columns are both greater than 0.
	 * <p>
	 * 3. The first argument's number of columns is equal to the second argument's number of rows.
	 * 
	 * @param a		array of double values in a matrix
	 * @param b		array of double values in a matrix
	 * @return		the product of the two matrices
	 */
	public static double[][] multiplyMatrix(double[][] a, double[][] b)
	{
		double[][] product = new double[0][0];
		
		if (isMatrix(a) && isMatrix(b) && (a.length > 0) && (b.length > 0) && (a[0].length > 0) && 
				(b[0].length > 0) && (a[0].length == b.length))
		{
			product = new double[a.length][b[0].length];
			
			for (int aRow = 0; aRow < a.length ; aRow++)
			{
				for (int bColumn = 0; bColumn < b[0].length; bColumn++)
				{
					for (int aColumn = 0, bRow = 0; (aColumn < a[aRow].length) && (bRow < b.length); 
							aColumn++, bRow++)
					{
						product[aRow][bColumn] += a[aRow][aColumn] * b[bRow][bColumn];
					}
				}
			}
			
			return product;
		}
		
		return product;
	}
	
	/**
	 * Returns if the double two-dimensional array argument is a matrix.
	 * 
	 * @param matrix	array of double values in a matrix
	 * @return			true if the argument is a matrix. Otherwise, false.
	 */
	public static boolean isMatrix(double[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			if (matrix[row].length != matrix[0].length)
			{
				return false;
			}
		}
		
		return true;
	}
}