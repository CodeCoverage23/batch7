package com.assegment7;

import java.util.Scanner;

//Design method to print factors of given number
//( Enter no = 6 then factors should be displayed like 1,2,3,6.
public class Assig7Q3 {

	public static void factors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(+i + " ");
			}
		}
	}

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		System.out.println("enter the number");
		int num = SC.nextInt();
		if (num < 0) {
			factors(num);
		}

	}

}
