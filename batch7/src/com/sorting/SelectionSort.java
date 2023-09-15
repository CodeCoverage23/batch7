package com.sorting;

public class SelectionSort {

	public static void main(String[] args)
	{
		int[] a= {23,5,78,5,4,2,3};
		int min,temp;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		System.out.println("Sorted array");
		for(Integer l:a)
		{
			System.out.print(" "+l);
		}  
	}

}
