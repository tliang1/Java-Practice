package main;

import java.util.ArrayList;

/**
 * @author Tony Liang
 *
 */
public class TestAccountAndTransaction
{
	public static void main(String[] args)
	{
		Account account = new Account("George", 1122, 1000); 
		Account.setAnnualInterestRate(1.5);
		
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		
		System.out.println("Account summary of " + account.getName() + ":");
		System.out.println("Annual interest rate: " + Account.getAnnualInterestRate() + "%");
		System.out.println("Current balance: $" + account.getBalance());
		
		System.out.println("List of transactions:");
		
		ArrayList<Transaction> transactions = account.getTransactions();
		
		for (int transaction = 1; transaction <= transactions.size(); transaction++)
		{
			Transaction currentTransaction = transactions.get(transaction - 1);
			System.out.println("Date: " + currentTransaction.getDate() + " Type: " + currentTransaction.getType() + " Amount: $" + 
									currentTransaction.getAmount() + " New Balance: $" + currentTransaction.getBalance() + " Description: " + 
									currentTransaction.getDescription());
		}
	}
}