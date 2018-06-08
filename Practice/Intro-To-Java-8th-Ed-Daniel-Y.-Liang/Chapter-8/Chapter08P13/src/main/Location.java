package main;

/**
 * @author Tony Liang
 *
 */
public class Location
{
	public int row, column;
	public double maxValue;
	
	/**
	 * Creates a new Location given the row, column, and max value.
	 * 
	 * @param newRow		row the max value is located in in a two-dimensional array
	 * @param newCol		column the max value is located in in a two-dimensional array
	 * @param newMaxValue	max value in a two-dimensional array
	 */
	public Location(int newRow, int newCol, double newMaxValue)
	{
		row = newRow;
		column = newCol;
		maxValue = newMaxValue;
	}
}