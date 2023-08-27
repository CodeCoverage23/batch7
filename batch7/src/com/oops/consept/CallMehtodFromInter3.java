package com.oops.consept;

public class CallMehtodFromInter3 implements Inter3 {

	public static void main(String[] args) {
		CallMehtodFromInter3 c = new CallMehtodFromInter3();
		c.defaultMethod();
		c.play();
	}

	@Override
	public void play() {
		Inter3.staticMethod();

	}

}
