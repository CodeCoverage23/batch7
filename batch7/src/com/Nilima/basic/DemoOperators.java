package com.Nilima.basic;

public class DemoOperators {

	
	public static void main(String[] args) {

		//Assignment operator
		
		 int x = 10;
		 int y=15;
		 int z=x+y;
		 
		System.out.println(z);
		
		//+= operator
		System.out.println((x+=15));
		
		//- = operator
		System.out.println((x-=15));
		
		//*=
		System.out.println((x*=10));
		
		//= operator
		System.out.println((x/=10));
		
		//%= operator
		System.out.println(x%=10);
		
		//Realation operator
		
		// = =<,>=, <=,!=
		int s = 10;
		int k = 10;
		int j = 20;
		System.out.println("s>k"+(s<k));//false
		System.out.println("s>k"+(s>=k));//true
		System.out.println("s<k"+(s<k));//false
		System.out.println("s<=j"+(s<=j));//true
		System.out.println("s==k+(s==k)"); //true
		System.out.println("s!=k+(s!=k"); //false
		
		
				
		
	}
}
