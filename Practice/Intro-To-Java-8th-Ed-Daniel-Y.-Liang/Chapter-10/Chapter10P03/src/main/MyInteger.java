package main;

/**
 * @author Tony Liang
 *
 */
public class MyInteger
{
	private int value;
	
	/**
	 * Creates a new MyInteger given the integer value.
	 * 
	 * @param value		integer value
	 */
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	/**
	 * Returns if this MyInteger's value is an even integer.
	 * 
	 * @return	true if this MyInteger's value is an even integer. Otherwise, false.
	 */
	public boolean isEven()
	{
		return isEven(value);
	}
	
	/**
	 * Returns if this MyInteger's value is an odd integer.
	 * 
	 * @return	true if this MyInteger's value is an odd integer. Otherwise, false.
	 */
	public boolean isOdd()
	{
		return isOdd(value);
	}
	
	/**
	 * Returns if this MyInteger's value is a prime integer.
	 * 
	 * @return	true if this MyInteger's value is a prime integer. Otherwise, false.
	 */
	public boolean isPrime()
	{
		return isPrime(value);
	}
	
	/**
	 * Returns if the given value is an even integer.
	 * 
	 * @param value		integer value
	 * @return			true if the given value is an even integer. Otherwise, false.
	 */
	public static boolean isEven(int value)
	{
		return (value % 2) == 0;
	}
	
	/**
	 * Returns if the given value is an odd integer.
	 * 
	 * @param value		integer value
	 * @return			true if the given value is an odd integer. Otherwise, false.
	 */
	public static boolean isOdd(int value)
	{
		return (value % 2) != 0;
	}
	
	/**
	 * Returns the first specified number of prime numbers given the integer argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer argument is negative, an empty integer array is returned.
	 * 	</li>
	 * </ul>
	 * 
	 * @param numberOfPrimes	number of prime numbers to find
	 * @return					the integer array of the first numberOfPrimes prime numbers
	 */
	private static int[] findAllPrimes(int numberOfPrimes)
	{
		if (numberOfPrimes < 0)
		{
			return new int[0];
		}
		
		int[] primes = new int[numberOfPrimes];
		int count = 0;
		int number = 2;
		
		while (count < numberOfPrimes) 
		{
			if ((number > 2) && ((number % 2) == 0))
			{
				number++;
			}
			
			boolean isPrime = true;
			
			for (int index = 0; (index < count) && (primes[index] <= Math.sqrt(number)); index++) 
			{
				if (number % primes[index] == 0) 
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) 
			{
				primes[count] = number;
				count++;
			}
			
			number++;
		}
		
		return primes;
	}
	
	/**
	 * Returns if the given value is a prime integer.
	 * 
	 * @param value		integer value
	 * @return			true if the given value is a prime integer. Otherwise, false.
	 */
	public static boolean isPrime(int value)
	{
		if (value > 1)
		{
			int maxDivisor = (int) (Math.ceil(Math.sqrt(value)));
			
			for (int primeInteger: findAllPrimes(maxDivisor))
			{
				if (primeInteger >= maxDivisor)
				{
					break;
				}
				else if ((primeInteger > 0) && (value % primeInteger == 0))
				{
					return false;
				}
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns if the given MyInteger's value is an even integer.
	 * 
	 * @param value		MyInteger
	 * @return			true if the given MyInteger's value is an even integer. Otherwise, false.
	 */
	public static boolean isEven(MyInteger value)
	{
		return isEven(value.getValue());
	}
	
	/**
	 * Returns if the given MyInteger's value is an odd integer.
	 * 
	 * @param value		MyInteger
	 * @return			true if the given MyInteger's value is an odd integer. Otherwise, false.
	 */
	public static boolean isOdd(MyInteger value)
	{
		return isOdd(value.getValue());
	}
	
	/**
	 * Returns if the given MyInteger's value is a prime integer.
	 * 
	 * @param value		MyInteger
	 * @return			true if the given MyInteger's value is a prime integer. Otherwise, false.
	 */
	public static boolean isPrime(MyInteger value)
	{
		return isPrime(value.getValue());
	}
	
	public boolean equals(int value)
	{
		return this.value == value;
	}
	
	public boolean equals(MyInteger value)
	{
		return equals(value.getValue());
	}
	
	/**
	 * Converts the given array of numeric characters to an integer value.
	 * <ul>
	 * 	<li>
	 * 		If the given array can not be converted into an integer, it will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param value		array of numeric characters
	 * @return			the integer value
	 */
	public static int parseInt(char[] value)
	{
		String integerString = new String(value);
		
		return integerString.matches("-?\\d+") ? Integer.parseInt(integerString) : 0;
	}
	
	/**
	 * Converts the given string to an integer value.
	 * <ul>
	 * 	<li>
	 * 		If the given string can not be converted into an integer, it will default to 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param value		integer string
	 * @return			the integer value
	 */
	public static int parseInt(String value)
	{
		return value.matches("-?\\d+") ? Integer.parseInt(value) : 0;
	}
}