package com.Assignment9;

public class MultipleObject {
	static int count=0;
	MultipleObject(){
		count++;
	}
public static void main(String[] args) {
	MultipleObject obj1=new MultipleObject();
	MultipleObject obj2=new MultipleObject();
	MultipleObject obj3=new MultipleObject();
	MultipleObject obj4=new MultipleObject();
	MultipleObject obj5=new MultipleObject();
	System.out.println("Number of object:"+count);
}
}
