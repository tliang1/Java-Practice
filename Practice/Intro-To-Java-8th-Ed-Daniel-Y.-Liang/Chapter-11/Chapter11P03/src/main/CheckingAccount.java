package main;

/**
 * @author Tony Liang
 *
 */
public class CheckingAccount extends Account
{
	private double overdraftLimit;
	
	/**
	 * Creates a new default CheckingAccount.
	 */
	public CheckingAccount()
	{
		this(0, 0.0);
	}
	
	/**
	 * Creates a new CheckingAccount given the ID and balance.
	 * 
	 * @param id		ID
	 * @param balance	balance
	 */
	public CheckingAccount(int id, double balance)
	{
		this(id, balance, 0.0);
	}
	
	/**
	 * Creates a new CheckingAccount given the ID, balance, and overdraft limit.
	 * <ul>
	 * 	<li>
	 * 		If the overdraft limit is negative, it will default to $0.00.
	 * 	</li>
	 * </ul>
	 * 
	 * @param id				ID
	 * @param balance			balance
	 * @param overdraftLimit	overdraft limit
	 */
	public CheckingAccount(int id, double balance, double overdraftLimit)
	{
		super(id, balance);
		this.overdraftLimit = (overdraftLimit > 0.0) ? overdraftLimit : 0.0;
	}
	
	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit)
	{
		this.overdraftLimit = (overdraftLimit > 0.0) ? overdraftLimit : 0.0;
	}
	
	/**
	 * Subtracts the given amount from the checking account's balance.
	 * <ul>
	 * 	<li>
	 * 		If the amount is negative or greater than the sum of the current balance and the overdraft limit in the checking account, nothing 
	 * 		is withdrawn.
	 * 	</li>
	 * </ul>
	 * 
	 * @param amount	amount to withdraw from the checking account
	 */
	public void withdraw(double amount)
	{
		if ((amount >= 0.0) && (amount <= (getBalance() + overdraftLimit)))
		{
			setBalance(getBalance() - (Math.floor(amount * 100.0) / 100.0));
		}
	}

	public String toString()
	{
		return "Checking " + super.toString() + " The overdraft limit is $" + overdraftLimit;
	}
}