package assignment5;
// Write a program to swap the two numbers.

public class assignment52 {
	
	public static void main(String[] args) {
		int a = 45; //23
		int b = 23; //45
		
		int numb;
		System.out.println("before swap:" +a +" "+b);
		numb=a; //numb=45
		a=b; //a=23
		b=numb; //b=45
		
		System.out.println("after swapping:" + a +" " +b);
	}

}
