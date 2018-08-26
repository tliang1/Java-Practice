package main;

import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class ATMMachine
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_ACCOUNTS = 10;
		final double BALANCE = 100;
		
		Account[] accounts = new Account[NUMBER_OF_ACCOUNTS];
		
		for (int id = 0; id < NUMBER_OF_ACCOUNTS; id++)
		{
			accounts[id] = new Account(id, BALANCE);
		}
		
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			System.out.print("Enter an id: ");
			int id = input.nextInt();
			
			while (!(id >= 0) || !(id < NUMBER_OF_ACCOUNTS))
			{
				System.out.print("Enter a correct id: ");
				id = input.nextInt();
			}
			
			System.out.println();
			
			int choice = 0;
			
			while (choice != 4)
			{
				System.out.print("Main menu\n" + 
						"1: check balance\n" + 
						"2: withdraw\n" + 
						"3: deposit\n" + 
						"4: exit\n" + 
						"Enter a choice: ");
				choice = input.nextInt();
				
				switch (choice)
				{
					case 1: System.out.println("The balance is " + accounts[id].getBalance() + "\n");
							break;
					case 2: System.out.print("Enter an amount to withdraw: ");
							double withdrawAmount = input.nextDouble();
							
							accounts[id].withdraw(withdrawAmount);
							
							System.out.println();
							break;
					case 3: System.out.print("Enter an amount to deposit: ");
							double depositAmount = input.nextDouble();
							
							accounts[id].deposit(depositAmount);
							
							System.out.println();
							break;
					default: break; 
				}
			}
			
			System.out.println();
		}
	}
}