package com.pradeep.basic;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	int fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value to calculate factorial");
	int num = sc.nextInt();
	if(num>0) {
		for(int i=1;i<=num;i++) {
			
		fact=fact*i;	
				
		}
		System.out.println("the factorial of the given number is : "+fact);
			
	}else {
		
		System.out.println("please enter a valid number to calculate factorial");
		
	}
}
	
	
}
