package com.jspiders.arrayPrograms;

import java.util.Scanner;

public class NoOfOccurance {
	public static int[] readArr()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements:");
		int n=s.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		return ar;
		
	}
	public static void display(int[] ar) 
	{
		for(int i=0;i<ar.length;i++) 
		{
			System.out.println(ar[i]+" ");
		}
	}
	
	public static int[] deleteArr(int ar[],int index)
	{
		if(index<0||index>ar.length)
		{
			System.out.println("Deletion failed");
			return ar;
		}
		int[] newArr=new int[ar.length-1];
		int i=0;
		while(i<newArr.length)
		{
			if(i<index)
			{
				newArr[i]=ar[i];
			}
			
			else
				newArr[i]=ar[i+1];
				i++;
		}
		return newArr;
		
	}
	public static void occurance(int ar[]) {
		
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ar.length;j++) 
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar=deleteArr(ar, j);
					j--;
				}
				
			}
			System.out.println(ar[i]+"-------->"+count);
		}
	}

	public static void main(String[] args) {
		int a[]=readArr();
		System.out.println("Entered elements are:");
		display(a);
		System.out.println("Number of occurance of each elements:");
		occurance(a);
		
		

	}

}
