package main;

import java.util.Date;

/**
 * @author Tony Liang
 *
 */
public class Loan
{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	/**
	 * Creates a new default Loan.
	 */
	public Loan()
	{
		this(2.5, 1, 1000);
	}
	
	/**
	 * Creates a new Loan given the annual interest rate in percent, number of years, and loan amount.
	 * <ul>
	 * 	<li>
	 * 		If the annual interest rate is negative, it will default to 0.0.
	 * 	</li>
	 * 	<li>
	 * 		If the number of years is not a nonzero positive integer, it will default to 1.
	 * 	</li>
	 * 	<li>
	 * 		If the loan amount is negative, it will default to $0.00.
	 * 	</li>
	 * </ul>
	 * 
	 * @param annualInterestRate	annual interest rate in percent
	 * @param numberOfYears			number of years
	 * @param loanAmount			loan amount
	 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
	{
		this.annualInterestRate = (annualInterestRate > 0.0) ? annualInterestRate : 0.0;
		this.numberOfYears = (numberOfYears > 0) ? numberOfYears : 1;
		this.loanAmount = (loanAmount > 0.0) ? loanAmount : 0.0;
		this.loanDate = new Date();
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = (annualInterestRate > 0.0) ? annualInterestRate : 0.0;
	}
	
	public int getNumberOfYears()
	{
		return numberOfYears;
	}
	
	public void setNumberOfYears(int numberOfYears)
	{
		this.numberOfYears = (numberOfYears > 0) ? numberOfYears : 1;
	}
	
	public double getLoanAmount()
	{
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount)
	{
		this.loanAmount = (loanAmount > 0.0) ? loanAmount : 0.0;
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
	
	public String toString()
	{
		return String.format("The loan was created on %s\nThe monthly payment is %.2f\nThe total payment is %.2f\n", loanDate.toString(), 
									getMonthlyPayment(), getTotalPayment());
	}
}