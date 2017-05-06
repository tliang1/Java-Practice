package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.SolvingQuadraticEquations;

/**
 * @author Tony Liang
 *
 */
public class SolvingQuadraticEquationsTest
{
	double[][] quadraticEquationsCoefficients =
		{
			{ },
			{ 5.1 },
			{ 2.1, -4.9 },
			{ 0.0, 0.0, 8.3 },
			{ 1.0, 3, 1 }, 
			{ 1, 2.0, 1 },
			{ 1, 2, 3 },
			{ 6.6, 9.3, 2.4, 8.9 },
			{ -20.9, 19.17, 0.0 },
			{ 0.0, -2.5, 12.2 }, 
			{ 5.4, 0.0, 0.0 },
			{ 3.4, 0.0, 14.23 },
			{ 7.7, 5.23, 0.0 }
		};
	int[] numberOfSolutions = { 0, 0, 0, 0, 2, 1, 0, 0, 2, 0, 1, 0, 2 };
	
	@Test
	public void testSolveQuadratic()
	{
		for (int equationCoefficients = 0; equationCoefficients < quadraticEquationsCoefficients.length; 
				equationCoefficients++)
		{
			assertEquals(numberOfSolutions[equationCoefficients], 
					SolvingQuadraticEquations.solveQuadratic(quadraticEquationsCoefficients[equationCoefficients], 
							new double[2]));
		}
	}
}