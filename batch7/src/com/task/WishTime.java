package com.task;

import java.time.LocalTime;

public class WishtTme {

	public static void main(String[] args) 
	{
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
	
//		good morning(5am-12pm)
//		good after non(12pm-4pm)4=16
//		good evening(4pm-9pm)9=21
//		good night(9pm-6am)
		
		
		System.out.println(lt.getHour());
		if(lt.getHour()>=5 && lt.getHour()<12)
		{
			System.out.println("good morning");
		}
		else if(lt.getHour()>=12 && lt.getHour()<16)
		{
			System.out.println("Good After noon");
		}
		else if(lt.getHour()>=16 && lt.getHour()<22)
		{
			System.out.println("Good evening");
		}
		else
		{
			System.out.println("good night");
		}
	}

}
