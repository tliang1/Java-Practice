package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MeanAndStandardDeviation;

/**
 * @author Tony Liang
 *
 */
public class MeanAndStandardDeviationTest
{
	double[][] numbers =
		{
			{ 1, 2, 3, 4.5, 5.6, 6, 7, 8, 9, 10 },
			{ -5, 0, 2, -10, -6, 5, -8, -1, 0, 1 }
		};
	
	@Test
	public void testMean()
	{
		double[] means = { 5.61, 0.0 };
		
		for (int index = 0; index < numbers.length; index++)
		{
			double sum = 0.0;
			
			for (double number : numbers[index])
			{
				sum += number;
			}
			
			assertEquals(means[index], MeanAndStandardDeviation.mean(sum, numbers[index].length), 0.01);
		}
	}
	
	@Test
	public void testStandardDeviation()
	{
		double[] standardDeviations = { 2.99794, 0.0 };
		
		for (int index = 0; index < numbers.length; index++)
		{
			double sum = 0.0;
			double sumOfSquaredNumbers = 0.0;
			
			for (double number : numbers[index])
			{
				sum += number;
				sumOfSquaredNumbers += (number * number);
			}
			
			assertEquals(standardDeviations[index],
					MeanAndStandardDeviation.standardDeviation(sum, sumOfSquaredNumbers, numbers[index].length),
					0.00001);
		}
	}
}