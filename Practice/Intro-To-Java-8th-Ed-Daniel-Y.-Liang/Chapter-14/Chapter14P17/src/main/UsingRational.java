package main;

/**
 * @author Tony Liang
 *
 */
public class UsingRational
{
	public static void main(String[] args)
	{
		Rational sum = new Rational();
		
		final int MAXIMUM_I = 100;
		
		for (int i = 1; i < MAXIMUM_I; i++)
		{
			sum = sum.add(new Rational(i, i + 1));
		}
		
		System.out.println("The summation of i/(i + 1) for i = 1 to i = " + (MAXIMUM_I - 1) + " is " + sum);
	}
}