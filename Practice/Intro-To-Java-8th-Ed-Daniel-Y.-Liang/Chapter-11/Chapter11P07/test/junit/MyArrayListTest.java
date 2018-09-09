package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import main.MyArrayList;

/**
 * @author Tony Liang
 *
 */
public class MyArrayListTest
{
	MyArrayList myArrayList = new MyArrayList();
	
	@BeforeEach
	public void executedBeforeEach()
	{
		myArrayList.add("London");
		myArrayList.add("Denver");
		myArrayList.add("Paris");
		myArrayList.add("Miami");
		myArrayList.add("Seoul");
		myArrayList.add("Tokyo");
		myArrayList.add("Denver");
		myArrayList.add(null);
		myArrayList.add("Sacramento");
		myArrayList.add("Phoenix");
		myArrayList.add("Boise");
		myArrayList.add("Seoul");
		myArrayList.add("Austin");
		myArrayList.add("Lincoln");
		myArrayList.add(null);
		myArrayList.add("Boston");
	}
	
	/**
	 * Test method for {@link main.MyArrayList#add(int, java.lang.Object)}.
	 */
	@ParameterizedTest
	@CsvSource({ "0, Salem", "14, Topeka", "-7, Jackson", "3, " })
	public void testAddIntObject(int index, Object object)
	{
		int originalSize = myArrayList.size();
		Object original = myArrayList.get(index);
		myArrayList.add(index, object);
		
		if ((index >= 0) && (index < originalSize))
		{
			assertEquals(object, myArrayList.get(index));
			assertEquals(original, myArrayList.get(index + 1));
			assertEquals(originalSize + 1, myArrayList.size());
		}
		else
		{
			assertEquals(original, myArrayList.get(index));
		}
	}
	
	/**
	 * Test method for {@link main.MyArrayList#get(int)}.
	 */
	@ParameterizedTest
	@CsvSource({ "0, London", "5, Tokyo", "2, Paris", "-5, ", "18, " })
	public void testGet(int index, Object expected)
	{
		assertEquals(expected, myArrayList.get(index));
	}

	/**
	 * Test method for {@link main.MyArrayList#indexOf(java.lang.Object)}.
	 */
	@ParameterizedTest
	@CsvSource({ "Sacramento, 8", "Denver, 1", "Concord, -1", " , 7" })
	public void testIndexOf(Object object, int expected)
	{
		assertEquals(expected, myArrayList.indexOf(object));
	}

	/**
	 * Test method for {@link main.MyArrayList#lastIndexOf(java.lang.Object)}.
	 */
	@ParameterizedTest
	@CsvSource({ "Paris, 2", "Seoul, 11", "Dover, -1", " , 14" })
	public void testLastIndexOf(Object object, int expected)
	{
		assertEquals(expected, myArrayList.lastIndexOf(object));
	}

	/**
	 * Test method for {@link main.MyArrayList#remove(java.lang.Object)}.
	 */
	@ParameterizedTest
	@CsvSource({ "Lincoln, true", "Albany, false", ", true" })
	public void testRemoveObject(Object object, boolean expected)
	{
		int originalSize = myArrayList.size();
		
		assertEquals(expected, myArrayList.remove(object));
		
		if (expected)
		{
			assertEquals(originalSize - 1, myArrayList.size());
		}
	}

	/**
	 * Test method for {@link main.MyArrayList#remove(int)}.
	 */
	@ParameterizedTest
	@ValueSource(ints = { 0, 13, -2, 15})
	public void testRemoveInt(int index)
	{
		int originalSize = myArrayList.size();
		Object original = myArrayList.get(index);
		myArrayList.remove(index);
		
		if ((index >= 0) && (index < originalSize))
		{
			if (index == (originalSize - 1))
			{
				assertEquals(null, myArrayList.get(index));
			}
			else
			{
				assertNotEquals(original, myArrayList.get(index));
			}
			
			assertEquals(originalSize - 1, myArrayList.size());
		}
		else
		{
			assertEquals(original, myArrayList.get(index));
		}
	}

	/**
	 * Test method for {@link main.MyArrayList#set(int, java.lang.Object)}.
	 */
	@ParameterizedTest
	@CsvSource({ "0, Atlanta", "13, Frankfort", "4, Olympia", "-8, Nashville", "20, Lansing", "9, " })
	public void testSet(int index, Object object)
	{
		Object original = myArrayList.get(index);
		
		if ((index >= 0) && (index < myArrayList.size()))
		{
			assertEquals(original, myArrayList.set(index, object));
			assertEquals(object, myArrayList.get(index));
		}
		else
		{
			assertEquals(null, myArrayList.set(index, object));
		}
	}
}