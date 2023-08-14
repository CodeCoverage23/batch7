/*
 * 5. Write the Java Program to calculate total of five subject marks and 
 * average of it.
 */


package com.Assignments.basic;

import java.util.Scanner;

public class Average {
	
	public static float avg(float maths, float science,  float english, float hindi,  float EVS) {
		float total= maths+science+english+hindi+EVS;
	    float averageofsubjects=total/5;
	          //System.out.println(total);
		return averageofsubjects;
		
	}

	public static void main(String[] args) {
		
		
		int math,science,english,hindi,EVS;
		float averageofsubjects,total;
		
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
		
	    total = math+science+english+hindi+EVS;
		
        System.out.println(total);

		
		averageofsubjects= avg(math,science,english,hindi,EVS);
		
		System.out.println("average of 5 subjects: " + averageofsubjects);
	

	}

}
