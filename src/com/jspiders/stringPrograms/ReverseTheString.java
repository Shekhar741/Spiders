package com.jspiders.stringPrograms;

public class ReverseTheString {
	
	
		
	
	public static void main(String[] args) {
	
		 String str="madam";
			String res="";
			
			for(int i=str.length()-1;i>=0;i--) 
			{
				
			
				res=res+str.charAt(i);
			
			}

			if(res.equals(str)) {
				
				System.out.println("this is palindrome");
			}
			else
			{
				System.out.println("this is not palindrome");
			}
	
	
}}
