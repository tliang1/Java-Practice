package main;

public class SeriesSummation
{

	public static void main(String[] args)
	{
		double sum = 0.0;
		
		for (double n = 1; n <= 97; n += 2)
		{
			sum += (n / (n + 2));
		}
		
		System.out.println("The summation of 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99 is " + sum);
	}

}