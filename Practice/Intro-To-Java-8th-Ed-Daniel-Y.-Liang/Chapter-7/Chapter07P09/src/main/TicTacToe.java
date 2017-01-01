package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class TicTacToe
{
	public static void main(String[] args)
	{
		int winner = playTicTacToe();
		
		if (winner == 0)
		{
			System.out.println("O player won");
		}
		else if (winner == 1)
		{
			System.out.println("X player won");
		}
		else
		{
			System.out.println("No players won. It's a draw.");
		}
	}
	
	/**
	 * Returns the winner of the TicTacToe game.
	 * 
	 * @return	the winner of the TicTacToe game
	 */
	public static int playTicTacToe()
	{
		Scanner input = new Scanner(System.in);
		
		int[][] ticTacToeBoard = { { -1, -1, -1 }, { -1, -1, -1 }, { -1, -1, -1 } };
		boolean playerStart = ((int)(Math.random() * 2) != 0);
		int winner = -1;
		
		printTicTacToeBoard(ticTacToeBoard);
		
		while (winner == -1)
		{
			System.out.print("Enter a row (1, 2, or 3) for player ");
			
			if (playerStart)
			{
				System.out.print("X: ");
			}
			else
			{
				System.out.print("O: ");
			}
			
			int row = input.nextInt();
			
			System.out.print("Enter a column (1, 2, or 3) for player ");
			
			if (playerStart)
			{
				System.out.print("X: ");
			}
			else
			{
				System.out.print("O: ");
			}
			
			int column = input.nextInt();
			
			if (ticTacToeBoard[row - 1][column - 1] < 0)
			{
				ticTacToeBoard[row - 1][column - 1] = playerStart ? 1 : 0;
				playerStart = !playerStart;
				winner = winner(ticTacToeBoard);
				printTicTacToeBoard(ticTacToeBoard);
			}
			else
			{
				System.out.println("Row " + row + " Colummn " + column + " is not a available cell.");
			}
		}
		
		input.close();
		
		return winner;
	}
	
	/**
	 * Displays the TicTacToe board given the integer two-dimensional array argument.
	 * <p>
	 * If the integer two-dimensional array's number of rows and columns are not equal to 3, then a empty TicTacToe
	 * board is displayed.
	 * 
	 * @param board		array of integer values in the TicTacToe board
	 */
	public static void printTicTacToeBoard(int[][] board)
	{
		boolean validBoard = false;
		
		if ((board.length == 3) && (board[0].length == 3))
		{
			validBoard = true;
		}
		
		System.out.println("-------------");
		
		for (int row = 0; row < board.length; row++)
		{
			System.out.print("|");
			
			for (int column = 0; column < board[row].length; column++)
			{
				if (validBoard)
				{
					if (board[row][column] == 0)
					{
						System.out.print(" O |");
					}
					else if (board[row][column] == 1)
					{
						System.out.print(" X |");
					}
					else
					{
						System.out.print("   |");
					}
				}
				else
				{
					System.out.print("   |");
				}
			}
			
			System.out.println();
			System.out.println("-------------");
		}
	}
	
	/**
	 * Returns the winner of the TicTacToe game given the integer two-dimensional array argument.
	 * 
	 * @param board		array of integer values in the TicTacToe board
	 * @return			the winner of the TicTacToe game
	 * <p>
	 * If the winner is -1, no winner is chosen. Continue playing.
	 * <br>
	 * If the winner is 0, O is the winner.
	 * <br>
	 * If the winner is 1, X is the winner.
	 * <br>
	 * If the winner is 2, there is no winner. It's a draw.
	 */
	public static int winner(int[][] board)
	{
		int winner = -1;
		
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
							return XOrO;
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
							return XOrO;
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
						return XOrOMajorDiagonal;
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
						return XOrOMinorDiagonal;
					}
				}
			}
		}
		
		if (isFull(board))
		{
			winner = 2;
		}
		
		return winner;
	}
	
	/**
	 * Returns if the TicTacToe board is full given the integer two-dimensional array argument.
	 * 
	 * @param board		array of integer values in the TicTacToe board
	 * @return			true if the TicTacToe board is full. Otherwise, false.
	 */
	public static boolean isFull(int[][] board)
	{
		for (int row = 0; row < board.length; row++)
		{
			for (int column = 0; column < board[0].length; column++)
			{
				if ((board[row][column] < 0) || (board[row][column] > 1))
				{
					return false;
				}
			}
		}
		
		return true;
	}
}