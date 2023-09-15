package com.array;

import java.util.Arrays;

public class FrequencyOfElement {

	public static void main(String[] args) 
	{ 
		// input primitive integer array
        int[] arr= {1, 2, 8, 3, 2, 2, 2, 5, 1};
 
        String[] strArray = new String[arr.length];
        //convert int array to string array
        for (int i = 0; i < arr.length; i++)
        {
            strArray[i] = String.valueOf(arr[i]);
        }
        //displaying sting array element
        
        for(String s:strArray)
        {
        	System.out.print(s+" "+"\n");
        }
       // System.out.println("length:"+strArray.length);
       
        //System.out.println(Arrays.toString(strArray));
        //frequency finding code
        for(int i=0;i<strArray.length;i++)
        {
        	
        	
        	int count=1;
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i].equals(strArray[j]))
				{
					count=count+1;
					strArray[j]="0";
				}
			}
			if(strArray[i]!="0")
			{
				System.out.println(strArray[i]+"="+count);
			}
        }
	}

}
