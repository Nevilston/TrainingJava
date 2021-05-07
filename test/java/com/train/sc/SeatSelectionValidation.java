package com.train.sc;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import com.train.SeatAvailable;

public class SeatSelectionValidation {
	@Test
	public void seatSelectionTest1() {
		HashMap<String, String> seatOption = new HashMap<String, String>();
		seatOption.put("2S", "Secound Sitting(2S) ₹200 ");
		seatOption.put("SL", "Sleeper Class(SL) ₹400 ");
		seatOption.put("3A", "AC 3 Tier(2S) ₹1000 ");
		seatOption.put("2A", "AC 2 Tier(2S) ₹1500 ");
		seatOption.put("1A", "First Class Ac(1S) ₹2000 ");
		String seatChoise = "2S";
		boolean isValidNumber = SeatAvailable.ticketschechk(seatOption, seatChoise);
		assertTrue(isValidNumber);
	}

	@Test
	public void seatSelectionTest2() {
		HashMap<String, String> seatOption = new HashMap<String, String>();
		seatOption.put("2S", "Secound Sitting(2S) ₹200 ");
		seatOption.put("SL", "Sleeper Class(SL) ₹400 ");
		seatOption.put("3A", "AC 3 Tier(2S) ₹1000 ");
		seatOption.put("2A", "AC 2 Tier(2S) ₹1500 ");
		seatOption.put("1A", "First Class Ac(1S) ₹2000 ");
		String seatChoise = "SL";
		boolean isValidNumber = SeatAvailable.ticketschechk(seatOption, seatChoise);
		assertTrue(isValidNumber);
	}

	@Test
	public void seatSelectionTest3() {
		HashMap<String, String> seatOption = new HashMap<String, String>();
		seatOption.put("2S", "Secound Sitting(2S) ₹200 ");
		seatOption.put("SL", "Sleeper Class(SL) ₹400 ");
		seatOption.put("3A", "AC 3 Tier(2S) ₹1000 ");
		seatOption.put("2A", "AC 2 Tier(2S) ₹1500 ");
		seatOption.put("1A", "First Class Ac(1S) ₹2000 ");
		String seatChoise = "3A";
		boolean isValidNumber = SeatAvailable.ticketschechk(seatOption, seatChoise);
		assertTrue(isValidNumber);
	}

	@Test
	public void seatSelectionTest4() {
		HashMap<String, String> seatOption = new HashMap<String, String>();
		seatOption.put("2S", "Secound Sitting(2S) ₹200 ");
		seatOption.put("SL", "Sleeper Class(SL) ₹400 ");
		seatOption.put("3A", "AC 3 Tier(2S) ₹1000 ");
		seatOption.put("2A", "AC 2 Tier(2S) ₹1500 ");
		seatOption.put("1A", "First Class Ac(1S) ₹2000 ");
		String seatChoise = "2A";
		boolean isValidNumber = SeatAvailable.ticketschechk(seatOption, seatChoise);
		assertTrue(isValidNumber);
	}

	@Test
	public void seatSelectionTest5() {
		HashMap<String, String> seatOption = new HashMap<String, String>();
		seatOption.put("2S", "Secound Sitting(2S) ₹200 ");
		seatOption.put("SL", "Sleeper Class(SL) ₹400 ");
		seatOption.put("3A", "AC 3 Tier(2S) ₹1000 ");
		seatOption.put("2A", "AC 2 Tier(2S) ₹1500 ");
		seatOption.put("1A", "First Class Ac(1S) ₹2000 ");
		String seatChoise = "1A";
		boolean isValidNumber = SeatAvailable.ticketschechk(seatOption, seatChoise);
		assertTrue(isValidNumber);
	}

	@Test
	public void seatSelectionTest7() {
		HashMap<String, String> seatOption = new HashMap<String, String>();
		seatOption.put("2S", "Secound Sitting(2S) ₹200 ");
		seatOption.put("SL", "Sleeper Class(SL) ₹400 ");
		seatOption.put("3A", "AC 3 Tier(2S) ₹1000 ");
		seatOption.put("2A", "AC 2 Tier(2S) ₹1500 ");
		seatOption.put("1A", "First Class Ac(1S) ₹2000 ");
		String seatChoise = "";
		boolean isValidNumber = SeatAvailable.ticketschechk(seatOption, seatChoise);
		assertFalse(isValidNumber);
	}
}
