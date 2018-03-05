package com.jspiders.stringPrograms;

public class ToUpper {
	static String toUpperCase(String st) {
		char ch[]=st.toCharArray();
		for(int i=1;i<ch.length;i++) 
		{
			if(ch[i]>'a'&&ch[i]<'z') 
			{
				ch[i]=(char) (ch[i]-32);
			}
		}
		return new String(ch);
		
	}

	public static void main(String[] args) {
		System.out.println(toUpperCase("ShekhAr"));

	}

}
