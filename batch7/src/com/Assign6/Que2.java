package com.Assign6;

import java.util.Scanner;

/*
 * Design method void multiplication (int no) and print the multiplication 
 * table. ( Example enter the no=5 then output like 
5*1=5.......5*10=50)

 */

public class Que2 {

	public void multiplication(int no) {

		int i = 1;
		while (i <= 10) {
			System.out.println(no * i);
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();

		Que2 a = new Que2();

		a.multiplication(no);

	}

}
