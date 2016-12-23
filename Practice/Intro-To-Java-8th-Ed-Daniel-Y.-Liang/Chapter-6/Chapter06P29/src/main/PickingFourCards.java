package main;

/**
 * @author Tony Liang
 *
 */
public class PickingFourCards
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_CARDS = 52;
		int picks = 0;
		int sum = 0;
		
		while (sum != 24)
		{
			int card = (int) (Math.random() * NUMBER_OF_CARDS) + 1;
			int cardValue = cardValue(card);
			
			if ((sum + cardValue) <= 24)
			{
				sum += cardValue(card);
			}
			
			picks++;
		}
		
		System.out.println("Number of picks to get the sum of 24: " + picks);
	}
	
	/**
	 * Returns the card value of the specified integer argument.
	 * <p>
	 * If the integer argument is not between 1 and 52 inclusive, the card value will default to 0.
	 * 
	 * @param card	card number
	 * @return		the card value
	 */
	public static int cardValue(int card)
	{
		if ((card < 1) || (card > 52))
		{
			return 0;
		}
		
		switch ((card - 1) % 13)
		{
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 3;
		case 3:
			return 4;
		case 4:
			return 5;
		case 5:
			return 6;
		case 6:
			return 7;
		case 7:
			return 8;
		case 8:
			return 9;
		case 9:
			return 10;
		case 10:
			return 11;
		case 11:
			return 12;
		case 12:
			return 13;
		}
		
		return 0;
	}
}