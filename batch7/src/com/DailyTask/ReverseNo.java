package com.DailyTask;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter a number");
	int num = sc.nextInt();
	int orgnum =num;
	int rev =0;
	while(num>0) {
       int rem =num%10;
       rev = rev*10+rem;
       num=num/10;
	}
//	System.out.println("rev no of given no "+ orgnum + " is " + rev);
	if (orgnum == rev) {
		System.out.println("number is palidrome number");
	}
	else {
		System.out.println("number is not palidrome number");
	}
	}

}
