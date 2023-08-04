package Assignment4;
// write the java programto design method for addition of two number which returns int result to 
//that mathod nd result should be print into main method.

public class Assignment41 {
	
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Assignment41 r=new Assignment41();
		int c = r.add(10,20);
	
		
System.out.println("Addition of two number is:"+ c);
	}

}