package com.jspiders.stringPrograms;

public class ReverseTheSentence {
	static String reverse(String st) {
		char[] ch=st.toCharArray();
		String s="";
		for(int i=ch.length-1;i>=0;i--) 
		{
			int k=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				s=s+ch[j];
				j++;
			}
			if(i>=0)
				s=s+ch[i];
		}
		return s;
		
	}

	public static void main(String[] args) {
		String st="Ram and Laxman";
		String s=reverse(st);
		System.out.println(s);
		
		

	}

}
