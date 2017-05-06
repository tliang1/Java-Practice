package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.AveragingAnArray;

/**
 * @author Tony Liang
 *
 */
public class AveragingAnArrayTest
{
	int[][] listsOfIntegers =
		{
			{ },
			{ 2, 9, 4, 16, 1 },
			{ 2, 3, 4, 13, 20, 14, 11 }
		};
	int[] averageOfIntegers = { 0, 6, 9 };
	double[][] listsOfDoubleValues =
		{
			{ },
			{ 10.3, 4.5, 13.6, 14.14, 3.11, 7.18 },
			{ 2.5, 4.6, 7.8, 1.1, 3.3, 4.2, 9.8, 5.7, 1.8, 3.4 }
		};
	double[] averageOfDoubleValues = { 0.0, 8.805, 4.42 };
	
	@Test
	public void testAverage()
	{
		for (int index = 0; index < listsOfIntegers.length; index++)
		{
			assertEquals(averageOfIntegers[index], AveragingAnArray.average(listsOfIntegers[index]));
		}
		
		for (int index = 0; index < listsOfDoubleValues.length; index++)
		{
			assertEquals(averageOfDoubleValues[index], 
					AveragingAnArray.average(listsOfDoubleValues[index]), 0.0001);
		}
	}
}