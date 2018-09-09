package main;

import java.util.Date;

/**
 * @author Tony Liang
 *
 */
public class Transaction
{
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	public static final char DEPOSIT = 'D';
	public static final char WITHDRAWAL = 'W';
	
	/**
	 * Creates a new Transaction given the type of the transaction, the amount, the new balance after this transaction, and the description.
	 * <ul>
	 * 	<li>
	 * 		If the description is not specified, it will default to N/A.
	 * 	</li>
	 * </ul>
	 * 
	 * @param type			type of the transaction (D = Deposit or W = Withdrawal)
	 * @param amount		amount
	 * @param balance		new balance after this transaction
	 * @param description	description
	 */
	public Transaction(char type, double amount, double balance, String description)
	{
		this.date = new Date();
		this.type = Character.isUpperCase(type) ? type : Character.toUpperCase(type);
		this.amount = amount;
		this.balance = balance;
		this.description = description.trim().matches("\\S.*") ? description.trim() : "N/A";
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public char getType()
	{
		return type;
	}

	public void setType(char type)
	{
		this.type = Character.isUpperCase(type) ? type : Character.toUpperCase(type);
	}

	public double getAmount()
	{
		return amount;
	}

	public void setAmount(double amount)
	{
		this.amount = amount;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description.trim().matches("\\S.*") ? description.trim() : "N/A";
	}
}