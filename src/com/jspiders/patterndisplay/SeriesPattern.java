package com.jspiders.patterndisplay;

import java.util.Scanner;

public class SeriesPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the outer loop no:");
		int t = s.nextInt();
		
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter the a,b,c:");
			int a = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();
			int res=a;
			for(int j=0;j<n;j++)
			{
				res=(int) (res+Math.pow(2, j)*b);
				System.out.print(res+" ");
			}
			System.out.println();
		}

	}

}
