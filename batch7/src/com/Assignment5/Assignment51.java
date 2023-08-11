package com.Assignment5;

import java.util.Scanner;

//Write program to check the number is positive or negative.
public class Assignment51 {
	
	public static void main(String[] args) {
		
		int number = 10;
		
		if (number > 0) {
			System.out.println("Entre the number");
			Scanner d = new Scanner(System.in);
	     number=d.nextInt();
	     
	     if(number>0) {
	    	 System.out.println("positive number ");
	     }
	     else if(number<0) {
	    	 System.out.println("negative number");
	    	 
	     }
	     
		}

}
}