//4.Write a program to print month of year. Case 1 January case 2 February case n....use switch case
package com.assignment5;

import java.util.Scanner;

public class YearSwitchCase {

	public static void main(String[] args) {

		while (true) {
			System.out.println(
					"1:january\n2:February\n3:March\n4:April\n5:May\n6:June\n7:July\n8:August\n9:September\n10:October\n11:November\n12:December\n13:Exit");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice:");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("January");

				break;
			case 2:
				System.out.println("February");

				break;

			case 3:
				System.out.println("March");

				break;
			case 4:
				System.out.println("April");

				break;
			case 5:
				System.out.println("May");

				break;
			case 6:
				System.out.println("June");

				break;
			case 7:
				System.out.println("July");

				break;
			case 8:
				System.out.println("August");

				break;
			case 9:
				System.out.println("September");

				break;
			case 10:
				System.out.println("October");

				break;
			case 11:
				System.out.println("November");

				break;
			case 12:
				System.out.println("December");

				break;
			case 13:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice:");
				break;
			}
		}
	}

}
