/*Design method int factorial(int no)  which returns int value to that method. 
 * print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 
 * then output is 120)
 */

package Assignment6;

public class Factorial {
	
	public static int fact(int a){
		int fact=10;
		for(int i=1;i<a;i++)
		{
		    fact=fact*i;
			System.out.println("factorial of " + a + "=" + ""+ fact);
		}
		
		return fact;
	}
	

	public static void main(String[] args) {
	
		fact(10);
		
		
	}

}
