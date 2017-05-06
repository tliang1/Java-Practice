package main;

import java.util.Scanner;

public class PayrollStatement 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		
		double grossPay = hoursWorked * hourlyPayRate;
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxWithholdingRate = input.nextDouble();
		
		double federalTaxWithholdingDeduction = grossPay * federalTaxWithholdingRate;
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxWithholdingRate = input.nextDouble();
		
		double stateTaxWithholdingDeduction = grossPay * stateTaxWithholdingRate;
		
		double totalDeduction = federalTaxWithholdingDeduction + stateTaxWithholdingDeduction;
		
		federalTaxWithholdingDeduction = (int)(grossPay * federalTaxWithholdingRate * 100) / 100.0;
		stateTaxWithholdingDeduction = (int)(grossPay * stateTaxWithholdingRate * 100) / 100.0;
		
		double netPay = (int)((grossPay - totalDeduction) * 100) / 100.0;
		
		grossPay = (int)(hoursWorked * hourlyPayRate * 100) / 100.0;
		totalDeduction = (int)((federalTaxWithholdingDeduction + stateTaxWithholdingDeduction) * 100) / 100.0;
		
		System.out.println("Employee Name: " + name + "\nHours Worked: " + hoursWorked + 
				"\nPay Rate: $" + hourlyPayRate + "\nGross Pay: $" + grossPay + 
				"\nDeductions:\n\tFederal Withholding (" + (federalTaxWithholdingRate * 100) + "%): $" + 
				federalTaxWithholdingDeduction + "\n\tState Withholding (" + (stateTaxWithholdingRate * 100) + 
				"%): $" + stateTaxWithholdingDeduction + "\n\tTotal Deduction: $" + totalDeduction + 
				"\nNet Pay: $" + netPay);
		
		input.close();
	}

}