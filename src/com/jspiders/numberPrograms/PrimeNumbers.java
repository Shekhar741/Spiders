package com.jspiders.numberPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		int[] a= {2,3,5,7,11,4,6,8,10};
		for(int i=0;i<a.length;i++) 
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(a[i]%j==0) 
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}
