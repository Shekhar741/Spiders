package com.jspiders.arrayPrograms;

import java.util.Scanner;

public class DeleteElement {
	public int[] readArr() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements you want:");
		int n=sc.nextInt();
		int[] ar= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<ar.length;i++) 
		{
			ar[i]=sc.nextInt();
		}
		return ar;
		
	}
	
	public void display(int[] ar) 
	{
		for(int i=0;i<ar.length;i++) 
		{
			System.out.println(ar[i]+" ");
		}
		System.out.println();
	}
	
	public int[] deleteArr(int ar[],int index)
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

	public static void main(String[] args) {
		DeleteElement d=new DeleteElement();
		Scanner s=new Scanner(System.in);
		int a[]=d.readArr();
		System.out.println("Entered elements are:");
		d.display(a);
//		System.out.println("Enter the element:");
//		int element=s.nextInt();
		System.out.println("Enter the index:");
		int index=s.nextInt();
		int []b=d.deleteArr(a, index);
		System.out.println("The new array is:");
		d.display(b);

	}

}
