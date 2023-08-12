//7.  Write the program to print the square of any number.

package com.Assignment5.java;
	
   import java.util.Scanner;

		public class SquareNumber {
			
		    public static void main(String[] args) {
		    	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        int square = number * number;

		        System.out.println("The square of  number is: " + square);

		       
		    }
		}



