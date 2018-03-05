package com.jspiders.numberPrograms;

public class ContinuousNumbers {

	public static void main(String[] args) {
//		int []a= {20,40,56,35,42};
		int[] a= {7,8,9,12,6,18,3};
		int sum=0,res=0;
		System.out.println("Length of the array is: "+a.length);
		for(int i = 0; i<a.length-1;i++)
		{
			sum=a[i]+a[i+1];
			if(sum>res)
			res=sum;
				
			
		}
		System.out.println("Largest sum of continuous numbers is:"+res);

	}

}
