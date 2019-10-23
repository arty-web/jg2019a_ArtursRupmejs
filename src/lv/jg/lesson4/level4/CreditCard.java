package lv.jg.lesson4.level4;

import static java.lang.System.out;

public class CreditCard {

	private String cardNumber, pinCode;
	private double debitBalance, overdraftLimit, overdraftBalance;

	public boolean topup(double amount, String pinCode) {
		this.pinCode = pinCode;
		if (verifyPinCode() == true) {
			out.println("Current financial positions:");
			balanceOverview();
			out.printf("%s%.2f%s\n","***Requested transaction: +$", amount, "***");
			if (overdraftBalance > 0) {
				overdraftBalance = overdraftBalance - amount;
				if (overdraftBalance < 0) {
					debitBalance = debitBalance - overdraftBalance;
					overdraftBalance = 0;
				}
			} else {
				debitBalance = debitBalance + amount;
			}
			out.println("***Transaction was successful!***");
			out.println("New financial positions:");
			balanceOverview();
			insertLine();
			return true;
		} else {
			out.printf("%s%.2f%s\n","***Requested transaction: +$", amount, "***");
			out.println("***PIN code was incorrect. Transaction failed!***");
			insertLine();
			return false;
		}
	}
	
	public boolean withdraw(double amount, String pinCode) {
		this.pinCode = pinCode;
		if (verifyPinCode() == true) {
			out.println("Current financial positions:");
			balanceOverview();
			out.printf("%s%.2f%s\n","***Requested transaction: -$", amount, "***");
			double availableBalance = debitBalance + (overdraftLimit - overdraftBalance);
			if (availableBalance > amount) {
				debitBalance = debitBalance - amount;
				if (debitBalance < 0) {
					overdraftBalance = overdraftBalance - debitBalance;
					debitBalance = 0;
					out.println("***Transaction was successful!***");
					out.println("New financial positions:");
					balanceOverview();
				}
			} else {
				out.println("***Not enough funds. Transaction failed!***");
			}
			insertLine();
			return true;
		} else {
			out.printf("%s%.2f%s\n","***Requested transaction: -$", amount, "***");
			out.println("***PIN code was incorrect. Transaction failed!***");
			insertLine();
			return false;
		}
	}

	private void insertLine() {
		out.println();
		out.println("====================================================================================");
		out.println();
	}

	private void balanceOverview() {
		out.printf("%s%.2f", " > Debit balance: $", debitBalance);
		out.printf("%s%.2f", " // Overdraft balance: $", overdraftBalance);
		out.printf("%s%.2f\n", " // Overdraft limit: $", overdraftLimit);
	}

	private boolean verifyPinCode() {
		if ((cardNumber.equals("1111 2222 3333 4444") && pinCode.equals("1001"))
				|| (cardNumber.equals("5555 6666 7777 8888") && pinCode.equals("9876"))
				|| (cardNumber.equals("1122 1122 0000 4444") && pinCode.equals("3232"))) {
			return true;
		} else {
			return false;
		}
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

}