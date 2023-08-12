package assignment5;

import java.util.Scanner;

// write a program to find out maximum number among three number(if else if ladder statement)

public class assignment58 {
	public static void main(String[] arge) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int min=sc.nextInt();
		int max=sc.nextInt();
		
		for (int i = min; i <= max; i++) {
			int rev = 0;
			int org=i;
			while (org > 0) {
				 
				int rem=org % 10;
				rev = rev * 10 + rem;
				org = org/10;
			}
			if(i==rev) {
				System.out.println(rev+" ");
			}
		}
		
	}
	

}
