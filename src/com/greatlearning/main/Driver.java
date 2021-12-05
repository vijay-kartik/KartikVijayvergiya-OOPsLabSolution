package com.greatlearning.main;

import java.util.*;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver {
	public static void main(String[] args) {
		Employee empl = new Employee("Kartik", "Vijay");
		displayMenu();
		String deptName = getUserDepartment();
		String firstName = empl.getFirstName();
		String lastName = empl.getLastName();
		String email = CredentialService.generateEmailAddress(firstName, lastName, deptName);
		String password = CredentialService.generatePassword();
		System.out.println("Dear " + empl.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    --> " + email);
		System.out.println("Password --> " + password);
	}
	
	private static void displayMenu() {
		System.out.println("Please enter department from one of the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}
	
	private static String getUserDepartment() {
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		sc.close();
		String deptName = "Nil";
		switch(userInput) {
			case 1: 
				deptName = "technical";
				break;
			case 2: 
				deptName = "admin";
				break;
			case 3: 
				deptName = "humanresource";
				break;
			case 4:
				deptName = "legal";
			default:
				System.out.println("Invalid choice");
				break;
		}
		return deptName;
	}
}
