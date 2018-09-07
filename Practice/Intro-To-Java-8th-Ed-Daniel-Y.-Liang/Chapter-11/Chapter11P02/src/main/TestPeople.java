package main;

/**
 * @author Tony Liang
 *
 */
public class TestPeople
{
	public static void main(String[] args)
	{
		Person person = new Person("Scott Kim");
        Student student = new Student("Jennie Massey");
        Employee employee = new Employee("Edith	Owens");
        Faculty faculty = new Faculty("Brittany Neal");
        Staff staff = new Staff("Luke Hardy");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
	}
}