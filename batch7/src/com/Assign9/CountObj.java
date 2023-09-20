package com.Assign9;

public class CountObj {
	static int i;
	CountObj(){
		i++;

	}
	void geti()
	{
		System.out.println("number of object created "+i);
	}
	
	

	public static void main(String[] args) {
		
		CountObj obj1 = new CountObj();
		CountObj obj2 = new CountObj();
		CountObj obj3 = new CountObj();
		CountObj obj4 = new CountObj();
		CountObj obj5 = new CountObj();
		CountObj obj6 = new CountObj();
		
		obj1.geti();
	}

}
