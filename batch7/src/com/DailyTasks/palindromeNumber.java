//WAP to check if the given number is palindrome numbers or not. 
//Use scanner class to read the number from the user and use nextInt () method for the same.

package com.DailyTasks;

import java.util.Scanner;


public class palindromeNumber {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (isPalindrome(number)) {
	            System.out.println(number + "  palindrome number.");
	        } else {
	            System.out.println(number + "  a palindrome number.");
	        }

	    
	    }

	    public static boolean isPalindrome(int num) {
	    	
		     	int originalNum = num;
	            int reversedNum = 0;

	            while (num > 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }

	       return originalNum == reversedNum;	    }
	}




