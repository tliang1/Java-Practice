package main;

/**
 * @author Tony Liang
 *
 */
public class ExecutionTime
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_INTEGERS = 100000;
		int[] randomIntegers = new int[NUMBER_OF_INTEGERS];
		int randomKey = (int) (Math.random() * 100) - 50;
		
		for (int index = 0; index < NUMBER_OF_INTEGERS; index++)
		{
			randomIntegers[index] = (int) (Math.random() * 100) - 50;
		}
		
		System.out.print("Using linear search, ");
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("the index for " + randomKey + " is " + linearSearch(randomIntegers, randomKey));
		
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		System.out.println("The execution time of the linear search is " + executionTime + "ms");
		
		System.out.print("After sorting the integers in ascending order and using binary search, ");
		
		selectionSort(randomIntegers);
		startTime = System.currentTimeMillis();
		
		System.out.println("the index for " + randomKey + " is " + binarySearch(randomIntegers, randomKey));
		
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		
		System.out.println("The execution time of the binary search is " + executionTime + "ms");
	}
	
	/**
	 * Sorts the integer array argument using selection sort.
	 * 
	 * @param list	array of integers
	 */
	public static void selectionSort(int[] list) 
	{
		for (int i = 0; i < list.length - 1; i++)
		{
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++)
			{
				if (currentMin > list[j])
				{
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i)
			{
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	/**
	 * Returns the index of the integer argument in the integer array argument using linear search.
	 * <ul>
	 * 	<li>
	 * 		If the index of the integer argument can't be found in the integer array argument, it will default to
	 * 		-1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param list	array of integers
	 * @param key	integer to search for
	 * @return		the index of the key
	 */
	public static int linearSearch(int[] list, int key) 
	{
		for (int i = 0; i < list.length; i++) 
		{
			if (key == list[i])
			{
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * Returns the index of the integer argument in the integer array argument using binary search.
	 * <ul>
	 * 	<li>
	 * 		If the index of the integer argument can't be found in the integer array argument, it will default to
	 * 		-1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param list	array of integers
	 * @param key	integer to search for
	 * @return		the index of the key
	 */
	public static int binarySearch(int[] list, int key)
	{
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low)
		{
			int mid = (low + high) / 2;
			
			if (key < list[mid])
			{
				high = mid - 1;
			}
			else if (key == list[mid])
			{
				return mid;
			}
			else
			{
				low = mid + 1;
			}
		}
		
		return -1;
	}
}