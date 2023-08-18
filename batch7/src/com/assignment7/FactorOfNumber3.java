//3. Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.
package com.assignment7;

import java.util.Scanner;

public class FactorOfNumber3 
{

	
	
	
	public static  void getFactorOfNumber3(int no) 
	{
		
		
		for(int i=1;i<=no;i++)
		{
			
			   
			   if(no%i==0)
			   {
			    System.out.print(+i+",");
			   
			   }
				
			
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no=");
		int no=sc.nextInt();
		if(no>0)
		getFactorOfNumber3(no);
	
		
	}

}
