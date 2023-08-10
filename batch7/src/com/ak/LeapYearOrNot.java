package com.ak;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The Number ");
		int year = scanner.nextInt();
		
	 boolean isLeapYear=false;
	 if (year%400==0){
		 isLeapYear=true;
	 }else if (year%100==0){
		 isLeapYear=false;
	 }else if (year%4==0){
		 isLeapYear=true;
	 }
	 if(isLeapYear) {
		 System.out.println(year + "is a Leap Year");
	 }else {
		 System.out.println(year + "is not a Leap Year");
	 } 
	}
	//Assignment5)2
}
