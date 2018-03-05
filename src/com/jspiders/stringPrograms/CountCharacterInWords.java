package com.jspiders.stringPrograms;

public class CountCharacterInWords {
	static void count(String st) 
	{
		char[] ch=st.toCharArray();
//		int wordCount=1;
		for(int i=0;i<ch.length;i++)
		{
			int count=0;String s="";
			while(i<ch.length&&ch[i]!=' ') 
			{
				s=s+ch[i];
				count++;
				i++;
			}
			if(count>0)
			{
				System.out.println(s+"--------->"+count);
//				wordCount++;
			}
			
		}
	}

	public static void main(String[] args) {
		String s="Hello world I am shekhar";
		count(s);
		

	}

}
