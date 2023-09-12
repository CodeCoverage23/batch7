package com.StringMethods;

import java.util.Scanner;

public class FreqOfChar {

	public static void main(String[] args)
	{
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		String[] strr=str.split("");
		
		int count;
		for(int i=0;i<strr.length;i++)
		{
			count=1;
			for(int j=i+1;j<strr.length;j++)
			{
				if(strr[i].equals(strr[j]))
				{
					count++;
					strr[j]="0";
				}
			}
			if(strr[i]!=" " && strr[i]!="0" )
			{
				System.out.println(strr[i]+"="+count);
			}
		}
		
		
		//another way
		// given string
				String str1 = "rabiya nadaf";
				// counter array to store the frequency of each character.
				int freq[] = new int[str.length()];
				
				// convert the string into character array
				// store it in ch[]
				char ch[] = str1.toCharArray();
				
				// traverse through each character in the ch[] array
				for(int i=0;i<ch.length-1;i++)
				{
					// set freq[i] as 1 
					// for the first time visiting each new character
					freq[i]=1;
					// iterate through the rest of the characters
					for(int j=i+1;j<ch.length;j++)
					{
						// if more ch[i] characters are present
						if(ch[i]==ch[j])
						{
							// increase the count by 1
							freq[i]++;
							// set ch[j] to 0 to avoid counting visited characters
							ch[j]='0';
						}
						
					}
				}
				
				// traverse through the freq array
				for (int i = 0; i < freq.length; i++)
		               {
					// if characters in ch[] array is not '0' and ' '
					if(ch[i]!='0' && ch[i]!=' ')
					{
						// print the character along with its frequency
						System.out.println(ch[i]+" - "+freq[i]);
					}				
		               }

		
		

	}

}
