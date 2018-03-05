package com.jspiders.stringPrograms;

public class ToLower {
	static String toLowerCase(String s) 
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char) (ch[i]+32);
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		System.out.println(toLowerCase("SheKHAR"));
		

	}

}
