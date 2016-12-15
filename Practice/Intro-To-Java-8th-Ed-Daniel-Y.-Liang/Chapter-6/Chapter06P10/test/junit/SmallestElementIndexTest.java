package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.SmallestElementIndex;

/**
 * @author Tony Liang
 *
 */
public class SmallestElementIndexTest
{
	double[][] doubleValues = new double[][] { { }, { 3.19 }, { 4.3, 3.18, 14.8 }, 
		{ 11.16, 10.2, 8.14, 5.5, 4.3, 9.6 }, { 4.15, 19.18, 17.1, 1.1, 13.3, 11.11, 8.7, 20.17, 10.19, 3.2 } };
	int[] minimumValuesIndexes = { -1, 0, 1, 4, 3 };
	
	@Test
	public void testIndexOfSmallestElement()
	{
		for (int index = 0; index < doubleValues.length; index++)
		{
			assertEquals(minimumValuesIndexes[index], 
					SmallestElementIndex.indexOfSmallestElement(doubleValues[index]));
		}
	}
}