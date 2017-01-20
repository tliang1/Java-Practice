package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.SmallestElement;

/**
 * @author Tony Liang
 *
 */
public class SmallestElementTest
{
	double[][] listsOfDoubleValues =
		{
			{ },
			{ 1.23 },
			{ 1.9, 2.5, 3.7, 2, 1.5, 6, 3, 4, 5, 2 },
			{ 9.19, 4.2, 18.2, 10.17, 20.12, 13.15, 7.8, 12.7, 17.16, 19.11, 5.14, 6.6, 16.5, 11.1, 3.13 }
		};
	double[] minimumValues = { 0.0, 1.23, 1.5, 3.13 };
	
	@Test
	public void testMin()
	{
		for (int index = 0; index < listsOfDoubleValues.length; index++)
		{
			assertEquals(minimumValues[index], SmallestElement.min(listsOfDoubleValues[index]), 0.5);
		}
	}
}