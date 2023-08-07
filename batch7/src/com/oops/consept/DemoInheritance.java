package com.oops.consept;

class Animal {
	int legs = 2;

	public void eat() {
		System.out.println("I am eating...");
	}

	public void walk() {
		System.out.println("I am walking...");

	}
}

public class DemoInheritance extends Animal {
	public void run() {
		System.out.println("I can Run...");
	}

	public static void main(String[] args) {

		DemoInheritance d = new DemoInheritance();

		d.eat();
		d.walk();
		d.run();
		System.out.println(d.legs);

	}

}
