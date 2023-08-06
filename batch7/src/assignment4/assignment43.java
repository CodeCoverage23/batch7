package assignment4;
// Write the java program to design method for multiplication of two number
//which returns int value to that method and result should be print into main method.

public class assignment43 {
	public int multiplication(int a, int b) {
		return a*b;
	}
	public static void main(String[] arge) {
		assignment43 q = new assignment43();
		int w = q.multiplication(34, 23);
		System.out.println("multiplication of two number>>" + w);
	}

}
