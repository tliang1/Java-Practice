package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.ComputeTax;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class ComputeTaxTest
{
	private int status;
	private double income;
	private double expected;
	
	public ComputeTaxTest(int filingStatus, double taxableIncome, double expectedResult)
	{
		this.status = filingStatus;
		this.income = taxableIncome;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> taxList() 
	{
		return Arrays.asList(new Object[][] { { 0, 50000, 8688 }, { 1, 50050, 6673 }, { 2, 59950, 11175 }, 
			{ 3, 60000, 9853 }, { 0, 400000, 117683.5 }, { 2, -5.42, 0.0 } });
	}
	
	@Test
	public void testComputeTax()
	{
		assertEquals(expected, ComputeTax.computeTax(status, income), 1.0);
	}
}