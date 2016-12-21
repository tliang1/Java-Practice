package main;

import java.util.Arrays;

/**
 * @author Tony Liang
 *
 */
public class EightQueens
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_QUEENS = 8;
		int[] queenPositions = new int[NUMBER_OF_QUEENS];
		Arrays.fill(queenPositions, 1, NUMBER_OF_QUEENS, -1);
		int queensPlaced = 1;
		
		while ((queensPlaced >= 0) && (queensPlaced < NUMBER_OF_QUEENS))
		{
			int column = findValidColumn(queensPlaced, queenPositions);
			
			if (column < 0)
			{
				queenPositions[queensPlaced] = -1;
				queensPlaced--;
		    }
			else
			{
				queenPositions[queensPlaced] = column;
				queensPlaced++;
			}
		}
		
		printChessboard(queenPositions);
	}

	/**
	 * Returns the valid column to place the queen given the integer argument and the integer array argument.
	 * <p>
	 * If the row is negative or greater than or equal to the integer array's size or if every column is invalid,
	 * the column will default to -1.
	 * 
	 * @param row				queen's row
	 * @param queenPositions	array of queens positions
	 * @return					the valid column for the queen in the specified row
	 */
	public static int findValidColumn(int row, int[] queenPositions)
	{
		if ((row < 0) || (row >= queenPositions.length))
		{
			return -1;
		}
		
		int currentColumn = ((queenPositions[row] < 0) || (queenPositions[row] >= queenPositions.length)) 
				? 0 : (queenPositions[row] + 1);
		
		for (int column = currentColumn; column < queenPositions.length; column++)
		{
			if (isValidQueenPosition(row, column, queenPositions))
			{
				return column;
			}
		}
		
		return -1;
	}
	
	/**
	 * Returns if the queen placed at (row, column) is valid given the integer arguments and the integer array 
	 * argument.
	 * <p>
	 * If the row and/or column is negative or greater than or equal to the integer array's size, the placement
	 * of the queen will default to being invalid.
	 * <p>
	 * A valid queen position is not in the same row, column, and diagonal of the other queens' positions in the
	 * integer array.
	 * 
	 * @param row				queen's row
	 * @param column			queen's column
	 * @param queenPositions	array of queens positions
	 * @return					true if the (row, column) is a valid position for placing the queen. Otherwise, 
	 * 							false.
	 */
	public static boolean isValidQueenPosition(int row, int column, int[] queenPositions)
	{
		if ((row < 0) || (row >= queenPositions.length) || (column < 0) || (column >= queenPositions.length))
		{
			return false;
		}
		
		// Invalid for same columns
		for (int r = 0; r < row; r++)
		{
			if (queenPositions[r] == column)
			{
				return false;
			}
		}
		
		// Invalid for same diagonal in the left side
		for (int r = row - 1, col = column - 1; (r >= 0) && (col >= 0); r--, col--)
		{
			if (queenPositions[r] == col)
			{
				return false;
			}
		}
		
		// Invalid for same diagonal in the right side
		for (int r = row - 1, col = column + 1; (r >= 0) && (col < queenPositions.length); r--, col++)
		{
			if (queenPositions[r] == col)
			{
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Prints the chessboard with the valid queens given by the integer array argument.
	 * 
	 * @param queenPositions	array of valid queens positions
	 */
	public static void printChessboard(int[] queenPositions)
	{
		for (int row = 0; row < queenPositions.length; row++)
		{
			for (int col = 0; col < queenPositions.length; col++)
			{
				if (queenPositions[row] == col)
				{
					System.out.print("|Q");
				}
				else
				{
					System.out.print("| ");
				}
			}
			
			System.out.println("|");
		}
	}
}