
  //Write the program to print the square of any number.

package com.Assignments.basic;

import java.util.Scanner;


public class Square {
	
	public static void main(String[] args) {
		
		
		Scanner sq= new Scanner(System.in);
		System.out.println("Enter a number");
        int square=sq.nextInt();
		
		int squ= square*square; 
		System.out.println("square of number=" + squ);
	}

}
