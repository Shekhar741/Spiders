package com.jspiders.stringPrograms;

public class EvenNumbers {
	static int even(String st) 
	{
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='0'&&ch<='9') 
			{
				if(ch%2==0)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String st="she1246khar";
		int n=even(st);
		System.out.println("Count of even numbers is: "+n);
		

	}

}
