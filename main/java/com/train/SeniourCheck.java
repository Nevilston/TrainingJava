package com.train;

import java.util.ArrayList;

public class SeniourCheck {

	static ArrayList<PassangerDetails> passangerDetails = PassengerDetailsStore.getPassengerDetails();

	public static void ageCheck(int price) {
		System.out.println("Seniour Discount Check Started");
		int c = 0;
		int d = 0;
		for (PassangerDetails passangerInfo : passangerDetails) {
			if (passangerInfo.passangerage >= 65) {
				System.out.println(passangerInfo.passangername + " Is  eligbile for Seniour Discount");
				c++;
			} else {
				System.out.println(passangerInfo.passangername + " Not eligbile for Seniour Discount");
				d++;
				if (d > 0) {
					double cost1 = ((d * price));
					System.out.println("The Non Seniour Person Discount is " + cost1);
					double totalCost= cost1;
					System.out.println("The Total Fare is :"+totalCost);
				}

			}
		}
		if (c > 0) {
			double cost = ((c * price) * 0.5);
			System.out.println("The Discounted Ticket fare for"+c+" eligible person is" + cost);
			if (c == 1) {
				double totalCost = cost + (price);
				System.out.println("The Totoal fare is " + totalCost);
			} else {
				double cost1 = ((c * price) * 0.5);
				System.out.println("The Total Fare is:" + cost1);
			}
			
		}
	}
}

