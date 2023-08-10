package com.Assign5;

import java.util.Scanner;

public class Que2 {
	

	public static void main(String[] args) {
int year=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the year");
	int a =sc.nextInt();
	if (year%100==0 && year%400==0)
	{
System.out.println("the year is leap year");

	}else {
		System.out.println("the year is not leap year");
	}

}
}