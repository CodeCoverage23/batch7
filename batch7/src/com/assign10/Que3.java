package com.assign10;

import java.util.Scanner;

/*
 * Write java program to check whether number is Armstrong or not.
 * (A positive number is called armstrong number if it is equal to the sum of cubes of 
 * its digits for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 
 * is an Armstrong number.

 */
public class Que3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		if(isArmstrong(n)) {
			System.out.println(n + " is a Armstrong number.");
		}else {
			System.out.println(n + " is not a Armstrong number.");
		}
		

	}
	public static boolean isArmstrong(int n) {
		int original,result=0,rem;
		original=n;
		 int numberOfDigits = (int) Math.log10(n) + 1;
		while(original!=0) {
			rem=original%10;
			result+=Math.pow(rem, numberOfDigits);
			original /=10;
		}
		return result==n;
	}

}
