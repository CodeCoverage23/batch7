package com.pradeep.basic;

public class Operators {

	public static void main(String[] args) {
      int a=15;
      int b=10;
      int c=20;
      int d=-25;
      // Unary operator
//       System.out.println(a++);
//       System.out.println(a);
//       System.out.println(++a);
//       System.out.println(a);
//	System.out.println(a++ + a++ + a++);//(12+1)13+12=25+14=39
//	System.out.println(b--);
//	System.out.println(b);
//	System.out.println(--b);
//	System.out.println(~c);//-(c+1)=-(20+1)=-21
//	System.out.println(~d);//-(c+1)=-(-25+1)=-(-24)=24
	
//       arithmetic operator
//      
//      System.out.println(a+b);
//      System.out.println(a-b);
//      System.out.println(a*b);
//      System.out.println(a/b);
//	  System.out.println(a%b);
//		
	//bitwise operator 
	 // 1=true ; 0=false
      //and operator
//	  System.out.println(a<b & a>b);//false
//	  System.out.println(a<c & a>b);//true
//		// or operator
//	  System.out.println(a<b | a>b);//true
//	  System.out.println(a>c | a<b);//false
		
	//Logical operator
	  //AND operator(&&)
	 //1. if the first condition is true then it will check the second condition
		System.out.println(a<c && a<++b);//true && false=false
		System.out.println(b);
  //2. if the first condition is false then it will not check the second condition
		System.out.println(a>c && ++a>b);//false=false
		System.out.println(a);
		
		//or operator(||)
		
		System.out.println(a<c || a<++c);//true=true
		System.out.println(c);
		System.out.println(a>c || a<++c);//false||true =true
		System.out.println(c);
		
		
		
	}

}
