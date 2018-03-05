package com.jspiders.stringPrograms;

public class NumberOfWords {
	static int noOfWords(String s) {
		char[] ch=s.toCharArray();
		int wc=0;
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				wc++;
			
		}
		return wc;
	}

	public static void main(String[] args) {
		String s="Hello world I am Shekhar";
		int n=noOfWords(s);
		System.out.println("Number of worlds:"+n);

	}

}
