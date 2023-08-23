package com.DailyTask;

import java.time.LocalTime;

public class Greetings {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());

		if (time.getHour() >= 5 && time.getHour() < 12) {
			System.out.println("good morning");
		} else if (time.getHour() >= 12 && time.getHour() < 17) {
			System.out.println("good afternoon");
		} else if (time.getHour() >= 17 && time.getHour() < 21) {
			System.out.println("good evening");
		} else
			System.out.println("good night");

	}

}
