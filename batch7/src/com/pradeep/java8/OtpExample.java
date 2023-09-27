package com.pradeep.java8;

import java.util.function.Supplier;

public class OtpExample {

	public static void main(String[] args) {
      Supplier<String> s=()->{
    	  String otp="";
    	  for(int i=0;i<6;i++) {
    		 int num= (int)(Math.random()*10); 
				otp = otp + num;    		  
    		  
    	  }
    	   return otp;  
      };
		
		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		System.out.println((int)(Math.random()*10));
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
		
	}

}
