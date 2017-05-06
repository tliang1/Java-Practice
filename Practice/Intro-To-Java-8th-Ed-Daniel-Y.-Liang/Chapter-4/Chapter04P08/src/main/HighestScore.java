package main;

import java.util.Scanner;

public class HighestScore
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
		double highestScore = 0.0;
		
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
				highestScoreStudent = studentName;
				highestScore = studentScore;
			}
			
		}
		
		System.out.println(highestScoreStudent + " has the highest score");
		
		input.close();
	}

}