package main;

public class PickingACard
{

	public static void main(String[] args)
	{
		System.out.print("The card you picked is ");
		
		int rank = (int)(Math.random() * 13) + 1;
		int suit = (int)(Math.random() * 4);
		
		switch (rank)
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
			System.out.println("Clubs");
			break;
		case 1:
			System.out.println("Diamonds");
			break;
		case 2:
			System.out.println("Hearts");
			break;
		case 3:
			System.out.println("Spades");
			break;
		}
	}

}