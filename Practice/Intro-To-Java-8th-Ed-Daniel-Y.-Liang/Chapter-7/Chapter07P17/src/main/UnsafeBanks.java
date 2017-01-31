/**
 * 
 */
package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class UnsafeBanks
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n = readNumberOfBanks(input);
		double limit = readLimit(input);
		double[] banksBalances = new double[n];
		double[][] borrowers = new double[n][n];
		fillTwoDimensionalArray(borrowers, -1.0);
		
		readBanksBalancesAndBorrowers(banksBalances, borrowers, input);
		
		System.out.println(findUnsafeBanks(banksBalances, borrowers, limit));
		
		input.close();
	}
	
	/**
	 * Returns the number of banks retrieved by the user's input.
	 * <ul>
	 * 	<li>
	 * 		If the number of banks is less than 1, the user must reenter the number of banks until it is greater
	 * 		than 0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param input		simple text scanner used to parse the number of banks
	 * @return			the number of banks
	 */
	public static int readNumberOfBanks(Scanner input)
	{
		int n = -1;
		
		while (n < 1)
		{
			System.out.print("Enter the number of banks: ");
			n = input.nextInt();
		}
		
		return n;
	}
	
	/**
	 * Returns the bank minimum balance limit retrieved by the user's input.
	 * <p>
	 * The limit is represented in million dollars. So a limit of 1 is a limit of a million dollars.
	 * <ul>
	 * 	<li>
	 * 		If the limit is not greater than 0.0, the user must reenter the limit until it is greater than 0.0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param input		simple text scanner used to parse the bank minimum balance limit
	 * @return			the bank minimum balance limit
	 */
	public static double readLimit(Scanner input)
	{
		double limit = 0.0;
		
		while (limit <= 0.0)
		{
			System.out.print("Enter their minimum limit (1 = 1 million dollars) " +
					"(the minimum total assets for keeping a bank safe) (Must be a nonzero positive limit): ");
			limit = input.nextDouble();
		}
		
		return limit;
	}
	
	/**
	 * Fills all elements of the given double two-dimensional array argument with the double value.
	 * 
	 * @param arrays	the array to be filled
	 * @param value		the value to be stored in all elements of the array
	 */
	public static void fillTwoDimensionalArray(double[][] arrays, double value)
	{
		for (int array = 0; array < arrays.length; array++)
		{
			Arrays.fill(arrays[array], value);
		}
	}
	
	/**
	 * Retrieves every banks' balance and their borrowers' IDs and borrow amounts from the user's input.
	 * <ul>
	 * 	<li>
	 * 		If the number of rows and columns of the borrowers array is not equal to the banksBalances array's
	 * 		size, an error will be displayed.
	 * 	</li>
	 * </ul>
	 * 
	 * @param banksBalances		array of each bank's balance
	 * @param borrowers			array of loans each bank gave to the other bank(s)
	 * @param input				simple text scanner used to parse each bank's balance and their borrowers' IDs and
	 * 							borrow amounts
	 */
	public static void readBanksBalancesAndBorrowers(double[] banksBalances, double[][] borrowers, Scanner input)
	{
		boolean borrowersEqualBanks = true;
		
		if (banksBalances.length == borrowers.length)
		{
			for (int borrower = 0; borrower < borrowers.length; borrower++)
			{
				if (borrowers[borrower].length != borrowers.length)
				{
					borrowersEqualBanks = false;
					break;
				}
			}
			
			if (borrowersEqualBanks)
			{
				for (int bank = 0; bank < banksBalances.length; bank++)
				{
					while (banksBalances[bank] <= 0.0)
					{
						System.out.print("Enter the bank " + bank + "'s balance (1 = 1 million dollars) " +
								"(Must be a nonzero positive balance): ");
						banksBalances[bank] = input.nextDouble();
					}
					
					int numberOfBorrowers = -1;
					
					while ((numberOfBorrowers < 0) || (numberOfBorrowers > (borrowers.length - 1)))
					{
						System.out.print("Enter the number of banks that borrowed money from bank " + bank +
								" (Must be between 0 and " + (banksBalances.length - 1) + " inclusive): ");
						numberOfBorrowers = input.nextInt();
					}
					
					for (int borrower = 0; borrower < numberOfBorrowers; borrower++)
					{
						int borrowerID = -1;
						
						while ((borrowerID < 0) || (borrowerID == bank))
						{
							System.out.print("Enter the borrower's id: ");
							borrowerID = input.nextInt();
						}
						
						double amountBorrowed = 0.0;
						
						while (amountBorrowed <= 0.0)
						{
							System.out.print("Enter the amount borrowed: ");
							amountBorrowed = input.nextDouble();
						}
						
						borrowers[bank][borrowerID] = amountBorrowed;
					}
				}
			}
		}
		else
		{
			borrowersEqualBanks = false;
		}
		
		if (!borrowersEqualBanks)
		{
			System.out.println("Error: The borrowers array's rows and columns must equal to the banksBalances"
					+ "array's size.");
			System.exit(0);
		}
	}
	
	/**
	 * Returns which banks are unsafe given the double two-dimensional array argument, double array argument, and
	 * the double value.
	 * <ul>
	 * 	<li>
	 * 		If the limit is not greater than 0.0, it will default to 1.0.
	 * 	</li>
	 * 	<li>
	 * 		If the number of rows of the borrowers array is not equal to the banksBalances array's size, then an
	 * 		empty string is returned.
	 * 	</li>
	 * 	<li>
	 * 		If any of the banks have negative balance, they will default to 0.0.
	 * 	</li>
	 * 	<li>
	 * 		If any of the loans are negative, they will default to -1.0.
	 * 	</li>
	 * </ul>
	 * 
	 * @param banksBalances		array of each bank's balance
	 * @param borrowers			array of loans each bank gave to the other bank(s)
	 * @param limit				the bank minimum balance limit
	 * @return					the unsafe banks
	 */
	public static String findUnsafeBanks(double[] banksBalances, double[][] borrowers, double limit)
	{
		String unsafeBanksString = "";
		
		if (limit <= 0.0)
		{
			limit = 1.0;
		}
		
		if (borrowers.length == banksBalances.length)
		{
			for (int bank = 0; bank < banksBalances.length; bank++)
			{
				if (banksBalances[bank] < 0.0)
				{
					banksBalances[bank] = 0.0;
				}
			}
			
			for (int bank = 0; bank < borrowers.length; bank++)
			{
				if (borrowers[bank].length != borrowers.length)
				{
					double[] updatedBorrowers = new double[borrowers.length];
					Arrays.fill(updatedBorrowers, -1.0);
					
					for (int borrower = 0; ((borrower < updatedBorrowers.length) &&
							(borrower < borrowers[bank].length)); borrower++)
					{
						updatedBorrowers[borrower] = borrowers[bank][borrower];
					}
					
					borrowers[bank] = updatedBorrowers;
				}
				
				for (int borrower = 0; borrower < borrowers[bank].length; borrower++)
				{
					if (borrowers[bank][borrower] < 0.0)
					{
						borrowers[bank][borrower] = -1.0;
					}
				}
			}
			
			unsafeBanksString = "Unsafe banks are ";
			
			for (int bank = 0; bank < borrowers.length; bank++)
			{
				double totalAssets = banksBalances[bank];
				
				for (int borrower = 0; borrower < borrowers[bank].length; borrower++)
				{
					if (borrowers[bank][borrower] > 0.0)
					{
						totalAssets += borrowers[bank][borrower];
					}
				}
				
				if (totalAssets < limit)
				{
					boolean unsafeSet = false;
					
					for (int bank2 = 0; bank2 < borrowers.length; bank2++)
					{
						if (borrowers[bank2][bank] > 0.0)
						{
							unsafeSet = true;
							borrowers[bank2][bank] = 0.0;
						}
					}
					
					if (unsafeSet)
					{
						unsafeBanksString += bank + " ";
						bank = -1;
					}
				}
			}
			
			if (unsafeBanksString.length() == 17)
			{
				unsafeBanksString = "All banks are safe";
			}
		}
		
		return unsafeBanksString;
	}
}