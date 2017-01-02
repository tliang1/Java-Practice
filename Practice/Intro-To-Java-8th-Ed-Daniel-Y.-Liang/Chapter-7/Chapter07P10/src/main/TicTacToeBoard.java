package main;

/**
 * @author Tony Liang
 *
 */
public class TicTacToeBoard
{
	public static void main(String[] args)
	{
		final int ROWS = 3;
		final int COLUMNS = 3;
		int[][] ticTacToeBoard = new int[ROWS][COLUMNS];
		
		for (int row = 0; row < ROWS; row++)
		{
			for (int column = 0; column < COLUMNS; column++)
			{
				ticTacToeBoard[row][column] = (int) (Math.random() * 2);
			}
		}
		
		printTicTacToeBoard(ticTacToeBoard);
		all0sOr1s(ticTacToeBoard);
	}
	
	/**
	 * Displays the TicTacToe board given the integer two-dimensional array argument.
	 * 
	 * @param board		array of integer values in the TicTacToe board
	 */
	public static void printTicTacToeBoard(int[][] board)
	{
		for (int row = 0; row < board.length; row++)
		{
			for (int column = 0; column < board[row].length; column++)
			{
				System.out.print(board[row][column]);
			}
			
			System.out.println();
		}
	}
	
	/**
	 * Find and displays the rows, columns, or diagonals with all 0s or 1s given the integer two-dimensional array
	 * argument.
	 * 
	 * @param board		array of integer values in the TicTacToe board
	 */
	public static void all0sOr1s(int[][] board)
	{
		for (int row = 0; row < board.length; row++)
		{
			if ((board[row][0] == 0) || (board[row][0] == 1))
			{
				int XOrO = board[row][0];
				int count = 1;
				
				for (int column = 1; column < board[row].length; column++)
				{
					if (board[row][column] == XOrO)
					{
						count++;
						
						if (count == 3)
						{
							System.out.println("All " + XOrO + "s on row " + row);
						}
					}
				}
			}
		}
		
		for (int column = 0; column < board[0].length; column++)
		{
			if ((board[0][column] == 0) || (board[0][column] == 1))
			{
				int XOrO = board[0][column];
				int count = 1;
				
				for (int row = 1; row < board.length; row++)
				{
					if (board[row][column] == XOrO)
					{
						count++;
						
						if (count == 3)
						{
							System.out.println("All " + XOrO + "s on column " + column);
						}
					}
				}
			}
		}
		
		int XOrOMajorDiagonal = board[0][0];
		int XOrOMinorDiagonal = board[0][2];
		int majorCount = 1;
		int minorCount = 1;
		
		for (int row = 1, majorColumn = 1, minorColumn = 1; row < board.length; 
				row++, majorColumn++, minorColumn--)
		{
			if ((XOrOMajorDiagonal == 0) || (XOrOMajorDiagonal == 1))
			{
				if (board[row][majorColumn] == XOrOMajorDiagonal)
				{
					majorCount++;
					
					if (majorCount == 3)
					{
						System.out.println("All " + XOrOMajorDiagonal + "s on major diagonal");
					}
				}
			}
			
			if ((XOrOMinorDiagonal == 0) || (XOrOMinorDiagonal == 1))
			{
				if (board[row][minorColumn] == XOrOMinorDiagonal)
				{
					minorCount++;
					
					if (minorCount == 3)
					{
						System.out.println("All " + XOrOMinorDiagonal + "s on minor diagonal");
					}
				}
			}
		}
	}
}