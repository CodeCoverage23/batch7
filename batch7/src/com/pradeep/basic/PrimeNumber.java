package com.pradeep.basic;
//1. java program for checking number is prime or not
//==> the number which is divisible by itself and 1 
//==> the number which have more than two factors then the following is not prime
public class PrimeNumber {

	public static void main(String[] args) {
	
		int num=5;//the number to be check
		int count=0;
		if(num>1) {
		for(int i=1;i<=num;i++)//syntax==> for(initialization;condition;increament)
		{
			if(num%i==0)//5%1==0,5%2==0
			{
				count++;
			}
			
		}
		
		if(count==2) {
			
			System.out.println("the number is prime number");
		}
		
		else {
			
			System.out.println("the number is not prime number");
		}	

	}else
	{
		
	System.out.println("the number is invalid");	
		
	}

}
}