package com.train;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class JourneyDateValidation {

	@Test
	public void journeyDateValidationTest1() {
		LocalDate todayDate =  LocalDate.now();
		LocalDate afterDate = todayDate.plusDays(1);
		String todayStringdate=afterDate.toString(); 
		String journeydate = (todayStringdate);
		boolean isValidDate = JourneyDate.journeyDateCheck(journeydate);
		assertTrue(isValidDate);
	}
	@Test
	public void journeyDateValidationTest2() {
		String journeydate = "2021-04-27";
		boolean isValidDate = JourneyDate.journeyDateCheck(journeydate);
		assertFalse(isValidDate);
	}
	@Test
	public void journeyDateValidationTest3() {
		String journeydate = "2020-05-26";
		boolean isValidDate = JourneyDate.journeyDateCheck(journeydate);
		assertFalse(isValidDate);
	}
	@Test
	public void journeyDateValidationTest4() {
		String journeydate = "2021-03-26";
		boolean isValidDate = JourneyDate.journeyDateCheck(journeydate);
		assertFalse(isValidDate);
	}
	@Test
	public void journeyDateValidationTest5() {
		String journeydate = "2020-04-26";
		boolean isValidDate = JourneyDate.journeyDateCheck(journeydate);
		assertFalse(isValidDate);
	}
	@Test
	public void journeyDateValidationTest6() {
		String journeydate = "2021-04-26";
		boolean isValidDate = JourneyDate.journeyDateCheck(journeydate);
		assertFalse(isValidDate);
	}
}
