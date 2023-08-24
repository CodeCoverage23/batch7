package com.Assignment;

import java.util.Scanner;
//3. Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.

public class Assignment7Que3 {
	public void factors() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(" "+ i);
			}
		}
	}

	public static void main(String[] args) {
		Assignment7Que3 as = new Assignment7Que3();
		as.factors();

	}

}
