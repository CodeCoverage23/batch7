package com.sorting;

public class BubbleSortString {

	public static void main(String[] args)
	{
		String a[]= {"rabiya","eshrat","ishu","touqeer","nadaf"};
		System.out.println("Before sorting:");
		for(String i:a)
		{
			System.out.print(i+" ");
		}
		String  temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				
				if(a[i].compareTo(a[j+1])>0)
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\nAfter sorting:");
		for(String i:a)
		{
			System.out.print(i+" ");
		}
	}

}
