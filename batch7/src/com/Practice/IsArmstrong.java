package com.Practice;

import java.util.Scanner;

public class IsArmstrong {
	public static boolean isArm(int n) {
		 String str = String.valueOf(n);
		 int l = str.length();
		 int res = 0;
		 for(int i = 0;i<l;i++) {
			 int digit = Character.getNumericValue(str.charAt(i));
			 res += Math.pow(digit,l);
		 }
		 
		 return n==res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0;i<t;i++) {
			int n = sc.nextInt();
			System.out.println(isArm(n));
		}

	}

}
