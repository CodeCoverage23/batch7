/*Assignment 6.4 Design method int factorial(int no) which returns 
value to that method.Print the result into main method*/

package com.assignments;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n; int fact = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
		fact = fact*i;
		}
		System.out.println("Factorial of a "+n+" is :" +fact);
	}

}
