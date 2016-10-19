package main;

import java.util.Scanner;

public class TwoHighestScores
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int totalStudents = input.nextInt();
		
		while (totalStudents < 0)
		{
			System.out.print("Enter the number of students (Must be positive): ");
			totalStudents = input.nextInt();
		}
		
		String highestScoreStudent = "";
		String secondHighestScoreStudent = "";
		double highestScore = 0.0;
		double secondHighestScore = 0.0;
		
		for (int i = 0; i < totalStudents; i++)
		{
			System.out.print("Enter Student " + (i + 1) + "'s name and score: ");
			String studentName = input.next();
			double studentScore = input.nextDouble();
			
			while (studentScore < 0.0)
			{
				System.out.print("Enter Student " + (i + 1) + "'s name and score (Score must be positive): ");
				studentName = input.next();
				studentScore = input.nextDouble();
			}
			
			if (studentScore >= highestScore)
			{
				secondHighestScoreStudent = highestScoreStudent;
				secondHighestScore = highestScore;
				highestScoreStudent = studentName;
				highestScore = studentScore;
			}
			else if (studentScore >= secondHighestScore)
			{
				secondHighestScoreStudent = studentName;
				secondHighestScore = studentScore;
			}
		}
		
		System.out.println(highestScoreStudent + " has the highest score and " + secondHighestScoreStudent + 
				" has the second highest score");
		
		input.close();
	}

}