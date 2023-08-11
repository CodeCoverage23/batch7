package com.task;

import java.util.Scanner;

public class ArrayAdditionDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length:");
		int len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("Enter array elements:");
		for(int i=0;i<len;i++)
		{
		 a[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<len;i++)
		{
		 sum=sum+a[i];
		}
		System.out.println("Addition of array elements are:"+sum);
	   

	}

}
