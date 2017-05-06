package main;

public class Summation2
{

	public static void main(String[] args)
	{
		System.out.println("The summation of 1/(1 + √(2)) + 1/(√(2) + √(3)) + 1/(√(3) + √(4)) + ... + " + 
				"1/(√(624) + √(625)) is");
		
		double sum = 0.0;
		
		for (int i = 1; i < 625; i++)
		{
			double denominator = Math.pow(i, 0.5) + Math.pow(i + 1, 0.5);
			
			sum += (1 / denominator);
		}
		
		System.out.println(sum);
	}

}