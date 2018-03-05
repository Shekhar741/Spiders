package com.jspiders.stringPrograms;

import java.util.Scanner;

public class DisplayCount {
	static void count(String str) {
		int cl=0,sl=0,dc=0,sc=0,vc=0,cc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch>='A'&&ch<='Z') 
			{
				cl++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
				vc++;
				else
					cc++;
				
			}
			else if(ch>='a'&&ch<='z') 
			{
				sl++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				vc++;
				else
					cc++;
				
			}
			else if(ch>='0'&&ch<='9') 
			{
				dc++;
			}
			else
				sc++;
		}
		System.out.println("Number of capital lettrs: "+cl);
		System.out.println("Number of small lettrs: "+sl);
		System.out.println("Number of digits: "+dc);
		System.out.println("Number of special lettrs: "+sc);
		System.out.println("Number of vowels: "+vc);
		System.out.println("Number of consonants: "+cc);
		
	}
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String st=new String("");
		System.out.println("Enter the string: ");
		st=s.next();
		
		count(st);

	}

}
