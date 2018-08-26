package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import main.MyInteger;

/**
 * @author Tony Liang
 *
 */
public class MyIntegerTest
{
	/**
	 * Test method for {@link main.MyInteger#isEven(int)}.
	 */
	@ParameterizedTest
	@CsvSource({ "0, true", "134, true", "-628, true", "123, false", "-479, false" })
	public void testIsEvenInt(int value, boolean isEven)
	{
		assertEquals(isEven, MyInteger.isEven(value));
		assertEquals(isEven, MyInteger.isEven(new MyInteger(value)));
	}

	/**
	 * Test method for {@link main.MyInteger#isOdd(int)}.
	 */
	@ParameterizedTest
	@CsvSource({ "123, true", "-479, true", "0, false", "134, false", "-628, false" })
	public void testIsOddInt(int value, boolean isOdd)
	{
		assertEquals(isOdd, MyInteger.isOdd(value));
		assertEquals(isOdd, MyInteger.isOdd(new MyInteger(value)));
	}

	/**
	 * Test method for {@link main.MyInteger#isPrime(int)}.
	 */
	@ParameterizedTest
	@CsvSource({ "2, true", "3, true", "5, true", "7, true", "9, true", "127, true", "0, false", "1, false", "134, false", "-628, false", 
					"-479, false" })
	public void testIsPrimeInt(int value, boolean isPrime)
	{
		assertEquals(isPrime, MyInteger.isPrime(value));
		assertEquals(isPrime, MyInteger.isPrime(new MyInteger(value)));
	}
	
	static Stream<Arguments> stringAndIntProvider()
	{
	    return Stream.of(
	        Arguments.of("123", 123),
	        Arguments.of("-123", -123),
	        Arguments.of("--123", 0),
	        Arguments.of("+123", 0),
	        Arguments.of("a123", 0),
	        Arguments.of("qe8C&m", 0)
	    );
	}
	
	/**
	 * Test method for {@link main.MyInteger#parseInt(char[])}.
	 */
	@ParameterizedTest
	@MethodSource("stringAndIntProvider")
	public void testParseIntCharArray(String integer, int value)
	{
		assertEquals(value, MyInteger.parseInt(integer.toCharArray()));
	}

	/**
	 * Test method for {@link main.MyInteger#parseInt(java.lang.String)}.
	 */
	@ParameterizedTest
	@MethodSource("stringAndIntProvider")
	public void testParseIntString(String integer, int value)
	{
		assertEquals(value, MyInteger.parseInt(integer));
	}
}