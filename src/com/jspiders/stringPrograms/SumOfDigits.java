package com.jspiders.stringPrograms;

public class SumOfDigits {
	static int sum(String s)
	{
		char[] ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if(c>='0'&&c<='9')
				sum=sum+(ch[i]);
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		String st="She1436khar";
		int n=sum(st);
		System.out.println("Sum of digits in a given string is: "+n);
		

	}

}
