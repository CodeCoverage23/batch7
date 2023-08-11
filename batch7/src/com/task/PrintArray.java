package com.task;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length");
		int len=sc.nextInt();
		int arr[]=new int[len];
		String arr1[]=new String[len];
		System.out.println("Enter Integer Array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Integer Array Elements are:");
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
		System.out.println("\nEnter String Array elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.next();
		}
		System.out.print("String Array Elements are:");
		for(String i:arr1)
		{
			System.out.print(" "+i);
		}

	}

} 
