package com.jspiders.stringPrograms;

import java.util.Scanner;

public class CircularWords {
	static String repChar(String s)
	{
		int a=0;
		String res="";
		for(int i=0;i<s.length();i++) 
		{
			char ch=s.charAt(i);
//			a=ch+1;
			a=ch-1;
			if(ch=='a'||ch=='A')
			{
//				a=a-26;
				a=a+26;
				
			}
			res=res+(char)a;
		}
		return res;
		
	}

	public static void main(String[] args) {
		String ans="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String st=sc.nextLine();
//		System.out.println("Enter the first word number which you want to alter:");
//		int fn=sc.nextInt();
//		System.out.println("Enter the second word number which you want to alter:");
//		int sn=sc.nextInt();
		String[] word=st.split(" ");
		int len=word.length;
		for(int i=0;i<len;i++) 
		{
			System.out.println(word[i]);
		}
		
		for(int i=0;i<len;i++) 
		{
			word[i]=repChar(word[i]);
		}
		
//		word[fn-1]=repChar(word[fn-1]);
//		word[sn-1]=repChar(word[sn-1]);
		
		for(int i=0;i<len;i++) 
		{
			ans=ans+word[i]+" ";
		}
		System.out.println("The new String is:"+ans);

	}

}
