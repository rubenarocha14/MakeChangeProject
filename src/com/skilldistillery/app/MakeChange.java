package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize change
		double penny = .01;
		double nickle = .05;
		double dime = .10;
		double quarter = .25;
		double dollar = 1;
		double five = 5;
		double ten = 10;
		double twenty = 20;
		
		//Ask user for item price
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the price of the item");
		double itemPrice = scan.nextDouble();
		//Ask user for amount tendered
		System.out.println("What was the amount tendered?");
		double amountTendered = scan.nextDouble();
		double change = amountTendered-itemPrice;

		// determine whether change is to be returned
		if(amountTendered == itemPrice) {System.out.println("No change to be returned.");}
		else if(amountTendered < itemPrice) {System.out.println(itemPrice - amountTendered +
				" more is needed to complete the transaction.");}
		else if(amountTendered > itemPrice){System.out.println(amountTendered - itemPrice + " is the amount of change to be returned");}
		
		
		//determine the bills and coins for register to dispense to clerk
		//program should take the change amount and 
		System.out.println(change);
		System.out.println(change%1);
		
		/*
		 * Overview
In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the 
amount tendered. We will also notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c
, .01c) is needed to make the change for the customer. Change should be provided using the largest bill and coin 
denominations as possible. Denominations that are not used should not be displayed.

Hint: Mod operator

User Story #1
The user is prompted asking for the price of the item.

User Story #2
The user is then prompted asking how much money was tendered by the customer.

User Story #3
Display an appropriate message if the customer provided too little money or the exact amount.

User Story #4
If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given 
to the customer.
		 */
//
	}
	

	}

