package com.array;

public class DuplicateNumberRemove {

	public static void main(String[] args)
	{
		int a[]= {10,20,20,30,30,40,50,50};
		System.out.println("Before removing duplicates elements");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		int a2[]= new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
				
			{
				a2[j]=a[i];
				j++;
			}
		}
		a2[j]=a[a.length-1];
		System.out.println("\nAfter removing duplicates elements");
		for(int i:a2)
		{
			if(i==0)
			break;
			System.out.print(i+" ");
		}
		
		
		
	}

}
