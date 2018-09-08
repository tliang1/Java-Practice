package main;

/**
 * @author Tony Liang
 *
 */
public class SavingsAccount extends Account
{
	/**
	 * Creates a new default SavingsAccount.
	 */
	public SavingsAccount()
	{
		this(0, 0.0);
	}
	
	/**
	 * Creates a new SavingsAccount given the ID and balance.
	 * 
	 * @param id		ID
	 * @param balance	balance
	 */
	public SavingsAccount(int id, double balance)
	{
		super(id, balance);
	}
	
	public String toString()
	{
		return "Savings " + super.toString();
	}
}