package com.Assignment5.java;

       import java.util.Scanner;

		public class SwapNumber {
			
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        System.out.println("Before swapping:");
		        System.out.println("First number: " + num1);
		        System.out.println("Second number: " + num2);

		       
		        int a = num1;
		        num1 = num2;
		        num2 = a;

		        System.out.println("After swapping:");
		        System.out.println("First number: " + num1);
		        System.out.println("Second number: " + num2);

		       
		    }
		}
