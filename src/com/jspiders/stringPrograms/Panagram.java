package com.jspiders.stringPrograms;

public class Panagram {
	static boolean isPanagram(String st) {
		int[] c=new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
				c[ch-65]++;
			else if(ch>='a'&&ch<='z')
				c[ch-97]++;
		}
		for(int i=0;i<c.length;i++) 
		{
			if(c[i]==0)
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		String st="Abcdefghijklmnopqrstuvwxyz";
		boolean b=isPanagram(st);
		if(b) 
		{
			System.out.println("String is Panagram");
		}
		else
			System.out.println("String is not Panagram");

	}

}
