package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TicTacToe;

/**
 * @author Tony Liang
 *
 */
public class TicTacToeTest
{
	int[][][] boards = {
			{
				{ -1, -1, -1 }, 
				{ -1, -1, -1 }, 
				{ -1, -1, -1 }
			},
			{
				{ 1, -1, -1 }, 
				{ 0, 1, 0 }, 
				{ -1, -1, 1 }
			},
			{
				{ 1, 1, 1 }, 
				{ 1, 1, 1 }, 
				{ 1, 1, 1 }
			},
			{
				{ 0, 0, 0 }, 
				{ 1, 1, -1 }, 
				{ -1, -1, -1 }
			},
			{
				{ 1, 0, 1 }, 
				{ 0, 1, 0 }, 
				{ 0, 1, 0 }
			},
			{
				{ -1, -1, 1 }, 
				{ -1, 0, -1 }, 
				{ -1, -1, -1 }
			}
		};
	boolean[] fullBoards = { false, false, true, false, true, false };
	int[] winners = { -1, 1, 1, 0, 2, -1 };
	
	@Test
	public void testIsFull()
	{
		for (int board = 0; board < boards.length; board++)
		{
			assertEquals(fullBoards[board], TicTacToe.isFull(boards[board]));
		}
	}
	
	@Test
	public void testWinner()
	{
		for (int board = 0; board < boards.length; board++)
		{
			assertEquals(winners[board], TicTacToe.winner(boards[board]));
		}
	}
}