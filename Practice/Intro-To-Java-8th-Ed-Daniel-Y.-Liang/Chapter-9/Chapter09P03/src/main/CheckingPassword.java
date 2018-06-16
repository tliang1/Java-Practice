package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class CheckingPassword
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a password: ");
		String password = input.next();
		
		if (isValidPassword(password))
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}
		
		input.close();
	}
	
	/**
	 * Returns true if the password is valid.
	 * <ul>
	 * 	<li>
	 * 		If the password's length is less than 8, it will default to false.
	 * 	</li>
	 * 	<li>
	 * 		If the password does not consist of only letters and digits, it will default to false.
	 * 	</li>
	 * 	<li>
	 * 		If the password has less than 2 digits, it will default to false.
	 * 	</li>
	 * </ul>
	 * 
	 * @param password	password
	 * @return			true if the password is valid. Otherwise, false.
	 */
	public static boolean isValidPassword(String password)
	{
		if (password.length() > 7)
		{
			if (password.matches("([a-zA-Z]+[0-9]|[0-9]+[a-zA-Z])[a-zA-Z0-9]*"))
			{
				if (password.matches("[a-zA-Z]*[0-9][a-zA-Z]*[0-9][a-zA-Z0-9]*"))
				{
					return true;
				}
			}
		}
		
		return false;
	}
}