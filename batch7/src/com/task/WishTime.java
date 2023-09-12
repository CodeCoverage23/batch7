package com.task;

import java.time.LocalTime;
import java.util.Scanner;

public class WishTime {

	public static void main(String[] args) 
	{
    	LocalTime lt=LocalTime.now();
//		System.out.println(lt);
//	
// 		good morning(5am-12pm)
//		good after non(12pm-4pm)4=16
//		good evening(4pm-9pm)9=21
//		good night(9pm-6am)
//		
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter time");
		int time=sc.nextInt();
		if(time>=5 && time<12)
		{
			System.out.println("morning");
		}
		else if(time>=12 && time<16)
		{
			System.out.println("Afternoon");
		}
		else if(time>=16 && time<21 )
		{
			System.out.println("evening");
		}
		else
		{
			System.out.println("night");
		}
	
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
