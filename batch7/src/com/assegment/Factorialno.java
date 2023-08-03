package com.assegment;

import java.util.Scanner;

public class Factorialno {

	public static void main(String[] args) {

		int m, Factorialno = 1;
		System.out.println("Enter A No");
		Scanner sc = new Scanner(System.in);
		 m = sc.nextInt();


		for 
		(int i = 1; i <= m; i++) {
			Factorialno = Factorialno* i;
		}

		System.out.println("Factorialno of :"+Factorialno);
//5*4*3*2*1
	}

}
