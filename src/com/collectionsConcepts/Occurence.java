package com.collectionsConcepts;

public class Occurence {

	public static void main(String[] args) {
		String st="CheTanvasupraveenshekharravi";
		char[] ch=st.toCharArray();
		int[] c=new int[128];
		for(int i=0;i<ch.length;i++) {
			c[ch[i]]++;
		}
		for(int i=0;i<c.length;i++) {
			if(c[i]>0) {
				System.out.println((char)i+"---------"+c[i]);
			}
		}

	}

}
