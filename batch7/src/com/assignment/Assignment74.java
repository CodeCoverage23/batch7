package com.assignment;

public class Assignment74 {

	public static void main(String[] args) {
		int number=125 ,reverse= 0;
		for(;number !=0;number=number/10) {
		 int remainder=number % 10;
		 reverse= reverse * 10 + remainder;
		
		}
		System.out.println("the reverse number is:"+reverse);
		
		// TODO Auto-generated method stub

	}

}
