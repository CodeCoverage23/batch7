package com.pradeep.java8;

@FunctionalInterface
interface Inter{
	
	public void task();
}


public class reff {

	public static void main(String[] args) {
		
		//Static refference
        Inter inter=Book::javaBook;
       	inter.task();
		
       	// instance reff or object refference
		Book book = new Book();
		Inter inter1=book::cBook;
		
		inter1.task();
		
		
		
		
	}

}
