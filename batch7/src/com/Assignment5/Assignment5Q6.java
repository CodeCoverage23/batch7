package com.Assignment5;

import java.util.Scanner;

public class Assignment5Q6 {//Write the program to check whether the no is greater than 100

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the number ");
int number=s.nextInt();
if (number>100) {
	System.out.println("number is greater than 100 ");
}
else {
	System.out.println("number is smaller than 100");
}
	}

}
