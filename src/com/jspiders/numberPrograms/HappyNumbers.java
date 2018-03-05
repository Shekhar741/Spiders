package com.jspiders.numberPrograms;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

    public static boolean isHappy_number(int num)
    {
        Set<Integer> unique_num = new HashSet<Integer>();

        while (unique_num.add(num))
        {
            int value = 0;
            while (num > 0)
            {
                value += Math.pow(num % 10, 2);
                num /= 10;
            }
            num = value;
        }

        return num == 1;
    }

	
	
	
	

	public static void main(String[] args) {
		int count=0;
		int ar[]=new int[1000];
		for(int i=0;i<ar.length;i++) 
		{
			count++;
			ar[i]=count;
		}
		System.out.println("Happy numbers are: ");
		boolean res=false;
		int numCount=0;
		for(int i=0;i<ar.length;i++) 
		{
			
			res=isHappy_number(ar[i]);
			if(res) 
			{
				numCount++;
				System.out.print(ar[i]+" ");
			}
			
		}
		System.out.println();
		System.out.println("Total Happy numbers are: "+numCount);
	}
	

}
