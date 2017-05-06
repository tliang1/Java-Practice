package main;

public class SmallestN
{

	public static void main(String[] args)
	{
		final int MINIMUM_NUMBER = 12000;
		int smallestN = 0;
		
		while ((smallestN * smallestN) <= MINIMUM_NUMBER)
		{
			++smallestN;
		}
		
		System.out.println("The smallest integer n such that n^2 is greater than 12000 is: " + smallestN);
	}

}