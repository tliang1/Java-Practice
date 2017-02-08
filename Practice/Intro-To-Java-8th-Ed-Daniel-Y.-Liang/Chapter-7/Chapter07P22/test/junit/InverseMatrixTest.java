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
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
			},
			{
				{ 0, 0 },
				{ 0, 0 }
			},
			{
				{ 1, 2 },
				{ 3, 4 }
			},
			{
				{ 0.5, 2 },
				{ 1.5, 4.5 }
			}
		};
	double[][][] listsOfInverseMatrices =
		{
			null,
			null,
			null,
			{
				{ -2.0, 1.0 },
				{ 1.5, -0.5 }
			},
			{
				{ -6.0, 2.6666666666666665 },
				{ 2.0, -0.6666666666666666 }
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