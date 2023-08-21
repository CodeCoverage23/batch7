package com.pradeep.basic;

import java.util.Scanner;

public class AddtionOfArray {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		 
		System.out.println("enter the size of array");
		
		int n = sc.nextInt();
		
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		
		System.out.println("enter "+n+" elements");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter "+n+" elements");
		for(int i=0;i<n;i++) {
			
			arr2[i]=sc.nextInt();
		}
		
		int arr3[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr3[i]=arr1[i]+arr2[i];
			System.out.println("addition of " +i+" index is :"+arr3[i]);
		}
		
	}

}
