package com.DailyTasks;


import java.time.LocalTime;

public class DayWish {
	
	public static void main (String args[]) {
	int hours= 24;
    LocalTime now= LocalTime.now();
	System.out.println(now);
	
	
	if(hours>=1 && hours<=12) {
		
		System.out.println("Good Morning");
		
	}
	
	else if(hours>=12 && hours<=16) {
		
		System.out.println("Good Afternoon");
	}
	
    else if(hours>=16 && hours<=21) {
		
		System.out.println("Good Afternoon");
	}
	
	else{
		
		System.out.println("Good Night");
	}
	
}

}
