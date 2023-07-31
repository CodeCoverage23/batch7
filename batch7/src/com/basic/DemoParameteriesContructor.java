package com.basic;

public class DemoParameteriesContructor {

	int rollNo;

	String name;

	String clgName;

	public DemoParameteriesContructor(int r, String n, String c) {
		rollNo = r;
		name = n;
		clgName = c;
	}

	public DemoParameteriesContructor(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void display() {
		System.out.println(rollNo + " " + name + " " + clgName);
	}

	public static void main(String[] args) {
		
		DemoParameteriesContructor d = new DemoParameteriesContructor(101, "John", "IIT");
		DemoParameteriesContructor d2 = new DemoParameteriesContructor(102, "John", "IIT");
		DemoParameteriesContructor d3 = new DemoParameteriesContructor(103, "John", "IIT");
		DemoParameteriesContructor d4 = new DemoParameteriesContructor(104, "John", "IIT");
		DemoParameteriesContructor d5 = new DemoParameteriesContructor(105, "John", "IIT");
		DemoParameteriesContructor d6 = new DemoParameteriesContructor(106, "Sam");

		d.display();

		d2.display();
		d3.display();
		d4.display();
		d5.display();

		d6.display();
	}

}
