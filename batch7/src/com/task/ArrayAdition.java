package com.task;

import java.util.Scanner;

public class ArrayAdition {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length");
		int len=sc.nextInt();
		System.out.println("Enter Array 1 elements");
		int arr1[]=new int[len];
		int arr2[]=new int[len];
		int arr3[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Array 2 elements");
		for(int i=0;i<len;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("Addition of 2 arrays is:");
		for(int i=0;i<len;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		for(int i:arr3)
		{
			System.out.println(i);
		}
	}

}
