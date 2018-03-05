package com.jspiders.stringPrograms;

public class CheckAnagram {
	static String removeSpace(String st) {
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
				st=st+ch[i];
		}
		return st;
		
	}
	static String toLower(String st)
	{
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char) (ch[i]+32);
			}
		}
		return new String(ch);
		
	}
	
	static int[] countOccurance(String st) 
	{
		int[] c=new int[128];
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			c[ch[i]]++;
		}
		return c;
		
	}
	static boolean compare(int[] a,int[] b) 
	{
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]!=b[i]) 
			{
				return false;
			}
		}
		return true;
	}
	
	static boolean isAnagram(String s1,String s2) {
		s1=removeSpace(s1);
		s2=removeSpace(s2);
		if(s1.length()!=s2.length())
			return false;
		
		s1=toLower(s1);
		s2=toLower(s2);
		
		int[] sc1=countOccurance(s1);
		int[] sc2=countOccurance(s2);
		
		return compare(sc1, sc2);
		
	}

	public static void main(String[] args) {
		String st="Mother in Law";
		String st1="Hitler Woman";
		boolean result=isAnagram(st, st1);
		if(result)
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are NOT Anagram");
		

	}

}
