//WAP to print palindrome numbers till 500.

package com.DailyTasks;

public class Palindrome1 {
	public static void main (String args[]) {
	
	       int i = 1;

	        for (i=1 ; i<=500 ; i++){
	          
	        	if (isPalindrome(i)) {
	                System.out.println(i);
	        	}
	              
	               
	            }
	            
	        }


	    public static boolean isPalindrome(int number) {
	        int originalNumber = number;
	        int reversedNumber = 0;
	        
            while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
	     
	        }

	        return originalNumber == reversedNumber;
	    }
	}

		 

