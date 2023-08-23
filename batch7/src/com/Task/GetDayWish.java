package com.Task;

import java.time.LocalTime;

public class GetDayWish {
 
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int h = time.getHour();
		
		System.out.println(); //blank line
		
		if(4<=h && h<=12) {
			System.out.println("Good Morning sunshine !");
		}
		else if(h>12 && h<17) {
			System.out.println("Good Afternoon");
		}
		else if(h>=17 && h<21) {
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}

	}

}
