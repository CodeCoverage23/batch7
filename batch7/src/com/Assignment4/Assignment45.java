package com.Assignment4;

import java.util.Scanner;

//write java program to calculate total of five subject marks and average of it.
public class Assignment45 {
	public static void main(String[] args) {

		float maths, sci, hindi, eng, marathi;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter subject marks :");
		System.out.println("maths subject marks:");
		maths = sc.nextFloat();
		System.out.println("sci subject marks:");
		sci = sc.nextFloat();
		System.out.println("hindi subject marks:");
		hindi = sc.nextFloat();
		System.out.println("eng subject marks:");
		eng = sc.nextFloat();
		System.out.println("marathi subject marks:");
		marathi = sc.nextFloat();

		float total = maths + sci + hindi + eng + marathi;
		System.out.println("Average marks :" + total / 5);
		total = maths + sci + hindi + eng + marathi;
		System.out.println("total :" + total);
	}
}
