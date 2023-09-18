package com.demo.java8;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctinalInterfacesDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> s = e -> (e%2==0);
		System.out.println(s.test(42));
		
		
		Function<Integer,String> f= e-> e+2 +" hiii";
		System.out.println(f.apply(2));
		
		Consumer<String> c = e -> System.out.println(e);;
		c.accept("hellooooooooo");
		
		Supplier<String> p = () -> LocalDateTime.now().toString(); 
		String d = p.get();
		System.out.println(p.get());
		System.out.println(d);
		System.out.println(d.charAt(12));

	}

}
