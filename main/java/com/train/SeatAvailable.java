package com.train;

import java.util.HashMap;

public class SeatAvailable {
	public static boolean ticketschechk(HashMap<String, String> seatOption, String SeatChoise) {
		HashMap<String, String> sittingOption = seatOption;
		boolean valid=false;
		switch(SeatChoise) {
		case "2S":
			String seatType=sittingOption.get(SeatChoise);
			System.out.println("The Selected Seat Option is "+seatType);
			valid=true;
			break;
		case "SL":
			String seatType1=sittingOption.get(SeatChoise);
			System.out.println("The Selected Seat Option is "+seatType1);
			valid=true;
			break;
		case "3A":
			String seatType2=sittingOption.get(SeatChoise);
			System.out.println("The Selected Seat Option is "+seatType2);
			valid=true;
			break;
		case "2A":
			String seatType3=sittingOption.get(SeatChoise);
			System.out.println("The Selected Seat Option is "+seatType3);
			valid=true;
			break;
		case "1A":
			String seatType4=sittingOption.get(SeatChoise);
			System.out.println("The Selected Seat Option is "+seatType4);
			valid=true;
			break;
			default:
				System.out.println("The Entered Option Is Invalid ");
				valid=false;
		}
		return valid;
	}
}
