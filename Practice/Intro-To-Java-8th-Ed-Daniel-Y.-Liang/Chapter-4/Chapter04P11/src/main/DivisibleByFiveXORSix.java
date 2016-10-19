package main;

public class DivisibleByFiveXORSix
{

	public static void main(String[] args)
	{
		final int MINIMUM_NUMBER = 100;
		final int MAXIMUM_NUMBER = 200;
		final int NUMBERS_PER_LINE = 10;
		
		int count = 0;
		
		for (int i = MINIMUM_NUMBER; i <= MAXIMUM_NUMBER; i++)
		{
			if ((i % 5 == 0) ^ (i % 6 == 0))
			{
				if ((count % NUMBERS_PER_LINE == 0) && (count > 0))
				{
					System.out.println();
				}
				
				System.out.print(i + " ");
				
				++count;
			}
		}
	}

}