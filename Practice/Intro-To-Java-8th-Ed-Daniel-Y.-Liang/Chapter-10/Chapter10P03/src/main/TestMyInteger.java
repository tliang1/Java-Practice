package main;

import java.util.Random;

/**
 * @author Tony Liang
 *
 */
public class TestMyInteger
{
	public static void main(String[] args)
	{
		MyInteger myInteger1 = new MyInteger(0);
		
		System.out.println("The value for myInteger1 is " + myInteger1.getValue());
		System.out.println("Is " + myInteger1.getValue() + " an even integer? " + myInteger1.isEven());
		System.out.println("Is " + myInteger1.getValue() + " an odd integer? " + myInteger1.isOdd());
		System.out.println("Is " + myInteger1.getValue() + " a prime integer? " + myInteger1.isPrime());
		
		MyInteger myInteger2 = new MyInteger(9842595);
		
		System.out.println("Is " + myInteger2.getValue() + " an even integer? " + myInteger2.isEven());
		System.out.println("Is " + myInteger2.getValue() + " an odd integer? " + myInteger2.isOdd());
		System.out.println("Is " + myInteger2.getValue() + " a prime integer? " + myInteger2.isPrime());
		
		Random random = new Random();
		int randomInteger = random.nextInt() * ((2 * random.nextInt(2)) - 1);
		
		System.out.println("Is " + randomInteger + " an even integer? " + MyInteger.isEven(randomInteger));
		System.out.println("Is " + randomInteger + " an odd integer? " + MyInteger.isOdd(randomInteger));
		System.out.println("Is " + randomInteger + " a prime integer? " + MyInteger.isPrime(randomInteger));
		
		int randomInteger2 = random.nextInt() * ((2 * random.nextInt(2)) - 1);
		MyInteger myInteger3 = new MyInteger(randomInteger2);
		
		System.out.println("Is " + randomInteger2 + " an even integer? " + MyInteger.isEven(myInteger3));
		System.out.println("Is " + randomInteger2 + " an odd integer? " + MyInteger.isOdd(myInteger3));
		System.out.println("Is " + randomInteger2 + " a prime integer? " + MyInteger.isPrime(myInteger3));
		
		int randomInteger3 = random.nextInt() * ((2 * random.nextInt(2)) - 1);
		
		System.out.println("Is myInteger1 = 0? " + myInteger1.equals(0));
		System.out.println("Is myInteger1 = " + randomInteger3 + "? " + myInteger1.equals(randomInteger3));
		System.out.println("Is myInteger1 = myInteger2? " + myInteger1.equals(myInteger2));
		System.out.println("Is myInteger1 = myInteger3? " + myInteger1.equals(myInteger3));
		
		char[][] integers = {{'9','4', '8', '0', '8', '1'}, {'-', '6', '6', '7', '6', '3', '1'}, {'1', '5', 'q', '7', '#', '3'}};
		
		for (char[] integer: integers)
		{
			System.out.println("The array, " + String.valueOf(integer) + ", is converted to the integer: " + MyInteger.parseInt(integer));
		}
		
		String[] integerStrings = {"217665", "-332279", "r989i131x"};
		
		for (String integer: integerStrings)
		{
			System.out.println("The string " + integer + " is converted to the integer: " + MyInteger.parseInt(integer));
		}
	}
}