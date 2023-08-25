package assignment7;

import java.util.Scanner;

//. Design method to print factors of given number
//( Enter no = 6 then factors should be displayed like 1,2,3,6.

public class assignment73 {
	public void factore(int num) {// method for finding factors
		
		for(i = 1; i <= num; i++ ) {
			if(num % i ==0) {
				System.out.println("i");
			}
		}
		
	}
	public  static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		assignment73 a = new assignment73();
		a.factore(num);
	}

}
