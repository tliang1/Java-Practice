package main;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Tony Liang
 *
 */
public class Account
{
	private String name;
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;
	
	/**
	 * Creates a new default Account.
	 */
	public Account()
	{
		this(0, 0.0);
	}
	
	
	/**
	 * Creates a new Account given the ID and balance.
	 * 
	 * @param id		the account's ID
	 * @param balance	the account's balance
	 */
	public Account(int id, double balance)
	{
		this("", id, balance);
	}
	
	/**
	 * Creates a new Account given the customer's name, ID, and balance.
	 * <ul>
	 * 	<li>
	 * 		If the name is empty, it will be assigned a default name.
	 * 	</li>
	 * 	<li>
	 * 		If the ID is not a nonzero positive integer, it will default to 0.
	 * 	</li>
	 * 	<li>
	 * 		If the balance is not a positive number, it will default to $0.00.
	 * 	</li>
	 * </ul>
	 * 
	 * @param name		the name of the customer
	 * @param id		the account's ID
	 * @param balance	the account's balance
	 */
	public Account(String name, int id, double balance)
	{
		this.name = name.trim().matches("\\S.*") ? name.trim() : "John Doe";
		this.id = (id > 0) ? id : 0;
		this.balance = (balance >= 0.0) ? Math.floor(balance * 100.0) / 100.0 : 0.0;
		this.dateCreated = new Date();
		this.transactions = new ArrayList<>();
	}
	
	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name.trim().matches("\\S.*") ? name.trim() : "John Doe";
	}


	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		if (id > 0)
		{
			this.id = id;
		}
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = Math.floor(balance * 100.0) / 100.0;
	}

	public static double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate)
	{
		if (annualInterestRate >= 0.0)
		{
			Account.annualInterestRate = annualInterestRate;
		}
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	public ArrayList<Transaction> getTransactions()
	{
		return transactions;
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
			transactions.add(new Transaction('W', amount, balance, "Withdrawn $" + amount + " from the account."));
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
			transactions.add(new Transaction('D', amount, balance, "Deposited $" + amount + " from the account."));
		}
	}
	
	public String toString()
	{
		return "Account #" + id + " has a balance of $" + balance + " and annual interest rate of " + annualInterestRate + "%. It was " + 
					"created on " + dateCreated.toString() + ".";
	}
}