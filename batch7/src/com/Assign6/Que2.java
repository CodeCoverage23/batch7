package com.Assign6;
import java. util.Scanner;
public class Que2 {
	
		public int multiplication(int num,int i ) {
			int mul = num*i;
			return mul;
			
		}
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n =sc.nextInt();
			for(int i=1;i<=10;i++) {
				int mul =   n*i;
				System.out.println(mul);
			}
			
		}

	}

