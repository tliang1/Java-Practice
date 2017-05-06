package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.AssignGrades;

/**
 * @author Tony Liang
 *
 */
public class AssignGradesTest
{
	int[][] listsOfGrades =
		{
			{ },
			{ 10 },
			{ 40, 55, 70, 58 },
			{ 25, -54, 95, 72, 68 },
			{ -57, -17, -86, -36, -88, -100 }
		};
	int[] largestNumbers = { 0, 10, 70, 95, -17 };
	
	@Test
	public void testLargestNumber()
	{
		for (int grade = 0; grade < listsOfGrades.length; grade++)
		{
			assertEquals(largestNumbers[grade], AssignGrades.largestNumber(listsOfGrades[grade]));
		}
	}
}