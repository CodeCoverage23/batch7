package com.multithreading;

class MyThread1 extends Thread {

	@Override
	/*
	 * When Thread scheduler gives chance for execution
	 * 
	 * Running state
	 */
	public void run() {
		System.out.println("Child Thread");
	}

}

public class ThreadCreationWay1 {

	public static void main(String[] args) {

		MyThread1 t = new MyThread1(); // Born

		t.start(); // Runnable

		System.out.println("Main Thread	");

	}

}
