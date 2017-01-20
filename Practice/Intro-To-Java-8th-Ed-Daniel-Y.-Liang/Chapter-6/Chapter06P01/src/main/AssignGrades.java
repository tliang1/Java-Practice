package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class AssignGrades
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int totalStudents = input.nextInt();
		
		while (totalStudents < 1)
		{
			System.out.print("Enter the number of students (Must be nonzero positive): ");
			totalStudents = input.nextInt();
		}
		
		int[] scores = new int[totalStudents];
		
		System.out.print("Enter " + totalStudents);
		
		if (totalStudents > 1)
		{
			System.out.print(" scores: ");
		}
		else
		{
			System.out.print(" score: ");
		}
		
		for (int student = 0; student < totalStudents; student++)
		{
			scores[student] = input.nextInt();
		}
		
		printStudentsScoresAndGrades(scores);
		
		input.close();
	}

	/**
	 * Returns the largest integer in the integer array argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer array's size is less than 1, the largest integer will default to 0.
	 * 	</li>
	 * 	<li>
	 * 		If the integer array's size is 1, the largest integer will default to the only element in the array.
	 * 	</li>
	 * </ul>
	 * 
	 * @param numbers	array of integers
	 * @return			the largest integer
	 */
	public static int largestNumber(int[] numbers)
	{
		if (numbers.length < 1)
		{
			return 0;
		}
		else if (numbers.length == 1)
		{
			return numbers[0];
		}
		else
		{
			int max = numbers[0];
			
			for (int index = 1; index < numbers.length; index++)
			{
				if (numbers[index] > max)
				{
					max = numbers[index];
				}
			}
			
			return max;
		}
	}
	
	/**
	 * Prints every student's score and grade using the integer array argument.
	 * <ul>
	 * 	<li>
	 * 		If the integer array's size is less than 1, nothing is displayed.
	 * 	</li>
	 * </ul>
	 * 
	 * @param numbers	array of integers
	 */
	public static void printStudentsScoresAndGrades(int[] numbers)
	{
		if (numbers.length > 0)
		{
			int bestScore = largestNumber(numbers);
			
			for (int index = 0; index < numbers.length; index++)
			{
				System.out.print("Student " + index + " score is " + numbers[index] + " and grade is ");
				
				if (numbers[index] >= (bestScore - 10))
				{
					System.out.println("A");
				}
				else if (numbers[index] >= (bestScore - 20))
				{
					System.out.println("B");
				}
				else if (numbers[index] >= (bestScore - 30))
				{
					System.out.println("C");
				}
				else if (numbers[index] >= (bestScore - 40))
				{
					System.out.println("D");
				}
				else
				{
					System.out.println("F");
				}
			}
		}
	}
}