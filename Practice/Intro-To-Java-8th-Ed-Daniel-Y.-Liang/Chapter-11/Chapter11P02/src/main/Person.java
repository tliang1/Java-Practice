package main;

/**
 * @author Tony Liang
 *
 */
public class Person
{
	private String name, address, phoneNumber, emailAddress;
	
	/**
	 * Creates a new default Person.
	 */
	public Person()
	{
		this("");
	}
	
	/**
	 * Creates a new Person given the name.
	 * 
	 * @param name	name
	 */
	public Person(String name)
	{
		this(name, "", "", "");
	}
	
	/**
	 * Creates a new Person given the name, address, phone number, and email address.
	 * <ul>
	 * 	<li>
	 * 		If the name, address, phone number, or email address are empty, they will be assigned a default value respectively.
	 * 	</li>
	 * </ul>
	 * 
	 * @param name			name
	 * @param address		address
	 * @param phoneNumber	phone number
	 * @param emailAddress	email address
	 */
	public Person(String name, String address, String phoneNumber, String emailAddress)
	{
		this.name = name.trim().matches("\\S.*") ? name.trim() : "John Doe";
		this.address = address.trim().matches("\\S.*") ? address.trim() : "123 Main Street, Los Angeles, CA 90012";
		this.phoneNumber = phoneNumber.trim().matches("\\S.*") ? phoneNumber.trim() : "1 (323) 123-4567";
		this.emailAddress = emailAddress.trim().matches("\\S.*") ? emailAddress.trim() : "johndoe@example.com";
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name.trim().matches("\\S.*") ? name.trim() : "John Doe";
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address.trim().matches("\\S.*") ? address.trim() : "123 Main Street, Los Angeles, CA 90012";
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber.trim().matches("\\S.*") ? phoneNumber.trim() : "1 (323) 123-4567";
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress.trim().matches("\\S.*") ? emailAddress.trim() : "johndoe@example.com";
	}
	
	public String toString()
	{
		return "Person: " + name;
	}
}