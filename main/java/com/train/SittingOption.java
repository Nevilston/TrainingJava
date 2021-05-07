package com.train;

import java.util.HashMap;
public  class SittingOption {
	static HashMap<String, String> seatOption = new HashMap<String, String>();
	public static void SeatsDisplay() {
	
	seatOption.put("2S", "Secound Sitting(2S) ₹200 ");
	seatOption.put("SL", "Sleeper Class(SL) ₹400 ");
	seatOption.put("3A", "AC 3 Tier(2S) ₹1000 ");
	seatOption.put("2A", "AC 2 Tier(2S) ₹1500 ");
	seatOption.put("1A", "First Class Ac(1S) ₹2000 ");
	System.out.println("The Avilable Sitting Options :\n" + seatOption + "\n\n");
}

	

 
	public static void main(String[] args) {
		SittingOption.SeatsDisplay();
	}
}