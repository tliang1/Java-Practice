package main;

import java.util.ArrayList;

/**
 * @author Tony Liang
 *
 */
public class Course
{
	private String courseName;
	private ArrayList<String> students;
	
	/**
	 * Creates a new Course given the course name.
	 * 
	 * @param courseName	course name
	 */
	public Course(String courseName)
	{
		this.courseName = courseName;
		students = new ArrayList<String>();
	}
	
	public void addStudent(String student)
	{
		students.add(student);
	}
	
	public String[] getStudents()
	{
		return students.toArray(new String[students.size()]);
	}
	
	public int getNumberOfStudents()
	{
		return students.size();
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void dropStudent(String student)
	{
		students.remove(student);
	}
	
	/**
	 * Removes all students from the course.
	 */
	public void clear()
	{
		students.clear();
	}
}