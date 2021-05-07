package com.train.sc;

import static org.junit.Assert.*;

import org.junit.Test;

import com.train.LoginValidation;

public class LoginTestCase {
		////registering user 1 with correct field values

		@Test
		public void registerUserTest1() { 
			String username = "ling2657";
			String password =  "Lingtan";
			boolean check=LoginValidation.registerUser(username, password);
			assertTrue(check);
			
		}


		//registering user 2 with correct field values

	@Test
		public void registerUserTest2() { 
			String username = "raja2643";
			String password =  "Raja";
			boolean check=LoginValidation.registerUser(username, password);	
			assertTrue(check);
		}
	//registering user 3 with correct field values
		@Test
		public void registerUserTest3() { 
			String username = "Venki2622";
			String password =  "Venki";
			boolean check=LoginValidation.registerUser(username, password);
			assertTrue(check);


		}
		//registering user 4 with correct field values
		@Test
		public void registerUserTest4() { 
			String username = "nevil2650";
			String password =  "nevil";
			boolean check=LoginValidation.registerUser(username, password);
			assertTrue(check);
		}
		//username is empty
		
		@Test
		public void registerUserTest5() { 
			String username = "";
			String password =  "nevil";
			boolean check=LoginValidation.registerUser(username, password);
			assertFalse(check);
		}
		//password is empty
		@Test
		public void registerUserTest6() { 
			String username = "nevil2650";
			String password =  "";
			boolean check=LoginValidation.registerUser(username, password);
			assertFalse(check);
		}
		//username and password both are empty
		@Test
		public void registerUserTest7() { 
			String username = null;
			String password =  "";
			boolean check=LoginValidation.registerUser(username, password);
			assertFalse(check);
		}


		//user name - correct and password - correct
		@Test
		public void credentialValidationTest1() { 
			String userId = "nevil2345";
			String password =  "nevil";
			boolean inValidCredentials = LoginValidation.credentialValidation(userId, password);
			assertFalse(inValidCredentials);	
	}
		
		//user name - correct password - correct

		@Test
		public void credentialValidationTest3() { 
			String userId = "lingaa";
			String password =  "lingtan";
			boolean inValidCredentials = LoginValidation.credentialValidation(userId, password);
			assertTrue(inValidCredentials);	
		}

		//user name-wrong and password-wrong

		@Test
		public void registerUserTest8() { 
			String userId = "ne";
			String password =  "nevil";
			boolean inValidCredentials = LoginValidation.registerUser(userId, password);
			assertFalse(inValidCredentials);	
		}


		@Test
		public void registerUserTest9() { 
			String userId = "nevil23";
			String password =  "nv";
			boolean inValidCredentials = LoginValidation.registerUser(userId, password);
			assertFalse(inValidCredentials);	
		}

	
	}

