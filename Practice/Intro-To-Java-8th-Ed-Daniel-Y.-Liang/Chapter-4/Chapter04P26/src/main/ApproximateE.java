package main;

public class ApproximateE
{

	public static void main(String[] args)
	{
		final int STARTING_I = 10000;
		final int ENDING_I = 100000;
		final int CHANGE_IN_I = 10000;
		
		System.out.println("e is approximately 1 + 1/(1!) + 1/(2!) + 1/(3!) + 1/(4!) + ... + 1/(i!).");
		
		for (int i = STARTING_I; i <= ENDING_I; i += CHANGE_IN_I)
		{
			double e = 1.0;
			double reciprocalFactorial = 1.0;
			
			for (int n = 1; n <= i; n++)
			{
				reciprocalFactorial /= n;
				e += reciprocalFactorial;
			}
			
			System.out.println("For i = " + i + ", e is approximately " + e);
		}
	}

}