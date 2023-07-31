package com.basic;

public class DemoStaticVariable {

	static String name = "Akola";
	int count;

	public DemoStaticVariable(int count) {
		this.count = count;
	}

	public void display() {
		System.out.println(name + count);
	}

	public static void main(String[] args) {

		DemoStaticVariable d1 = new DemoStaticVariable(11);
		DemoStaticVariable d2 = new DemoStaticVariable(12);
		DemoStaticVariable d3 = new DemoStaticVariable(13);
		DemoStaticVariable d4 = new DemoStaticVariable(14);
		DemoStaticVariable d5 = new DemoStaticVariable(15);

		d1.display();
		d2.display();
		d3.display();
		d4.display();
		d5.display();

		System.out.println(d1.name);
		System.out.println(name);
		System.out.println(d3.count);
		System.out.println(d4.count);
		System.out.println(d5.count);

	}

}
