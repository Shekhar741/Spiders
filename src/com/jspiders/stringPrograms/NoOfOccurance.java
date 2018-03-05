package com.jspiders.stringPrograms;

public class NoOfOccurance {

	public static void main(String[] args) {
		String st="LEARn DATABASE DEVELOPMEnT";
		int[] c=new int[128];
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			c[ch[i]]++;
		}
		for(int i=0;i<c.length;i++) 
		{
			if(c[i]>0)
				System.out.println((char)i+"-------->"+c[i]);
		}
		

	}

}
