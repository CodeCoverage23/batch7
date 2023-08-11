package assignment5;

import java.util.Scanner;

//  Write a program to print month of year. Case 1 January case 2 February case n....use switch case

public class assignment57 {
	public static void main(String[] arge) {
		System.out.println("1:januaey\n2:february\n3:march\n4:april\n5:may\n6:jun\n7:july\n8:augast\n9:saptember\n10:october\n11:novamber\n12:desamber");
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int number = Sc.nextInt();
	
		switch(number) {
		
		
		
		case 1: System.out.println("january");
		break;
		
		case 2: System.out.println("february");
		break;
		
		
		case 3: System.out.println("march");
		break;
		
		case 4: System.out.println("april");
		break;
		
		case 5: System.out.println("may");
		break;
		
		case 6: System.out.println("jun");
		break;
		
		case 7: System.out.println("july");
		break;
		
		case 8: System.out.println("augast");
		break;
		
		case 9: System.out.println("saptember");
		break;
		
		case 10: System.out.println("october");
		break;
		
		case 11: System.out.println("november");
		break;
		
		case 12: System.out.println("decamber");
		
		
		}
 
	}
}
