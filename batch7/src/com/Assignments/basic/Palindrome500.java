package com.Assignments.basic;

import java.util.Scanner;

public class Palindrome500 {

	public static void main(String[] args) {
		
		
		Scanner number=new Scanner(System.in);
		System.out.println("Enter a number:");
	    int num = number.nextInt();
	    
		int num1=0, no ;
	    int number1= num;
	    
	    System.out.println("number:" + number1);
	
	for (no=0; no<=500;no++)
	{
	   while(num!=0)
	   {
	    	int rem=num%10;
	    	num1=num1*10+rem;
	    	num=num/10;
	    	
	   }
	    
	   //ystem.out.println(" no:" + num1);
	    
	    if (number1==num1)
	    	System.out.println("number is palindrome number.");
	    else
	    	System.out.println("number is not a palindrome number.");

	}
	}

}
