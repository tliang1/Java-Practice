package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class NineHeadsAndTails
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int ROWS = 3;
		final int COLUMNS = 3;
		final int COMBINATIONS = (int) (Math.pow(2, ROWS * COLUMNS));
		int[][][] coins = new int[COMBINATIONS][ROWS][COLUMNS];
		
		for (int state = 0; state < COMBINATIONS; state++)
		{
			int bitPosition = (ROWS * COLUMNS) - 1;
			int mask = 1;
			
			for (int row = 0; row < ROWS; row++)
			{	
				for (int column = 0; (column < COLUMNS) && (bitPosition >= 0); column++, bitPosition--)
				{
					int rightShiftedNumber = state >> bitPosition;
					coins[state][row][column] = rightShiftedNumber & mask;
				}
			}
		}
		
		System.out.print("Enter a number between 0 and 511: ");
		int number = input.nextInt();
		
		for (int row = 0; row < ROWS; row++)
		{
			for (int column = 0; column < COLUMNS; column++)
			{
				if (coins[number][row][column] == 0)
				{
					System.out.print("H ");
				}
				else
				{
					System.out.print("T ");
				}
			}
			
			System.out.println();
		}
		
		input.close();
	}
}