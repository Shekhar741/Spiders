package com.jspiders.arrayPrograms;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		System.out.println("Enter the Number of elements you want:");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int arr[]=new int[number];
		System.out.println("Enter your "+number+" Integer values:");
		for(int i=0;i<number;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<number;i++)
		{
			System.out.println(i+"--->"+arr[i]);
		}
		

	}

}
