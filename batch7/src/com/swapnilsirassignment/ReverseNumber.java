package com.swapnilsirassignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number to reverse :");
		int number = sc.nextInt();
		int orgnum = number;
		int rev = 0;
		while(number >0) {
			int rem = number%10;
			rev = rev *10 +rem;
			
			number = number /10;
		}
System.out.println("the reverse number of "+ orgnum +" is "+ rev);
	}

}
