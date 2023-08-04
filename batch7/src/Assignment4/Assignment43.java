package Assignment4;
//Write the java program to design method for multiplication of two number which returns int value to
//that method and result should be print into main method.
public class Assignment43 {
int a=25;
int b=20;

public int mul(int a,int b) {
	return a*b;
	
}
	public static void main(String[] args) {
		Assignment43 r=new Assignment43();
		int c=r.mul(25,20);
		System.out.println("multipiliction f two number:"+c);
	}

}
