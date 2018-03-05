package com.jspiders.stringPrograms;

public class Palindrome {
	static boolean isPalindrome(String st) 
	{
		int i=0;
		while(i<=st.length()/2 &&st.charAt(i)==st.charAt(st.length()-1-i))
		{
			i++;
		}
		return i>st.length()/2;
		
	}

	public static void main(String[] args) {
		String st="madaam";
		boolean b=isPalindrome(st);
		if(b) 
		{
			System.out.println("Entered string is Palindrome");
		}
		else
			System.out.println("It is not a palindrome");

	}

}
