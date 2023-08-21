package com.pradeep.basic;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range :");
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		for (int i = min; i <= max; i++) {
			int rev = 0; 
			int org=i;
			while (org > 0) {

				int rem = org % 10;
				rev = rev * 10 + rem;
				org = org / 10;
			}

			if(i==rev) {
				
				System.out.print(rev+" ");
			}	
			
		}

	}

}
