// 4. Design method int fact orial(int no)  which returns int value to that method.
//print the results into main method.

package com.Assignment6;

public class Factorial {

	    public static int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int number = 5;
	        int result = factorial(number);
	        System.out.println("Factorial of " + number + " is: " + result);
	    }
	}



