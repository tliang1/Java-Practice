package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.SelectionSort;

/**
 * @author Tony Liang
 *
 */
public class SelectionSortTest
{
	@Test
	public void testSelectionSort()
	{
		int size = (int)(Math.random() * 100);
		
		double[] randomNumbers = new double[size];
		
		for (int index = 0; index < size; index++)
		{
			randomNumbers[index] = (Math.random() * 100.0) - 50.0;
		}
		
		SelectionSort.selectionSort(randomNumbers);
		
		boolean sorted = true;
		
		for (int index = 0; index < (randomNumbers.length - 1); index++)
		{
			if (randomNumbers[index] > randomNumbers[index + 1])
			{
				sorted = false;
				break;
			}
		}
		
		assertEquals(true, sorted);
	}
}