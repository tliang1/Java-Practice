package main;

/**
 * @author Tony Liang
 *
 */
public class PrimeNumbersUsingStack
{
	public static void main(String[] args)
	{
		int number = 120;
		
		System.out.print("The prime numbers less than " + number + " are");
		
		StackOfIntegers primeNumbers = findAllPrimes(number);
		
		while (!primeNumbers.empty())
		{
			System.out.print(" " + primeNumbers.pop());
		}
		
		System.out.println(".");
	}
	
	/**
	 * Returns the StackOfIntegers that stores every prime number less than the given integer.
	 * <ul>
	 * 	<li>
	 * 		If the integer is negative, the StackOfIntegers is empty.
	 * 	</li>
	 * </ul>
	 * 
	 * @param integer	integer
	 * @return			the StackOfIntegers that stores every prime number less than the given integer
	 */
	public static StackOfIntegers findAllPrimes(int integer)
	{
		StackOfIntegers primeIntegers = new StackOfIntegers();
		
		if (integer < 0)
		{
			return primeIntegers;
		}
		
		int[] primes = new int[integer];
		int count = 0;
		int number = 2;
		
		while (number < integer) 
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
				primeIntegers.push(number);
				primes[count] = number;
				count++;
			}
			
			number++;
		}
		
		return primeIntegers;
	}
}