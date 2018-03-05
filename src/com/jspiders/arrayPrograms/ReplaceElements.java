package com.jspiders.arrayPrograms;

import java.util.Scanner;

public class ReplaceElements {
	public static int[] readArr() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the elements you want:");
		int n=s.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) 
		{
			ar[i]=s.nextInt();
		}
		return ar;
	}
	
	public static void display(int ar[]) {
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] replace(int[] ar,int index ,int element ) 
	{
		if(index<0||index>ar.length)
		{
			System.out.println("Can't replace the element");
			return ar;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(i==index) 
			{
				ar[i]=element;	
			}
		}
			return ar;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=readArr();
		System.out.println("Entered elements are:");
		display(a);
		System.out.println("Enter the element:");
		int element=sc.nextInt();
		System.out.println("Enter the index:");
		int index=sc.nextInt();
		int[] c=replace(a, index, element);
		System.out.println("New Array is:");
		display(c);
		
		

	}

}
