package com.jspiders.stringPrograms;

public class NoOfVowels {
	public static int vowelscount(String st) {
		int vc=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z') 
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
				{
					vc++;
				}
			}
			else if(ch>='a'&&ch<='z') 
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				{
					vc++;
				}
			}
		}
		return vc;
	}
	public static void main(String[] args) {
		String st="Hello I am Shekhar";
		String[] words=st.split(" ");
		System.out.println("Length:"+words.length);
		for(String s:words) 
		{
			int count=vowelscount(s);
			System.out.println("No of vowels in "+s+" are:"+count);
		}

	}

}
