//Design method to print factors of given number
//( Enter no = 6 then factors should be displayed like 1,2,3,6.

package Assignment7;

import java.util.Scanner;

public class FactorsOfNumber {
	
	public static int factors(int a) {
		
		for(int i=1; i<=a;i++)
		{
			if(a%i==0)
				System.out.println(i);
			
		}
		
	return(a);
	}

	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		System.out.println("enter a number");
		int number= num.nextInt();
		
		factors(number);

	}

}
