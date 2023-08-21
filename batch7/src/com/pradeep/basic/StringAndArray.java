package com.pradeep.basic;

public class StringAndArray {

	public static void main(String[] args) {
      
		String name="pradeep";
		int number[]= {10,40,60,50,90,8};
		
		System.out.println(name);
     for(int i=0;i<number.length;i++) {
    	 
    	 System.out.println(number[i]);
    	 
    	 
     }
		for(int num:number) {
			
			System.out.println(num);
			
		}
		

	}

}
