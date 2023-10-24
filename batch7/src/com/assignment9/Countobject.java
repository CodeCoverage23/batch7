package com.assignment9;
//Write the Java program in which create the multiple objects and
//display the count of number of objects created into class.

public class Countobject {
 static int i;
Countobject(){
	i++;
	
}
void geti()
{
	System.out.println("number of object created "+i);
	
}
public static void main(String[] args) {
	
	 Countobject obj1 = new  Countobject ();
	 Countobject obj2 = new  Countobject ();
	 Countobject obj3 = new  Countobject ();
	 Countobject obj4 = new  Countobject ();
	 Countobject obj5 = new  Countobject ();
	 Countobject obj6 = new  Countobject ();
	 Countobject obj7 = new  Countobject ();
	 
	 obj1.geti();
}
}
