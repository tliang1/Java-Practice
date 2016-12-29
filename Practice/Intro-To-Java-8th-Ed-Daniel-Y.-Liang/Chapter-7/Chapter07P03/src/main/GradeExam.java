package main;

/**
 * @author Tony Liang
 *
 */
public class GradeExam
{
	public static void main(String[] args)
	{
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		final int STUDENT_AND_SCORE = 2;
		int[][] correctAnswers = new int[answers.length][STUDENT_AND_SCORE];
		
		for (int student = 0;  student < answers.length;  student++)
		{
			int correctCount = 0;
			
			for (int studentAnswers = 0; studentAnswers < answers[student].length; studentAnswers++)
			{
				if (answers[student][studentAnswers] == keys[studentAnswers])
				{
					correctCount++;
				}
			}
			
			correctAnswers[student][0] = student;
			correctAnswers[student][1] = correctCount;
		}
		
		selectionSortStudents(correctAnswers);
		
		for (int student = 0; student < correctAnswers.length; student++)
		{
			System.out.println("Student " + correctAnswers[student][0] + "’s correct count is " +
					correctAnswers[student][1]);
		}
	}
	
	/**
	 * Sorts the integer two-dimensional array argument in increasing order of the second element of the
	 * one-dimensional array using selection sort.
	 * <p>
	 * For the studentScores array:
	 * <p>
	 * studentScores[i][j]
	 * <p>
	 * i = row
	 * <p>
	 * j = student/score where j = 0 = student's number and j = 1 = student's score
	 * <p>
	 * If the integer two-dimensional array's one-dimensional arrays' sizes are not equal to 2, an error will be
	 * displayed.
	 * 
	 * @param studentScores		array of students and their scores
	 */
	public static void selectionSortStudents(int[][] studentScores) 
	{
		for (int[] student : studentScores)
		{
			if (student.length != 2)
			{
				System.out.println("Error: Every element of the two-dimensional array must have a size of 2.");
				System.exit(0);
			}
		}
		
		for (int student = 0; student < studentScores.length - 1; student++)
		{
			int[] currentMin = studentScores[student];
			int currentMinIndex = student;
			
			for (int nextStudent = student + 1; nextStudent < studentScores.length; nextStudent++)
			{
				if (currentMin[1] > studentScores[nextStudent][1])
				{
					currentMin = studentScores[nextStudent];
					currentMinIndex = nextStudent;
				}
			}
			
			if (currentMinIndex != student)
			{
				studentScores[currentMinIndex] = studentScores[student];
				studentScores[student] = currentMin;
			}
		}
	}
}