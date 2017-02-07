package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class Sudoku
{
	public static void main(String[] args)
	{
		 int[][] grid = readAPuzzle();
		 
		 if (!isValid(grid))
		 {
			 System.out.println("Invalid input");
		 }
		 else
		 {
			 System.out.print("The total number of solutions for the Sudoku puzzle is " + search(grid, 2));
		 }
	}
	
	/**
	 * Returns the Sudoku puzzle retrieved by the user's input.
	 * <ul>
	 * 	<li>
	 * 		If the Sudoku puzzle has numbers that are negative or greater than 9, the user must reenter the Sudoku
	 * 		puzzle.
	 * 	</li>
	 * </ul>
	 * 
	 * @return	the Sudoku puzzle
	 */
	public static int[][] readAPuzzle()
	{
		Scanner input = new Scanner(System.in);
		
		final int ROWS = 9, COLUMNS = 9;
		int[][] grid = new int[ROWS][COLUMNS];
		boolean validSudokuPuzzle = false;
		
		while (!validSudokuPuzzle)
		{
			validSudokuPuzzle = true;
			
			System.out.println("Enter a Sudoku puzzle:");
			
			for (int row = 0; row < ROWS; row++)
			{
				for (int col = 0; col < COLUMNS; col++)
				{
					grid[row][col] = input.nextInt();
					
					if ((grid[row][col] < 0) || (grid[row][col] > 9))
					{
						validSudokuPuzzle = false;
					}
				}
			}
		}
		
		input.close();
		
		return grid;
	}
	
	/**
	 * Returns the array of positions of every empty cell given the integer two-dimensional array argument.
	 * <ul>
	 * 	<li>
	 * 		If the grid is invalid, an empty array will be returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param grid	the Sudoku puzzle
	 * @return		array of positions of empty cells
	 */
	public static int[][] getFreeCellList(int[][] grid)
	{
		int[][] freeCellList = new int[0][0];
		
		if (isValid(grid))
		{
			int numberOfFreeCells = 0;
			
			for (int row = 0; row < grid.length; row++)
			{
				for (int col = 0; col < grid[row].length; col++)
				{
					if (grid[row][col] == 0)
					{
						numberOfFreeCells++;
					}
				}
			}
			
			freeCellList = new int[numberOfFreeCells][2];
			int count = 0;
			
			for (int row = 0; row < grid.length; row++)
			{
				for (int col = 0; col < grid[row].length; col++)
				{
					if (grid[row][col] == 0)
					{
						freeCellList[count][0] = row;
						freeCellList[count][1] = col;
						count++;
					}
				}
			}
		}
		
		return freeCellList;
	}
	
	/**
	 * Returns the number of solutions for the given Sudoku puzzle and displays up to the number of solutions
	 * given from the integer argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is less than 1, it will default to 1.
	 * 	</li>
	 * 	<li>
	 * 		If the grid is invalid, the number of solutions will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param grid						the Sudoku puzzle
	 * @param maxSolutionsToDisplay		max number of solutions to display
	 * @return							the number of solutions
	 */
	public static int search(int[][] grid, int maxSolutionsToDisplay)
	{
		if (maxSolutionsToDisplay < 1)
		{
			maxSolutionsToDisplay = 1;
		}
		
		int numberOfSolutions = 0;
		
		if (isValid(grid))
		{
			int[][] freeCellList = getFreeCellList(grid);
			
			if (freeCellList.length == 0)
			{
				numberOfSolutions++;
				
				printGrid(grid);
				
				return numberOfSolutions;
			}
			
			int cellRow = 0;
			
			while (true)
			{
				int row = freeCellList[cellRow][0];
				int col = freeCellList[cellRow][1];
				
				if (grid[row][col] == 0)
				{
					grid[row][col] = 1;
				}
				
				if (isValid(row, col, grid))
				{
					// A solution is found
					if ((cellRow + 1) == freeCellList.length)
					{
						numberOfSolutions++;
						
						if (numberOfSolutions <= maxSolutionsToDisplay)
						{
							System.out.println("Solution " + numberOfSolutions + ": ");
							
							printGrid(grid);
						}
						
						if (grid[row][col] < 9)
						{
							grid[row][col] = grid[row][col] + 1;
						}
						else
						{
							return numberOfSolutions;
						}
					}
					else
					{
						cellRow++;
					}
				}
				else if (grid[row][col] < 9)
				{
					grid[row][col] = grid[row][col] + 1;
				}
				else
				{
					// Backtrack if all values can't be valid in that position
					while (grid[row][col] == 9)
					{
						if (cellRow == 0)
						{
							return numberOfSolutions; 
						}
						
						grid[row][col] = 0;
						cellRow--;
						row = freeCellList[cellRow][0];
						col = freeCellList[cellRow][1];
					}
					
					grid[row][col] = grid[row][col] + 1;
				}
			}
		}
		
		return numberOfSolutions;
	}
	
	/**
	 * Returns if the element in the specified row and column of the integer two-dimensional array argument is
	 * valid for the Sudoku puzzle.
	 * <p>
	 * If any of the following below is true, the element will default to being invalid.
	 * <ul>
	 * 	<li>
	 * 		The grid's number of rows and columns is not 9.
	 * 	</li>
	 * 	<li>
	 * 		The grid contains an integer that is negative or greater than 9.
	 * 	</li>
	 * 	<li>
	 * 		The grid already contains the same integer in the same row as the specified row.
	 * 	</li>
	 * 	<li>
	 * 		The grid already contains the same integer in the same column as the specified column.
	 * 	</li>
	 * 	<li>
	 * 		The element occurs more than once in its 3X3 grid.
	 * 	</li>
	 * </ul>
	 * 
	 * @param cellRow		the row to check
	 * @param cellColumn	the column to check
	 * @param grid			the Sudoku puzzle
	 * @return				true if the element is valid. Otherwise, false.
	 */
	public static boolean isValid(int cellRow, int cellColumn, int[][] grid)
	{
		if (isMatrix(grid) && (grid.length == 9) && (grid[0].length == 9))
		{
			for (int row = 0; row < grid.length; row++)
			{
				for (int col = 0; col < grid[row].length; col++)
				{
					if ((grid[row][col] < 0) || (grid[row][col] > 9))
					{
						return false;
					}
				}
			}
			
			if ((cellRow >= 0) && (cellRow < grid.length) && (cellColumn >= 0) && (cellColumn < grid[0].length))
			{
				// Checks columns of the cellRow
				for (int column = 0; column < grid[0].length; column++)
				{
					if ((column != cellColumn) && (grid[cellRow][column] == grid[cellRow][cellColumn]))
					{
						return false;
					}
				}
				
				// Checks rows of the cellColumn
				for (int row = 0; row < grid.length; row++)
				{
					if ((row != cellRow) && (grid[row][cellColumn] == grid[cellRow][cellColumn]))
					{
						return false;
					}
				}
				
				// Checks rows and columns in the 3 by 3 box
				for (int row = ((cellRow / 3) * 3); row < (((cellRow / 3) * 3) + 3); row++)
				{
					for (int col = ((cellColumn / 3) * 3); col < (((cellColumn / 3) * 3) + 3); col++)
					{
						if ((row != cellRow) && (col != cellColumn) &&
								(grid[row][col] == grid[cellRow][cellColumn]))
						{
							return false;
						}
					}
				}
				
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Returns if the integer two-dimensional array argument's fixed cells are valid.
	 * <p>
	 * If any of the following below is true, the grid will default to being invalid.
	 * <ul>
	 * 	<li>
	 * 		The grid's number of rows and columns are not 9.
	 * 	</li>
	 * 	<li>
	 * 		The grid contains an integer that is negative or greater than 9.
	 * 	</li>
	 * 	<li>
	 * 		The grid contains an integer between 1 and 9 inclusive that is in a position that is invalid for the
	 * 		Sudoku puzzle.
	 * 	</li>
	 * </ul>
	 * 
	 * @param grid	the Sudoku puzzle
	 * @return		true if the Sudoku puzzle has all valid fixed cells. Otherwise, false.
	 */
	public static boolean isValid(int[][] grid)
	{
		if (isMatrix(grid) && (grid.length == 9) && (grid[0].length == 9))
		{
			for (int row = 0; row < grid.length; row++)
			{
				for (int col = 0; col < grid[row].length; col++)
				{
					if ((grid[row][col] < 0) || (grid[row][col] > 9) || ((grid[row][col] != 0) &&
							(!isValid(row, col, grid))))
					{
						return false;
					}
				}
			}
			
			return true;
		}
		
		return false;
	}
	
	/**
	 * Displays the Sudoku puzzle grid given the integer two-dimensional array argument.
	 * <ul>
	 * 	<li>
	 * 		The grid will only display if it is valid.
	 * 	</li>
	 * </ul>
	 * 
	 * @param grid	the Sudoku puzzle
	 */
	public static void printGrid(int[][] grid)
	{
		if (isValid(grid))
		{
			for (int row = 0; row < grid.length; row++)
			{
				for (int col = 0; col < grid[row].length; col++)
				{
					System.out.print(grid[row][col] + " ");
				}
				
				System.out.println();
			}
		}
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