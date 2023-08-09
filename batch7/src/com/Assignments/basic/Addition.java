/*1. Write the java program to design method for addition of two number 
which returns int results to that method and result should be print into main 
method.*/




package com.Assignments.basic;
import java.util.Scanner;

public class Addition {

	

	public static int add(int a, int b) {
		int c=a+b;
		return(c);
	
	}
	
	public static void main(String[] args) {
		//add Add= new add();
		int  a,b,c;
		
		Scanner a1= new Scanner (System.in);
		System.out.println("enter 1st number:");
		a=a1.nextInt();
		
		Scanner b1= new Scanner (System.in);
		System.out.println("enter 2nd number:");
		b=b1.nextInt();
		
		c= add(a,b);
		System.out.println("sum: " + c);

	}

}

