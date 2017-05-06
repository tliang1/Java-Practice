package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.FutureInvestmentValueRevised;

/**
 * @author Tony Liang
 *
 */
@RunWith(Parameterized.class)
public class FutureInvestmentValueRevisedTest
{
	private double investment;
	private double interestRate;
	private int year;
	private double expected;
	
	public FutureInvestmentValueRevisedTest(double investmentAmount, double monthlyInterestRate,
			int investmentYear, double expectedResult)
	{
		this.investment = investmentAmount;
		this.interestRate = monthlyInterestRate;
		this.year = investmentYear;
		this.expected = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> futureInvestmentValuesList() 
	{
		return Arrays.asList(new Object[][] { { -1, 0.09 / 12, 1, 0.00 }, { 2504, -0.05 / 12, 1, 2504 },
			{ 2504, 0.07 / 12, -5, 2685.01 }, { 2504, -0.02 / 12, 0, 2504 }, { 1000, 0.09 / 12, 1, 1093.8 },
			{ 1000, 0.09 / 12, 29, 13467.25 }, { 10000, 0.05 / 12, 5, 12833.59 }, { 1000, 0.0325 / 12, 1, 1032.98 },
			{ 1000, 0.0425 / 12, 1, 1043.34 } });
	}
	
	@Test
	public void testFutureInvestmentValue()
	{
		assertEquals(expected, FutureInvestmentValueRevised.futureInvestmentValue(investment, interestRate, year), 
				0.02);
	}
}