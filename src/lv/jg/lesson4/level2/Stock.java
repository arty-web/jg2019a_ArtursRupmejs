package lv.jg.lesson4.level2;

import static java.lang.System.out;

public class Stock {

	private String company;
	private double currentValue, max, min;

	public Stock(String company, double currentValue) {
		this.company = company;
		this.currentValue = currentValue;
		max = currentValue;
		min = currentValue;
	}

//	slikts metode nosaukums, get liecien par to, ka tiks atgriezts rezultāts
	private void getMax() {
		if (currentValue > max) {
			max = currentValue;
		}
	}

	//	slikts metode nosaukums, get liecien par to, ka tiks atgriezts rezultāts
	private void getMin() {
		if (currentValue < min) {
			min = currentValue;
		}
	}

	public void updatePrice(double currentValue) {
		this.currentValue = currentValue;
		getMax();
		getMin();
	}

	public void printInformation() {
		out.print("The stock price of " + company);
		out.print(" hit the low of $" + min);
		out.print(" and the high of $" + max);
		out.println(" while ending the day at $" + currentValue);
	}

}