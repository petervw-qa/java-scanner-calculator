package com.qa.main;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.println("Hello!");
		System.out.println("Which operation would you like to perform?");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		String result = scan.nextLine();
		
		switch(result) {
		case "1":
			calc.addition();
			break;
		case "2":
			calc.subtraction();
			break;
		case "3":
			calc.multiplication();
			break;
		case "4":
			calc.division();
			break;
		default:
			System.out.println("You have inputted an invalid option.");
			break;
			
		}
		scan.close();
		
		
		
		
	}
	
	
}
