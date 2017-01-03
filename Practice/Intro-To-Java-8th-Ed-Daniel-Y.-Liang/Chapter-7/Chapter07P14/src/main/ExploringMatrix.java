package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ExploringMatrix
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size for the matrix: ");
		int size = input.nextInt();
		
		while (size < 0)
		{
			System.out.print("Enter the size for the matrix (Must be positive): ");
			size = input.nextInt();
		}
		
		int[][] squareMatrix = new int[size][size];
		
		for (int row = 0; row < size; row++)
		{
			for (int column = 0; column < size; column++)
			{
				squareMatrix[row][column] = (int) (Math.random() * 2);
			}
		}
		
		printMatrix(squareMatrix);
		all0sOr1s(squareMatrix);
		
		input.close();
	}
	
	/**
	 * Displays the matrix given the integer two-dimensional array argument.
	 * 
	 * @param matrix	array of integers in the matrix
	 */
	public static void printMatrix(int[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int column = 0; column < matrix[row].length; column++)
			{
				System.out.print(matrix[row][column]);
			}
			
			System.out.println();
		}
	}
	
	/**
	 * Find and displays the rows, columns, or diagonals with all 0s or 1s given the integer two-dimensional array
	 * argument.
	 * 
	 * @param squareMatrix	array of integers in the square matrix
	 */
	public static void all0sOr1s(int[][] squareMatrix)
	{
		boolean allOnRow = false;
		boolean allOnColumn = false;
		boolean allOnMajorDiagonal = false;
		boolean allOnSubDiagonal = false;
		
		if (isSquareMatrix(squareMatrix))
		{
			if (squareMatrix.length > 0)
			{
				for (int row = 0; row < squareMatrix.length; row++)
				{
					if ((squareMatrix[row][0] == 0) || (squareMatrix[row][0] == 1))
					{
						int ZeroOrOne = squareMatrix[row][0];
						int count = 1;
						
						for (int column = 1; column < squareMatrix[row].length; column++)
						{
							if (squareMatrix[row][column] == ZeroOrOne)
							{
								count++;
							}
							else
							{
								break;
							}
						}
						
						if (count == squareMatrix.length)
						{
							allOnRow = true;
							System.out.println("All " + ZeroOrOne + "s on row " + row);
						}
					}
				}
				
				for (int column = 0; column < squareMatrix[0].length; column++)
				{
					if ((squareMatrix[0][column] == 0) || (squareMatrix[0][column] == 1))
					{
						int ZeroOrOne = squareMatrix[0][column];
						int count = 1;
						
						for (int row = 1; row < squareMatrix.length; row++)
						{
							if (squareMatrix[row][column] == ZeroOrOne)
							{
								count++;
							}
							else
							{
								break;
							}
						}
						
						if (count == squareMatrix.length)
						{
							allOnColumn = true;
							System.out.println("All " + ZeroOrOne + "s on column " + column);
						}
					}
				}
				
				int ZeroOrOneMajorDiagonal = squareMatrix[0][0];
				int ZeroOrOneSubDiagonal = squareMatrix[0][squareMatrix.length - 1];
				int majorCount = 1;
				int subCount = 1;
				
				for (int row = 1, majorColumn = 1, minorColumn = squareMatrix.length - 2;
						row < squareMatrix.length; row++, majorColumn++, minorColumn--)
				{
					if ((ZeroOrOneMajorDiagonal == 0) || (ZeroOrOneMajorDiagonal == 1))
					{
						if (squareMatrix[row][majorColumn] == ZeroOrOneMajorDiagonal)
						{
							majorCount++;
						}
						
						if (majorCount == squareMatrix.length)
						{
							allOnMajorDiagonal = true;
							System.out.println("All " + ZeroOrOneMajorDiagonal + "s on major diagonal");
						}
					}
					
					if ((ZeroOrOneSubDiagonal == 0) || (ZeroOrOneSubDiagonal == 1))
					{
						if (squareMatrix[row][minorColumn] == ZeroOrOneSubDiagonal)
						{
							subCount++;
						}
						
						if (subCount == squareMatrix.length)
						{
							allOnSubDiagonal = true;
							System.out.println("All " + ZeroOrOneSubDiagonal + "s on sub diagonal");
						}
					}
				}
			}
		}
		
		if (!allOnRow)
		{
			System.out.println("No same numbers on a row");
		}
		
		if (!allOnColumn)
		{
			System.out.println("No same numbers on a column");
		}
		
		if (!allOnMajorDiagonal)
		{
			System.out.println("No same numbers on the major diagonal");
		}
		
		if (!allOnSubDiagonal)
		{
			System.out.println("No same numbers on the sub-diagonal");
		}
	}
	
	/**
	 * Returns if the integer two-dimensional array argument is a square matrix.
	 * 
	 * @param squareMatrix	array of integers in the matrix
	 * @return				true if the argument is a square matrix. Otherwise, false.
	 */
	public static boolean isSquareMatrix(int[][] squareMatrix)
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