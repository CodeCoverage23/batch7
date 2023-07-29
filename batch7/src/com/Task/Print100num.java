package com.Task;

import java.util.Scanner;

public class Print100num {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String s1 = s.next();

		System.out.println("Enter your last name : ");
		String s2 = s.next();

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(s1 +" "+ s2);

			} else if (i % 7 == 0) {
				System.out.println(s2);
			} else if (i % 5 == 0) {
				System.out.println(s1);

			} else {
				System.out.println(i);
			}
		}

	}

}
