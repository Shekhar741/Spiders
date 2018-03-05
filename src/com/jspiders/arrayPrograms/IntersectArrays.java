package com.jspiders.arrayPrograms;

import java.util.Scanner;

public class IntersectArrays {
	int[] readArr()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  how many elements:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" values:");
		for(int i=0;i<ar.length;i++) 
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	
	void dispArr(int ar[]) 
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

	}

}
