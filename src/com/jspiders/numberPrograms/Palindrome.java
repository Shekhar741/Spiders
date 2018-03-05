package com.jspiders.numberPrograms;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Palindrome numbers are:");
		for(int i=1;i<1000;i++) 
		{
			int temp=i;
			int n=i;
			int sum=0;
			while(n>0)
			{
				int r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
			if(temp==sum) 
			{
				System.out.println(i);
			}
		}

	}

}
