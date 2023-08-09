/*
 * 3. Write the java program to design method for multiplication of two number 
 * which returns int value to that method and result should be print into main 
 * method.

 */


package com.Assignments.basic;

import java.util.Scanner;

public class Multiplication {

		public static int mult(int a, int b) {
			int c=a*b;
			return(c);
		
		}
		
		public static void main(String[] args) {
			
			int  a,b,c;
			
			Scanner a1= new Scanner (System.in);
			System.out.println("enter 1st number:");
			a=a1.nextInt();
			
			Scanner b1= new Scanner (System.in);
			System.out.println("enter 2nd number:");
			b=b1.nextInt();
			
			c= mult(a,b);
			System.out.println("Multiplication: " + c);

		}

	}


