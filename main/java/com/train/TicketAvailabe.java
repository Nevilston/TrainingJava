package com.train;

public class TicketAvailabe {
	public static boolean numberOfTickets(int neededTickets) {
		boolean validation=false;
		if(neededTickets >= 2) {
			System.out.println(neededTickets+" Tickets Avilable");
			validation=true;
		}
		else {
			System.out.println(neededTickets+"Is not available Only 2 Tickets Per User");
		}
		return validation;
	}
}

