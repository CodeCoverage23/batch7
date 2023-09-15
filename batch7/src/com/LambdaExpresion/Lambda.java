package com.LambdaExpresion;


interface  Shape
{
	public void Draw();
}


public class Lambda 
{

	public static void main(String[] args)
	{
//		Shape circle=()->System.out.println("circle");
//		//circle.Draw();
//		Shape square=()->System.out.println("Square");
//		//square.Draw();
//		Shape rectangle=()->System.out.println("Rectangle");
//		//rectangle.Draw();
//		
//		 print(circle);
//		 print(square);
//		 print(rectangle);
//			
		 
		 print(()->System.out.println("circle"));
		 print(()->System.out.println("Square"));
		 print(()->System.out.println("Rectangle"));
		
		
		
		
		
	}
	//method parameter as lambda 
	
	private static void print(Shape shape)
	{
		shape.Draw();
	}

}
