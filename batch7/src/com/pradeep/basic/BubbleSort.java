package com.pradeep.basic;

public class BubbleSort {

	public static void main(String[] args) {
		int temp = 0;
		int arr[] = { 76, 43, 23, 65, 88, 4 };

		System.out.println("array before sorting");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}

		}
        System.out.println();
		System.out.println("Array after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
