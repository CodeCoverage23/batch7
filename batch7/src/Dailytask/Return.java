package Dailytask;
// Create four methods with return types for addition, subtraction, division(float)  multiplication, and create object of the class to call each method.
public class Return {
	
	public int add(int a, int b, int c) {
		return a + b - c * a / a; 
	}
	public static void main(String[] arge) {
		Return R = new Return();
		int d = R.add(10, 20, 30);
		System.out.println(d);
	}
}
	
 
	
	

