package com.jspiders.stringPrograms;

public class Substring2 {

	public static void main(String[] args) {
		String str="abcdde";
		String sub="cde";
		boolean flag=false;
		for(int i=0;i<str.length();i++) 
		{
			int k=i;int l=0;int count=0;
			while(l<sub.length()) 
			{
				if(str.charAt(k)==sub.charAt(l)) {
					count++;
					k++;
					l++;
				}
				else {
					break;
				}
			}
			if(count==sub.length()) {
				flag=true;
//				System.out.println("Substring is present");
				break;
			}
			
		}
		if(flag) {
			System.out.println("Substring is present");
		}
		else {
			System.out.println("Not a substring");
		}

	}

}
