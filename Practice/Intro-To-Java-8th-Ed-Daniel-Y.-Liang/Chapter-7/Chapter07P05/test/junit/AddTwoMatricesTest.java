package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.AddTwoMatrices;

/**
 * @author Tony Liang
 *
 */
public class AddTwoMatricesTest
{
	double[][][][] listOfMatricesPairs = {
				{
					new double[0][0],
					new double[0][0]
				},
				{
					{
						{ 4.8, 4.1, -4.5 }, { -1.2, 9.1 }, { -6.5 }
					},
					{
						{ -3.9, -1.3, -10.3 }, { -10.7, -9.0, -1.8 }, { 5.1, -1.4, 7.8 }
					}
				},
				{ 
					{ 
						{ 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 }, { 7.0, 8.0, 9.0 } 
					}, 
					{ 
						{ 0.0, 2.0, 4.0 }, { 1.0, 4.5, 2.2 }, { 1.1, 4.3, 5.2 } 
					} 
				},
				{
					{
						{ -7.8, -3.8, -2.9, -1.5, -10.7 }, { 3.9, 2.2, 1.2, 10.3, 4.6 }, 
						{ 7.8, -3.1, -10.1, -8.1, -9.5 }, { 6.0, 7.7, 10.5, -6.2, -2.5 },
						{ 0.1, 9.1, -5.6, -7.1, -8.2 }
					},
					{
						{ 2.3, -3.5, 7.1, 10.8, -7.8 }, { -4.3, 2.6, 1.9, 0.7, -7.8 },
						{ -10.1, 7.3, 8.3, -3.6, 6.9 }, { 0.9, 3.0, 0.2, -2.4, 7.7 },
						{ 5.4, 8.2, 4.9, 4.7, -5.7 }
					}
				}
			};
	boolean[] validMatrices = { true, true, false, true, true, true, true, true };
	double[][][] sumOfTwoMatrices = {
				new double[0][0],
				new double[0][0],
				{ 
					{ 1.0, 4.0, 7.0 }, { 5.0, 9.5, 8.2 }, { 8.1, 12.3, 14.2 }
				},
				{ 
					{ -5.5, -7.3, 4.2, 9.3, -18.5 }, { -0.4, 4.8, 3.1, 11.0, -3.2 },
					{ -2.3, 4.2, -1.8, -11.7, -2.6 }, { 6.9, 10.7, 10.7, -8.6, 5.2 },
					{ 5.5, 17.3, -0.7, -2.4, -13.9 }
				}
			};
	
	@Test
	public void testIsMatrix()
	{
		int currentMatrix = 0;
		
		for (int pair = 0; pair < listOfMatricesPairs.length; pair++)
		{
			for (int matrix = 0; matrix < listOfMatricesPairs[pair].length; matrix++)
			{
				assertEquals(validMatrices[currentMatrix], 
						AddTwoMatrices.isMatrix(listOfMatricesPairs[pair][matrix]));
				currentMatrix++;
			}
		}
	}
	
	@Test
	public void testAddMatrix()
	{
		for (int pair = 0; pair < listOfMatricesPairs.length; pair++)
		{
			double[][] sum = AddTwoMatrices.addMatrix(listOfMatricesPairs[pair][0], listOfMatricesPairs[pair][1]);
			
			for (int row = 0; row < sumOfTwoMatrices[pair].length; row++)
			{
				assertArrayEquals(sumOfTwoMatrices[pair][row], sum[row], 0.1);
			}
		}
	}
}