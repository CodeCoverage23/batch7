//4. Design method public int getReverseNumber(int num) which return int value
//to that method and result print into main method.
package com.Assignment7;
import java.util.Scanner;

public class GetReverseNum{
	    public static int getReverseNumber(int num) {
	        int reversed = 0;
	        
	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }
	        
	        return reversed;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        int originalNumber = scanner.nextInt();
	        
	        int reversedNumber = getReverseNumber(originalNumber);
	        
	        System.out.println("Reversed number: " + reversedNumber);
	        
	        
	    }
	}


	

	    
	


