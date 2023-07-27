package com.swatibasic;
import java.util.Scanner;

public class Evennumberusingscannerclass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int number=s.nextInt();
		
		System.out.print("list of even number from 1 to "  );
		
		for(int i= 1;i<=number; i++)
		{
			if(i%2==0)
			{
			System.out.print(i+" ");
			
		}
				
			
					
		}

	}

} 
