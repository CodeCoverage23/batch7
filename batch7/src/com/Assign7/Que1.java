package com.Assign7;

import java.util.Scanner;

/*Design method to check whether the character is alphabet, digit 
 * and special symbol.
 */

public class Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter character to be checked : ");
		char ch = sc.next().charAt(0);
		if(ch >='a' && ch<='z') {
			System.out.println(ch + " is a alphabet");
		}
		else if(ch >='0' && ch <= '9') {
			System.out.println(ch + " is a digit");
		}
		else {
			System.out.println(ch + " is a symbol");
		}

	}

}
