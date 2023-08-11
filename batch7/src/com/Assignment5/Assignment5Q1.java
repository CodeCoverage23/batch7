package com.Assignment5;
import java.util.Scanner;
public class Assignment5Q1 { //write a program to check the number is positive or negative

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
System.out.println("Enter the number ");
int number=s.nextInt();
if(number>0) {
	System.out.println("The number is positive ");
}
else 
	if(number<0) {
		System.out.println("The number is negative ");
}
	}

}
