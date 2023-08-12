package com.assignment5;

import java.util.Scanner;

//4.Write a program to print month of year. Case 1 January case 2 February case n....use switch case

public class Assignment5Q4 {

	public static void main(String[] args) {
		 
			System.out.println("1: january\n2 : february\n3 : march\n4 : april\n5: may\n6: jun\n7: july\n8: augest\n9: sepmber\n10: octmber\n11:novmber\n12:decmber");
			Scanner Sc = new Scanner(System.in);
			System.out.println("enter your choice");
			int number  = Sc.nextInt();
			
			
			switch (number) {
			

		
		case 1 : System.out.println("january");
		break;
		
		case 2 : System.out.println("februray");
		break;
		
		case 3 : System.out.println("march");
		break;
		
		case 4 : System.out.println("april");
		break;
		
		case 5 : System.out.println(" may");
		break;
		
		case 6 : System.out.println(" jun");
		break;
		
		case 7 : System.out.println(" july");
		break;
		
		case 8 : System.out.println(" augest");
		break;
		
		case 9 : System.out.println(" sepmber");
		break;
		
		case 10: System.out.println(" octmber");
		break;
		
		case 11 : System.out.println(" novmber");
		break;
		
		case 12 : System.out.println("decmber");
		
		
		
		
		}

	}

	}
