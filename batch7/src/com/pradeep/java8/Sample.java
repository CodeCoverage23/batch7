package com.pradeep.java8;

import java.util.Optional;

public class Sample {

	public static void main(String[] args) {		
		
		String str="pradeep";
		
		Optional<String> of = Optional.ofNullable(str);
		 System.out.println(of);
		 System.out.println(of.isPresent());
		 System.out.println(of.isEmpty());
//		 System.out.println(of.get());
		System.out.println(of.orElse("this is null object"));
		System.out.println(of.orElseThrow(()-> new IllegalStateException("this is null object so that exception is thorwn")));
	
	}

}
