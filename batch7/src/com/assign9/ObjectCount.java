package com.assign9;
// Write the Java program in which create the multiple objects and display the count of number of objects created into class.

public class ObjectCount {
	static int count;
	public ObjectCount() {
		count++;
	}
	public static int getCountOfObject() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCount s1 = new ObjectCount();
		ObjectCount s2 = new ObjectCount();
		ObjectCount s3 = new ObjectCount();
		System.out.println("object created until now : ");
		System.out.println(getCountOfObject());
		
		ObjectCount s4 = new ObjectCount();
		ObjectCount s5 = new ObjectCount();
		ObjectCount s6 = new ObjectCount();
		
		System.out.println("object created at last : ");
		System.out.println(getCountOfObject());

	}

}
