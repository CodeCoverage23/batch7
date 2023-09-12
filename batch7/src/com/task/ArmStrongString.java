package com.task;

import java.util.Scanner;

public class ArmStrongString {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		String s = sc.next();
		int len = s.length();
		char c;
		int arm = 0;
		for (int i = 0; i < len; i++) 
		{
			c = s.charAt(i);
            // convert ascii value to integer
            int num = Character.getNumericValue(c);
            //calculting power
            arm = (int) (arm + Math.pow(num, len));
         }
		String arm1 = Integer.toString(arm);
		if (arm1.equals(s))
		{
			System.out.println("Number is Armstrong");
		} 
		else 
		{
			System.out.println("Number is not a Armstrong");
		}
		 
		 
		 
		// Another way:convert first string into interger
		
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		int num = Integer.valueOf(s);
//		int len = (int) (Math.log10(num) + 1);
//		int original = num;
//		int rem, arm = 0;
//		while (num > 0) {
//
//			/*
//			 * without length method is applicabale only for 3 digit number rem=num%10;
//			 * arm=arm+rem*rem*rem; num=num/10;
//			 */
//
//			rem = num % 10;
//
//			arm = (int) (arm + Math.pow(rem, len));
//
//			num = num / 10;
//
//		}
//		if (arm == original) {
//			System.out.println("Number is Armstrong");
//		} else {
//			System.out.println("Number is not a Armstrong");
//		}

	}
}
