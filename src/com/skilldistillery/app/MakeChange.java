package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// initialize scanner
		Scanner scan = new Scanner(System.in);
		// ask user for item price and assign to variable
		System.out.println("Please enter the price of the item");
		double itemPrice = scan.nextDouble();
		// Ask user for amount tendered and assign to variable
		System.out.println("What was the amount tendered?");
		double tenderDollars = scan.nextDouble();
		// calculate the change amount to be returned
		double changeInDollars = tenderDollars - itemPrice;
		// calculate change amount in cents
		double changeInCents = changeInDollars * 100;
		// round to the nearest cent
		changeInCents = (int) (changeInCents + .5);
		// determine whether change is to be returned
		// tendered exact amount
		if (tenderDollars == itemPrice) {
			System.out.println("No change to be returned.");
		}
		// tendered too little
		else if (tenderDollars < itemPrice) {
			System.out.println("Not enough money tendered. Please tender a minimum " + "of $" + itemPrice);
		}
		// tendered greater than item price
		else if (tenderDollars > itemPrice) {
			System.out.println("Return $" + changeInCents / 100 + " back to the customer.");
			// call calculateChange() method to return the number of bills and/or coins to
			// return to the customer
			calculateChange(changeInDollars);
		}

	}
	//Method for calculating number of bills and coins to return to customer
	public static void calculateChange(double changeInDollars) {

		// convert changeInDollars to cents
		double changeInCents = changeInDollars * 100;
		// round to nearest cent
		changeInCents = (int) (changeInCents + .5);

		// while loop to continue counting change until change to be
		// returned is not greater than 0
		while (changeInCents > 0) {
			// if/else-if to determine how many bills or coins to return to the user
			if (changeInCents / 2000 > 1) {
				System.out.println((int) changeInCents / 2000 + " twenty dollar bill(s)");
				changeInCents = (int) (changeInCents % 2000);
				// System.out.println(tender);
			} else if (changeInCents / 1000 > 1) {
				System.out.println((int) changeInCents / 1000 + " ten dollar bill(s)");
				changeInCents = changeInCents % 1000;
				// System.out.println(tender);
			} else if (changeInCents / 500 > 1) {
				System.out.println((int) changeInCents / 500 + " five dollar bill(s)");
				changeInCents = changeInCents % 500;
				// System.out.println(tender);
			} else if (changeInCents / 100 > 1) {
				System.out.println((int) changeInCents / 100 + " dollar bill(s)");
				changeInCents = changeInCents % 100;
				// System.out.println(tender);
			} else if (changeInCents / 25 > 1) {
				System.out.println((int) changeInCents / 25 + " quarter(s)");
				changeInCents = changeInCents % 25;
				// System.out.println(tender);
			} else if (changeInCents / 10 > 1) {
				System.out.println((int) changeInCents / 10 + " dime(s)");
				changeInCents = changeInCents % 10;
				// System.out.println(tender);
			} else if (changeInCents / 5 > 1) {
				System.out.println((int) changeInCents / 5 + " nickle(s)");
				changeInCents = changeInCents % 5;
				// System.out.println(tender);
			} else if (changeInCents / 1 >= 1) {
				System.out.println((int) changeInCents / 1 + " penny(ies)");
				changeInCents = changeInCents % 1;
				// System.out.println(tender);
			}

		}
	}
}