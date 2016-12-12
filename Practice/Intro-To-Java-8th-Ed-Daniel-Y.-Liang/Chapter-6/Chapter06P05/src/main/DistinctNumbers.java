package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class DistinctNumbers
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int MAX_NUMBER_OF_DISTINCT_INTEGERS = 10;
		int[] integers = new int[MAX_NUMBER_OF_DISTINCT_INTEGERS];
		Arrays.fill(integers, -1);
		
		System.out.print("Enter ten numbers: ");
		
		int distinctIndex = 0;
		
		for(int count = 0; count < integers.length; count++)
		{
			int number = input.nextInt();
			
			boolean distinct = true;
			
			for (int index = 0; index < (count + 1); index++)
			{
				if (integers[index] == number)
				{
					distinct = false;
					break;
				}
			}
			
			if (distinct)
			{
				integers[distinctIndex] = number;
				distinctIndex++;
			}
		}
		
		System.out.print("The distinct numbers are: ");
		
		for (int index = 0; index < integers.length; index++)
		{
			if (integers[index] < 0)
			{
				break;
			}
			
			System.out.print(integers[index] + " ");
		}
		
		System.out.println();
		
		input.close();
	}
}
