package main;

import javax.swing.JOptionPane;

public class PayrollStatementGUI 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog(null, 
				"Enter employee's name: ",
				"Payroll",
				JOptionPane.QUESTION_MESSAGE);
		String name = input;
		
		input = JOptionPane.showInputDialog(null, 
				"Enter number of hours worked in a week: ", 
				"Payroll",
				JOptionPane.QUESTION_MESSAGE);
		double hoursWorked = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog(null, 
				"Enter hourly pay rate: ", 
				"Payroll",
				JOptionPane.QUESTION_MESSAGE);
		double hourlyPayRate = Double.parseDouble(input);
		
		double grossPay = hoursWorked * hourlyPayRate;
		
		input = JOptionPane.showInputDialog(null, 
				"Enter federal tax withholding rate: ", 
				"Payroll",
				JOptionPane.QUESTION_MESSAGE);
		double federalTaxWithholdingRate = Double.parseDouble(input);
		
		double federalTaxWithholdingDeduction = grossPay * federalTaxWithholdingRate;
		
		input = JOptionPane.showInputDialog(null, 
				"Enter state tax withholding rate: ", 
				"Payroll",
				JOptionPane.QUESTION_MESSAGE);
		double stateTaxWithholdingRate = Double.parseDouble(input);
		
		double stateTaxWithholdingDeduction = grossPay * stateTaxWithholdingRate;
		
		double totalDeduction = federalTaxWithholdingDeduction + stateTaxWithholdingDeduction;
		
		federalTaxWithholdingDeduction = (int)(grossPay * federalTaxWithholdingRate * 100) / 100.0;
		stateTaxWithholdingDeduction = (int)(grossPay * stateTaxWithholdingRate * 100) / 100.0;
		
		double netPay = (int)((grossPay - totalDeduction) * 100) / 100.0;
		
		grossPay = (int)(hoursWorked * hourlyPayRate * 100) / 100.0;
		totalDeduction = (int)((federalTaxWithholdingDeduction + stateTaxWithholdingDeduction) * 100) / 100.0;
		
		// Display results
		JOptionPane.showMessageDialog(null, 
				"Employee Name: " + name + "\nHours Worked: " + hoursWorked + "\nPay Rate: $" + hourlyPayRate + 
						"\nGross Pay: $" + grossPay + "\nDeductions:\nFederal Withholding (" + 
						(federalTaxWithholdingRate * 100) + "%): $" + federalTaxWithholdingDeduction + 
						"\nState Withholding (" + (stateTaxWithholdingRate * 100) + "%): $" + 
						stateTaxWithholdingDeduction + "\nTotal Deduction: $" + totalDeduction + "\nNet Pay: $" + 
						netPay, 
				"Payroll", 
				JOptionPane.INFORMATION_MESSAGE);
	}

}