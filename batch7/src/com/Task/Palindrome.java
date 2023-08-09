package com.Task;

import java.util.Scanner;

/*WAP to check if the given number is palindrome numbers or not.
 *  Use scanner class to read the number from the user and use nextInt () 
 *  method for the same.
 */
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		int num = sc.nextInt();
		
		int orgnum = num;
		int rev=0;
		
		while(num>0) {
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(orgnum==rev) {
			System.out.println("given number is an palindrome number.");
		}
		else {
			System.out.println("given number is not an palindrome number.");
		}

	}

}
