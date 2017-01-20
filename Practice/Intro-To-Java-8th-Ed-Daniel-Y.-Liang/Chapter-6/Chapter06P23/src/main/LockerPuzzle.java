package main;

import java.util.Arrays;

/**
 * @author Tony Liang
 *
 */
public class LockerPuzzle
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_LOCKERS = 100;
		boolean[] lockers = new boolean[NUMBER_OF_LOCKERS];
		
		lockerPuzzle(lockers);
		
		System.out.println("After " + NUMBER_OF_LOCKERS + " students have changed the lockers, the lockers that are"
				+ " still opened are: ");
		
		for (int locker = 0; locker < NUMBER_OF_LOCKERS; locker++)
		{
			if (lockers[locker])
			{
				System.out.println("Locker " + (locker + 1) + " is opened.");
			}
		}
	}
	
	/**
	 * Solves the locker puzzle given the boolean array argument.
	 * <ul>
	 * 	<li>
	 * 		If the boolean array's size is 0, an error will be displayed.
	 * 	</li>
	 * </ul>
	 * <p>
	 * Every element of the boolean array will default to false before solving the puzzle.
	 * 
	 * @param lockers	array of lockers
	 */
	public static void lockerPuzzle(boolean[] lockers)
	{
		if (lockers.length < 1)
		{
			System.out.println("Error: The number of lockers must be greater than zero.");
			System.exit(0);
		}
		
		Arrays.fill(lockers, false);
		
		for (int student = 1; student <= lockers.length; student++)
		{
			for (int locker = student; locker <= lockers.length; locker += student)
			{
				lockers[locker - 1] = !(lockers[locker - 1]);
			}
		}
	}
}