/* Design method public int getReverseNumber(int num) 
 * which return int value to that method and result print into main method.*/

package Assignment7;

import java.util.Scanner;

public class ReverseNumberUsingMethod {
	
	static int rev=0;
	
	public static int getReverseNumber(int num)  {
		
	while(num!=0)
	{
		 int rem=num%10;
		 rev=rev*10 + rem;
		 num = num/10;
	}
		 return rev;
	
	}

	public static void main(String[] args) {
		
		Scanner num1=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=num1.nextInt();
		
		getReverseNumber(num); 
		System.out.println(rev);

	}

}
