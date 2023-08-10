package com.Assignment4;

import java.util.Scanner;

public class Assingment4Q5 {	
public static void main(String[] args) {
//int eng, math, mar, phy,cps;
	double total,average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of five Subject :");
		System.out.println("Enter the english marks");
		int eng1 = sc.nextInt();
		System.out.println("Enter the math marks");
	    int math1 = sc.nextInt();
	    System.out.println("Enter the mar marks");
	    int mar1 = sc.nextInt();
	    System.out.println("Enter the phy marks");
		int phy1 = sc.nextInt();
		System.out.println("Enter the cs marks");
	    int cps1 = sc.nextInt();
	    total = eng1 + math1 + mar1 + phy1 + cps1;
		average = (total/5);
		System.out.println("total :=" +total);
		System.out.println("average :=" +average);
	}
}
