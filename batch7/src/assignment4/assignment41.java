package assignment4;



//Write the java program to design method for addition of two number
//which returns int results to that method and result should be print into main method.

public class assignment41 {
	public int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] arge) {
		assignment41 r = new assignment41();
		int d = r.add(10, 20);
		System.out.println("Addition of two number:" + d);
	}

}
