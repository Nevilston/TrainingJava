package com.train;

import org.junit.Test;

	public class AddPassangerTest {
		//user need one ticket so entering single user details
		//no Senior Person in this list
		@Test
		public void test() {
			PassangerDetails Passanger1 = new PassangerDetails();
			Passanger1.passangername="Magesh";
			Passanger1.passangerage=22;
			Passanger1.passangergender="Male"; 
			int numberOfTicketNeeded=1;
			int price=400;
			PassengerDetailsStore.addPassangerDetails(numberOfTicketNeeded,Passanger1);
			PassengerDetailsStore.displayUserDetails();
			SeniourCheck.ageCheck(price);
		}
		//user need one ticket so entering single user details
		// Senior Person in this list Calculating  the discount 
		@Test
		public void test2() {
			PassangerDetails Passanger1 = new PassangerDetails();
			Passanger1.passangername="Magesh";
			Passanger1.passangerage=72;
			Passanger1.passangergender="Male"; 
			int numberOfTicketNeeded=1;
			int price=400;
			PassengerDetailsStore.addPassangerDetails(numberOfTicketNeeded,Passanger1);
			PassengerDetailsStore.displayUserDetails();
			SeniourCheck.ageCheck(price);
		}
		//user need 2 ticket so entering 2 user details 
		//one person is senior and other is So not calculating the cost for each one person
			@Test
			public void test1() {
			PassangerDetails Passanger1 = new PassangerDetails();
			Passanger1.passangername="Robin";
			Passanger1.passangerage=25;	
			Passanger1.passangergender="Male"; 
			PassangerDetails Passanger2 = new PassangerDetails();
			Passanger2.passangername="Linga";
			Passanger2.passangerage=65;
			Passanger2.passangergender="Male"; 
			int price=400;
			int numberOfTicketsNeeded=2;
			
			PassengerDetailsStore.addPassangerDetails(numberOfTicketsNeeded,Passanger1,Passanger2);
			PassengerDetailsStore.displayUserDetails();
			SeniourCheck.ageCheck(price);
			}
			//user need 2 ticket so entering 2 user details
			//two person is senior calculating the discounted price and calculating the total amount
			public void test3() {
				PassangerDetails Passanger1 = new PassangerDetails();
				Passanger1.passangername="Robin";
				Passanger1.passangerage=65;	
				Passanger1.passangergender="Male"; 
				PassangerDetails Passanger2 = new PassangerDetails();
				Passanger2.passangername="Linga";
				Passanger2.passangerage=65;
				Passanger2.passangergender="Male"; 
				int price=400;
				int numberOfTicketsNeeded=2;
				
				PassengerDetailsStore.addPassangerDetails(numberOfTicketsNeeded,Passanger1,Passanger2);
				PassengerDetailsStore.displayUserDetails();
				SeniourCheck.ageCheck(price);
				}
		
			}
			
			
		
		


