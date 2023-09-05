package com.assignment7;

import java.util.Scanner;

//4. Design method public int getReverseNumber(int num) 
//which return int value to that method and result print into main method.

public class Assignment7Q4 {
	
public static int getReverseNumber(int num) {//method for reversing number
	int reversed = 0;
	
	while (num >0) {
		int rem = num % 10;
		reversed = reversed * 10 + rem ;
		num = num/10;
	}
	return reversed;
}
		
public static void main(String[] args) {//adding scanner class
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number :");
	int num = sc.nextInt();//getting input from user
	
	Assignment7Q4 r = new Assignment7Q4();//object creation 
	 
	int a = r.getReverseNumber(num);//method call
	System.out.println(a);//displaying output
}
		
	}


