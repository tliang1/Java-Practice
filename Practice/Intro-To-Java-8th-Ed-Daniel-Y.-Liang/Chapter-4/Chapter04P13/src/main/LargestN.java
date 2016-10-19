package main;

public class LargestN
{

	public static void main(String[] args)
	{
		final int MAX_NUMBER = 12000;
		int largestN = 0;
		
		while ((largestN * largestN * largestN) < MAX_NUMBER)
		{
			++largestN;
		}
		
		--largestN;
		
		System.out.println("The largest integer n such that n^3 is less than 12000 is: " + largestN);
	}

}