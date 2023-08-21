/*Assignment 7.1 Design a method to print factors of a given
  number*/

package com.assignments;

import java.util.Scanner;

public class Factors {
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		
		
			for(int i=1; i<=num; i++)
	
			if(num % i == 0)
			{
				System.out.println(i);
			}
			
	}

}
