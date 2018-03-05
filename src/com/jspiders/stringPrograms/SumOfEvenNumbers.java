package com.jspiders.stringPrograms;

public class SumOfEvenNumbers {
	static int sum(String st) {
		int sum=0;
		for(int i=0;i<st.length();i++) 
		{
			char ch=st.charAt(i);
			if(ch>='0'&&ch<='9') 
			{
				if(ch%2==0)
				{
					sum+=ch-48;
				}
			}
		}
		return sum;
		
	}

	public static void main(String[] args) {
		String st="She123456khar";
		int total=sum(st);
		System.out.println("Sum of even numbers is: "+total);

	}

}
