package com.ak;
import java.time.LocalTime;
import java.time.Localtime;
public class TimeBasedGreet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime=LocalTime.now();
		
		if (currentTime.isBefore(LocalTime.NOON)) {
			System.out.println("Good Morning!!!");
		}
		else if (currentTime.isBefore(LocalTime.of(16,0))) {
			System.out.println("Good AfterNoon!!!");
		}else if 
			(currentTime.isBefore(LocalTime.of(21,0))) {
			System.out.println("Good Evening!!!");
		}else System.out.println("Good Night!!!");
		
		
	}

}
