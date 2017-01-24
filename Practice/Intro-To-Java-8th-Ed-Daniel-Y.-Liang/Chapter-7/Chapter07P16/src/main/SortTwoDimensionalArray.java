/**
 * 
 */
package main;

/**
 * @author Tony Liang
 *
 */
public class SortTwoDimensionalArray
{
	public static void main(String[] args)
	{
		int[][] numbers = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		sort(numbers);
		
		System.out.println("The sorted two-dimensional array:");
		
		printGroupedIntegers(numbers);
	}
	
	/**
	 * Sorts the integer two-dimensional array argument in ascending order.
	 * <ul>
	 * 	<li>
	 * 		For a jagged array argument, the group of integers are also sorted in ascending order of the group's
	 * 		size. Example: [ 5, 6 ] (Size: 2) is less than [ 1, 2, 3 ] (Size: 3)
	 * 	</li>
	 * </ul>
	 * 
	 * @param m		array of group of integers
	 */
	public static void sort(int m[][])
	{
		for (int row = 0; row < (m.length - 1); row++)
		{
			int minimumIndex = row;
			int[] minimumGroup = m[minimumIndex];
			int currentColumnMinimumInteger = minimumGroup[0];
			
			for (int nextRow = row + 1; nextRow < m.length; nextRow++)
			{
				if (m[nextRow].length <= minimumGroup.length)
				{
					boolean changeCurrentColumnMinimumInteger = false;
					
					if (m[nextRow].length == minimumGroup.length)
					{
						for (int col = 0; col < minimumGroup.length; col++)
						{
							if ((m[nextRow][col] <= minimumGroup[col]))
							{
								if (m[nextRow][col] < minimumGroup[col])
								{
									if ((col == 0) || ((col > 0) &&
											(m[nextRow][col - 1] <= currentColumnMinimumInteger)))
									{
										changeCurrentColumnMinimumInteger = true;
										currentColumnMinimumInteger = (col > 0) ? m[nextRow][col - 1] :
											m[nextRow][col];
										break;
									}
								}
							}
							else
							{
								break;
							}
						}
					}
					else
					{
						changeCurrentColumnMinimumInteger = true;
						currentColumnMinimumInteger = m[nextRow][0];
					}
					
					if (changeCurrentColumnMinimumInteger)
					{
						minimumIndex = nextRow;
						minimumGroup = m[minimumIndex];
					}
				}
			}
			
			if (minimumIndex != row)
			{
				m[minimumIndex] = m[row];
				m[row] = minimumGroup;
			}
		}
	}
	
	/**
	 * Displays each row of integers as a group per line using the integer two-dimensional array argument.
	 * 
	 * @param numbers	array of group of integers
	 */
	public static void printGroupedIntegers(int[][] numbers)
	{
		for (int row = 0; row < numbers.length; row++)
		{
			System.out.print("(");
			
			for (int col = 0; col < numbers[row].length; col++)
			{
				System.out.print(numbers[row][col]);
				
				if (col < (numbers[row].length - 1))
				{
					System.out.print(", ");
				}
			}
			
			System.out.println(")");
		}
	}
}