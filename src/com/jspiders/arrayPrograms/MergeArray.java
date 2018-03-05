package com.jspiders.arrayPrograms;

import java.util.Scanner;

public class MergeArray {
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
	
	int[] combine(int ar1[],int ar2[])
	{
		int rs[]=new int[ar1.length+ar2.length];
		for(int i=0;i<ar1.length;i++) 
		{
			rs[i]=ar1[i];
		}
		for(int i=0;i<ar2.length;i++) 
		{
			rs[ar1.length+i]=ar2[i];
		}
		return rs;
	}
	
	void reverse(int ar[])
	{
		for(int i=0;i<ar.length/2;i++) 
		{
			int t=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=t;
		}
	}
	

	public static void main(String[] args) {
		MergeArray m= new MergeArray();
		System.out.println("First array elements: ");
		int a[]=m.readArr();
		System.out.println("Second array elements: ");
		int b[]=m.readArr();
		
		System.out.println("Entered first array elements:");
		m.dispArr(a);
		System.out.println("Entered second array elements:");
		m.dispArr(b);
		
		int c[]=m.combine(a, b);
		System.out.println("The combined elements are:");
		m.dispArr(c);
		
		int ar[]=m.readArr();
		System.out.println("Entered elements:");
		m.dispArr(ar);
		
		m.reverse(ar);
		System.out.println("Reversed array: ");
		m.dispArr(ar);
		
	}

}
