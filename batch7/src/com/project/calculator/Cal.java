package com.project.calculator;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		
		CalImpl calImpl = new CalImpl();
		String menuchoice = calImpl.menu();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int x = sc.nextInt();
		System.out.println("Enter 2nd no");
		int y = sc.nextInt();
		String nc = calImpl.opration(menuchoice, x, y);
		
		if(nc.equals("0")) {
			calImpl.opration(nc, x, y);
		}else if(nc.equals("8")) {
			calImpl.menu();
		}else if(nc.equals("9")) {
			calImpl.opration(menuchoice, x, y);
		}else {
			System.out.println("invalid");
		}
		
	}

}
