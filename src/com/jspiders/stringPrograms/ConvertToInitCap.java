package com.jspiders.stringPrograms;

public class ConvertToInitCap {
	static String convert(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if(ch[i]>'a'&&ch[i]<'z') 
				{
					ch[i]=(char) (ch[i]-32);
				}	
			}
			else if(ch[i]>'A'&&ch[i]<'Z') {
				ch[i]=(char) (ch[i]+32);
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String st="raM and laKShman";
		String s=convert(st);
		System.out.println("New string is:"+s);

	}

}
