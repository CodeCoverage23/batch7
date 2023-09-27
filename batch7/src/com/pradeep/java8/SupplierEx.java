package com.pradeep.java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {

		Supplier<Date> s=()-> new Date();
	System.out.println(	s.get());
	System.out.println(	s.get());
	System.out.println(	s.get());
	System.out.println(	s.get());
	System.out.println(s.get());
		
		
		
	}

}
