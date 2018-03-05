package com.jspiders.stringPrograms;

public class SwapCharacters {
	static String swap(String st) {
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				int fi=i;
				while(i<ch.length&&ch[i]!=' ') {
					i++;
				}
				char c=ch[fi];
				ch[fi]=ch[i-1];
				ch[i-1]=c;
			}
		}
		return new String(ch);
	}
	

	public static void main(String[] args) {
		// Swapping the 1st and last characters of each word in sentance
		String st="Ram and Laxman";
		String s=swap(st);
		System.out.println(s);
		

	}

}
