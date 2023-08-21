/*Assignment 6.3 Write a program to print all even numbers from
50 to 75*/

package com.assignments;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		
		int n;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		n=sc.nextInt();
		
		for(i=25; i<=n; i++)
		{
			if(i%2==0)
			{
		    System.out.println(i);
			}
		}
	}
}