package com.arrays;

public class DemoArray1 {

	public static void main(String[] args) {

		int a[] = { 2, 3, 1, 4, 5, 8, 7, 9, 6 };

		

//		System.out.println(a[0]); // indexing
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);

		// By old for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("******************************");

		for (int j : a) {
			System.out.println(j);
		}
	}

}
