package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.SumOfMajorDiagonalInAMatrix;

/**
 * @author Tony Liang
 *
 */
public class SumOfMajorDiagonalInAMatrixTest
{
	int[][][] listsOfMatrices =
		{
			{ },
			new int[5][0],
			new int[0][10],
			{
				{ 1, 2, 3 },
				{ 1, 2 },
				{ 1 }
			},
			{ 
				{ -10, 8, 9, 8, -5, 0 },
				{ -10, -10, 4, -1, 8 },
				{ -8, 5, -1, 10 },
				{ -8, -3, 5 },
				{ -1, 3 },
				{ 2 },
				{ }
			},
			{
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
			},
			{
				{ 4, 2, 8, 3 },
				{ 6, 7, 5, 4 },
				{ 9, 8, 10, 9 },
				{ 1, 4, 1, 4 }
			},
			{
				{ 6, -10, -3, -9 },
				{ -2, -10, 8, -2 },
				{ -1, 4, 4, 3 },
				{ 8, -3, 1, 4 }
			},
			{
				{ 2, 6, -8 },
				{ 9, -5, -2 },
				{ -6, 3, 0 }
			}
		}; 
	int[] sums = { 0, 0, 0, 0, 0, 34, 25, 4, -3 };
	
	@Test
	public void testSumMajorDiagonal()
	{
		for (int matrix = 0; matrix < listsOfMatrices.length; matrix++)
		{
			assertEquals(sums[matrix], SumOfMajorDiagonalInAMatrix.sumMajorDiagonal(listsOfMatrices[matrix]));
		}
	}
}