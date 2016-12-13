package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class MeanAndStandardDeviationRevised
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int NUMBER_OF_DOUBLE_VALUES = 10;
		double[] numbers = new double[NUMBER_OF_DOUBLE_VALUES];
		
		System.out.print("Enter ten numbers: ");
		
		for(int count = 0; count < NUMBER_OF_DOUBLE_VALUES; count++)
		{
			numbers[count] = input.nextDouble();
		}
		
		System.out.printf("The mean is %4.2f\n", mean(numbers));
		System.out.printf("The standard deviation is %7.5f", deviation(numbers));
		System.out.println();
		
		input.close();
	}
	
	/**
	 * Returns the standard deviation of the double values in the double array argument.
	 * <p>
	 * If the double array's size is less than 2, the standard deviation will default to 0.0.
	 * 
	 * @param x		array of double values
	 * @return		the standard deviation of the double values
	 */
	public static double deviation(double[] x)
	{
		if (x.length < 2)
		{
			return 0.0;
		}
		
		double sum = 0.0;
		
		double mean = mean(x);
		
		for (int index = 0; index < x.length; index++)
		{
			sum += Math.pow(x[index] - mean, 2);
		}
		
		double standardDeviation = Math.sqrt(sum / (x.length - 1));
		
		return standardDeviation;
	}
	
	/**
	 * Returns the mean of the double values in the double array argument.
	 * <p>
	 * If the double array's size is 0, the mean will default to 0.0.
	 * 
	 * @param x		array of double values
	 * @return		the mean of the double values
	 */
	public static double mean(double[] x)
	{
		double sum = 0.0;
		
		if (x.length == 0)
		{
			return sum;
		}
		
		for (double number : x)
		{
			sum += number;
		}
		
		return (sum / x.length);
	}
}