package main;

/**
 * @author Tony Liang
 *
 */
public class SortTotalWeeklyHours
{
	public static void main(String[] args)
	{
		int[][] employeeHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 }, 
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 }, 
				{ 6, 3, 5, 9, 2, 7, 9 } };
		
		final int EMPLOYEE_AND_WEEKLY_HOURS = 2;
		int[][] totalHours = new int[employeeHours.length][EMPLOYEE_AND_WEEKLY_HOURS];
		
		for (int employee = 0; employee < employeeHours.length; employee++)
		{
			totalHours[employee][0] = employee;
			
			int sumOfWeeklyHours = 0;
			
			for (int hour = 0; hour < employeeHours[employee].length; hour++)
			{
				sumOfWeeklyHours += employeeHours[employee][hour];
			}
			
			totalHours[employee][1] = sumOfWeeklyHours;
		}
		
		selectionSortEmployees(totalHours);
		
		for (int employee = 0; employee < totalHours.length; employee++)
		{
			System.out.println("Employee " + totalHours[employee][0] + "'s total weekly hours is " + 
					totalHours[employee][1]);
		}
	}
	
	/**
	 * Sorts the integer two-dimensional array argument in decreasing order of the second element of the
	 * one-dimensional array using selection sort.
	 * <p>
	 * For the employeeWeeklyHours array:
	 * <p>
	 * employeeWeeklyHours[i][j]
	 * <p>
	 * i = row
	 * <p>
	 * j = employee/weekly hours where j = 0 = employee's number and j = 1 = employee's weekly hours
	 * <p>
	 * If the integer two-dimensional array's one-dimensional arrays' sizes are not equal to 2, an error will be
	 * displayed.
	 * 
	 * @param employeeWeeklyHours	array of employees and their total weekly hours
	 */
	public static void selectionSortEmployees(int[][] employeeWeeklyHours) 
	{
		for (int[] employee : employeeWeeklyHours)
		{
			if (employee.length != 2)
			{
				System.out.println("Error: Every element of the two-dimensional array must have a size of 2.");
				System.exit(0);
			}
		}
		
		for (int employee = 0; employee < employeeWeeklyHours.length - 1; employee++)
		{
			int[] currentMax = employeeWeeklyHours[employee];
			int currentMaxIndex = employee;
			
			for (int nextEmployee = employee + 1; nextEmployee < employeeWeeklyHours.length; nextEmployee++)
			{
				if (currentMax[1] < employeeWeeklyHours[nextEmployee][1])
				{
					currentMax = employeeWeeklyHours[nextEmployee];
					currentMaxIndex = nextEmployee;
				}
			}
			
			if (currentMaxIndex != employee)
			{
				employeeWeeklyHours[currentMaxIndex] = employeeWeeklyHours[employee];
				employeeWeeklyHours[employee] = currentMax;
			}
		}
	}
}
