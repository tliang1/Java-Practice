package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import main.AssignGrades;

/**
 * @author Tony Liang
 *
 */
public class AssignGradesTest
{
	Collection<int[]> grades = Arrays.asList(new int[][] { { 40, 55, 70, 58 }, { 10 }, 
		{ 25, -54, 95, 72, 68 }, { -57, -17, -86, -36, -88, -100 } });
	int[] largestNumbers = { 70, 10, 95, -17 };
	
	@Test
	public void testLargestNumber()
	{
		
		int index = 0;
		
		for (int[] gradesList : grades)
		{
			assertEquals(largestNumbers[index], AssignGrades.largestNumber(gradesList));
			
			index++;
		}
	}
}
