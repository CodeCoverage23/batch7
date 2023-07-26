package com.basic.Control.Statement;

public class DemoSwitchCase {
	
	public static void main(String[] args) {
		int WeekDays=6; 
		String StringWeekDays="";

		switch (WeekDays) {

		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;

		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;


		default:
			System.out.println("Please give valid input");

		}

		System.out.println("Outside the loop");

	}


}
