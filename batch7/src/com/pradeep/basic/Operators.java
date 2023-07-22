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
		
//	//Logical operator
//	  //AND operator(&&)
//	 //1. if the first condition is true then it will check the second condition
//		System.out.println(a<c && a<++b);//true && false=false
//		System.out.println(b);
//  //2. if the first condition is false then it will not check the second condition
//		System.out.println(a>c && ++a>b);//false=false
//		System.out.println(a);
		
//		//or operator(||)
//		
//		System.out.println(a<c || a<++c);//true=true
//		System.out.println(c);
//		System.out.println(a>c || a<++c);//false||true =true
//		System.out.println(c);
//		
		//Assignment Operator
//		
//		int x=10;
//		int y=15;
//		int z=x+y;
//		System.out.println(z);
//		//+= operator
//		System.out.println("addition :"+(x+=15));//x=x+15=>x=10+15=25
//		// -= operator
//		System.out.println("substraction :"+(x-=5));//x=x-5=>25-5=5=20
//		//*= operator
//		System.out.println("multiplication :"+(x*=10));//x=x*10=20*10=200
//		//  /= operator
//		System.out.println("division :"+(x/=10));//x=x/10=200/10=20
//		// %= operator
//		System.out.println("remainder :"+(x%=10));//x=x%10=20/10=0
//		
		// Relation operator
//		// ==,<,>,>=,<=,!=
//		int s=10;
//		int k=10;
//		int j=20;
//		System.out.println("s>k :"+(s>k));//false
//		System.out.println("s>=k :"+(s>=k));//true
//		System.out.println("s<k :"+(s<k));//false
//		System.out.println("s<=j :"+(s<=j));//true
//		System.out.println("s==k :"+(s==k));//true
//		System.out.println("s!=k :"+(s!=k));//false
//		
		// ternary operator(?)
		System.out.println(a>b?a:b);//15
		
	}

}
