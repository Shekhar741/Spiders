package com.jspiders.numberPrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(+i+"*"+j+"="+i*j+"\t"); //"\t" is for space in the middle//
			}
			System.out.println();
		}

	}

}
