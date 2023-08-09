package com.Task;

import java.util.Scanner;

//WAP to print  FS.
public class Fabonacciseries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		int count=10;
		
		System.out.print(n1+ " "+ n2);
		while(count>0) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			count--;
		}

	}

}
