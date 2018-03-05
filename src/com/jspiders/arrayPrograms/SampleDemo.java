package com.jspiders.arrayPrograms;

public class SampleDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,51};
		int size= arr.length;
		int sum=arr[0];
		double average;
		for(int i=1;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Total sum:"+sum);
		average=sum/(double)size;
		System.out.println("Average:"+average);

	}

}
