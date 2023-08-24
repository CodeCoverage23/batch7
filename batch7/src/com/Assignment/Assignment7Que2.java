package com.Assignment;

import java.util.Scanner;

//2. Design method public int getNumberCube(int num), return int value to that method and result should be into main method.

public class Assignment7Que2 {

	public int getNumberCube(int num) {

		int cube = num * num * num;
		return cube;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		Assignment7Que2 as = new Assignment7Que2();
		int cube = as.getNumberCube(num);
		System.out.println(cube);
	}

}
