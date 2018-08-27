package main;

import java.util.Arrays;

/**
 * @author Tony Liang
 *
 */
public class Course
{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	/**
	 * Creates a new Course given the course name.
	 * 
	 * @param courseName	course name
	 */
	public Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void addStudent(String student)
	{
		if (numberOfStudents >= students.length)
		{
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		
		students[numberOfStudents++] = student;
	}
	
	public String[] getStudents()
	{
		return students;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void dropStudent(String student)
	{
		int studentIndex = 0;
		
		while ((!students[studentIndex].equals(student)) && (studentIndex < students.length))
		{
			studentIndex++;
		}
		
		if (studentIndex != students.length)
		{
			numberOfStudents--;
			students[studentIndex] = null;
			
			if (studentIndex < (students.length - 1))
			{
				System.arraycopy(students, studentIndex + 1, students, studentIndex, students.length - (studentIndex + 1));
			}
		}
	}
	
	/**
	 * Removes all students from the course.
	 */
	public void clear()
	{
		numberOfStudents = 0;
		Arrays.fill(students, null);
	}
}