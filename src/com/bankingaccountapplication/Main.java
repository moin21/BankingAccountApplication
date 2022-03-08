package com.bankingaccountapplication;

public class Main {
	public static void main(String args[]) {
		System.out.println("Welcome To The Banking Application");

		/**
		 * saving account object for 2 accounts
		 */
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();

		/**
		 * Balance of savings accounts
		 */
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);

		/**
		 * modify annual interest rate to 0% to 4%
		 */
		SavingsAccount.modifyInterestRate(4);
		/**
		 * calculating Monthly Interest for both accounts at 4%
		 */
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		/**
		 * Using 4% Monthly Interest Rate printing Savings Balance after one month by
		 * calling getSavingsBalance method getSavingsBalance method
		 */
		System.out.printf("New Balance for Saver1 with interest of 4 is " + saver1.getSavingsBalance() + "\n");
		System.out.printf("New Balance for Saver2 with interest of 4 is " + saver2.getSavingsBalance() + "\n");

		/**
		 * modify annual interest rate to 4% to 5%
		 */
		SavingsAccount.modifyInterestRate(5);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		/**
		 * Now we got new Account Balances to which Using 5% Monthly Interest Rate
		 * printing Savings Balance after next month by calling getSavingsBalance method
		 */
		System.out.printf("New Balance for Saver1 with interest of 5 is " + saver1.getSavingsBalance() + "\n");
		System.out.printf("New Balance for Saver2 with interest of 5 is " + saver2.getSavingsBalance() + "\n");
	}
}