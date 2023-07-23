package com.basic.control.stmt;

public class DemoNestedIf {
	public static void main(String[] args) {
		
		int age = 22; //age variable to store age of user
		
		int weight = 55;
		if (age >= 18) {
		System.out.println("we are checking your weight");
		if (weight >= 50) {
			System.out.println("you can donate blood");
		}
		
		}
	}

}
