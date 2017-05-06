package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ConnectFour
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		boolean player = (((int) (Math.random() * 2)) == 0);
		int winner = connectFour(player, input);
		
		input.close();
		
		if (winner == 1)
		{
			System.out.println("The red player won");
		}
		else if (winner == 2)
		{
			System.out.println("The yellow player won");
		}
		else
		{
			System.out.println("It's a draw");
		}
	}
	
	/**
	 * Returns the winner of the Connect Four game given the boolean and Scanner arguments.
	 * 
	 * @param player	the player to go first
	 * @param input		simple text scanner used to parse the column to place a colored disk
	 * @return			the winner of the Connect Four game
	 */
	public static int connectFour(boolean player, Scanner input)
	{
		final int ROWS = 6, COLUMNS = 7;
		int[][] disks = new int[ROWS][COLUMNS];
		boolean turn = player;
		int winner = -1;
		
		while ((winner < 0) || (winner > 2))
		{
			printConnectFourBoard(disks);
			
			System.out.println("----------------------");
			
			winner = connectFourWinner(disks);
			
			if ((winner == 1) || (winner == 2))
			{
				break;
			}
			else
			{
				int column = -1;
				
				while ((column < 0) || (column > 6))
				{
					System.out.print("Drop a ");
					
					if (turn)
					{
						System.out.print("red");
					}
					else
					{
						System.out.print("yellow");
					}
					
					System.out.print(" disk at column (0–6): ");
					column = input.nextInt();
					
					if ((column >= 0) && (column < 7))
					{
						if ((disks[0][column] == 1) || (disks[0][column] == 2))
						{
							column = -1;
						}
					}
				}
				
				for (int row = (disks.length - 1); row >= 0; row--)
				{
					if ((disks[row][column] < 1) || (disks[row][column] > 2))
					{
						if (turn)
						{
							disks[row][column] = 1;
						}
						else
						{
							disks[row][column] = 2;
						}
						
						break;
					}
				}
				
				turn = !turn;
			}
			
			if (isInArray(disks, 0))
			{
				winner = -1;
			}
		}
		
		return winner;
	}
	
	/**
	 * Returns the winner of the Connect Four game given the integer two-dimensional array argument.
	 * <ul>
	 * 	<li>
	 * 		If the number of rows is not 6 and the number of columns is not 7 or the array argument is a jagged
	 * 		array, it will default to no winner.
	 * 	</li>
	 * 	<li>
	 * 		If the array contains four consecutive integers with the same value (Either 1(Red) or 2(Yellow)),
	 * 		either horizontally, vertically, or diagonally, then the winner is determined.
	 * 	</li>
	 * </ul>
	 * 
	 * @param disks		array of red and yellow disks' positions
	 * @return			the winner of the Connect Four game
	 * <ul>
	 * 	<li>
	 * 		If the winner is 0, no winner is chosen. Continue playing.
	 * 	</li>
	 * 	<li>
	 * 		If the winner is 1, the red player is the winner.
	 * 	</li>
	 * 	<li>
	 * 		If the winner is 2, the yellow player is the winner.
	 * 	</li>
	 * </ul>
	 */
	public static int connectFourWinner(int[][] disks)
	{
		if (isMatrix(disks) && (disks.length == 6) && (disks[0].length == 7))
		{
			// Check horizontal
			for (int row = 0; row < disks.length; row++)
			{
				if (disks[row].length > 3)
				{
					int currentConsecutiveInteger = disks[row][0];
					int countConsecutiveIntegers = 0;
					
					for (int col = 0; col < disks[row].length; col++)
					{
						if (disks[row][col] == currentConsecutiveInteger)
						{
							countConsecutiveIntegers++;
							
							if ((countConsecutiveIntegers == 4) &&
									((currentConsecutiveInteger == 1) || (currentConsecutiveInteger == 2)))
							{
								return currentConsecutiveInteger;
							}
						}
						else if (col > (disks[row].length - 4))
						{
							break;
						}
						else
						{
							currentConsecutiveInteger = disks[row][col];
							countConsecutiveIntegers = 1;
						}
					}
				}
			}
			
			// Check vertical
			if (disks.length > 3)
			{
				for (int col = 0; col < disks[0].length; col++)
				{
					int currentConsecutiveInteger = disks[0][col];
					int countConsecutiveIntegers = 0;
					
					for (int row = 0; row < disks.length; row++)
					{
						if (disks[row][col] == currentConsecutiveInteger)
						{
							countConsecutiveIntegers++;
							
							if ((countConsecutiveIntegers == 4) &&
									((currentConsecutiveInteger == 1) || (currentConsecutiveInteger == 2)))
							{
								return currentConsecutiveInteger;
							}
						}
						else if (row > (disks.length - 4))
						{
							break;
						}
						else
						{
							currentConsecutiveInteger = disks[row][col];
							countConsecutiveIntegers = 1;
						}
					}
				}
			}
			
			if ((disks.length > 3) && (disks[0].length > 3))
			{
				// Check diagonal using rows
				for (int row = 0; row < (disks.length - 3); row++)
				{
					int currentConsecutiveIntegerForMajorDiagonal = disks[row][0];
					int countConsecutiveIntegersForMajorDiagonal = 0;
					
					for (int currentRow = row, col = 0; (currentRow < disks.length) && (col < disks[0].length);
							currentRow++, col++)
					{
						if (disks[currentRow][col] == currentConsecutiveIntegerForMajorDiagonal)
						{
							countConsecutiveIntegersForMajorDiagonal++;
							
							if ((countConsecutiveIntegersForMajorDiagonal == 4) &&
									((currentConsecutiveIntegerForMajorDiagonal == 1) ||
											(currentConsecutiveIntegerForMajorDiagonal == 2)))
							{
								return currentConsecutiveIntegerForMajorDiagonal;
							}
						}
						else if (currentRow > (disks.length - 4))
						{
							break;
						}
						else
						{
							currentConsecutiveIntegerForMajorDiagonal = disks[currentRow][col];
							countConsecutiveIntegersForMajorDiagonal = 1;
						}
					}
					
					int currentConsecutiveIntegerForSubDiagonal = disks[row][disks[0].length - 1];
					int countConsecutiveIntegersForSubDiagonal = 0;
					
					for (int currentRow = row, reverseCol = (disks[0].length - 1);
							(currentRow < disks.length) && (reverseCol >= 0); currentRow++, reverseCol--)
					{
						if (disks[currentRow][reverseCol] == currentConsecutiveIntegerForSubDiagonal)
						{
							countConsecutiveIntegersForSubDiagonal++;
							
							if ((countConsecutiveIntegersForSubDiagonal == 4) &&
									((currentConsecutiveIntegerForSubDiagonal == 1) ||
											(currentConsecutiveIntegerForSubDiagonal == 2)))
							{
								return currentConsecutiveIntegerForSubDiagonal;
							}
						}
						else if (currentRow > (disks.length - 4))
						{
							break;
						}
						else
						{
							currentConsecutiveIntegerForSubDiagonal = disks[currentRow][reverseCol];
							countConsecutiveIntegersForSubDiagonal = 1;
						}
					}
				}
				
				// Check diagonal using columns
				for (int col = 1, reverseCol = (disks[0].length - 2);
						(col < (disks[0].length - 3)) && (reverseCol >= 3);
						col++, reverseCol--)
				{
					int currentConsecutiveIntegerForMajorDiagonal = disks[0][col];
					int currentConsecutiveIntegerForSubDiagonal = disks[0][reverseCol];
					int countConsecutiveIntegersForMajorDiagonal = 0,
							countConsecutiveIntegersForSubDiagonal = 0;
					
					for (int row = 0, currentColumn = col, currentReverseColumn = reverseCol;
							(row < disks.length) && (currentColumn < disks[0].length) &&
							(currentReverseColumn >= 0);
							row++, currentColumn++, currentReverseColumn--)
					{
						if (disks[row][currentColumn] == currentConsecutiveIntegerForMajorDiagonal)
						{
							countConsecutiveIntegersForMajorDiagonal++;
							
							if ((countConsecutiveIntegersForMajorDiagonal == 4) &&
									((currentConsecutiveIntegerForMajorDiagonal == 1) ||
											(currentConsecutiveIntegerForMajorDiagonal == 2)))
							{
								return currentConsecutiveIntegerForMajorDiagonal;
							}
						}
						else
						{
							currentConsecutiveIntegerForMajorDiagonal = disks[row][currentColumn];
							countConsecutiveIntegersForMajorDiagonal = 1;
						}
						
						if (disks[row][currentReverseColumn] == currentConsecutiveIntegerForSubDiagonal)
						{
							countConsecutiveIntegersForSubDiagonal++;
							
							if ((countConsecutiveIntegersForSubDiagonal == 4) &&
									((currentConsecutiveIntegerForSubDiagonal == 1) ||
											(currentConsecutiveIntegerForSubDiagonal == 2)))
							{
								return currentConsecutiveIntegerForSubDiagonal;
							}
						}
						else
						{
							currentConsecutiveIntegerForSubDiagonal = disks[row][currentReverseColumn];
							countConsecutiveIntegersForSubDiagonal = 1;
						}
					}
				}
			}
		}
		
		return 0;
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
	
	/**
	 * Returns if the integer argument is in the integer two-dimensional array argument.
	 * 
	 * @param array		array of group of integers
	 * @param number	the number to search for
	 * @return			true if the number is in the array. Otherwise, false.
	 */
	public static boolean isInArray(int[][] array, int number)
	{
		for (int row = 0; row < array.length; row++)
		{
			for (int col = 0; col < array[row].length; col++)
			{
				if (array[row][col] == number)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Displays the Connect Four board with red and yellow disks given the integer two-dimensional array argument.
	 * <ul>
	 * 	<li>
	 * 		The board will only display if the number of rows is 6 and the number of columns is 7.
	 * 	</li>
	 * </ul>
	 * 
	 * @param disks		array of red and yellow disks' positions
	 */
	public static void printConnectFourBoard(int[][] disks)
	{
		if (isMatrix(disks) && (disks.length == 6) && (disks[0].length == 7))
		{
			for (int row = 0; row < disks.length; row++)
			{
				for (int col = 0; col < disks[row].length; col++)
				{
					System.out.print("|");
					
					if (disks[row][col] == 1)
					{
						System.out.print("R");
					}
					else if (disks[row][col] == 2)
					{
						System.out.print("Y");
					}
					else
					{
						System.out.print(" ");
					}
					
					if (col == (disks[row].length - 1))
					{
						System.out.println("|");
					}
				}
			}
		}
	}
}