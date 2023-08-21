//3. Design method to print factors of given number( Enter no = 6 then factors 
//should be displayed like 1,2,3,6.
package com.Assignment7;

import java.util.Scanner;

public class FactorNumber {
 public static void main(String[] args) {
	    	
	        // Create a Scanner object to read input from the user
	    	Scanner scanner = new Scanner(System.in);

	        // user to enter a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();


	        // Print the factors of the entered number
	         System.out.print("Factors of number: ");
	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                System.out.print( i);
	               
	                }
	            }
	        }
	    }
	


