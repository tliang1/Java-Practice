package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.SalesAmountRevised;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class SalesAmountRevisedTest
{
	private double amount;
	private double expected;
	
	public SalesAmountRevisedTest(double salesAmount, double expectedResult)
	{
		this.amount = salesAmount;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> commissionsList() 
	{
		return Arrays.asList(new Object[][] { { 210833.35, 25000.00 }, { 10000, 900.0 }, { 95000, 11100.0 } });
	}
	
	@Test
	public void testComputeCommission()
	{
		assertEquals(expected, SalesAmountRevised.computeCommission(amount), 0.01);
	}

}