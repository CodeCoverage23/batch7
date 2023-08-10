package com.ak;
import java.util.Scanner;
public class CheckNumPosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter The Number: ");
	int number = scanner.nextInt();
	
	if (number > 0) {
		System.out.println("The Number Is Positive");
	}else if (number < 0) {
		System.out.println("The Number Is Negative");
	}else{
		System.out.println("The Number Is Zero");
	  }
	}
//Assignment 5)1
}
