package main;

/**
 * @author Tony Liang
 *
 */
public class Stock
{
	public static void main(String[] args)
	{
		Stock stock = new Stock("JAVA", "Sun Microsystems Inc");
		System.out.println("The previous closing price was 4.5");
		System.out.println("The current price is 4.35");
		System.out.println("The price-change percentage is " + stock.getChangePercent() + "%");
	}
	
	String symbol, name;
	double previousClosingPrice = 4.5, currentPrice = 4.35;
	
	/**
	 * Creates a new Stock given the symbol and name.
	 * 
	 * @param newSymbol	new symbol for the stock
	 * @param newName	new name for the stock
	 */
	Stock(String newSymbol, String newName)
	{
		symbol = newSymbol;
		name = newName;
	}
	
	double getChangePercent()
	{
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100.0;
	}
}