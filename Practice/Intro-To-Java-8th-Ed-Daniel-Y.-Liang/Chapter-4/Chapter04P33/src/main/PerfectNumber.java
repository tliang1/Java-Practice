package main;

public class PerfectNumber
{

	public static void main(String[] args)
	{
		final int MAX_NUMBER = 10000;
		
		System.out.println("In the range of (1-" + MAX_NUMBER + "), the perfect numbers are:");
		
		for (int num = 2; num < MAX_NUMBER; num++)
		{
			int sum = 0;
			
			for (int factor = 1; factor <= (int)((num / 2.0) + 1); factor++)
			{
				if (num % factor == 0)
				{	
					sum += factor;
				}
			}
			
			if (num == sum)
			{
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
	}

}