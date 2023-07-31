package com.Assign4;
//Write the Java Program to calculate total of five subject marks and average of it.
import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
	int a,b,c,d,e;
	System.out.println("enter marks of five subject");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();

	c = sc.nextInt();

	d = sc.nextInt();

	e = sc.nextInt();
	int sum =a+b+c+c+d+e;
	System.out.println("Total mars"+sum);
	double avg= sum/5.0;
	System.out.println("Average marks");
			
	
		
	
		

	}

}
