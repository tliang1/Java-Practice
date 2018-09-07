package main;

/**
 * @author Tony Liang
 *
 */
public class Employee extends Person
{
	private String office;
	private double salary;
	private MyDate dateHired;
	
	/**
	 * Creates a new default Employee.
	 */
	public Employee()
	{
		this("");
	}
	
	/**
	 * Creates a new Employee given the name.
	 * 
	 * @param name	name
	 */
	public Employee(String name)
	{
		this(name, "", 0, new MyDate());
	}
	
	/**
	 * Creates a new Employee given the name, office, salary, and date hired.
	 * <ul>
	 * 	<li>
	 * 		If the office is not specified, it will default to N/A.
	 * 	</li>
	 * 	<li>
	 * 		If the salary is not greater than $0.00, it will default to $25,000.
	 * 	</li>
	 * </ul>
	 * 
	 * @param name			name
	 * @param office		office
	 * @param salary		salary
	 * @param dateHired		date hired
	 */
	public Employee(String name, String office, double salary, MyDate dateHired)
	{
		super(name);
		this.office = office.trim().matches("\\S.*") ? office.trim() : "N/A";
		this.salary = (salary > 0.0) ? salary : 25000;
		this.dateHired = dateHired;
	}
	
	public String getOffice()
	{
		return office;
	}

	public void setOffice(String office)
	{
		this.office = office.trim().matches("\\S.*") ? office.trim() : "N/A";
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = (salary > 0.0) ? salary : 25000;
	}

	public MyDate getDateHired()
	{
		return dateHired;
	}

	public void setDateHired(MyDate dateHired)
	{
		this.dateHired = dateHired;
	}

	public String toString()
	{
		return "Employee: " + super.getName();
	}
}