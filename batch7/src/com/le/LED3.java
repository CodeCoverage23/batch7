package com.le;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LED3 {

	public static void main(String[] args) {

		Function<Integer, Integer> f = entry -> entry * 44;
		System.out.println(f.apply(100));
		Function<String, Integer> f2 = e -> e.length();
		System.out.println(f2.apply("Coverage"));

		Function<String, String> f3 = e -> e.toUpperCase();
		System.out.println(f3.apply("Coverage"));
		System.out.println("-----------------------------");

		Consumer<String> c = e -> System.out.println(e);
		c.accept("Code Coverage");

		Consumer<String> c2 = e -> {
			String d = e.toUpperCase();
			System.out.println(d);
		};
		c2.accept("Code Coverage");

		System.out.println("-----------------------------");

		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		String string = s.get().toString();
		char charAt = string.charAt(11);
		System.out.println(charAt);
		System.out.println(s.get());

	}

}
