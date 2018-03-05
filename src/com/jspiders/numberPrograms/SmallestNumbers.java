package com.jspiders.numberPrograms;

public class SmallestNumbers {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55,66,77,88};
		int firstSmall=arr[0];
		int secondSmall=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(firstSmall>arr[j])
				{
					secondSmall=firstSmall;
					firstSmall=arr[j];
					
				}
				else if(secondSmall>arr[j]&&arr[j]!=firstSmall) 
				{
					secondSmall=arr[j];
				}
			}
		}
		System.out.println("First smallest number is:"+firstSmall);
		System.out.println("Second smallest number is:"+secondSmall);

	}

}
