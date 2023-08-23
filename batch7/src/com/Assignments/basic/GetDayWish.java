package com.Assignments.basic;

import java.time.LocalTime;

public class GetDayWish {

	public static void main(String[] args) {
		
		LocalTime now= LocalTime.now();
		System.out.println(now);
		
		int hours= now.getHour();
		
		
		if (hours>=20 || hours <=6)
		{
			System.out.println("Good Night");
		} else if(hours>=6 || hours<= 12)
		{
			System.out.println("Good Morning");
		} else if(hours>=12 || hours<= 16)
			
		{
			System.out.println("Good Afternoon");
		} else if(hours>=16 || hours<= 20)
		{
			System.out.println("Good Evening");
		}
		
			
		}
		
		
		
		



}
