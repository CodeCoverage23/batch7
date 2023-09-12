package com.StringMethods;

public class MinMAxChar {

	public static void main(String[] args)
	{
		String s="grass is greener on the other side";
		
		System.out.println("length of a string:"+s.length());
		
		char[] arr=s.toCharArray();
		
		int[] freq=new int[arr.length];
		
		int i ,j;
		int min,max;
		
		
		
		for(i=0;i<arr.length;i++)
		{
			freq[i]=1;
			for( j=i+1;j<arr.length;j++)
			{
				//if(arr[i]==arr[j]&& arr[i] != ' ' && arr[i] != '0')
				if(arr[i]==arr[j]&& arr[i] != ' ' && arr[i] != '0')
				{
					freq[i]++;
				     arr[j]='0';
				
			}
			}
		}
//		for(char t:arr)
//		{
//			System.out.print(t+" ");
//		}
//			
		
//		for(int t:freq)
//		{
//			
//			System.out.print(t+" ");
//			
//		}
		char charmin,charmax;
		min=max=freq[0];
		charmin=s.charAt(0);
		charmax=s.charAt(0);
		for(i=0;i<freq.length;i++)
		{
			//if(min>freq[i]&& freq[i] != '0')
			if(min>freq[i]&& freq[i] != '0')
			{
				min=freq[i];
				charmin=arr[i];
			}
		}
		for(i=0;i<freq.length;i++)
		{
			if(max<freq[i])
			{
				max=freq[i];
				charmax=arr[i];
			}
		}
		
		System.out.println("minimum character:"+charmin);
		System.out.println("maximum character:"+charmax);
			

	}

	
	
}
