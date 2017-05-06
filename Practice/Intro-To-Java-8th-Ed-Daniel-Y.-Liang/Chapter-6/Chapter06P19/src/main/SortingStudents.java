package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class SortingStudents
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
		
		String[] names = new String[totalStudents];
		int[] scores = new int[totalStudents];
		
		for (int student = 0; student < totalStudents; student++)
		{
			System.out.print("Enter student #" + (student + 1) + "'s name: ");
			names[student] = input.next();
			
			System.out.print("Enter student #" + (student + 1) + "'s score: ");
			scores[student] = input.nextInt();
		}
		
		System.out.println();
		
		selectionSortStudentsScores(scores, names);
		
		System.out.print("List of students ordered from highest score to lowest score: ");
		
		for (int index = 0; index < totalStudents; index++)
		{
			System.out.print(names[index] + " ");
		}
		
		System.out.println();
		
		input.close();
	}
	
	/**
	 * Sorts the integer and string array arguments using selection sort.
	 * <ul>
	 * 	<li>
	 * 		If the integer array's size is not equal to the string array's size, an error will be displayed.
	 * 	</li>
	 * </ul>
	 * 
	 * @param scores	array of scores
	 * @param names		array of names
	 */
	public static void selectionSortStudentsScores(int[] scores, String[] names) 
	{
		if (scores.length != names.length)
		{
			System.out.println("Error: The number of scores must equal to the number of student names.");
			System.exit(0);
		}
		
		for (int i = 0; i < scores.length - 1; i++)
		{
			int currentMax = scores[i];
			int currentMaxIndex = i;
			String currentStudent = names[i];
			
			for (int j = i + 1; j < scores.length; j++)
			{
				if (currentMax < scores[j])
				{
					currentMax = scores[j];
					currentStudent = names[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex != i)
			{
				scores[currentMaxIndex] = scores[i];
				names[currentMaxIndex] = names[i];
				scores[i] = currentMax;
				names[i] = currentStudent;
			}
		}
	}
}