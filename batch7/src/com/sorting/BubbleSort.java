package com.sorting;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[]= {12,5,6,8,1,34,56};
		System.out.println("Before sorting:");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\nAfter sorting:");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}  

}
