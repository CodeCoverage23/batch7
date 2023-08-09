package com.basic;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" enter your age: ");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("Now user can check weight");
			
		//System.out.println("enter your weight:");
		
		int weight = input.nextInt();
		
		if (weight >= 50) {
			System.out.println("now user can check hemoglobin");

			
			
			double hemoglobin = input.nextInt();
			 if (hemoglobin <10)
			 System.out.println("you are not fit to donate blood");
			if (hemoglobin >= 10) {
				System.out.println("user is fit to donate blood");

			}
		}

	}
		//System.out.println("not eligible to donate");

	}
}
