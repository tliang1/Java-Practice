package main;

public class ApproximatePI
{

	public static void main(String[] args)
	{
		final int STARTING_I = 10000;
		final int ENDING_I = 100000;
		final int CHANGE_IN_I = 10000;
		
		System.out.println("PI is approximately 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... " + 
				"+ 1/(2i - 1) - 1/(2i + 1)).");
		
		for (int i = STARTING_I; i <= ENDING_I; i += CHANGE_IN_I)
		{
			double pI = 0.0;
			
			for (int iteration = 0; iteration < i; iteration++)
			{
				pI += Math.pow(-1, iteration) / ((2 * iteration) + 1);
			}
			
			pI *= 4.0;
			
			System.out.println("For i = " + i + ", PI is approximately " + pI);
		}
	}

}