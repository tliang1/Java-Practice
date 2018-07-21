package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.NewStringSplitMethod;

/**
 * @author Tony Liang
 *
 */
public class NewStringSplitMethodTest
{
	/**
	 * Test method for {@link main.NewStringSplitMethod#split(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSplit()
	{
		String[][] substringsAndDelimiters = 
			{
				{"ab#12#453", "#"}, {"a?b?gf#e", "[?#]"}
			};
		String[][] expected = 
			{
				{"ab", "#", "12", "#", "453"}, {"a", "?", "b", "?", "gf", "#", "e"}
			};
		
		for (int index = 0; index < substringsAndDelimiters.length; index++)
		{
			assertArrayEquals(expected[index], 
					NewStringSplitMethod.split(substringsAndDelimiters[index][0], substringsAndDelimiters[index][1]));
		}
	}
}