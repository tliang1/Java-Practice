package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.InverseMatrix;

/**
 * @author Tony Liang
 *
 */
public class InverseMatrixTest
{
	double[][][] listsOfMatrices =
		{
			{
				{ 1, 2 },
				{ 3 }
			},
			{
				{ 1, 2 },
				{ 3, 4 }
			},
			{
				{ 0, 0, 0 },
				{ 0, 0, 0 },
				{ 0, 0, 0 }
			},
			{
				{ 1, 2, 1 },
				{ 2, 3, 1 },
				{ 4, 5, 3 }
			},
			{
				{ 1, 4, 2 },
				{ 2, 5, 8 },
				{ 2, 1, 8 }
			}
		};
	double[][][] listsOfInverseMatrices =
		{
			null,
			null,
			null,
			{
				{ -2, 0.5, 0.5 },
				{ 1, 0.5, -0.5 },
				{ 1, -1.5, 0.5 }
			},
			{
				{ 2.0, -1.875, 1.375 },
				{ 0.0, 0.25, -0.25 },
				{ -0.5, 0.4375, -0.1875 }
			}
		};
	
	@Test
	public void testInverse()
	{
		for (int list = 0; list < listsOfMatrices.length; list++)
		{
			double[][] inverseMatrix = InverseMatrix.inverse(listsOfMatrices[list]);
			
			if (listsOfInverseMatrices[list] == null)
			{
				assertNull(inverseMatrix);
			}
			else
			{
				for (int row = 0; row < inverseMatrix.length; row++)
				{
					assertArrayEquals(listsOfInverseMatrices[list][row], inverseMatrix[row], 0.1);
				}
			}
		}
	}
}