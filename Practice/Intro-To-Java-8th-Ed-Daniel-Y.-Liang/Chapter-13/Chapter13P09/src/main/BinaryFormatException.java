package main;

/**
 * @author Tony Liang
 *
 */
public class BinaryFormatException extends Exception
{
	private String binaryString;
	
	/**
	 * Creates a new BinaryFormationException given the binary string.
	 * 
	 * @param binaryString	a binary string
	 */
	public BinaryFormatException(String binaryString)
	{
		super("Invalid binary string " + binaryString);
		this.binaryString = binaryString;
	}

	public String getBinaryString()
	{
		return binaryString;
	}
}