package com.greatlearning.service;

import java.util.Random;

public class CredentialService {
	public static String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".company.com";
	}
	
	public static String generatePassword() {
		String numbers = "1234567890";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialChar = "!@#$%^&*()<>?/";
		String combined = numbers + smallLetters + capLetters + specialChar;
		String password = "";
		Random random = new Random();
		
		password += numbers.charAt(random.nextInt(numbers.length()));
		password += smallLetters.charAt(random.nextInt(smallLetters.length()));
		password += capLetters.charAt(random.nextInt(capLetters.length()));
		password += specialChar.charAt(random.nextInt(specialChar.length()));
		
		for(int i = 0; i < 4; i++) {
			password += combined.charAt(random.nextInt(combined.length()));
		}
		
		return password;
	}
}
