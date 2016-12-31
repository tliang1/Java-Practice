package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MultiplyTwoMatrices;

/**
 * @author Tony Liang
 *
 */
public class MultiplyTwoMatricesTest
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
					{ 10.1 }, { 6.9 }
				},
				{
					{ 9.3 }, { 7.3 }
				}
			},
			{
				{
					{ 10.1 }, { 6.9 }
				},
				{
					{ 9.3, 7.3 }
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
	double[][][] productOfTwoMatrices = {
			new double[0][0],
			new double[0][0],
			new double[0][0],
			{
				{ 93.93, 73.73 }, { 64.17, 50.37 }
			},
			{ 
				{ 5.3, 23.9, 24.0 }, { 11.6, 56.3, 58.2 }, { 17.9, 88.7, 92.4 }
			},
			{ 
				{ -31.44, -95.99, -139.4, -123.15, 119.91 }, { 21.5, 69.45, 66.43, 36.24, 13.79 },
				{ 74.69, -211.29, -82.51, 93.22, -114.57 }, { -144.44, 36.57, 130.89, 35.52, -67.9 },
				{ -33.01, -106.11, -70.08, 6.11, -118.33 }
			}
		};
	
	@Test
	public void testMultiplyMatrix()
	{
		for (int pair = 0; pair < listOfMatricesPairs.length; pair++)
		{
			double[][] product = MultiplyTwoMatrices.multiplyMatrix(listOfMatricesPairs[pair][0], listOfMatricesPairs[pair][1]);
			
			for (int row = 0; row < productOfTwoMatrices[pair].length; row++)
			{
				assertArrayEquals(productOfTwoMatrices[pair][row], product[row], 0.1);
			}
		}
	}
}