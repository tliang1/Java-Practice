package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import main.UnsafeBanks;

/**
 * @author Tony Liang
 *
 */
public class UnsafeBanksTest
{
	double[][] listsOfBanksBalances =
		{
			{ 25, 125, 175, 75 },
			{ 25, 125, 175, 75, 181 },
			{ 1, 2, 3, 4 },
			{ 25, 125, 175, 75, 181 },
			{ -1, 125, 175, 75, 181 },
			{ 0, 125, 175, 75, 181 },
			{ 25, 125, 175, 75, 181 },
			{ 25, 125, 175, 75, 181 },
			{ 59, 61, 7, 14, 85, 21, 66, 69 },
			{ 25, 125, 175, 75, 181 },
			{ 25, 125, 175, 75, 181 }
		};
	double[][][] listsOfBorrowers =
		{
			{
				{ -1, 100.5,  -1, -1, 320.5 },
				{ -1, -1, 40, 85, -1 },
				{ 125, -1, -1, 75, -1 },
				{ 125, -1, -1, -1, -1 },
				{ -1, -1, 125, -1, -1 }
			},
			{
				{ -1, -1, 40, 85, -1 },
				{ 125, -1, -1, 75, -1 },
				{ 125, -1, -1, -1, -1 },
				{ -1, -1, 125, -1, -1 }
			},
			{
				{ 2, 5, 12, 6 },
				{ -1, -1, 1, 7 },
				{ 3, 1 },
				{ 9, -1, -1, 4 }
			},
			{
				{ -1, 100.5,  -1, -1, 320.5 },
				{ -1, -1, 40, 85 },
				{ 125, -1, -1, 75 },
				{ 125 },
				{ -1, -1, 125 }
			},
			{
				{ -1, 100.5,  -1, -1, 320.5 },
				{ -1, -1, 40, 85, -1 },
				{ 125, -1, -1, 75, -1 },
				{ 125, -1, -1, -1, -1 },
				{ -1, -1, 125, -1, -1 }
			},
			{
				{ -1, 100.5,  -1, -1, 320.5 },
				{ -1, -1, 40, 85, -1 },
				{ 125, -1, -1, 75, -1 },
				{ 125, -1, -1, -1, -1 },
				{ -1, -1, 125, -1, -1 }
			},
			{
				{ -10, 100.5,  -19, -16, 320.5 },
				{ -15, -18, 40, 85, -13 },
				{ 125, -11, -1, 75, -12 },
				{ 125, -22, -30, -27, -33 },
				{ -90, -43, 125, -20, -8 }
			},
			{
				{ -1, 100.5,  -1, -1, 320.5 },
				{ -1, -1, 40, 85, -1 },
				{ 125, -1, -1, 75, -1 },
				{ 125, -1, -1, -1, -1 },
				{ -1, -1, 125, -1, -1 }
			},
			{
				{ 11, 2, 90, 75, 17, -1, -1, 36 },
				{ 43, 75, -1, 91, -1, 1, 23 },
				{ 53, 10, 7, -1, 39, -1, 96, 52 },
				{ 5, -1, -1, -1, -1, 51, 49, 48 },
				{ 61 },
				{ },
				{ -1, -1, 84, 97, -1, 43 },
				{ -1, -1, 87, -1, 12 }
			},
			{
				{ -1, 100.5,  -1, -1, 320.5 },
				{ -1, -1, 40, 85, -1 },
				{ 125, -1, -1, 75, -1 },
				{ 125, -1, -1, -1, -1 },
				{ -1, -1, 125, -1, -1 }
			},
			{
				{ -1, 100.5,  -1, -1, 320.5 },
				{ -1, -1, 40, 85, -1 },
				{ 125, -1, -1, 75, -1 },
				{ 125, -1, -1, -1, -1 },
				{ -1, -1, 125, -1, -1 }
			},
		};
	double[] limits = { -1.0, -1.0, 10.0, 201.0, 201.0, 201.0, 201.0, 201.0, 42.0, -1.0, 0.0 };
	int[][] listsOfUnsafeBanks =
		{
			{ },
			{ },
			{ 0, 1, 2, 3 },
			{ 1, 3 },
			{ 1, 3 },
			{ 1, 3 },
			{ 1, 3 },
			{ 1, 3 },
			{ 5 },
			{ },
			{ }
		};
	
	@Test
	public void testFindUnsafeBanks()
	{
		for (int list = 0; list < listsOfBanksBalances.length; list++)
		{
			UnsafeBanks.findUnsafeBanks(listsOfBanksBalances[list], listsOfBorrowers[list], limits[list]);
			
			boolean[] unsafeBanks = new boolean[listsOfBanksBalances[list].length];
			
			for (int bank = 0; bank < listsOfBorrowers[list].length; bank++)
			{
				for (int borrower = 0; borrower < listsOfBorrowers[list][bank].length; borrower++)
				{
					if (listsOfBorrowers[list][bank][borrower] == 0.0)
					{
						unsafeBanks[borrower] = true;
					}
				}
			}
			
			int countUnsafeBanks = 0;
			
			for (int bank = 0; bank < listsOfUnsafeBanks[list].length; bank++)
			{
				if (unsafeBanks[listsOfUnsafeBanks[list][bank]])
				{
					countUnsafeBanks++;
				}
			}
			
			assertEquals(true, countUnsafeBanks == listsOfUnsafeBanks[list].length);
		}
	}
}