/*
 * 5. Write the Java Program to calculate total of five subject marks and 
 * average of it.
 */


package com.Assignments.basic;

import java.util.Scanner;

public class Average {
	
	public static float avg(int a,int b, int c, int d, int e) {
		float averageofsubjects=(a+b+c+d+e)/5;
		return averageofsubjects;
		
	}

	public static void main(String[] args) {
		
		
		int math,science,english,hindi,EVS;
		float averageofsubjects;
		
		Scanner maths=new Scanner(System.in);
		System.out.println("enter marks of maths");
		math= maths.nextInt();
		
		Scanner science1=new Scanner(System.in);
		System.out.println("enter marks of science");
		science= science1.nextInt();
		
		Scanner english1=new Scanner(System.in);
		System.out.println("enter marks of english");
		english= english1.nextInt();
		
		Scanner hindi1=new Scanner(System.in);
		System.out.println("enter marks of hindi");
		hindi= hindi1.nextInt();
		
		Scanner EVS1=new Scanner(System.in);
		System.out.println("enter marks of EVS");
		EVS= EVS1.nextInt();
		
		averageofsubjects= avg(math,science,english,hindi,EVS);
		
		System.out.println("average of 5 subjects: " + averageofsubjects);
	

	}

}
