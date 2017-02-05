package main;

import java.util.Scanner;

/**
 * @author Tony
 *
 */
public class FourSameConsecutiveNumbersInTwoDimensionalArray
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int rows = readRows(input);
		int cols = readCols(input);
		int[][] values = readValues(rows, cols, input);
		
		System.out.print("Does the array contain four consecutive numbers with the same value?: " +
				isConsecutiveFour(values));
		
		input.close();
	}
	
	/**
	 * Returns the number of rows retrieved by the user's input.
	 * <ul>
	 * 	<li>
	 * 		If the number of rows is less than 1, the user must reenter the number of rows until it is greater than
	 * 		0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param input		simple text scanner used to parse the number of rows
	 * @return			the number of rows
	 */
	public static int readRows(Scanner input)
	{
		int rows = 0;
		
		while (rows < 1)
		{
			System.out.print("Enter the number of rows (Must be nonzero positive): ");
			rows = input.nextInt();
		}
		
		return rows;
	}
	
	/**
	 * Returns the number of columns retrieved by the user's input.
	 * <ul>
	 * 	<li>
	 * 		If the number of columns is less than 1, the user must reenter the number of columns until it is
	 * 		greater than 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param input		simple text scanner used to parse the number of columns
	 * @return			the number of columns
	 */
	public static int readCols(Scanner input)
	{
		int cols = 0;
		
		while (cols < 1)
		{
			System.out.print("Enter the number of columns (Must be nonzero positive): ");
			cols = input.nextInt();
		}
		
		return cols;
	}
	
	/**
	 * Returns the integer two-dimensional array of integers retrieved by the user's input given the integer
	 * arguments.
	 * <ul>
	 * 	<li>
	 * 		If the number of rows or columns is less than 1, the array will default to having one row and column
	 * 		with an element of 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param rows		the number of rows for the array
	 * @param cols		the number of columns for the array
	 * @param input		simple text scanner used to parse the integers into the array
	 * @return			the array of integer values
	 */
	public static int[][] readValues(int rows, int cols, Scanner input)
	{
		int[][] values = new int[1][1];
		
		if ((rows > 0) && (cols > 0))
		{
			values = new int[rows][cols];
		}
		
		System.out.print("Enter " + (rows * cols) + " integers: ");
		
		for (int row = 0; row < rows; row++)
		{
			for (int col = 0; col < cols; col++)
			{
				values[row][col] = input.nextInt();
			}
		}
		
		return values;
	}
	
	/**
	 * Returns if the integer two-dimensional array argument contains four consecutive integers with the same
	 * value, either horizontally, vertically, or diagonally.
	 * <ul>
	 * 	<li>
	 * 		If the array argument is a jagged array, it will default to not containing four consecutive integers
	 * 		with the same value.
	 * 	</li>
	 * </ul>
	 * 
	 * @param values	array of group of integers
	 * @return			true if the array contains four consecutive integers with the same value, either
	 * 					horizontally, vertically, or diagonally. Otherwise, false.
	 */
	public static boolean isConsecutiveFour(int[][] values)
	{
		if (isMatrix(values))
		{
			// Check horizontal
			for (int row = 0; row < values.length; row++)
			{
				if (values[row].length > 3)
				{
					int currentConsecutiveInteger = values[row][0];
					int countConsecutiveIntegers = 0;
					
					for (int col = 0; col < values[row].length; col++)
					{
						if (values[row][col] == currentConsecutiveInteger)
						{
							countConsecutiveIntegers++;
							
							if (countConsecutiveIntegers == 4)
							{
								return true;
							}
						}
						else if (col > (values[row].length - 4))
						{
							break;
						}
						else
						{
							currentConsecutiveInteger = values[row][col];
							countConsecutiveIntegers = 1;
						}
					}
				}
			}
			
			// Check vertical
			if (values.length > 3)
			{
				for (int col = 0; col < values[0].length; col++)
				{
					int currentConsecutiveInteger = values[0][col];
					int countConsecutiveIntegers = 0;
					
					for (int row = 0; row < values.length; row++)
					{
						if (values[row][col] == currentConsecutiveInteger)
						{
							countConsecutiveIntegers++;
							
							if (countConsecutiveIntegers == 4)
							{
								return true;
							}
						}
						else if (row > (values.length - 4))
						{
							break;
						}
						else
						{
							currentConsecutiveInteger = values[row][col];
							countConsecutiveIntegers = 1;
						}
					}
				}
			}
			
			if ((values.length > 3) && (values[0].length > 3))
			{
				// Check diagonal using rows
				for (int row = 0; row < (values.length - 3); row++)
				{
					int currentConsecutiveIntegerForMajorDiagonal = values[row][0];
					int countConsecutiveIntegersForMajorDiagonal = 0;
					int maxCols = (values.length > values[0].length) ? values[0].length : values.length;
					
					for (int col = 0, reverseCol = (values[0].length - 1);
							(col < maxCols) && (reverseCol >= 0) && ((row + col) < maxCols);
							col++, reverseCol--)
					{
						if (values[row + col][col] == currentConsecutiveIntegerForMajorDiagonal)
						{
							countConsecutiveIntegersForMajorDiagonal++;
							
							if (countConsecutiveIntegersForMajorDiagonal == 4)
							{
								return true;
							}
						}
						else if ((row + col) > (maxCols - 4))
						{
							break;
						}
						else
						{
							currentConsecutiveIntegerForMajorDiagonal = values[row + col][col];
							countConsecutiveIntegersForMajorDiagonal = 1;
						}
					}
					
					int currentConsecutiveIntegerForSubDiagonal = values[row][values[0].length - 1];
					int countConsecutiveIntegersForSubDiagonal = 0;
					
					for (int col = 0, reverseCol = (values[0].length - 1);
							(col < maxCols) && (reverseCol >= 0) && ((row + col) < maxCols);
							col++, reverseCol--)
					{
						if (values[row + col][reverseCol] == currentConsecutiveIntegerForSubDiagonal)
						{
							countConsecutiveIntegersForSubDiagonal++;
							
							if (countConsecutiveIntegersForSubDiagonal == 4)
							{
								return true;
							}
						}
						else if ((row + col) > (maxCols - 4))
						{
							break;
						}
						else
						{
							currentConsecutiveIntegerForSubDiagonal = values[row + col][reverseCol];
							countConsecutiveIntegersForSubDiagonal = 1;
						}
					}
				}
				
				// Check diagonal using columns
				for (int col = 1, reverseCol = (values[0].length - 2);
						(col < (values[0].length - 3)) && (reverseCol >= 3);
						col++, reverseCol--)
				{
					int currentConsecutiveIntegerForMajorDiagonal = values[0][col];
					int currentConsecutiveIntegerForSubDiagonal = values[0][reverseCol];
					int countConsecutiveIntegersForMajorDiagonal = 0, countConsecutiveIntegersForSubDiagonal = 0;
					int maxRows = (values.length > values[0].length) ? values[0].length : values.length;
					
					for (int row = 0; (row < maxRows) && ((row + col) < maxRows); row++)
					{
						if (values[row][row + col] == currentConsecutiveIntegerForMajorDiagonal)
						{
							countConsecutiveIntegersForMajorDiagonal++;
							
							if (countConsecutiveIntegersForMajorDiagonal == 4)
							{
								return true;
							}
						}
						else
						{
							currentConsecutiveIntegerForMajorDiagonal = values[row][row + col];
							countConsecutiveIntegersForMajorDiagonal = 1;
						}
						
						if (values[row][reverseCol - row] == currentConsecutiveIntegerForSubDiagonal)
						{
							countConsecutiveIntegersForSubDiagonal++;
							
							if (countConsecutiveIntegersForSubDiagonal == 4)
							{
								return true;
							}
						}
						else
						{
							currentConsecutiveIntegerForSubDiagonal = values[row][reverseCol - row];
							countConsecutiveIntegersForSubDiagonal = 1;
						}
					}
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Returns if the integer two-dimensional array argument is a matrix.
	 * 
	 * @param matrix	array of integer values in a matrix
	 * @return			true if the argument is a matrix. Otherwise, false.
	 */
	public static boolean isMatrix(int[][] matrix)
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