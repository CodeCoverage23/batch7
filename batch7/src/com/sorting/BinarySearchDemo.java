package com.sorting;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args)
	{
		//array is alreary sorted if not you have to first sort the array.
		int[] arr= {1,6,4,3,7,8,9};
		int first,last,mid,key;
		//sorting array using Arrays.sort
		Arrays.sort(arr);
		for(Integer i:arr)
		{
			System.out.print(" "+i);
		}
		key=3;
		first=0;
		last=arr.length-1;
		mid=(first+last)/2;
		while(first<=last)
		{
			if (key == arr[mid])
			{
				System.out.println("\n Key is found at index:" + mid);
				break;
			}
			else if (arr[mid] < key)
			{
				first = mid +1;
			} 
			else 
			{
				last = mid -1;
			}

			mid = (first + last) / 2;
		
		
		}
		if(first>last)
		{
			System.out.println("\n Key is not found");
		}
	}

}
