package com.Assign7;

import java.util.Scanner;

/*
 * Design method public int getReverseNumber(int num) which return 
 * int value to that method and result print into main method.
(Enter the no=125 then output will be 521
 */
public class Que4 {
	
	public int getReverseNumber(int num) { //method for reversing number
		int rev =0;
		
		while(num>0) {
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //adding scanner class
		System.out.println("Enter the number :");
		int num = sc.nextInt();//geting input from user
		
		Que4 a = new Que4();//object creation
		
		int ans = a.getReverseNumber(num);//method call
		
		System.out.println(ans);//displaying output

	}

}
