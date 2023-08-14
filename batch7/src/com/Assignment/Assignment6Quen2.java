package com.Assignment;

import java.util.Scanner;

//2. Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like 

public class Assignment6Quen2 {
	
	public void multiplication(int no) {
		for (int i = 1; i <= 10; i++) {

			System.out.println(no + " * " + i + " = " + no * i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int no = sc.nextInt();
		Assignment6Quen2 as = new Assignment6Quen2();

		as.multiplication(no);

	}

}
