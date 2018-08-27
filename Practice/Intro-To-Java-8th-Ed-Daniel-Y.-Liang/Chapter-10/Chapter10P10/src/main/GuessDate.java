package main;

/**
 * @author Tony Liang
 *
 */
public class GuessDate
{
	private static int[][] set1 =
		{
			{1, 3, 5, 7},
			{9, 11, 13, 15},
			{17, 19, 21, 23},
			{25, 27, 29, 31}
		};
	private static int[][] set2 =
		{
			{2, 3, 6, 7},
			{10, 11, 14, 15},
			{18, 19, 22, 23},
			{26, 27, 30, 31}
		};
	private static int[][] set3 =
		{
			{4, 5, 6, 7},
			{12, 13, 14, 15},
			{20, 21, 22, 23},
			{28, 29, 30, 31}
		};
	private static int[][] set4 =
		{
			{8, 9, 10, 11},
			{12, 13, 14, 15},
			{24, 25, 26, 27},
			{28, 29, 30, 31}
		};
	private static int[][] set5 =
		{
			{16, 17, 18, 19},
			{20, 21, 22, 23},
			{24, 25, 26, 27},
			{28, 29, 30, 31}
		};
	
	private GuessDate()
	{
	}
	
	/**
	 * Returns the date at the given row and column in the given set.
	 * <ul>
	 * 	<li>
	 * 		If the set number is not between 1 and 5 inclusive, the date will default to -1.
	 * 	</li>
	 * 	<li>
	 * 		If the row and column are not between 0 and 3 inclusive, the date will default to -1.
	 * 	</li>
	 * </ul>
	 * 
	 * @param setNo		set number
	 * @param row		row
	 * @param col		column
	 * @return			the date at the given row and column in the given set
	 */
	public static int getValue(int setNo, int row, int col)
	{
		if ((setNo > 0) && (setNo < 6) && (row >= 0) && (row < 4) && (col >= 0) && (col < 4))
		{
			switch (setNo)
			{
				case 1: return set1[row][col];
				case 2: return set2[row][col];
				case 3: return set3[row][col];
				case 4: return set4[row][col];
				case 5: return set5[row][col];
				default: return -1;
			}
		}
		else
		{
			return -1;
		}
	}
}