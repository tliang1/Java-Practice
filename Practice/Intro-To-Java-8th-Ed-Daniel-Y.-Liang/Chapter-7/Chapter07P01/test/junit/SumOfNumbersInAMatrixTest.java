package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.SumOfNumbersInAMatrix;

/**
 * @author Tony Liang
 *
 */
public class SumOfNumbersInAMatrixTest
{
	int[][][] listOfMatrices = { { }, new int[5][0], new int[0][10], 
			{ { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } },
			{ { 4, 2, 8, 3 }, { 6, 7, 5, 4 }, { 9, 8, 10, 9 }, { 1, 4, 1, 4 } },
			{ { 6, -10, -3, -9 }, { -2, -10, 8, -2 }, { -1, 4, 4, 3 }, { 8, -3, 1, 4 } },
			{ 
				{ -10, 8, 9, 8, -5, 0 }, { -10, -10, 4, -1, 8 }, { -8, 5, -1, 10 }, { -8, -3, 5 }, { -1, 3 }, { 2 },
				{ }
			}
			}; 
	int[] sums = { 0, 0, 0, 136, 85, -2, 5 };
	
	@Test
	public void testSumMatrix()
	{
		for (int matrix = 0; matrix < listOfMatrices.length; matrix++)
		{
			assertEquals(sums[matrix], SumOfNumbersInAMatrix.sumMatrix(listOfMatrices[matrix]));
		}
	}
}