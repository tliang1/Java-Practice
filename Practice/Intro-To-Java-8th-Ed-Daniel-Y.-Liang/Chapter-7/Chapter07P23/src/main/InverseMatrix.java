package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class InverseMatrix
{
	public static void main(String[] args)
	{
		double[][] inverseMatrix = inverse(readMatrix());
		
		if (inverseMatrix != null)
		{
			displayMatrix(inverseMatrix);
		}
	}
	
	/**
	 * Returns the 3X3 matrix retrieved by the user's input.
	 * 
	 * @return	the 3X3 matrix
	 */
	public static double[][] readMatrix()
	{
		Scanner input = new Scanner(System.in);
		
		final int ROWS = 3, COLUMNS = 3;
		double[][] matrix = new double[ROWS][COLUMNS];
		
		System.out.print("Enter a11, a12, a13, a21, a22, a23, a31, a32, a33: ");
		
		for (int row = 0; row < ROWS; row++)
		{
			for (int col = 0; col < COLUMNS; col++)
			{
				matrix[row][col] = input.nextDouble();
			}
		}
		
		input.close();
		
		return matrix;
	}
	
	/**
	 * Returns the inverse matrix of the double two-dimensional array argument.
	 * <ul>
	 * 	<li>
	 * 		If the argument is not a 3X3 matrix or the determinant is 0, there is no inverse matrix.
	 * 	</li>
	 * </ul>
	 * 
	 * @param A		array of double values in a matrix
	 * @return		the inverse matrix of A
	 */
	public static double[][] inverse(double[][] A)
	{
		if (isSquareMatrix(A))
		{
			if (A.length == 3)
			{
				double determinant = (A[0][0] * A[1][1] * A[2][2]) + (A[2][0] * A[0][1] * A[1][2]) +
						(A[0][2] * A[1][0] * A[2][1]) - (A[0][2] * A[1][1] * A[2][0]) -
						(A[0][0] * A[1][2] * A[2][1]) - (A[2][2] * A[1][0] * A[0][1]);
				
				if (determinant != 0)
				{
					double[][] inverseMatrix =
						{
							{
								(A[1][1] * A[2][2]) - (A[1][2] * A[2][1]),
								(A[0][2] * A[2][1]) - (A[0][1] * A[2][2]),
								(A[0][1] * A[1][2]) - (A[0][2] * A[1][1])
							},
							{
								(A[1][2] * A[2][0]) - (A[1][0] * A[2][2]),
								(A[0][0] * A[2][2]) - (A[0][2] * A[2][0]),
								(A[0][2] * A[1][0]) - (A[0][0] * A[1][2])
							},
							{
								(A[1][0] * A[2][1]) - (A[1][1] * A[2][0]),
								(A[0][1] * A[2][0]) - (A[0][0] * A[2][1]),
								(A[0][0] * A[1][1]) - (A[0][1] * A[1][0])
							}
						};
					
					for (int row = 0; row < inverseMatrix.length; row++)
					{
						for (int col = 0; col < inverseMatrix[row].length; col++)
						{
							inverseMatrix[row][col] = inverseMatrix[row][col] / determinant;
						}
					}
					
					return inverseMatrix;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * Displays the matrix using the double two-dimensional array argument.
	 * 
	 * @param matrix	array of double values in a matrix
	 */
	public static void displayMatrix(double[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[row].length; col++)
			{
				System.out.print(matrix[row][col] + " ");
			}
			
			System.out.println();
		}
	}
	
	/**
	 * Returns if the double two-dimensional array argument is a square matrix.
	 * 
	 * @param squareMatrix	array of double values in the matrix
	 * @return				true if the argument is a square matrix. Otherwise, false.
	 */
	public static boolean isSquareMatrix(double[][] squareMatrix)
	{
		for (int row = 0; row < squareMatrix.length; row++)
		{
			if (squareMatrix[row].length != squareMatrix.length)
			{
				return false;
			}
		}
		
		return true;
	}
}