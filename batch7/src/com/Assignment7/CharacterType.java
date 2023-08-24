//1. Design method to check whether the character is alphabet, digit and special symbol.

package com.Assignment7;

import java.util.Scanner;

public class CharacterType {

	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter any caracter : ");
	        char ch = scanner.next().charAt(0); 

	       
	        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

	            System.out.println(ch + " is  Alphabet.");

	        } else if (ch >= '0' && ch <= '9') {

	            System.out.println(ch + " is Digit.");

	        } else {

	            System.out.println(ch + " is  Special symbol.");

	        }

	    }
	}
	        
	        	
	  



