package junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.ShufflingRows;

/**
 * @author Tony Liang
 *
 */
public class ShufflingRowsTest
{
	int[][][] listsOfGroupOfIntegers =
		{
			new int[0][0],
			{
				{ 4, 2 }
			},
			{
				{ 0, 1, -8 },
				{ -4, 1, 9 }
			},
			{
				{ -3, 8, -1, 7, -5, -7, -10, 1 },
				{ -3, 10, 9 },
				{ 0, -3, 4, -6, 10, 8, 2 },
				{ 3, -7 },
				{ -2, 0, 9, 6 },
				{ 8, 5, -5, -7, -3 },
				{ },
				{ -7 }
			},
			{ 
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 },
				{ 7, 8 },
				{ 9, 10 }
			}
		};
	
	@Test
	public void testSwap()
	{
		for (int list = 0; list < listsOfGroupOfIntegers.length; list++)
		{	
			if (listsOfGroupOfIntegers[list].length > 1)
			{
				int row = (int)(Math.random() * listsOfGroupOfIntegers[list].length);
				int newRow = row;
				
				while (newRow == row)
				{
					newRow = (int)(Math.random() * listsOfGroupOfIntegers[list].length);
				}
				
				int[] originalRowElements = listsOfGroupOfIntegers[list][row];
				int[] originalNewRowElements = listsOfGroupOfIntegers[list][newRow];
				
				ShufflingRows.swap(listsOfGroupOfIntegers[list], row, newRow);
				
				assertTrue(Arrays.equals(listsOfGroupOfIntegers[list][newRow], originalRowElements));
				assertTrue(Arrays.equals(listsOfGroupOfIntegers[list][row], originalNewRowElements));
			}
		}
	}
}