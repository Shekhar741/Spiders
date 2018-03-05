package com.jspiders.stringPrograms;

public class Substring {
	static boolean check(String st1,String st2 )
	{
		char ms[]=st1.toCharArray();
		char ss[]=st2.toCharArray();
		int i=0;
		while(i<ms.length)
		{
			int j=0;
			while(i+j<ms.length&&j<ss.length&&ms[i+j]==ss[j])
			{
				j++;
			}
			if(j==ss.length)
				return true;
			i++;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(check("chitradurga", "durga"));

	}

}
