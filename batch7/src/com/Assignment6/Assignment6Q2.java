package com.Assignment6;

import java.util.Scanner;

public class Assignment6Q2 {//Design method void multiplication (int no) and print the multiplication table
public void multiplication(int num) {
	for (int i=1;i<=10;i++) {
		int n=num*i;
		System.out.println(+n);
		
}
}
 public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	Assignment6Q2 mt=new Assignment6Q2();
	mt.multiplication(num);
		}
		
}

