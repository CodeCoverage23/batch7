package com.basic.control.stmt;

import java.util.Scanner;

public class DemoIfElseIf {
	public static void main(String[] args) {
     
		Scanner s = new scanner(system.in); //object of scanner class
		system.out.println("Enter the number :");
		int number = s.nextInt(); //method from scanner class to read integer value
		
		
		//int number = 1;
		
		if (number> 0) {
			System.out.println("Positive number");
		}else if (number < 0) {
			System.out.println("negative number");
		}else {
			System.out.println("number is zero");
		}
		
		//system.out.println("Rest of the part");
	}
	
}