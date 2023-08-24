package com.DailyTasks;

import java.time.LocalTime;

public class getDayWish {
	
	
	public static void main (String args[]) {
	
	    LocalTime now= LocalTime.now();
		System.out.println(now);
		
		int hours= now.getHour();
		
		
		if(hours>=1 && hours<=12) {
			
			System.out.println("Good Morning");
			
		}
		
		else if(hours>=12 && hours<=16) {
			
			System.out.println("Good Afternoon");
		}
		
	    else if(hours>=16 && hours<=22) {
			
			System.out.println("Good Evening");
		}
		
		else{
			
			System.out.println("Good Night");
		}
		
	}

	}



