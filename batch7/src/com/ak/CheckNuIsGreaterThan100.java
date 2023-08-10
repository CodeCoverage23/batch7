package com.ak;

import java.util.Scanner;

public class CheckNuIsGreaterThan100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int number = scanner.nextInt();
		
		if (number <= 100){
			System.out.println("The Number Is Equal To 100");
		}else if (number > 100 ){
			System.out.println("The Number Is Greater Than 100");
		}else {
			System.out.println("The Number Is Not Greater Than 100");
		}
	}
//assignment 5)6
}
