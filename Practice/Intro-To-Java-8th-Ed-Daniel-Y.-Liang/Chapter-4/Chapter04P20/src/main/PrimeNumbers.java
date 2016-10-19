package main;

public class PrimeNumbers
{

	public static void main(String[] args)
	{
		final int MAX_NUMBER = 1000; // Max number to test for prime
		final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		
		System.out.println("The list of prime numbers between " + number + " and " + MAX_NUMBER + 
				" inclusive are: ");
		
		// Repeatedly find prime numbers
		while (number <= MAX_NUMBER) 
		{
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?
			
			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) 
			{
				if (number % divisor == 0) 
				{ // If true, number is not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}
			
			// Print the prime number and increase the count
			if (isPrime) 
			{
				count++; // Increase the count
				
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) 
				{
					// Print the number and advance to the new line
					System.out.println(number);
				}
				else
				{
					System.out.print(number + " ");
				}
			}
			
			// Check if the next number is prime
			number++;
		}
	}

}