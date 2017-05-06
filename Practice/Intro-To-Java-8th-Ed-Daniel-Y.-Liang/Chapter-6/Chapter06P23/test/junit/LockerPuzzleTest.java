package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.LockerPuzzle;

/**
 * @author Tony Liang
 *
 */
public class LockerPuzzleTest
{
	boolean[][] listOfLockers = { new boolean[100], new boolean[(int) (Math.random() * 1001)] };
	
	@Test
	public void testLockerPuzzle()
	{
		for (boolean[] lockers : listOfLockers)
		{
			LockerPuzzle.lockerPuzzle(lockers);
			
			boolean isSolved = true;
			int numberOfPerfectSquares = 0;
			
			for (int locker = 1; (locker * locker) <= lockers.length; locker++)
			{
				if (!lockers[(locker * locker) - 1])
				{
					isSolved = false;
				}
				else
				{
					numberOfPerfectSquares++;
				}
			}
			
			if (numberOfPerfectSquares > (int) (Math.floor(Math.sqrt(lockers.length))))
			{
				isSolved = false;
			}
			
			assertEquals(true, isSolved);
		}
	}
}