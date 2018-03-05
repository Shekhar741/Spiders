package com.jspiders.stringPrograms;

public class countPartWord {
	static int check(String st1,String st2,int oc )
	{
		char ms[]=st1.toCharArray();
		char ss[]=st2.toCharArray();
		int count=0,in=-1;
		int i=0;
		while(i<ms.length)
		{
			int j=0;
			while(i+j<ms.length&&j<ss.length&&ms[i+j]==ss[j])
			{
				j++;
			}
			if(j==ss.length)
			{
				if(i==0||ms[i-j]==' '&&i+j==ms.length||ms[i+j]==' ')
					in=i;
					count++;
					if(count==oc)
					return in;
			}
			i++;
		}
		return -1;
	}

	public static void main(String[] args) {
		String s1="raghu is very very bad boy";
		String s2="ghu";
		System.out.println(check(s1, s2,1));
		

	}

}
