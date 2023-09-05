package com.assegment7;

import java.util.Scanner;

//Design method public int getNumberCube(int num), return int value to that method 
//and result should be into main method.
public class Assig7Q2 {

	public static int getNumberCube(int num1, int num2, int num3) {
		int num = num1 * num2 * num3;
		return num;

	}

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("enter the number");
		int num = SC.nextInt();
		int n = getNumberCube(num, num, num);
		System.out.println("the cube of number is" + n);

	}

}
