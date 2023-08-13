package com.TaskArray;
//WAP to perform addition of the array.

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		int sum=0;
		
		System.out.println("Enter the array element one by one : ");
		
		for (int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		sum = sum + arr[i];
		}
		
		System.out.println("The sum of Array elements is "+sum);

	}

}
