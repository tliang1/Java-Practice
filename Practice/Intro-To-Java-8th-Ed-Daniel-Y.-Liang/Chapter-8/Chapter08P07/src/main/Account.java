package main;

import java.util.Date;

/**
 * @author Tony Liang
 *
 */
public class Account
{
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private Date dateCreated;
	
	/**
	 * Creates a new default Account.
	 */
	public Account()
	{
		dateCreated = new Date();
	}
	
	
	/**
	 * Creates a new Account given the ID and balance.
	 * <ul>
	 * 	<li>
	 * 		If the ID is not a nonzero positive integer, it will default to 0.
	 * 	</li>
	 * 	<li>
	 * 		If the balance is not a positive number, it will default to 0.00.
	 * 	</li>
	 * </ul>
	 * 
	 * @param newID			the account's ID
	 * @param newBalance	the account's balance
	 */
	public Account(int newID, double newBalance)
	{
		id = (newID > 0) ? newID : 0;
		balance = (newBalance >= 0.0) ? Math.floor(newBalance * 100.0) / 100.0 : 0.0;
		dateCreated = new Date();
	}
	
	public int getId()
	{
		return id;
	}

	public void setId(int newID)
	{
		if (newID > 0)
		{
			id = newID;
		}
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double newBalance)
	{
		if (newBalance >= 0.0)
		{
			balance = Math.floor(newBalance * 100.0) / 100.0;
		}
	}

	public static double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double newAnnualInterestRate)
	{
		if (newAnnualInterestRate >= 0.0)
		{
			annualInterestRate = newAnnualInterestRate;
		}
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}

	/**
	 * Returns the monthly interest rate in percent of the account.
	 * 
	 * @return	the monthly interest rate in percent of the account
	 */
	public static double getMonthlyInterestRate()
	{
		return annualInterestRate / 12.0;
	}
	
	/**
	 * Subtracts the given amount from the account's balance.
	 * <ul>
	 * 	<li>
	 * 		If the amount is negative or greater than the current balance in the account, nothing is withdrawn.
	 * 	</li>
	 * </ul>
	 * 
	 * @param amount	amount to withdraw from the account
	 */
	public void withdraw(double amount)
	{
		if ((amount >= 0.0) && (amount <= balance))
		{
			balance -= Math.floor(amount * 100.0) / 100.0;
		}
	}
	
	/**
	 * Adds the given amount to the account's balance.
	 * <ul>
	 * 	<li>
	 * 		If the amount is not a nonzero positive number, nothing is deposited.
	 * 	</li>
	 * </ul>
	 * 
	 * @param amount	amount to deposit into the account
	 */
	public void deposit(double amount)
	{
		if (amount > 0.0)
		{
			balance += Math.floor(amount * 100.0) / 100.0;
		}
	}
}