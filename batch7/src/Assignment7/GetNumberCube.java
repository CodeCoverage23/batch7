/*Design method public int getNumberCube(int num),
return int value to that method and result should be into main method.*/
package Assignment7;

import java.util.Scanner;

public class GetNumberCube {
	
	 public static int getNumberCube(int num) {
		 
		 int cube= num*num*num;
		 System.out.println("cube of number=" + cube);
		 
	 return (num);
	 }
	
	

	public static void main(String[] args) {
		
		Scanner number=new Scanner(System.in);
		System.out.println("enter a number");
		int num= number.nextInt();
		
		getNumberCube(num);
		
	}

}
