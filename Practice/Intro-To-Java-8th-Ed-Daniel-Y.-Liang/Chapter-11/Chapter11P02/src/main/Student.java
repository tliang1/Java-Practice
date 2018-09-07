package main;

/**
 * @author Tony Liang
 *
 */
public class Student extends Person
{
	private String status;
	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";
	
	/**
	 * Creates a new default Student as a freshman.
	 */
	public Student()
	{
		this("");
	}
	
	/**
	 * Creates a new Student as a freshman given the name.
	 * 
	 * @param name	name
	 */
	public Student(String name)
	{
		this(name, FRESHMAN);
	}
	
	/**
	 * Creates a new Student given the name and class status.
	 * <ul>
	 * 	<li>
	 * 		If the class status is not Freshman, Sophomore, Junior, or Senior, it will default to Freshman.
	 * 	</li>
	 * </ul>
	 * 
	 * @param name		name
	 * @param status	class status (Freshman, Sophomore, Junior, or Senior)
	 */
	public Student(String name, String status)
	{
		super(name);
		
		if (status.equalsIgnoreCase(FRESHMAN) || status.equalsIgnoreCase(SOPHOMORE) || status.equalsIgnoreCase(JUNIOR) || 
				status.equalsIgnoreCase(SENIOR))
		{
			this.status = Character.toUpperCase(status.charAt(0)) + status.substring(1);
		}
		else
		{
			this.status = FRESHMAN;
		}
	}
	
	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		if (status.equalsIgnoreCase(FRESHMAN) || status.equalsIgnoreCase(SOPHOMORE) || status.equalsIgnoreCase(JUNIOR) || 
				status.equalsIgnoreCase(SENIOR))
		{
			this.status = Character.toUpperCase(status.charAt(0)) + status.substring(1);
		}
		else
		{
			this.status = FRESHMAN;
		}
	}

	public String toString()
	{
		return "Student: " + super.getName();
	}
}