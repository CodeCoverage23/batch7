package com.pradeep.java8;
@FunctionalInterface
interface Xyz{
    int bird(int x,int y);
    static void parrot(){
    	System.out.println("Hi I am Parrot");
    	
    }
    
    default void peacaock() {
    	
    	System.out.println("Hi I am Peacock");
    	
    }
    
    
}

public class Animal {
	public static void main(String[] args) {
		Xyz a =(x,y)->x*y;
		System.out.println(a.bird(20,30));
		Xyz.parrot();
		a.peacaock();
	}

}
