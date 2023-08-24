package assignment6;

import java.util.Scanner;

// . Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like 
 // 5*1=5.......5*10=50)
public class assignment62 {
	public static void Multiplication(int no) {
		int i = 1;
		while(i <= 10) {
			System.out.println(no*i);
			i++;
		}
	}
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();
		 
		assignment62 a = new assignment62();
		
		a.Multiplication(no);
	}

}
