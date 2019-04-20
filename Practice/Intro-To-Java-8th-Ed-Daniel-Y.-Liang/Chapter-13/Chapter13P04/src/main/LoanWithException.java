package main;

import java.util.Date;

/**
 * @author Tony Liang
 *
 */
public class LoanWithException
{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	/**
	 * Creates a new default LoanWithException.
	 */
	public LoanWithException()
	{
		this(2.5, 1, 1000);
	}
	
	/**
	 * Creates a new LoanWithException given the annual interest rate in percent, number of years, and loan amount.
	 * 
	 * @param annualInterestRate	annual interest rate in percent
	 * @param numberOfYears			number of years
	 * @param loanAmount			loan amount
	 */
	public LoanWithException(double annualInterestRate, int numberOfYears, double loanAmount)
	{
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		this.loanDate = new Date();
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	/**
	 * Sets the annual interest rate of this loan.
	 * 
	 * @param annualInterestRate			annual interest rate in percent
	 * @throws IllegalArgumentException		if the annual interest rate is less than or equal to zero
	 */
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException
	{
		if (annualInterestRate > 0.0)
			this.annualInterestRate = annualInterestRate;
		else
			throw new IllegalArgumentException("Annual interest rate must be greater than 0");
	}
	
	public int getNumberOfYears()
	{
		return numberOfYears;
	}
	
	/**
	 * Sets the number of years of this loan.
	 * 
	 * @param numberOfYears					number of years
	 * @throws IllegalArgumentException		if the number of years is less than or equal to zero
	 */
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException
	{
		if (numberOfYears > 0)
			this.numberOfYears = numberOfYears;
		else
			throw new IllegalArgumentException("Number of years must be greater than 0");
	}
	
	public double getLoanAmount()
	{
		return loanAmount;
	}
	
	/**
	 * Sets the loan amount.
	 * 
	 * @param loanAmount					loan amount
	 * @throws IllegalArgumentException		if the loan amount is less than or equal to zero
	 */
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException
	{
		if (loanAmount > 0.0)
			this.loanAmount = loanAmount;
		else
			throw new IllegalArgumentException("Loan amount must be greater than 0");
	}
	
	public double getMonthlyPayment()
	{
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment()
	{
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	public Date getLoanDate()
	{
		return loanDate;
	}
}