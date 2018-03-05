package com.jspiders.arrayPrograms;

import java.util.Scanner;

public class InsertIntoArray {
	
	public int[] readArr() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements you want:");
		int n=sc.nextInt();
		int[] ar= new int[n];
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
	
	int[] insert(int ar[],int element,int index)
	{
		if(index<0||index>ar.length)
		{
			System.out.println("Insertion failed");
			return ar;
		}
		int[] newArr=new int[ar.length+1];
		int i=0;
		while(i<ar.length)
		{
			if(i<index) 
			{
				newArr[i]=ar[i];
			}
			else
			{
				newArr[i+1]=ar[i];
			}
			i++;
		}
		newArr[index]=element;
		return newArr;
		
	}

	public static void main(String[] args) {
		InsertIntoArray i=new InsertIntoArray();
		Scanner s=new Scanner(System.in);
		int a[]=i.readArr();
		System.out.println("Entered elements are:");
		i.display(a);
		System.out.println("Enter the element:");
		int element=s.nextInt();
		System.out.println("Enter the index:");
		int index=s.nextInt();
		int []b=i.insert(a, element, index);
		System.out.println("The new array is:");
		i.display(b);
		
		
		

	}

}
