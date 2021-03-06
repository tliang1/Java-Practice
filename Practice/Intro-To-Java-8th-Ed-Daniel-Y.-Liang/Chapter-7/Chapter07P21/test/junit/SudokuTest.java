package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Sudoku;

/**
 * @author Tony Liang
 *
 */
public class SudokuTest
{
	int[][][] listsOfSudokuPuzzles =
		{
				new int[0][0],
				{
					{ 0, 1, 2 },
					{ 3, 4, 5 },
					{ 6, 7, 8 }
				},
				{
					{ 0, 1, 2, 3, 4, 5, 6, 7, 8 },
					{ 0, 1, 2, 3, 4, 5, 6, 7 },
					{ 0, 1, 2, 3, 4, 5, 6},
					{ 0, 1, 2, 3, 4, 5 },
					{ 0, 1, 2, 3, 4 },
					{ 0, 1, 2, 3 },
					{ 0, 1, 2 },
					{ 0, 1 },
					{ 0 }
				},
				{
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 1, 2, 3, -4, 5, 6, 7, 8 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }
				},
				{
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 1, 2, 3, 4, 5, 6, 15, 8 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }
				},
				{
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 5, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 5, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 5, 0, 0, 0, 5, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }
				},
				{
					{ 0, 6, 0, 1, 0, 4, 0, 5, 0 },
					{ 0, 0, 8, 3, 0, 5, 6, 0, 0 },
					{ 2, 0, 0, 0, 0, 0, 0, 0, 1 },
					{ 8, 0, 0, 4, 0, 7, 0, 0, 6 },
					{ 0, 0, 6, 0, 0, 0, 3, 0, 0 },
					{ 7, 0, 0, 9, 0, 1, 0, 0, 4 },
					{ 5, 0, 0, 0, 0, 0, 0, 0, 2 },
					{ 0, 0, 7, 2, 0, 6, 9, 0, 0 },
					{ 0, 4, 0, 5, 0, 8, 0, 7, 0 }
				},
				{
					{ 9, 6, 3, 1, 7, 4, 2, 5, 8 },
					{ 1, 7, 8, 3, 2, 5, 6, 4, 9 },
					{ 2, 5, 4, 6, 8, 9, 7, 3, 1 }, 
					{ 8, 2, 1, 4, 3, 7, 5, 9, 6 },
					{ 4, 9, 6, 8, 5, 2, 3, 1, 7 },
					{ 7, 3, 5, 9, 6, 1, 8, 2, 4 },
					{ 5, 8, 9, 7, 1, 3, 4, 6, 2 },
					{ 3, 1, 7, 2, 4, 6, 9, 8, 5 },
					{ 6, 4, 2, 5, 9, 8, 1, 7, 3 }
				},
				{
					{ 0, 0, 0, 4, 5, 6, 7, 8, 9 },
					{ 6, 7, 9, 8, 1, 3, 2, 4, 5 },
					{ 5, 4, 8, 9, 2, 7, 1, 3, 6 },
					{ 0, 0, 0, 5, 9, 4, 6, 7, 8 },
					{ 8, 5, 7, 3, 6, 1, 4, 9, 2 },
					{ 9, 6, 4, 7, 8, 2, 5, 1, 3 },
					{ 0, 0, 0, 6, 4, 8, 9, 5, 7 },
					{ 7, 9, 6, 1, 3, 5, 8, 2, 4 },
					{ 4, 8, 5, 2, 7, 9, 3, 6, 1 }
				},
				{
					{ 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 
					{ 6, 7, 9, 8, 1, 3, 2, 4, 5 },
					{ 5, 4, 8, 9, 2, 7, 1, 3, 6 },
					{ 2, 3, 1, 5, 9, 4, 6, 7, 8 },
					{ 8, 5, 7, 3, 6, 1, 4, 9, 2 },
					{ 9, 6, 4, 7, 8, 2, 5, 1, 3 },
					{ 3, 1, 2, 6, 4, 8, 9, 5, 7 },
					{ 7, 9, 6, 1, 3, 5, 8, 2, 4 },
					{ 4, 8, 5, 2, 7, 9, 3, 6, 1 }
				}
		};
	int[][][] listsOfFreeCells =
		{
			new int[0][0],
			new int[0][0],
			new int[0][0],
			new int[0][0],
			new int[0][0],
			new int[0][0],
			{
				{ 0, 0 }, { 0, 2 }, { 0, 4 }, { 0, 6 }, { 0, 8 },
				{ 1, 0 }, { 1, 1 }, { 1, 4 }, { 1, 7 }, { 1, 8 },
				{ 2, 1 }, { 2, 2 }, { 2, 3 }, { 2, 4 }, { 2, 5 }, { 2, 6 }, { 2, 7 },
				{ 3, 1 }, { 3, 2 }, { 3, 4 }, { 3, 6 }, { 3, 7 },
				{ 4, 0 }, { 4, 1 }, { 4, 3 }, { 4, 4 }, { 4, 5 }, { 4, 7 }, { 4, 8 },
				{ 5, 1 }, { 5, 2 }, { 5, 4 }, { 5, 6 }, { 5, 7 },
				{ 6, 1 }, { 6, 2 }, { 6, 3 }, { 6, 4 }, { 6, 5 }, { 6, 6 }, { 6, 7 },
				{ 7, 0 }, { 7, 1 }, { 7, 4 }, { 7, 7 }, { 7, 8 },
				{ 8, 0 }, { 8, 2 }, { 8, 4 }, { 8, 6 }, { 8, 8 }
			},
			new int[0][0],
			{
				{ 0, 0 }, { 0, 1 }, { 0, 2 },
				{ 3, 0 }, { 3, 1 }, { 3, 2 },
				{ 6, 0 }, { 6, 1 }, { 6, 2 }
			},
			new int[0][0]
		};
	boolean[] validSudokusOrNot = { false, false, false, false, false, false, true, true, true, true };
	
	@Test
	public void testIsValid()
	{
		for (int list = 0; list < listsOfSudokuPuzzles.length; list++)
		{	
			assertEquals(validSudokusOrNot[list], Sudoku.isValid(listsOfSudokuPuzzles[list]));
		}
	}
	
	@Test
	public void testGetFreeCellList()
	{
		for (int list = 0; list < listsOfSudokuPuzzles.length; list++)
		{
			int[][] listOfFreeCells = Sudoku.getFreeCellList(listsOfSudokuPuzzles[list]);
			
			for (int cell = 0; cell < listOfFreeCells.length; cell++)
			{
				assertArrayEquals(listOfFreeCells[cell], listsOfFreeCells[list][cell]);
			}
		}
	}
}