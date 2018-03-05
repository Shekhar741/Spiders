package com.jspiders.numberPrograms;

public class PrintPattern {

	public static void main(String[] args) {
		int n=3;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		for(int k=n;k>=1;k--)
		{
			for(int l=1;l<k;l++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
	
