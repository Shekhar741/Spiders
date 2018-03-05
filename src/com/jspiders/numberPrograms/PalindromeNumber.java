package com.jspiders.numberPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int []a= {11,12,13,22,23,33,44,45};
		int temp,n;
		int count=0;
		System.out.println("Palindrome numbers are: ");
		for(int i=0;i<a.length;i++)
		{   
			int sum=0;
			temp=a[i];
			n=a[i];
			while(n>0) {
			sum= (sum*10)+n%10;
			n=n/10;
			}
			if(temp==sum) 
			System.out.print(a[i]+" ");
				
		}
		
//		System.out.println("");
		
		}

}
