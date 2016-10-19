package main;

public class MoreAccurateSummationComparison
{

	public static void main(String[] args)
	{
		final int N = 50000;
		
		System.out.println("Summation of 1 + 1/2 + 1/3 + ... + 1/n comparison.");
		
		double leftToRightSum = 1.0;
		
		for (int n = 2; n <= N; n++)
		{
			leftToRightSum += (1.0 / n);
		}
		
		double rightToLeftSum = 1.0 / N;
		
		for (int n = N - 1; n >= 1; n--)
		{
			rightToLeftSum += (1.0 / n);
		}
		
		System.out.println("Computing from left to right: " + leftToRightSum);
		System.out.println("Computing from right to left: " + rightToLeftSum);
	}

}