package com.pradeep.java8;

@FunctionalInterface
interface Provider {

	public Bird getBird();

}

public class Consreff {

	public static void main(String[] args) {
		// Constructor refference
		Provider provider = Bird::new;
		// getBird method implementation
//		Provider provider=()->{
//			
//			return new  Bird();
//		};

		Bird bird = provider.getBird();
		bird.parrot();

	}

}
