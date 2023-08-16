//1.write a program to check the number is positive or negative.

package com.Assignments.basic;
import java.util.Scanner;

public class PositiveNegative {


	public static void main(String[] args) {
		
		int a;
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter a Number");
		a=a1.nextInt();
		
		if (a>=0)
	System.out.println( a + " is Positive Number");
		else
			System.out.println( a + " is Negative number");
	}

}
