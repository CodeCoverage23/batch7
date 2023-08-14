package com.Assignment;

import java.util.Scanner;

//4. Design method int fact orial(int no)  which returns int value to that method. print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)

public class Assignment6Quen4 {
	public int factorial(int no) {
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		return no;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int no = sc.nextInt();

		Assignment6Quen4 as = new Assignment6Quen4();
		as.factorial(no);

	}

}
