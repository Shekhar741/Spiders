package com.jspiders.numberPrograms;

import java.util.Scanner;

public class NSmallest {
	int findSmallest(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				
				if(a[j]<a[i])
					count++;
			}
			if(count==n-1)
				return a[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		NSmallest sm= new NSmallest();
		int arr[]= {11,22,22,44,55,66,77,88};
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter which smallest number you want:");
		int n=scanner.nextInt();
		int smallest=sm.findSmallest(arr, n);
		System.out.println(n+"th smallest number is:"+smallest);
			
		

	}

}
