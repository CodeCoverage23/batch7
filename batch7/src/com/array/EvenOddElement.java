package com.array;

public class EvenOddElement {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,8,9,10,12};
		System.out.println("Odd elements:");
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\nEven elements:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			
				System.out.print(arr[i]+" ");
			}
		}
	}

}
