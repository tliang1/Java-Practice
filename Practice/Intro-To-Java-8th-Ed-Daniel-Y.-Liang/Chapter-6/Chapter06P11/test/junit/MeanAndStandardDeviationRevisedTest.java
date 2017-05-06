package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MeanAndStandardDeviationRevised;

/**
 * @author Tony Liang
 *
 */
public class MeanAndStandardDeviationRevisedTest
{
	double[][] listsOfNumbers =
		{
			{ },
			{ 8 },
			{ 1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2 },
			{ 1, 2, 3, 4.5, 5.6, 6, 7, 8, 9, 10 },
			{ -5, 0, 2, -10, -6, 5, -8, -1, 0, 1 }
		};
	double[] means = { 0, 8, 3.11, 5.61, -2.2 };
	double[] standardDeviations = { 0.0, 0.0, 1.55738, 2.99794, 4.80278 };
	
	@Test
	public void testMean()
	{
		for (int index = 0; index < listsOfNumbers.length; index++)
		{	
			assertEquals(means[index], MeanAndStandardDeviationRevised.mean(listsOfNumbers[index]), 0.01);
		}
	}
	
	@Test
	public void testDeviation()
	{
		for (int index = 0; index < listsOfNumbers.length; index++)
		{	
			assertEquals(standardDeviations[index],
					MeanAndStandardDeviationRevised.deviation(listsOfNumbers[index]), 0.00001);
		}
	}
}