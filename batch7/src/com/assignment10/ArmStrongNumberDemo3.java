/*3. Write java program to check whether number is Armstrong or not.(A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.
153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153)
*/
package com.assignment10;

import java.util.Scanner;

public class ArmStrongNumberDemo3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		//Taking input from user as a number
		int number=sc.nextInt();
		int temp=number;
		int len=0;
		//step1:find the length of a Given Number
		while(number>0)
		{
			number=number/10;
			len++;
		}
		System.out.println("Length of a Given Number:"+len);
		//step2:find cube of a each digit of given number
		int arm=0;
		int num2=temp;
		while(num2>0)
		{
			int cube=1;
			int rem=0;
			
			rem=num2%10;
			for(int i=0;i<len;i++)
			{
				cube=cube*rem;
			}
			//step 3:additon of cube of each digit into arm varaible
			arm=arm+cube;
			num2=num2/10;
		}
//		System.out.println(arm);
//		System.out.println(number);
//		System.out.println(temp);
//		//if temp i.e given number is equal to armstrong number then number is Armstrong
		if(temp==arm)
		{
			System.out.println("Given Number is ArmStrong Number:");
		}
		else
		{
			System.out.println("Given Number is Not a ArmStrong Number:");
		}
		
		
	}

}
