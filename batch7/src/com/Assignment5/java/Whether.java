//6. Write the program to check whether the no is greater than 100
package com.Assignment5.java;
import java.util.Scanner;

public class Whether {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (number > 100) {
	        	
	            System.out.println(number +" is greater than 100.");
	        } else {
	        	
	        	
	            System.out.println(number +" is not greater than 100.");
	        }

	       
	    }
	}


