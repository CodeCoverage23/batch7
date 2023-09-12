package com.array;

public class AnnoymousArray {

	public static void main(String[] args)
	{
	  
		AnnoymousArray.sum(new int[] {10,30,40});
	}
	static void sum(int [] no)
	{
		int total=0;
		for(int i:no)
		{
			total=total+i;
		}
		System.out.println("Sum of array is:"+total);
	}

}
