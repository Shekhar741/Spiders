package com.jspiders.numberPrograms;

import java.util.Scanner;

public class NLargest {
	
	int findLargest(int a[],int n) {
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++) 
			{
				if(a[j]>a[i]) 
				{
					count++;
				}
			}
			if(count==n-1)
				return a[i];
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		NLargest nl= new NLargest();
		int a[]= {11,22,33,44,55,66,77};
		System.out.println("Enter the largest number you want to find:");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		int big=nl.findLargest(a,n);
		System.out.println(n+"th Largest number is :"+big);
		
		

	}

}
