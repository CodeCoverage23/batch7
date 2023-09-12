package com.interfacePrograms;

public class InterfaceClass  implements interfaceDemo,InterfaceDemo2{

	public static void main(String[] args) {
		InterfaceClass ic=new InterfaceClass();
		ic.display();
		ic.defaultMethod();
		interfaceDemo.staticMethod();
		ic.show();
	}

	@Override
	public void display() {
		System.out.println("Interface concept");
		
	}

	@Override
	public void show() {
		System.out.println("I am show method");
		
	}

}
