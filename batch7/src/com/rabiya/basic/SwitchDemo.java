package com.rabiya.basic;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) 
		{
			System.out.println("1:Sunday\n2:Monday\n3:Tuesday:\n4:Wednesday:\n5:Thursday:\n6:Friday:\n7:Saturday\n8:Exit:");
			System.out.println("Enetr your choice:");
			int ch = s.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;

			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option...");

			}
		}

	}
}
