package com.Assignments.basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner number=new Scanner(System.in);
		System.out.println("Enter a number:");
	    int num = number.nextInt();
		int rev=0;
	    int number1= num;
	    
	    System.out.println("number:" + number1);
	   while(num!=0)
	   {
	    for (int i=0;i<num;i++)
	    {
	    	int rem=num%10;
	    	rev=rev*10+rem;
	    	num=num/10;
	    	
	    }
	   }
	    
	    System.out.println("reverse no:" + rev);
	    
	    if (number1==rev)
	    	System.out.println("number is palindrome number.");
	    else
	    	System.out.println("number is not a palindrome number.");

	}

}
