package com.pradeep.java8;
@FunctionalInterface
interface Vehicle{
	void bike();
	static void car() {
		System.out.println("this is bmw car");
	}
	default void van() {
		System.out.println("this is van");	
	}
}


public class Java8Method  {
    public  void van() {
    	
    	System.out.println("this is tata van");
    }
	
	public static void cycle() {
		System.out.println("this is cycle");
	}
	
	
	public static void main(String[] args) {
		
		Java8Method java= new Java8Method();
		Vehicle v=()->System.out.println("this is honda bike");
		v.bike();
		cycle();
		Vehicle.car();
		v.van();
		java.van();
	}

}
