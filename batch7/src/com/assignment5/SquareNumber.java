//7.  Write the program to print the square of any number.

package com.assignment5;

import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int square=num*num;
		System.out.println("Square of "+num+" is:"+square);

	}

}
