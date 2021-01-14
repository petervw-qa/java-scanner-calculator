package com.qa.main;

import java.util.Scanner;

public class Calculator {
	
	Scanner scan = new Scanner(System.in);
	
	public void addition() {
		System.out.println("Performing x + y!");
		System.out.println("Please input x: ");
		String result = scan.nextLine();
		double x = Double.parseDouble(result);
		System.out.println("Please input y: ");
		String result2 = scan.nextLine();
		double y = Double.parseDouble(result2);
		System.out.println("\nResult: " + (x + y));
		scan.close();
	
	}
	
	public void division() {
		System.out.println("Performing x / y!");
		System.out.println("Please input x: ");
		String result = scan.nextLine();
		double x = Double.parseDouble(result);
		System.out.println("Please input y: ");
		String result2 = scan.nextLine();
		double y = Double.parseDouble(result2);
		System.out.println("\nResult: " + (x / y));
		scan.close();
	}
	
	public void multiplication() {
		System.out.println("Performing x * y!");
		System.out.println("Please input x: ");
		String result = scan.nextLine();
		double x = Double.parseDouble(result);
		System.out.println("Please input y: ");
		String result2 = scan.nextLine();
		double y = Double.parseDouble(result2);
		System.out.println("\nResult: " + (x * y));
		scan.close();
	
	}

	public void subtraction() {
		System.out.println("Performing x - y!");
		System.out.println("Please input x: ");
		String result = scan.nextLine();
		double x = Double.parseDouble(result);
		System.out.println("Please input y: ");
		String result2 = scan.nextLine();
		double y = Double.parseDouble(result2);
		System.out.println("\nResult: " + (x - y));
		scan.close();
	
	}



}
