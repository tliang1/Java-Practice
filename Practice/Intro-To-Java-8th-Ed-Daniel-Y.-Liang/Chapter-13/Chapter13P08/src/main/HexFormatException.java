package main;

/**
 * @author Tony Liang
 *
 */
public class HexFormatException extends Exception
{
	private String hex;
	
	/**
	 * Creates a new HexFormatException given the hex string.
	 * 
	 * @param hex	hex string
	 */
	public HexFormatException(String hex)
	{
		super("Invalid hex " + hex);
		this.hex = hex;
	}

	public String getHex()
	{
		return hex;
	}
}