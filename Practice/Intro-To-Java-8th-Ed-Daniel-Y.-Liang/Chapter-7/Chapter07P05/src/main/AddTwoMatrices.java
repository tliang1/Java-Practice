package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class AddTwoMatrices
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
		
		System.out.println("The matrices are added as follows");
		
		double[][] sum = addMatrix(matrix1, matrix2);
		
		for (int row = 0; row < ROWS; row++)
		{
			for (int column = 0; column < COLUMNS; column++)
			{
				System.out.print(matrix1[row][column]);
				
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
				System.out.print("\t");
			}
			
			for (int column = 0; column < COLUMNS; column++)
			{
				if ((row == (ROWS / 2)) && (column == 0))
				{
					System.out.print("+\t");
				}
				
				System.out.print(matrix2[row][column]);
				
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
				System.out.print("\t");
			}
			
			for (int column = 0; column < COLUMNS; column++)
			{
				if ((row == (ROWS / 2)) && (column == 0))
				{
					System.out.print("=\t");
				}
				
				System.out.print(sum[row][column]);
				
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
	 * Returns the sum of the two matrices given the two double two-dimensional array arguments.
	 * <p>
	 * If the two double two-dimensional array arguments are not valid matrices, don't have same rows and columns,
	 * and not have at least one row and column, then the sum will default to a empty double two-dimensional array.
	 * 
	 * @param a		array of double values in a matrix
	 * @param b		array of double values in a matrix
	 * @return		the sum of the two matrices
	 */
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		double[][] sum = new double[0][0];
		
		if (isMatrix(a) && isMatrix(b) && (a.length == b.length) && (a.length > 0) && (b.length > 0) && 
				(a[0].length == b[0].length) && (a[0].length > 0) && (b[0].length > 0))
		{
			sum = new double[a.length][a[0].length];
			
			for (int row = 0; row < a.length; row++)
			{
				for (int column = 0; column < a[row].length; column++)
				{
					sum[row][column] = a[row][column] + b[row][column];
				}
			}
			
			return sum;
		}
		
		return sum;
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