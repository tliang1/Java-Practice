package main;

/**
 * @author Tony Liang
 *
 */
public class TestAccount
{
	public static void main(String[] args)
	{
		Account account = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		
		double monthlyInterest = Math.floor(account.getBalance() * Account.getMonthlyInterestRate()) / 100.0;
		
		System.out.printf("Account " + account.getId() + 
				" has a balance of $%,.2f and a monthly interest of $%,.2f. This account was created on " + 
				account.getDateCreated().toString() + ".", account.getBalance(), monthlyInterest);
	}
}