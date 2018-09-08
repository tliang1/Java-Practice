package main;

/**
 * @author Tony Liang
 *
 */
public class TestAccounts
{
	public static void main(String[] args)
	{
		Account.setAnnualInterestRate(3.26);
		Account account = new Account(448, 3906.64);
		SavingsAccount savingsAccount = new SavingsAccount(63, 523879.27);
		CheckingAccount checkingAccount = new CheckingAccount(986, 57991.13, 500);
		
		System.out.println(account.toString());
		System.out.println(savingsAccount.toString());
		System.out.println(checkingAccount.toString());
	}
}