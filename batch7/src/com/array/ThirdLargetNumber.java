package com.array;

public class ThirdLargetNumber {

	public static void main(String[] args)
	{
		int a[]= {1,6,4,3,2,8,9,10,11,34};
		System.out.println("Descending order:");
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			
				if(a[i]<a[j])
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
		System.out.println("\nThird Largest number:"+a[2]);
		System.out.println("Second Largest number:"+a[1]);
		System.out.println("Largest number:"+a[0]);
		int smallest=a.length-1;
		System.out.println("Smallest Number:"+a[smallest]);
		
	}

}
