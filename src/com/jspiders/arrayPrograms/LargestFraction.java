package com.jspiders.arrayPrograms;

import java.util.Scanner;

public class LargestFraction {

	public static void main(String[] args) {
		System.out.println("Enter the Number of elements you want:");
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		double db[]=new double[n];
		for(int i=0;i<n;i++) {
			db[i]=s.nextDouble();
		}
		double big=db[0];
		for(int i=1;i<n;i++) {
			if(big<db[i]) {
				big=db[i];
			}
			
		}
		System.out.println("Biggest Fraction number is:"+big);
		
		
		

	}

}
