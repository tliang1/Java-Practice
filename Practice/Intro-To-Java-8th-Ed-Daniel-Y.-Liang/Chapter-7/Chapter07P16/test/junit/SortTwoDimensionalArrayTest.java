/**
 * 
 */
package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.SortTwoDimensionalArray;

/**
 * @author Tony Liang
 *
 */
public class SortTwoDimensionalArrayTest
{
	int[][][] numbers =
		{
			new int[0][0],
			{
				{ 5 },
				{ 0, 0, 0 },
				{ 1, 2 },
				{ 0, 0 },
				{ 0 },
				{ 3, 4, 5, 6 },
				{ 1, 2 },
				{ 1, 2, 3 },
				{ 0, 0 },
				{ 6, 9, 3 } 
			},
			{
				{ 4, 2 },
				{ 1, 7 },
				{ 4, 5 },
				{ 1, 2 },
				{ 1, 1 },
				{ 4, 1 }
			},
			{
				{ -5, 9, -8, 7, 4 },
				{ -7, 5, 8, 4, 1 },
				{ -9, 9, 7, 4, -1 },
				{ -4, 1, 8, 4, 0 },
				{ -2, -6, -10, 1, 2 },
				{ -3, -5, -9, 7, -8 },
				{ 5, -4, -5, 1, 2 },
				{ -3, -4, -10, -2, 9 },
				{ 7, -5, -6, -2, 10 },
				{ -8, 3, 2, 9, 6 }
			},
			{
				{ -7, -8, -10, 5, 2 },
				{ 3, 7, 1 },
				{ -1, 7 },
				{ -7, -2, -9, 2 },
				{ 2 },
				{ 6, -10 },
				{ 1, 0, 9, 6 },
				{ 0 },
				{ -1, 1, 4 },
				{ -3, 2, 6, -7, 1 }
			}
		};
	
	@Test
	public void testSort()
	{
		for (int array = 0; array < numbers.length; array++)
		{
			SortTwoDimensionalArray.sort(numbers[array]);
		}
		
		boolean allSorted = true;
		
		for (int[][] array : numbers)
		{
			for (int row = 0; row < (array.length - 1); row++)
			{
				int[] group = array[row];
				int[] nextGroup = array[row + 1];
				
				if (group.length == nextGroup.length)
				{
					for (int col = 0; col < group.length; col++)
					{
						if (group[col] != nextGroup[col])
						{
							if (group[col] > nextGroup[col])
							{
								allSorted = false;
							}
							
							break;
						}
					}
				}
				
				if (!allSorted)
				{
					break;
				}
			}
			
			if (!allSorted)
			{
				break;
			}
		}
		
		assertEquals(true, allSorted);
	}
}