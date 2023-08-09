  /*4. Write the java program to design method for division of two 
   * number which returns int value to that method and result should be 
   * print into main method.

   * */ 

package com.Assignments.basic;

import java.util.Scanner;

public class Division {


	public static int div(int a, int b) {
		int c=a/b; //quotient
		return c;
	}
	public static int remi(int a, int b) {
		
		int d=a%b; //reminder
		return d;
		
	
	}
	
	public static void main(String[] args) {
		
		int  a,b,c,d;
		
		Scanner a1= new Scanner (System.in);
		System.out.println("enter 1st number:");
		a=a1.nextInt();
		
		Scanner b1= new Scanner (System.in);
		System.out.println("enter 2nd number:");
		b=b1.nextInt();
		
		c= div(a,b);
		System.out.println("Division: " + c);
		
		d= remi(a,b);
		System.out.println("division reminder: " + d);

	}
	}


