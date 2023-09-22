package com.searching;

public class LinearSearchDemo 

{

	public  static int searchElement(int[] arr, int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			 if(arr[i]==key)
				 return i;
		}
		
		return -1;
		
	}
	public static void main(String[] args)
	{
		int[] arr= {10,20,330,50,70};
		
		int key=10;
		
	    System.out.println("elemnet is found at index:"+searchElement(arr,key));
		
	}


}
