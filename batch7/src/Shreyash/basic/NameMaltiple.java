package Shreyash.basic;

import java.util.Scanner;

public class NameMaltiple {
	
	public static void main(String[] arge) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a value to prent name of perticular multiple : ");
		int number = sc.nextInt();
		for (int i = 1;  i<= number; i++ ) {
			if (i % 2 == 0 && i % 1 == 0){
			System.out.println(i + " :Shreyash chaurase");
		}
			else if (i % 2 == 0)
			{
			System.out.println(i + " : shreyash");
		}
			else if (i % 1 == 0) 
			{
			
			System.out.println(i + " : chaurase");
		}
			else 
			System.out.println(i);
			
	}

	}
	
}