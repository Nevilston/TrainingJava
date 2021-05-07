package com.train;

import java.util.HashMap;

public class LoginValidation {
	static HashMap<String, String> credentials = new HashMap<String, String>();
	static {
		credentials.put("nevilston", "nevil");
		credentials.put("lingaa", "lingtan");
		credentials.put("venkat", "venkat143");

	}

	public static boolean registerUser(String username, String password) {
		boolean check = false;
		if ((username != null) && (password != null)) {
			String enteredUsername = username.trim();
			String enteredPassword = password.trim();
			if ((enteredUsername != "") && (enteredPassword != "") &&( enteredUsername.length()>2)&&(enteredPassword.length()>2)&&(password.length()>=5)) {
				credentials.put(username, password);
				check = true;
			} else {
				System.out.println("Username OR Password Feild Should Not Be empty ");
				check = false;
			}
		}
		return check;
	}

	public static boolean credentialValidation(String userId, String password) {
		boolean isValidCredentials = false;

		try {
			String password1 = credentials.get(userId);
			if (credentials.containsKey(userId) && password1.equals(password)) {
				{
					isValidCredentials = true;
				}
			}

		} catch (Exception e) {
			String wrong = "Wrong Password";
			System.out.println(wrong);
		}
		return isValidCredentials;
	}
}
