package com.array;

public class AscendingOrder {

	public static void main(String[] args) 
	{
		int a[]= {1,6,4,3,2,8,9,0};
		System.out.println("Ascending order:");
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			
				if(a[i]>a[j])
					
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
