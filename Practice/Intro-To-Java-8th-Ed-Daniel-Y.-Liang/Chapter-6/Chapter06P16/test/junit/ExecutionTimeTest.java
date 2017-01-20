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
	int[][] listsOfIntegers =
		{
			{ },
			{ 9 },
			{ 6, 7 },
			{ 14, -10, -19, 16, 11, -13, 8, 6 },
			{ 4 },
			{ 8, 3 },
			{ 5, 2, 4, 2 },
			{ 13, 6, -12, 11, -6, -3, -7, -11 }
		};
	int[] keys = { 1, 5, 8, 19, 4, 3, 2, -7 };
	int[] linearSearchIndexes = { -1, -1, -1, -1, 0, 1, 1, 6 };
	int[] binarySearchIndexes = { -1, -1, -1, -1, 0, 0, 1, 2 };
	
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
		for (int index = 0; index < listsOfIntegers.length; index++)
		{
			assertEquals(linearSearchIndexes[index], 
					ExecutionTime.linearSearch(listsOfIntegers[index], keys[index]));
		}
	}
	
	@Test
	public void testBinarySearch()
	{
		for (int index = 0; index < listsOfIntegers.length; index++)
		{
			ExecutionTime.selectionSort(listsOfIntegers[index]);
			assertEquals(binarySearchIndexes[index], 
					ExecutionTime.binarySearch(listsOfIntegers[index], keys[index]));
		}
	}
}