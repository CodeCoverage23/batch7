package com.le;

import java.util.function.Predicate;

@FunctionalInterface
interface Inter {
	public void m1();
}

public class LambdaExDemo1 implements Predicate<Integer> {

	public static void main(String[] args) {

		Inter i = () -> System.out.println("JAVA");

		i.m1();

	}

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		}
		return false;
	}
	
	

}
