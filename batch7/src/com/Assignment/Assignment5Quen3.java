package com.Assignment;
//3.write a program to find out maximum number among three number(if else if ladder statement)
public class Assignment5Quen3 {

	public static void main(String[] args) {
		int a = 8756;
		int b = 8755;
		int c = 8754;
		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else if (c > b && c > a) {
			System.out.println(c);
		}
		
			System.out.println("maximum no among three no : " + a + " : " + b + " : " + c);
	}

}
