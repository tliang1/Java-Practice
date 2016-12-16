package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.ExecutionTime;

/**
 * @author Tony Liang
 *
 */
public class ExecutionTimeTest
{
	int[][] integers = { { }, { 9 }, { 4 }, { 6, 7 }, { 8, 3 }, { 5, 2, 4, 2 }, { 13, 6, -12, 11, -6, -3, -7, -11 },
			{ 14, -10, -19, 16, 11, -13, 8, 6 } };
	int[] keys = { 1, 5, 4, 8, 3, 2, -7, 19 };
	int[] linearSearchIndexes = { -1, -1, 0, -1, 1, 1, 6, -1 };
	int[] binarySearchIndexes = { -1, -1, 0, -3, 0, 1, 2, -9 };
	
	@Test
	public void testSelectionSort()
	{
		int size = (int)(Math.random() * 100);
		
		int[] randomIntegers = new int[size];
		
		for (int index = 0; index < size; index++)
		{
			randomIntegers[index] = (int)(Math.random() * 100);
		}
		
		ExecutionTime.selectionSort(randomIntegers);
		
		boolean sorted = true;
		
		for (int index = 0; index < (randomIntegers.length - 1); index++)
		{
			if (randomIntegers[index] > randomIntegers[index + 1])
			{
				sorted = false;
				break;
			}
		}
		
		assertEquals(true, sorted);
	}
	
	@Test
	public void testLinearSearch()
	{
		for (int index = 0; index < integers.length; index++)
		{
			assertEquals(linearSearchIndexes[index], ExecutionTime.linearSearch(integers[index], keys[index]));
		}
	}
	
	@Test
	public void testBinarySearch()
	{
		for (int index = 0; index < integers.length; index++)
		{
			ExecutionTime.selectionSort(integers[index]);
			assertEquals(binarySearchIndexes[index], ExecutionTime.binarySearch(integers[index], keys[index]));
		}
	}
}