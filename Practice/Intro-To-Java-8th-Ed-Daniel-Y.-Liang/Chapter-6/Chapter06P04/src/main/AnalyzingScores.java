package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class AnalyzingScores
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter scores (Limit: 10 scores maximum. Enter a negative integer to finish): ");
		
		final int MAX_NUMBER_OF_SCORES = 10;
		int[] scores = new int[MAX_NUMBER_OF_SCORES];
		Arrays.fill(scores, -1);
		int score = 0;
		int currentIndex = 0;
		
		while (score >= 0)
		{
			score = input.nextInt();
			
			if (score >= 0)
			{
				scores[currentIndex] = score;
				currentIndex++;
			}
		}
		
		double average = 0.0;
		
		for (currentIndex = 0; currentIndex < scores.length; currentIndex++)
		{
			if (scores[currentIndex] != -1)
			{
				average += scores[currentIndex];
			}
			else
			{
				break;
			}
		}
		
		average /= currentIndex;
		
		int averageOrAbove = 0;
		int belowAverage = 0;
		
		for (int index = 0; index < scores.length; index++)
		{
			if (scores[index] >= 0)
			{
				if (scores[index] >= average)
				{
					averageOrAbove++;
				}
				else
				{
					belowAverage++;
				}
			}
		}
		
		System.out.println(averageOrAbove + " scores are above or equal to the average score of " + average + ".");
		System.out.println(belowAverage + " scores are below the average score of " + average + ".");
		
		input.close();
	}
}