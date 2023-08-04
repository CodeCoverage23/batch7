package Assignment4;
//Write the java program to design method for division of two number which returns int value to that
//method and result should be print into main method.
public class Assignment44 {

	public int div (int p,int q) {
	return p/q;
	
}
	public static void main(String[] args) {

		Assignment44 r=new Assignment44();
		int s =r.div(30, 5);
	System.out.println("Division of two number:"+s);
}

}
