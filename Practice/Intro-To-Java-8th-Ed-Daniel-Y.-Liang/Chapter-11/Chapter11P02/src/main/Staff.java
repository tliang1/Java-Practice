package main;

/**
 * @author Tony Liang
 *
 */
public class Staff extends Employee
{
	private String title;
	
	/**
	 * Creates a new default Staff.
	 */
	public Staff()
	{
		this("");
	}
	
	/**
	 * Creates a new Staff given the name.
	 * 
	 * @param name	name
	 */
	public Staff(String name)
	{
		this(name, "");
	}
	
	/**
	 * Creates a new Staff given the name and title.
	 * <ul>
	 * 	<li>
	 * 		If the title is not specified, it will default to N/A.
	 * 	</li>
	 * </ul>
	 * 
	 * @param name		name
	 * @param title		title
	 */
	public Staff(String name, String title)
	{
		super(name);
		this.title = title.trim().matches("\\S.*") ? title.trim() : "N/A";
	}
	
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title.trim().matches("\\S.*") ? title.trim() : "N/A";
	}

	public String toString()
	{
		return "Staff: " + super.getName();
	}
}