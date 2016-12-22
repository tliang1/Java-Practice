package main;

/**
 * @author Tony Liang
 *
 */
public class CouponCollectorProblem
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_SUITS = 4;
		final int NUMBER_OF_RANKS = 13;
		final int NUMBER_OF_CARDS = 52;
		int[] suits = new int[NUMBER_OF_SUITS];
		
		int picks = 0;
		int suitsPicked = 0;
		
		while (suitsPicked < NUMBER_OF_SUITS)
		{
			int card = (int) (Math.random() * NUMBER_OF_CARDS) + 1;
			
			if (suits[(card - 1) / NUMBER_OF_RANKS] == 0)
			{
				suitsPicked++;
			}
			
			suits[(card - 1) / NUMBER_OF_RANKS] = card;
			
			picks++;
		}
		
		for (int card = 0; card < NUMBER_OF_SUITS; card++)
		{
			displayCard(suits[card]);
		}
		
		System.out.println("Number of picks: " + picks);
	}
	
	/**
	 * Displays the rank and suit of the specified integer argument.
	 * <p>
	 * If the integer argument is not between 1 and 52 inclusive, an error will be displayed.
	 * 
	 * @param card	card number
	 */
	public static void displayCard(int card)
	{
		if ((card < 1) || (card > 52))
		{
			System.out.println("Error: Not a valid card number. Must be between 1 and 52 inclusive.");
			System.exit(0);
		}
		
		int suit = (card - 1) / 13;
		
		switch ((card % 13) + 1)
		{
		case 1:
			System.out.print("Ace of ");
			break;
		case 2:
			System.out.print("2 of ");
			break;
		case 3:
			System.out.print("3 of ");
			break;
		case 4:
			System.out.print("4 of ");
			break;
		case 5:
			System.out.print("5 of ");
			break;
		case 6:
			System.out.print("6 of ");
			break;
		case 7:
			System.out.print("7 of ");
			break;
		case 8:
			System.out.print("8 of ");
			break;
		case 9:
			System.out.print("9 of ");
			break;
		case 10:
			System.out.print("10 of ");
			break;
		case 11:
			System.out.print("Jack of ");
			break;
		case 12:
			System.out.print("Queen of ");
			break;
		case 13:
			System.out.print("King of ");
			break;
		}
		
		switch (suit)
		{
		case 0:
			System.out.println("Spades");
			break;
		case 1:
			System.out.println("Clubs");
			break;
		case 2:
			System.out.println("Hearts");
			break;
		case 3:
			System.out.println("Diamonds");
			break;
		}
	}
}