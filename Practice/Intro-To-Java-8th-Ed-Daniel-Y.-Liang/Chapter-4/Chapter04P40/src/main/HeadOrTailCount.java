package main;

public class HeadOrTailCount
{

	public static void main(String[] args)
	{
		final int TOTAL_FLIPS = 1000000;
		
		int heads = 0, tails = 0, coin = 0;
		
		for (int times = 1; times <= TOTAL_FLIPS; times++)
		{
			coin = (int) (Math.random() * 2);
			
			if (coin == 0)
			{
				heads++;
			}
			else
			{
				tails++;
			}
		}
		
		System.out.println("After flipping the coin " + TOTAL_FLIPS + " times, the number of heads are " + heads + 
				" and the number of tails are " + tails);
	}

}