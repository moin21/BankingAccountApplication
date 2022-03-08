package com.bankingaccountapplication;

public class SavingsAccount {

	/**
	 * Static variables - annual interest rate offered by bank.
	 */
	public static double annualInterestRate;
	private double savingsBalance;

	/**
	 *  setter method
	 * @param newBalance
	 */
	public void setSavingsBalance(double newBalance) {
		savingsBalance = newBalance;
	}

	/**
	 *  getter method
	 * @return - savingsBalance
	 */
	public double getSavingsBalance() {
		return savingsBalance;
	}

	/**
	 *  getter method
	 * @return - annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * Method to calculate monthly interest by multiplying savingsBalance to 1/12th
	 * of annual interest Calculating monthlyInterest using above mentioned formula
	 * Add calculated interest to savingsBalance
	 * 
	 * @return - Monthly Interest using annual interest rate and savingsBalance
	 */
	public double calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * (annualInterestRate / 1200));
		savingsBalance = savingsBalance + monthlyInterest;
		return monthlyInterest;
	}

	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
}
