package main;

/**
 * @author Tony Liang
 *
 */
public class Faculty extends Employee
{
	private String officeHours, rank;
	
	/**
	 * Creates a new default Faculty.
	 */
	public Faculty()
	{
		this("");
	}
	
	/**
	 * Creates a new Faculty given the name.
	 * 
	 * @param name	name
	 */
	public Faculty(String name)
	{
		this(name, "", "");
	}
	
	/**
	 * Creates a new Faculty given the name, office hours, and rank.
	 * <ul>
	 * 	<li>
	 * 		If the office hours or rank are not specified, they will default to N/A respectively.
	 * 	</li>
	 * </ul>
	 * 
	 * @param name			name
	 * @param officeHours	office hours
	 * @param rank			rank
	 */
	public Faculty(String name, String officeHours, String rank)
	{
		super(name);
		this.officeHours = officeHours.trim().matches("\\S.*") ? officeHours.trim() : "N/A";
		this.rank = rank.trim().matches("\\S.*") ? rank.trim() : "N/A";
	}
	
	public String getOfficeHours()
	{
		return officeHours;
	}

	public void setOfficeHours(String officeHours)
	{
		this.officeHours = officeHours.trim().matches("\\S.*") ? officeHours.trim() : "N/A";
	}

	public String getRank()
	{
		return rank;
	}

	public void setRank(String rank)
	{
		this.rank = rank.trim().matches("\\S.*") ? rank.trim() : "N/A";
	}

	public String toString()
	{
		return "Faculty: " + super.getName();
	}
}