package com.train;

import java.util.ArrayList;

public class PassengerDetailsStore {
	
	static ArrayList<PassangerDetails> PassangerInformation = new ArrayList<PassangerDetails>();
	public static void addPassangerDetails(int numberOfTicketNeeded,PassangerDetails  ...passanger) {
		int tickets = numberOfTicketNeeded;
		for(int i=0;i <tickets; i++) {
			PassangerDetails passangerInfo = passanger[i];
				PassangerInformation.add(passangerInfo);	
			}
	}
	public static void displayUserDetails() {
		
			System.out.println("Passanger Entered ");
			for (PassangerDetails passangerInfo: PassangerInformation) {
				System.out.println(passangerInfo);
				
			}
			
	}
	public static ArrayList<PassangerDetails> getPassengerDetails() {

		return PassangerInformation;
		
	}
}


