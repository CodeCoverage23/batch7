package com.assignment5;

import java.util.Scanner;

//7.  Write the program to print the square of any number.

public class Assignment5Q7 {
	
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("enter a number");
	int number = Sc.nextInt();
	
       int 	square = number*number;
       System.out.println("squar of given no" + number +"  "+ square);
	
	
	
	
}
}