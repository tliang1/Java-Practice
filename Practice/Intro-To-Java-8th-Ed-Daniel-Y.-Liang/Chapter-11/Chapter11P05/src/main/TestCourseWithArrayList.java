package main;

/**
 * @author Tony Liang
 *
 */
public class TestCourseWithArrayList
{
	public static void main(String[] args)
	{
		Course course = new Course("Data Structures");
		course.addStudent("Peter Jones");
		course.addStudent("Brian Smith");
		course.addStudent("Anne Kennedy");
		
		course.dropStudent("Brian Smith");
		
		String[] students = course.getStudents();
		
		System.out.print("List of students for the " + course.getCourseName() + " course: ");
		
		for (int student = 0; student < course.getNumberOfStudents() - 1; student++)
		{
			System.out.print(students[student] + ", ");
		}
		
		if (course.getNumberOfStudents() > 0)
		{
			if (course.getNumberOfStudents() > 1)
			{
				System.out.print("and ");
			}
			
			System.out.print(students[course.getNumberOfStudents() - 1]);
		}
		
		System.out.println(".");
	}
}