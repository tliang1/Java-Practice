package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class MeanAndStandardDeviation
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double num1 = 0.0, num2 = 0.0, num3 = 0.0, num4 = 0.0, num5 = 0.0, num6 = 0.0, num7 = 0.0, num8 = 0.0, 
				num9 = 0.0, num10 = 0.0;
		boolean isValidInput = false;
		
		while (!isValidInput)
		{
			System.out.print("Enter ten numbers: ");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			num3 = input.nextDouble();
			num4 = input.nextDouble();
			num5 = input.nextDouble();
			num6 = input.nextDouble();
			num7 = input.nextDouble();
			num8 = input.nextDouble();
			num9 = input.nextDouble();
			num10 = input.nextDouble();
			
			if ((num1 < 0.0) || (num2 < 0.0) || (num3 < 0.0) || (num4 < 0.0) || (num5 < 0.0) || (num6 < 0.0) || 
				(num7 < 0.0) || (num8 < 0.0) || (num9 < 0.0) || (num10 < 0.0))
			{
				continue;
			}
			else
			{
				isValidInput = !isValidInput;
			}
		}
		
		double sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10; 
		
		System.out.println("The mean is " + mean(sum, 10));
		
		double sumOfSquaredNumbers = (num1 * num1) + (num2 * num2) + (num3 * num3) + (num4 * num4) + 
				(num5 * num5) + (num6 * num6) + (num7 * num7) + (num8 * num8) + (num9 * num9) + (num10 * num10);
		
		System.out.printf("The standard deviation is %7.5f", standardDeviation(sum, sumOfSquaredNumbers, 10));
		
		input.close();
	}
	
	/**
	 * Returns the mean using the the sum of the numbers and the total numbers.
	 * <p>
	 * If the first argument is negative, it will default to 0.0.
	 * <p>
	 * If the second argument is less than 2, it will default to 2.
	 * 
	 * @param sumOfNumbers	sum of all numbers
	 * @param totalNumbers	total numbers
	 * @return				the mean of the numbers
	 */
	public static double mean(double sumOfNumbers, int totalNumbers)
	{
		if (totalNumbers < 2)
		{
			totalNumbers = 2;
		}
		
		if (sumOfNumbers < 0.0)
		{
			sumOfNumbers = 0.0;
		}
		
		return sumOfNumbers / totalNumbers;
	}
	
	/**
	 * Returns the standard deviation of the numbers using the sum of the numbers, the sum of the squared numbers, 
	 * and the total numbers.
	 * <p>
	 * The sum of the squared numbers is done by squaring each number and adding them together.
	 * <p>
	 * If the first argument or second argument is negative or the third argument is less than 2, the standard 
	 * deviation will default to zero.
	 * 
	 * @param sumOfNumbers			sum of all numbers
	 * @param sumOfSquaredNumbers	sum of the squared numbers
	 * @param totalNumbers			total numbers
	 * @return						the standard deviation of the numbers
	 */
	public static double standardDeviation(double sumOfNumbers, double sumOfSquaredNumbers, int totalNumbers)
	{
		if ((sumOfNumbers < 0.0) || (sumOfSquaredNumbers < 0.0) || (totalNumbers < 2))
		{
			return 0.0;
		}
		
		return Math.sqrt((sumOfSquaredNumbers - (Math.pow(sumOfNumbers, 2.0) / totalNumbers)) / (totalNumbers - 1));
	}
}